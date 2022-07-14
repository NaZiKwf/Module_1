package LVL1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LVL1Task3Test {
    @Test
    void lineLength_coordinatesOfDots_length(){
        double input_x1 = 2.0;
        double input_y1 = 3.0;
        double input_x2 = 1.0;
        double input_y2 = 2.0;
        double expected=1.4142135623730951;
        double actual = LVL1Task3.lineLength(input_x1,input_y1,input_x2,input_y2);
        assertEquals(expected,actual,"Not correct");

    }
    @Test
    void calculateArea_perimetrOfTriangle_areaOfTriangle(){
        double l1=1.5;
        double l2=2.0;
        double l3 =3.0;
        double expected=1.3331705629813464;
        double actual = LVL1Task3.calculateArea(l1,l2,l3);
        assertEquals(expected,actual,"Not correct");
    }

}
