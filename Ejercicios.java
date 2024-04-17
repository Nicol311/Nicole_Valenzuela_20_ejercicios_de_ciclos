import java.util.Scanner;

public class Ejercicios {

    public static void _1_calcular_medidas() {
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        do {
            System.out.print("\nIngrese una medida en centímetros: ");
            int centimetros = entrada.nextInt();

            int kilometros = centimetros / 100000;
            centimetros %= 100000;
            int metros = centimetros / 100;
            centimetros %= 100;

            System.out.println("Resultado: " + kilometros + " kilómetros, " + metros + " metros y " + centimetros + " centímetros.");

            System.out.print("¿Desea calcular nuevamente para otras medidas? (s/n): ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public static void _2_imprimir_numeros() {
        int numero = 1;
        System.out.println("\nNúmeros del 1 al 10:");
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }
    }

    public static void _3_sumar_numeros() {
        int suma = 0;
        int numero = 1;
        while (numero <= 10) {
            suma += numero;
            numero++;
        }
        System.out.println("\nLa suma de los números del 1 al 10 es: " + suma);
    }

    public static void _4_verificar_par_impar() {
        Scanner entrada = new Scanner(System.in);
        String continuar;
        do {
            System.out.print("\nIngrese un número: ");
            int numero = entrada.nextInt();
            if (numero % 2 == 0) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }
            System.out.print("¿Desea ingresar otro número? (s/n): ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("s"));
    }
    
    public static void _5_calcular_promedio() {
        Scanner entrada = new Scanner(System.in);
        double suma = 0;
        System.out.println("");
        for (int i = 1; i <= 30; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            suma += entrada.nextDouble();
        }
        double promedio = suma / 30;
        System.out.println("El promedio de los 30 números ingresados es: " + promedio);
    }

    public static void _6_imprimir_numeros_pares() {
        int numero = 2;
        System.out.println("\nNúmeros pares del 1 al 20:");
        while (numero <= 20) {
            System.out.println(numero);
            numero += 2;
        }
    }

    public static void _7_sumar_impares() {
        int suma = 0;
        int numero = 1;
        while (numero <= 400) {
            if (numero % 2 != 0) {
                suma += numero;
            }
            numero++;
        }
        System.out.println("\nLa suma de los números impares del 1 al 400 es: " + suma);
    }

    public static void _8_calcular_area_circulo() {
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        do {
            System.out.print("\nIngrese el radio del círculo: ");
            double radio = entrada.nextDouble();
            if (radio <= 0) {
                System.out.println("El radio debe ser un número positivo.");
                continue;
            }
            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("El área del círculo es: " + area);
            System.out.print("¿Desea calcular el área de otro círculo? (s/n): ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public static void _9_calcular_perimetro_circulo() {
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        do {
            System.out.print("\nIngrese el radio del círculo: ");
            double radio = entrada.nextDouble();
            if (radio <= 0) {
                System.out.println("El radio debe ser un número positivo.");
                continue;
            }
            double perimetro = 2 * Math.PI * radio;
            System.out.println("El perímetro del círculo es: " + perimetro);
            System.out.print("¿Desea calcular el perímetro de otro círculo? (s/n): ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public static void _10_calcular_area_rectangulo() {
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        do {
            System.out.print("\nIngrese la base del rectángulo: ");
            double base = entrada.nextDouble();
            System.out.print("Ingrese la altura del rectángulo: ");
            double altura = entrada.nextDouble();
            if (base <= 0 || altura <= 0) {
                System.out.println("Las medidas deben ser números positivos.");
                continue;
            }
            double area = base * altura;
            System.out.println("El área del rectángulo es: " + area);
            System.out.print("¿Desea calcular el área de otro rectángulo? (s/n): ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public static void _11_calcular_volumen_esfera() {
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        do {
            System.out.print("\nIngrese el radio de la esfera: ");
            double radio = entrada.nextDouble();
            if (radio <= 0) {
                System.out.println("El radio debe ser un número positivo.");
                continue;
            }
            double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
            System.out.println("El volumen de la esfera es: " + volumen);
            System.out.print("¿Desea calcular el volumen de otra esfera? (s/n): ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public static void _12_calcular_area_perimetro_cubo() {
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        do {
            System.out.print("\nIngrese la longitud de un lado del cubo: ");
            double longitud = entrada.nextDouble();
            if (longitud <= 0) {
                System.out.println("La longitud debe ser un número positivo.");
                continue;
            }
            double area = 6 * Math.pow(longitud, 2);
            double perimetro = 12 * longitud;
            System.out.println("El área del cubo es: " + area);
            System.out.println("El perímetro del cubo es: " + perimetro);
            System.out.print("¿Desea calcular el área y perímetro de otro cubo? (s/n): ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public static void _13_imprimir_saltando_multiplos_de_3() {
        System.out.println("\nNúmeros del 1 al 100, saltando múltiplos de 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void _14_imprimir_saltando_multiplos_de_5() {
        int numero = 1;
        System.out.println("\nNúmeros del 1 al 100, saltando múltiplos de 5:");
        while (numero <= 100) {
            if (numero % 5 != 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }

    public static void _15_imprimir_saltando_multiplos_de_3_y_5() {
        int numero = 1;
        System.out.println("\nNúmeros del 1 al 100, saltando múltiplos de 3 y 5:");
        while (numero <= 100) {
            if (numero % 3 != 0 && numero % 5 != 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }

    public static void _16_imprimir_reemplazando_Cuek() {
        System.out.println("\nNúmeros del 1 al 100, reemplazando múltiplos de 3 por \"Cuek\":");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Cuek");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void _17_calcular_factorial() {
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        do {
            System.out.print("\nIngrese un número para calcular su factorial: ");
            int numero = entrada.nextInt();
            if (numero < 0) {
                System.out.println("El número debe ser positivo.");
                continue;
            }
            int factorial = 1;
            for (int i = numero; i > 0; i--) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
            System.out.print("¿Desea calcular el factorial de otro número? (s/n): ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public static void _18_contar_digitos() {
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        do {
            System.out.print("\nIngrese un número para contar sus dígitos: ");
            long numero = Math.abs(entrada.nextLong());
            int contador = 0;
            while (numero != 0) {
                numero /= 10;
                contador++;
            }
            System.out.println("El número ingresado tiene " + contador + " dígitos.");
            System.out.print("¿Desea contar los dígitos de otro número? (s/n): ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public static void _19_calcular_area_perimetro_cuadrado() {
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        do {
            System.out.print("\nIngrese el valor del lado del cuadrado: ");
            double lado = entrada.nextDouble();
            if (lado <= 0) {
                System.out.println("El lado debe ser un número positivo.");
                continue;
            }
            double area = lado * lado;
            double perimetro = 4 * lado;
            System.out.println("El área del cuadrado es: " + area);
            System.out.println("El perímetro del cuadrado es: " + perimetro);
            System.out.print("¿Desea calcular el área y perímetro de otro cuadrado? (s/n): ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

    public static void _20_calcular_potencia() {
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";
        do {
            System.out.print("\nIngrese la base de la potencia: ");
            double base = entrada.nextDouble();
            System.out.print("Ingrese el exponente de la potencia: ");
            int exponente = entrada.nextInt();
            if (base <= 0 || exponente < 0) {
                System.out.println("Ambos valores deben ser positivos.");
                continue;
            }
            double resultado = 1;
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + resultado);
            System.out.print("¿Desea calcular otra potencia? (s/n): ");
            continuar = entrada.next();
        } while (continuar.equalsIgnoreCase("s"));
    }

}