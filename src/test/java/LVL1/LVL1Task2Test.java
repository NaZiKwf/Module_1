package LVL1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LVL1Task2Test {
    @Test
    void check_inputedCorrectStartPositionFromUser_Boolean(){
        char input = 'A';
        int  input1 = 1;
        boolean b = true;
        boolean expected= true;
        boolean actual = LVL1Task2.Check(input,input1, b);
        assertEquals(expected, actual,"Not correct");
    }
    @Test
    void check_inputedNotCorrectStartNumFromUser_Boolean(){
        char input = 'H';
        int  input1 = 9;
        boolean b = false;
        boolean expected= false;
        boolean actual = LVL1Task2.Check(input,input1, b);
        assertEquals(expected, actual,"Not correct");
    }

    @Test
    void check_inputedNotCorrectStartLetterFromUser_Boolean(){
        char input = 'L';
        int  input1 = 8;
        boolean b = false;
        boolean expected= false;
        boolean actual = LVL1Task2.Check(input,input1, b);
        assertEquals(expected, actual,"Not correct");
    }

    @Test
    void logic_checkForPossibleMoveForLetter_returnBoolean(){
        LVL1Task2.startPos='A';
        LVL1Task2.finishPos='C';
        LVL1Task2.startNum=5;
        LVL1Task2.finishNum=6;
        boolean expected = true;
        boolean actual = LVL1Task2.Logic();
        assertEquals(expected,actual);
    }
    @Test
    void logic_checkForPossibleMoveForNum_returnBoolean(){
        LVL1Task2.startNum=1;
        LVL1Task2.finishNum=3;
        LVL1Task2.startPos='A';
        LVL1Task2.finishPos='B';
        boolean expected = true;
        boolean actual = LVL1Task2.Logic();
        assertEquals(expected,actual);
    }
    @Test
    void logic_checkForNotPossibleMove_returnBoolean(){
        LVL1Task2.startNum=1;
        LVL1Task2.finishNum=4;
        LVL1Task2.startPos='A';
        LVL1Task2.finishPos='C';
        boolean expected = false;
        boolean actual = LVL1Task2.Logic();
        assertEquals(expected,actual);
    }

    @Test
    void check_inputedCorrectFinishNumFromUser_Boolean(){
        char input = 'H';
        int  input1 = 8;
        boolean b = false;
        boolean expected= true;
        boolean actual = LVL1Task2.Check(input,input1, b);
        assertEquals(expected, actual,"Not correct");
    }
}
