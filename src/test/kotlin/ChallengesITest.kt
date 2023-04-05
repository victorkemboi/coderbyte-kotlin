import io.kotest.core.spec.style.FreeSpec
import kotlin.test.assertEquals

class ChallengesITest

class AbCheckTest : FreeSpec({
    "abCheckReturnsTrue" {
        val input = "amknbpppkjhbyka"
        assertEquals(true, abCheck(input))
    }

    "abCheckReturnsFalse" {
        val input = "amknpppkjhyka"
        assertEquals(false, abCheck(input))
    }
})

class AdditivePersistence : FreeSpec({
    "additivePersistence3" {
        val additive = additivePersistence(num = 199)
        assertEquals(3, additive)
    }

    "additivePersistenceIs2" {
        val additive = additivePersistence(num = 2781)
        assertEquals(2, additive)
    }
})

class AlphabetSoupTest : FreeSpec({
    "helloSorted" {
        val actual = alphabetSoup("hello")
        assertEquals("ehllo", actual)
    }

    "supperSorted" {
        val actual = alphabetSoup("supper")
        assertEquals("epprsu", actual)
    }
})

class ArithGeoTest : FreeSpec({
    "arithmeticReturnsTrue" {
        val arithmetic = arithGeo(listOf(2, 4, 6, 8))
        assertEquals("Arithmetic", arithmetic)
    }

    "arithmeticReturnsFalse" {
        val arithmetic = arithGeo(listOf(2, 4, 6, 8, 9))
        assertEquals("-1", arithmetic)
    }

    "geometricReturnsTrue" {
        val geometric = arithGeo(listOf(2, 6, 18, 54))
        assertEquals("Geometric", geometric)
    }

    "geometricReturnsFalse" {
        val geometric = arithGeo(listOf(2, 6, 18, 54, 8))
        assertEquals("-1", geometric)
    }
})

class ArrayAdditionTest : FreeSpec({
    "arrayAdditionReturnsTrueI" {
        val actual = arrayAddition(listOf(4, 6, 24, 10, 1, 3))
        assertEquals(true, actual)
    }

    "arrayAdditionReturnsTrueII" {
        val actual = arrayAddition(listOf(4, 6, 2))
        assertEquals(true, actual)
    }

    "arrayAdditionReturnsTrueIII" {
        val actual = arrayAddition(listOf(8, 3, 7, 2, 3))
        assertEquals(true, actual)
    }

    "arrayAdditionReturnsFalseI" {
        val actual = arrayAddition(listOf(4, 7, 2))
        assertEquals(false, actual)
    }
})

class BinaryReversalTest : FreeSpec({
    "binaryReversalReturnsTrue" {
        val actual = binaryReversal(47)
        assertEquals(244, actual)
    }
})