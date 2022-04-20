import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDiffKataTest {
    @Test
    void checkForMinMaxDiffMethod(){
        //given
        int[] arr = new int[]{-20, 1, 2, 3, -4, -5};
        //when
        int actual = MaxDiffKata.maxDiff(arr);
        //then
        assertEquals(23,actual);

    }

    @Test
    void checkIfTheArrayIsEmpty(){
        //given
        int[] arr = new int[0];
        //when
        int actual = MaxDiffKata.maxDiff(arr);
        //then
        assertEquals(0,actual);

    }


}