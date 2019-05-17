import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose t;

    @Test
    public void transposeWord()
    {
        String str="transpose";
        String str1=t.stringTranspose(str);
        String str2="esopsnart";
        assertEquals(str2,str1);
    }
    @Test
    public void transposeFullString()
    {
        String str="transpose of String";
        String str1=t.stringTranspose(str);
        String str2="esopsnart fo gnirtS";
        assertEquals(str2,str1);
    }

}