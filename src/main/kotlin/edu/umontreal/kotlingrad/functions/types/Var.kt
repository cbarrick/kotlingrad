package edu.umontreal.kotlingrad.functions.types

import edu.umontreal.kotlingrad.algebra.Field
import edu.umontreal.kotlingrad.algebra.FieldPrototype
import edu.umontreal.kotlingrad.functions.Function

class Var<X: Field<X>>(
  override val prototype: FieldPrototype<X>,
  val value: X = prototype.zero,
  private var name: String = randomDefaultName()
): Function<X>(emptySet()) {
  override val variables: Set<Var<X>> = setOf(this)

  override fun invoke(map: Map<Var<X>, X>): X = if (map[this] != null) map[this]!! else value

  override fun diff(ind: Var<X>) = Const(if (this == ind) prototype.one else prototype.zero)

  override fun toString() = name

  companion object {
    private fun randomDefaultName() = ('a'..'z').map { it }.shuffled().subList(0, 4).joinToString("")
  }
}