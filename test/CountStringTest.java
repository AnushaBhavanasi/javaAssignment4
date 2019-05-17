import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CountStringTest {

    CountString cs;
   @Test
   public void countString(){
        cs=new CountString();
        String str="This is the text which to be searched";
        String search="is";
        String result=cs.stringCount(str,search);
        assertEquals("2-3,5-6",result);

    }

}