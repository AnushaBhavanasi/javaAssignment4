import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    ReplaceCharacter rc;
    @Test

    public void replaceCharacter(){
       rc=new ReplaceCharacter();
        String str="dry dried";
        char ch1='d';
        char ch2='f';
        String res= rc.characterReplace(str,ch1,ch2);
        assertEquals("fry frief",res);

    }
    @Test
    public void replaceCharacterYWithT(){
        rc=new ReplaceCharacter();
        String str="dry dried";
        char ch1='y';
        char ch2='t';
        String res= rc.characterReplace(str,ch1,ch2);
        assertEquals("drt dried",res);

    }
    @Test
    public void replaceCharacterWithSpace(){
        rc=new ReplaceCharacter();
        String str="dry dried";
        char ch1='r';
        char ch2=' ';
        String res= rc.characterReplace(str,ch1,ch2);
        assertEquals("d y d ied",res);

    }

}