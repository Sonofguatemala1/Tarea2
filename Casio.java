public class Casio implements ICalculator{

    public float Add(float a, float b) {

        float c = a+b;
        return c;
    }

    public float Substraction(float a, float b) {

        float c = b-a;
        return c;
    }

    public float Multiply(float a, float b) {

        float c = b*a;
        return c;
    }

    public float Divition(float a, float b) {

        float c = b/a;
        return c;
    }
}
