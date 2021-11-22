package com.tistory.devs0n.utils

infix fun String.isSpaceWithWidth(width: Int): Boolean = this.isBlank() && (this.length == width)
