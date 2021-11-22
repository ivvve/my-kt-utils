package com.tistory.devs0n.utils

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MyStringUtilsTest {
    @Test
    fun `isSpaceWithWidth passed tests`() {
        assertTrue("" isSpaceWithWidth 0)
        assertTrue(" " isSpaceWithWidth 1)
    }

    @Test
    fun `isSpaceWithWidth failed tests`() {
        assertFalse("a" isSpaceWithWidth 1)
        assertFalse("" isSpaceWithWidth 1)
    }
}
