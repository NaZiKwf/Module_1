package LVL1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LVL1Task1Test {

    @Test
    void check_notCorrectStringArray_Boolean(){
        String [] input = {"h","s","s"};
        boolean expected=false;
        boolean actual = LVL1Task1.Check(input);
        assertEquals(expected,actual,"Not correct");
    }
    @Test
    void check_CorrectStringArray_Boolean(){
        String [] input = {"2","1","3","1"};
        boolean expected=true;
        boolean actual = LVL1Task1.Check(input);
        assertEquals(expected,actual,"Not correct");
    }

    @Test
    void uniqueCount_intArray_UniqueNumbers(){
        int [] input = {1,2,4,5,5};
        int expected=4;
        int actual = LVL1Task1.uniqueCount(input);
        assertEquals(expected,actual,"Not correct");

    }
}
