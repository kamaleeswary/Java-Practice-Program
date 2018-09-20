import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void matrixAddition() {
        //act
        int[][] expected={{10,10},{10,10},{10,10}};
        //arrenge
        MatrixAddition matrixAddition1=new MatrixAddition(3,2,new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}});

        //assert
        assertEquals(expected,matrixAddition1.matrixAddition());
    }
}