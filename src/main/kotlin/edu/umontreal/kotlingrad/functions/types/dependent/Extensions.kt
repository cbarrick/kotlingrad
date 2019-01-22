@file:Suppress("UNUSED∕PARAMETER")

package edu.umontreal.kotlingrad.functions.types.dependent

@JvmName("g1")
infix operator fun <T> Vector<T, `1`>.get(i: `0`): T = contents[0]

@JvmName("g2")
infix operator fun <T> Vector<T, `2`>.get(i: `0`): T = contents[0]

@JvmName("g2")
infix operator fun <T> Vector<T, `2`>.get(i: `1`): T = contents[1]

@JvmName("g3")
infix operator fun <T> Vector<T, `3`>.get(i: `0`): T = contents[0]

@JvmName("g3")
infix operator fun <T> Vector<T, `3`>.get(i: `1`): T = contents[1]

@JvmName("g3")
infix operator fun <T> Vector<T, `3`>.get(i: `2`): T = contents[2]

@JvmName("g4")
infix operator fun <T> Vector<T, `4`>.get(i: `0`): T = contents[0]

@JvmName("g4")
infix operator fun <T> Vector<T, `4`>.get(i: `1`): T = contents[1]

@JvmName("g4")
infix operator fun <T> Vector<T, `4`>.get(i: `2`): T = contents[2]

@JvmName("g4")
infix operator fun <T> Vector<T, `4`>.get(i: `3`): T = contents[3]

@JvmName("g5")
infix operator fun <T> Vector<T, `5`>.get(i: `0`): T = contents[0]

@JvmName("g5")
infix operator fun <T> Vector<T, `5`>.get(i: `1`): T = contents[1]

@JvmName("g5")
infix operator fun <T> Vector<T, `5`>.get(i: `2`): T = contents[2]

@JvmName("g5")
infix operator fun <T> Vector<T, `5`>.get(i: `3`): T = contents[3]

@JvmName("g3")
infix operator fun <T> Vector<T, `5`>.get(i: `4`): T = contents[4]

@JvmName("0pT")
infix operator fun <T> Vector<T, `0`>.plus(t: T): Vector<T, `1`> = Vector(contents + t)

@JvmName("1pT")
infix operator fun <T> Vector<T, `1`>.plus(t: T): Vector<T, `2`> = Vector(contents + t)

@JvmName("2pT")
infix operator fun <T> Vector<T, `2`>.plus(t: T): Vector<T, `3`> = Vector(contents + t)

@JvmName("3pT")
infix operator fun <T> Vector<T, `3`>.plus(t: T): Vector<T, `4`> = Vector(contents + t)

@JvmName("4pT")
infix operator fun <T> Vector<T, `4`>.plus(t: T): Vector<T, `5`> = Vector(contents + t)

@JvmName("5pT")
infix operator fun <T> Vector<T, `5`>.plus(t: T): Vector<T, `6`> = Vector(contents + t)

@JvmName("Tp0")
infix operator fun <T> T.plus(t: Vector<T, `0`>): Vector<T, `1`> = Vector(arrayListOf(this))

@JvmName("Tp1")
infix operator fun <T> T.plus(t: Vector<T, `1`>): Vector<T, `2`> = Vector(arrayListOf(this) + t.contents)

@JvmName("Tp2")
infix operator fun <T> T.plus(t: Vector<T, `2`>): Vector<T, `3`> = Vector(arrayListOf(this) + t.contents)

@JvmName("Tp3")
infix operator fun <T> T.plus(t: Vector<T, `3`>): Vector<T, `4`> = Vector(arrayListOf(this) + t.contents)

@JvmName("Tp4")
infix operator fun <T> T.plus(t: Vector<T, `4`>): Vector<T, `5`> = Vector(arrayListOf(this) + t.contents)

@JvmName("Tp5")
infix operator fun <T> T.plus(t: Vector<T, `5`>): Vector<T, `6`> = Vector(arrayListOf(this) + t.contents)

@JvmName("0p0")
infix operator fun <T> Vector<T, `0`>.plus(l: Vector<T, `0`>): Vector<T, `0`> = l

@JvmName("0p1")
infix operator fun <T> Vector<T, `0`>.plus(l: Vector<T, `1`>): Vector<T, `1`> = l

@JvmName("0p2")
infix operator fun <T> Vector<T, `0`>.plus(l: Vector<T, `2`>): Vector<T, `2`> = l

@JvmName("0p3")
infix operator fun <T> Vector<T, `0`>.plus(l: Vector<T, `3`>): Vector<T, `3`> = l

@JvmName("1p0")
infix operator fun <T> Vector<T, `1`>.plus(l: Vector<T, `0`>): Vector<T, `1`> = this

@JvmName("2p0")
infix operator fun <T> Vector<T, `2`>.plus(l: Vector<T, `0`>): Vector<T, `2`> = this

@JvmName("3p0")
infix operator fun <T> Vector<T, `3`>.plus(l: Vector<T, `0`>): Vector<T, `3`> = this

@JvmName("1p1")
infix operator fun <T> Vector<T, `1`>.plus(l: Vector<T, `1`>): Vector<T, `2`> = Vector(contents + l.contents)

@JvmName("1p2")
infix operator fun <T> Vector<T, `1`>.plus(l: Vector<T, `2`>): Vector<T, `3`> = Vector(contents + l.contents)

@JvmName("1p3")
infix operator fun <T> Vector<T, `1`>.plus(l: Vector<T, `3`>): Vector<T, `4`> = Vector(contents + l.contents)

@JvmName("2p1")
infix operator fun <T> Vector<T, `2`>.plus(l: Vector<T, `1`>): Vector<T, `3`> = Vector(contents + l.contents)

@JvmName("3p1")
infix operator fun <T> Vector<T, `3`>.plus(l: Vector<T, `1`>): Vector<T, `4`> = Vector(contents + l.contents)

@JvmName("2p2")
infix operator fun <T> Vector<T, `2`>.plus(l: Vector<T, `2`>): Vector<T, `4`> = Vector(contents + l.contents)

@JvmName("2p3")
infix operator fun <T> Vector<T, `2`>.plus(l: Vector<T, `3`>): Vector<T, `5`> = Vector(contents + l.contents)

@JvmName("3p2")
infix operator fun <T> Vector<T, `3`>.plus(l: Vector<T, `2`>): Vector<T, `5`> = Vector(contents + l.contents)

@JvmName("3p3")
infix operator fun <T> Vector<T, `3`>.plus(l: Vector<T, `3`>): Vector<T, `6`> = Vector(contents + l.contents)
