import kotlin.test.Test
import kotlin.test.assertEquals

class ChallengesITest

class AbCheckTest {
    @Test
    fun abCheckReturnsTrue() {
        val input = "amknbpppkjhbyka"
        assertEquals(true, abCheck(input))
    }

    @Test
    fun abCheckReturnsFalse() {
        val input = "amknpppkjhyka"
        assertEquals(false, abCheck(input))
    }
}

class AdditivePersistence {
    @Test
    fun additivePersistence3() {
        val additive = additivePersistence(num = 199)
        assertEquals(3, additive)
    }

    @Test
    fun additivePersistenceIs2() {
        val additive = additivePersistence(num = 2781)
        assertEquals(2, additive)
    }
}

class AlphabetSoupTest {
    @Test
    fun helloSorted() {
        val actual = alphabetSoup("hello")
        assertEquals("ehllo", actual)
    }

    @Test
    fun supperSorted() {
        val actual = alphabetSoup("supper")
        assertEquals("epprsu", actual)
    }
}

class ArithGeoTest {
    @Test
    fun arithmeticReturnsTrue() {
        val arithmetic = arithGeo(listOf(2, 4, 6, 8))
        assertEquals("Arithmetic", arithmetic)
    }

    @Test
    fun arithmeticReturnsFalse() {
        val arithmetic = arithGeo(listOf(2, 4, 6, 8, 9))
        assertEquals("-1", arithmetic)
    }

    @Test
    fun geometricReturnsTrue() {
        val geometric = arithGeo(listOf(2, 6, 18, 54))
        assertEquals("Geometric", geometric)
    }

    @Test
    fun geometricReturnsFalse() {
        val geometric = arithGeo(listOf(2, 6, 18, 54, 8))
        assertEquals("-1", geometric)
    }
}

class ArrayAdditionTest {
    @Test
    fun arrayAdditionReturnsTrueI() {
        val actual = arrayAddition(listOf(4, 6, 24, 10, 1, 3))
        assertEquals(true, actual)
    }

    @Test
    fun arrayAdditionReturnsTrueII() {
        val actual = arrayAddition(listOf(4, 6, 2))
        assertEquals(true, actual)
    }

    @Test
    fun arrayAdditionReturnsTrueIII() {
        val actual = arrayAddition(listOf(8, 3, 7, 2, 3))
        assertEquals(true, actual)
    }

    @Test
    fun arrayAdditionReturnsFalseI() {
        val actual = arrayAddition(listOf(4, 7, 2))
        assertEquals(false, actual)
    }
}

class BinaryReversalTest {
    @Test 
    fun binaryReversalReturnsTrue() {
        val actual = binaryReversal(47)
        assertEquals(244,actual)
    }
}