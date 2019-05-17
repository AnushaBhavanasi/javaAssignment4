import org.junit.Test;

import static org.junit.Assert.*;

public class StringOcurranceTest {
    StringOcurrance so;
    @Test
    public void occuranceOfACharacter(){
        so=new StringOcurrance();
        String str="java is a java again java";
        char s='a';
        int result=so.charactersCount(str,s);
        int res=9;
        assertEquals(res,result);
    }
    @Test
    public void occuranceOfACharacterI(){
        so=new StringOcurrance();
        String str="java is a java again java";
        char s='i';
        int result=so.charactersCount(str,s);
        int res=2;
        assertEquals(res,result);
    }

}