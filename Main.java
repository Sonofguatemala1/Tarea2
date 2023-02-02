import java.util.Scanner;

public class Main {

    
 
    
    /** 
     * Clase: Estructura de datos. 
     * Nombre: Pablo Josue Noack Cajbon 
     * Carnet: 17596
     * Tarea: Hoja de trabajo 2 
     * Esta rutina prendente ejecutar la rutina de una calculadora que emplea postfix para hacer los calculos. 
     * Para esto toma un string separado por espacios y valida si es numero o simbolo. 
     * En caso sea numero lo agrega a una estructura Stack la cual es un ArrayList
     * Cuando encuentra un simbolo valida cual simbolo es y manda a llamar a la clase casio que implementa Icalculator. 
     * Y hace la operación, el resultado lo mete en el stack y busca el siguiente numero y el siguiente simbolo para repetir el proceso.
     * @param args
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int i = 0;
        
        Casio casio = new Casio();
        


        System.out.println("Bienvenido a la calculadora donde tienes que meter datos de forma extraña!");
       
        while(i == 0){
            int j = 0;
            Istack<Float> stack = new StackArrayList<Float>();
            System.out.println("El formato en el que debes agregar la formula a resolver es el siguiente: ab operacion c operacion2");
            System.out.println("Como ya sabemos que no le van a entender aquí se deja un ejemplo:");
            System.out.println("4 5 + 6 - 7 8 9* -");
            System.out.println("Que simboliza: ");
            System.out.println("(4+5-6-((8*9)-7)");
            System.out.println(" ");
            System.out.println("Reglas:");
            System.out.println("Si vamos a juntar n operandos la cantidad de operadores tienen que ser n-1");
            System.out.println("Es erroneo escribir:");
            System.out.println("3 4 + - *");
            System.out.println("3 4 5 +");
            System.out.println(" ");
            System.out.println("Tambien hay que dejar un espacio entre operandores y operandos");
            System.out.println("Se admiten numeros del 0 al 9 y operaciones basicas: +, -, *,/");
            System.out.println(" ");
            System.out.println("Introduzca la ecuación:");
            String postfix = myObj.nextLine();
            System.out.println("Su ecuación es:");
            System.out.println(postfix);
            String[] arrOfStr = postfix.split(" ");
            for (String a : arrOfStr) {
                //  Valido si el string es un numero y si es un numero pero está al final significa que no hay operación por lo tanto es invalido
                
                if(isNumeric(a)==true && j<arrOfStr.length-1 ){
                    float val = Float.parseFloat(a);
                    stack.push(val);
                }
                //  Si es invalido por ser numero y estar en la ultima parte mando el siguiente mensaje    
                else if (isNumeric(a)==true && j==arrOfStr.length-1 ){
                    System.out.println("Esta mala la expresión mi rey");
                }
                //  Si no es numero entonces valido que el stack tenga mas de un dato porque todas las operaciones tienen que ser binarias-
                else if (isNumeric(a)==false){
                    
                    if(stack.size()>1){
                     if(a.equals("+")){
        
                        float val1 = stack.pop();
                        float val2 = stack.pop();
                        System.out.println("***************");
                        System.out.println(val1);
                        System.out.println(val2);
                        stack.push(casio.Add(val1, val2));
                     }

                     else if(a.equals("-")){
                        float val1 = stack.pop();
                        float val2 = stack.pop();
                        stack.push(casio.Substraction(val1, val2));
                     }

                     else if(a.equals("*")){
                        float val1 = stack.pop();
                        float val2 = stack.pop();
                        stack.push(casio.Multiply(val1, val2));
                     }

                     else if(a.equals("/")){
                        float val1 = stack.pop();
                        float val2 = stack.pop();
                        stack.push(casio.Divition(val1, val2));
                     }
                     
                     
                     
                    }

                    else {
                        System.out.println("Esta mala la expresión mi rey");
                    }
                }
                j = j+1;
                
            }

            System.out.println("Resultado");
            System.out.println(stack.peek());
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");

            
            System.out.println("Continuar? Y/N");
            String decision= myObj.nextLine();
            if (decision.equals("N")){
                i = 666;
            }
            else{
                i = 0;
            }

            



        }

    }

    
    /** 
     * Esta clase verifica si el valor de una string puede volverse un float. 
     * El codigo lo obtuve del link: https://www.geeksforgeeks.org/convert-string-to-double-in-java/
     * @param strNum
     * @return boolean
     */
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Float.parseFloat(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    

}