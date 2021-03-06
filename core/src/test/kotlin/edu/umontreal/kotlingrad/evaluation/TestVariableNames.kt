package edu.umontreal.kotlingrad.evaluation

import edu.umontreal.kotlingrad.experimental.DReal
import edu.umontreal.kotlingrad.experimental.DoublePrecision
import edu.umontreal.kotlingrad.experimental.SVar
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestVariableNames {
  @Test
  fun testVariableNames() {
    val a by SVar<DReal>()
    assertEquals(a.name, "a")
  }

  @Test
  fun testDefaultVars() {
    assertEquals(DoublePrecision.x.name, "x")
  }
}