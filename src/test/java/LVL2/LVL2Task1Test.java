package LVL2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LVL2Task1Test {
    @Test
    void isValid_inputUser_boolean(){
        String input = "( }";
        boolean expected= false;
        boolean actual = LVL2Task1.isValid(String.valueOf(input));
        assertEquals(expected,actual,"Not correct");
    }

    @Test
    void isValid_inputedUser_boolean(){
        String input = "( }";
        boolean expected= false;
        boolean actual = LVL2Task1.isValid(input);
        assertEquals(expected,actual,"Not correct");
    }
    @Test
    void isValid_inputedNotCorrectStringUser_boolean(){
        String  input = "]";
        boolean expected= false;
        boolean actual = LVL2Task1.isValid(input);
        assertEquals(expected,actual,"Not correct");
    }
    @Test
    void isValid_inputedNotCorrectSymbUser_boolean(){
        String input = "}";
        boolean expected= false;
        boolean actual = LVL2Task1.isValid(input);
        assertEquals(expected,actual,"Not correct");
    }
    @Test
    void isValid_inputedNotCorrectSymbolUser_boolean(){
        String input = ")";
        boolean expected= false;
        boolean actual = LVL2Task1.isValid(input);
        assertEquals(expected,actual,"Not correct");
    }
    @Test
    void isValid_inputedNotCorrectSymbol1User_boolean(){
        String input = "( )";
        boolean expected= true;
        boolean actual = LVL2Task1.isValid(input);
        assertEquals(expected,actual,"Not correct");
    }
}
