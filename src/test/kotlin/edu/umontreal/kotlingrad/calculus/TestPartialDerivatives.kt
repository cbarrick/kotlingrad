package edu.umontreal.kotlingrad.calculus

import io.kotlintest.properties.assertAll
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

@Suppress("NonAsciiCharacters", "LocalVariableName")
class TestPartialDerivatives: StringSpec({
  with(DoubleFunctor) {
    val x = variable("x")
    val y = variable("y")

    "∂x / ∂y should be 0" {
      assertAll(DoubleRealGenerator, DoubleRealGenerator) { xVal, yVal ->
        val f = cos(x)
        val `∂f_∂y` = d(f) / d(y)
        `∂f_∂y`(x to xVal, y to yVal).dbl + 0.0 shouldBe 0.0
      }
    }

    "∂(x + y) / ∂x should be 1" {
      assertAll(DoubleRealGenerator, DoubleRealGenerator) { xVal, yVal ->
        val f = x + y
        val `∂f_∂x` = d(f) / d(x)
        `∂f_∂x`(x to xVal, y to yVal).dbl shouldBe 1.0
      }
    }

    "∂(x + y + x) / ∂x should be 2" {
      assertAll(DoubleRealGenerator, DoubleRealGenerator) { xVal, yVal ->
        val f = x + y + x
        val `∂f_∂x` = d(f) / d(x)
        `∂f_∂x`(x to xVal, y to yVal).dbl shouldBe 2.0
      }
    }

    "∂(yx) / ∂x should be y" {
      assertAll(DoubleRealGenerator, DoubleRealGenerator) { xVal, yVal ->
        val f = y * x
        val `∂f_∂x` = d(f) / d(x)
        `∂f_∂x`(x to xVal, y to yVal).dbl shouldBe yVal.dbl
      }
    }

    "∂(yx + xx + yy) / ∂x should be y + 2x" {
      assertAll(DoubleRealGenerator, DoubleRealGenerator) { xVal, yVal ->
        val f = y * x + pow(x, 2) + pow(y, 2)
        val `∂f_∂x` = d(f) / d(x)
        `∂f_∂x`(x to xVal, y to yVal).dbl shouldBe (y + x * 2)(x to xVal, y to yVal).dbl
      }
    }
  }
})