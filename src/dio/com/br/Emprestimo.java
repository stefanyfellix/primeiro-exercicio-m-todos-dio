package dio.com.br;

public class Emprestimo {
    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }

    public static double taxaDuasParcelas(){
        return 0.5;
    }
    public static double taxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(int valor, int quantidadeParcelas){
        if(quantidadeParcelas == 2){
            double valorTotal = valor + (valor + getDuasParcelas());
            System.out.println("O valor total do emprestimo é de R$" + valorTotal);

        }else if(quantidadeParcelas == 3){
            double valorTotal = valor + (valor + getTresParcelas());
            System.out.println("O valor total do emprestimo é de R$" + valorTotal);
        }else{
            System.out.println("Valor de parcelas não existente");
        }
    }
}
