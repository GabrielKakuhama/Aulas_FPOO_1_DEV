package orientacaoobjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8" ));
        
        Cliente c1 = new Cliente("José Antonio dos Santos");
                System.out.println(c1);
           double valorLocacaoSimples = c1.calcularLocacao(3);
           System.out.println("O valor para locação do filme" + "simples é:" + valorLocacaoSimples);
           
        Cliente c2 = new Cliente("Marilza Sílva", "marilza.silva@gmail.com");
                System.out.println(c2);
                double valorLocacaoLancamento = c2.calcularLocacao(03, true);
                        System.out.println("O valor da locação do filme" + "lançamento é:" + valorLocacaoLancamento);
   
    }
}
