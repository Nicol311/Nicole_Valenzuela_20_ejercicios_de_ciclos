import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n============== Menu ================\n");
            System.out.println("1. Calcular metros, kilómetros y centímetros de una medida.");
            System.out.println("2. Imprimir los números del 1 al 10.");
            System.out.println("3. Sumar los números del 1 al 10.");
            System.out.println("4. Verificar su el número ingresado es par o impar.");
            System.out.println("5. Calcular el promedio de 30 números ingresados.");
            System.out.println("6. Imprimir los números pares del 1 al 20.");
            System.out.println("7. Sumar los números impares del 1 al 400.");
            System.out.println("8. Calcular el área de un círculo y validar que el número ingresado sea positivo.");
            System.out.println("9. Calcular el perímetro de un círculo y validar que el número ingresado sea positivo.");
            System.out.println("10. Calcular el área de un rectángulo y validar si las medidas son positivas.");
            System.out.println("11. Calcular el volumen de una esfera y verificar si el radio es positivo.");
            System.out.println("12. Calcular el área y perimetro de un cubo, y verificar si la longitud es positiva.");
            System.out.println("13. Imprimir los números del 1 al 100, saltando los múltiplos de 3.");
            System.out.println("14. Imprimir los números del 1 al 100, saltando los múltiplos de 5.");
            System.out.println("15. Imprimir los números del 1 al 100, saltando los múltiplos de 3 y 5.");
            System.out.println("16. Imprimir los números del 1 al 100, pero reemplazando los múltiplos de 3 por 'Cuek'.");
            System.out.println("17. Calcular el factorial de un número.");
            System.out.println("18. Contar la cantidad de dígitos de un número ingresado.");
            System.out.println("19. Calcular el área y perímetro de un cuadrado y verificar si el valor del lado es positivo.");
            System.out.println("20. Calcular la potencia de un número y validar que ambos valores sean positivos.");
            System.out.println("21. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicios._1_calcular_medidas();
                    break;
                case 2:
                    Ejercicios._2_imprimir_numeros();
                    break;
                case 3:
                    Ejercicios._3_sumar_numeros();
                    break;
                case 4:
                    Ejercicios._4_verificar_par_impar();
                    break;
                case 5:
                    Ejercicios._5_calcular_promedio();
                    break;
                case 6:
                    Ejercicios._6_imprimir_numeros_pares();
                    break;
                case 7:
                    Ejercicios._7_sumar_impares();
                    break;
                case 8:
                    Ejercicios._8_calcular_area_circulo();
                    break;
                case 9:
                    Ejercicios._9_calcular_perimetro_circulo();
                    break;
                case 10:
                    Ejercicios._10_calcular_area_rectangulo();
                    break;
                case 11:
                    Ejercicios._11_calcular_volumen_esfera();
                    break;
                case 12:
                    Ejercicios._12_calcular_area_perimetro_cubo();
                    break;
                case 13:
                    Ejercicios._13_imprimir_saltando_multiplos_de_3();
                    break;
                case 14:
                    Ejercicios._14_imprimir_saltando_multiplos_de_5();
                    break;
                case 15:
                    Ejercicios._15_imprimir_saltando_multiplos_de_3_y_5();
                    break;
                case 16:
                    Ejercicios._16_imprimir_reemplazando_Cuek();
                    break;
                case 17:
                    Ejercicios._17_calcular_factorial();
                    break;
                case 18:
                    Ejercicios._18_contar_digitos();
                    break;
                case 19:
                    Ejercicios._19_calcular_area_perimetro_cuadrado();
                    break;
                case 20:
                    Ejercicios._20_calcular_potencia();
                    break;
                case 21:
                    System.out.println("\nFin del programa!\n");
                    break;
                default:
                    System.out.println("\nOpción no válida!");
                    break;
            }
        } while (opcion != 21);
        entrada.close();
    }
}
