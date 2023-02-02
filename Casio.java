public class Casio implements ICalculator{

    
    /** 
     * Esta clase suma los valores a y b
     * @param a
     * @param b
     * @return float
     */
    public float Add(float a, float b) {

        float c = a+b;
        return c;
    }

    
    /** 
     * Esta clase resta los parametros a y b
     * @param a
     * @param b
     * @return float
     */
    public float Substraction(float a, float b) {

        float c = b-a;
        return c;
    }

    
    /** 
     * esta clase multiplica 2 parametros
     * @param a
     * @param b
     * @return float
     */
    public float Multiply(float a, float b) {

        float c = b*a;
        return c;
    }

    
    /** 
     * esta clase divide 2 parametros
     * @param a
     * @param b
     * @return float
     */
    public float Divition(float a, float b) {

        float c = b/a;
        return c;
    }
}
