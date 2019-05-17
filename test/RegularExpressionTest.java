import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression oe;



    @Test
    public void matchingTheName() {
        oe = new RegularExpression();
        String a = "jenny how r u";
        boolean cn = oe.matchChecking(a);
        assertEquals(true,cn);


    }

    @Test
    public void notMatchingTheName() {
        oe = new RegularExpression();
        String str= "how r u";
        boolean result = oe.matchChecking(str);
        assertEquals(false,result);


    }
    @Test
    public void matchingTheNameMiddle() {
        oe = new RegularExpression();
        String a = " how jenny u";
        boolean cn = oe.matchChecking(a);
        assertEquals(true,cn);


    }
}