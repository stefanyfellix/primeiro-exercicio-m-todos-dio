package dio.com.br;

public class Calculadora {
    static void soma(int numero1, int numero2){
        int resultado = numero1 + numero2;

        System.out.println("O resultado da soma do numero1 com o numero2 é: " + resultado);
    }

    static void subtracao(int numero1, int numero2){
        int resultado = numero1 - numero2;

        System.out.println("O resultado da subtração do numero1 com o numero2 é: " + resultado);
    }

    static void multiplicacao(int numero1, int numero2){
        int resultado = numero1 * numero2;

        System.out.println("O resultado da multiplicação do numero1 com o numero2 é: " + resultado);
    }

    static void divisao(int numero1, int numero2){
        int resultado = numero1 / numero2;

        System.out.println("O resultado da divisão do numero1 com o numero2 é: " + resultado);
    }


}
