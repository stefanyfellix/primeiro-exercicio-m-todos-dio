package dio.com.br;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercicío calculadora");
        Calculadora.soma(6, 8);
        Calculadora.subtracao(100, 90);
        Calculadora.multiplicacao(5, 5);
        Calculadora.divisao(200, 20);

        System.out.println("Exercicio mensagens");
        Mensagens.mensagem(10);
        Mensagens.mensagem(14);
        Mensagens.mensagem(23);

        System.out.println("Exercicio emprestimo");
        Emprestimo.calcular(100, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(2000, 4);
    }
}

