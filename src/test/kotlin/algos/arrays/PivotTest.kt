package algos.arrays

import org.junit.Test
import kotlin.test.assertEquals

class PivotTest {

    @Test
    fun testPivotIndex() {
        assertEquals(expected = 3, actual = pivotIndex(arrayOf(1, 7, 3, 6, 5, 6)))
    }
}
