import io.kotest.core.spec.style.FreeSpec
import kotlin.test.assertEquals

class AdjacentStarCountTest:  FreeSpec( {
    val board = mutableListOf(
        mutableListOf(".", ".", "*", "."),
        mutableListOf(".", "*", "*", "."),
        mutableListOf("*", ".", ".", "*"),
        mutableListOf(".", ".", "*", "*"),
    )
    "Test adjacent star count" {
        val expectedBoard = mutableListOf(
            mutableListOf("1", "3", "*", "2"),
            mutableListOf("2", "*", "*", "3"),
            mutableListOf("*", "4", "5", "*"),
            mutableListOf("1", "2", "*", "*"),
        )
        val adjacentStarCount = adjacentStarCount(board)

        assertEquals(expectedBoard, adjacentStarCount)
    }

})