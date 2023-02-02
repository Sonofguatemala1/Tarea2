import static org.junit.Assert.assertEquals;

import org.junit.Test;;
public class Test_calculator {
    Casio casio = new Casio();
    @Test
    public void test_add(){
        float a = 1;
        float b = 2; 
        float c=casio.Add(1, 2);
        assertEquals(3, c,0.00001);
    }

    @Test
    public void test_sustraction(){
        float a = 1;
        float b = 2; 
        float c=casio.Substraction(1, 2);
        assertEquals(1, c,0.00001);
    }
    @Test
    public void test_multiply(){
        float a = 1;
        float b = 2; 
        float c=casio.Multiply(1, 2);
        assertEquals(2, c,0.00001);
    }
    @Test
    public void test_Divition(){
        float a = 1;
        float b = 2; 
        float c=casio.Divition(1, 2);
        assertEquals(2, c,0.00001);
    }

}
