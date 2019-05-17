import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringExtractAndSortTest {

    StringExtractAndSort se;
    @Before
    public void setUp() throws Exception {
        se=new StringExtractAndSort();
    }

    @After
    public void tearDown() throws Exception {
        se=null;
    }
    @Test
    public void stringExtractAndSort(){
        se=new StringExtractAndSort();
        String s1="Into the face of the young man who sat on terrace";
        String res=se.extractAndSort(s1);
        String result="[Into, face, man, of, on, sat, terrace, the, the, who, young]";
        assertEquals(result,res);
    }
}