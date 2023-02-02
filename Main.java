import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int i = 0;
        Casio casio = new Casio();
        Istack<String> stack = new StackArrayList<String>();


        System.out.println("Bienvenido a la calculadora donde tienes que meter datos de forma extraña!");
       
        while(i == 0){
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
                System.out.println(a);
                stack.push(a);
            }

            for (int j = 0; i < stack.size(); j++) {
                System.out.println(stack.pop());
              }


        }

         // Create a Scanner object






    }

}