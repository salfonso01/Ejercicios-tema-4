public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ejercicio1(-1);
        ejercicio1(0);
        ejercicio1(5);


       // Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile 
       // sea inferior a 3, el bloque de código que tendrá el bucle deberá:
       // Incrementar el valor de la variable en uno cada vez que se ejecute.
       // Mostrarlo por pantalla cada vez que se ejecute.
        
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println("El valor es: " + numeroWhile);

        // Para el bucle Do While, deberás crear la misma estructura que en el While, 
        // pero solo se debe ejecutar una vez.

        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile > 3);

        //bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su 
        //condición será que la variable sea igual o menor que 3, se irá incrementando en 1 
        //su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro 
        // estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por 
        // consola informando de la estación en la que está. También habrá que poner un default para cuando 
        // el valor de la variable no sea una estación

        String estacion = "Invierno";
        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }
    }
    
    //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

    public static void ejercicio1(float numeroIf) {
        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es 0");
        }
    }

    

}