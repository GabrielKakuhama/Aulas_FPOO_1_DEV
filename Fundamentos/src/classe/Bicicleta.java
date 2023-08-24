package classe;

public class Bicicleta {
    // atributos, sao as caracteristicas

    private int qtdeRodas;
    private boolean temMarchas;
    private int qtdeMarchas;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situacao;
    private int velocidade;

    //construtor
    public Bicicleta() {

    }
    //construtor com argumentos

    public Bicicleta(int qtdeRodas, boolean temMarchas, int qtdeMarchas,
            String modelo, boolean freio, String cor) {
        this.qtdeRodas = qtdeRodas;
        this.temMarchas = temMarchas;
        this.qtdeMarchas = qtdeMarchas;
        this.modelo = modelo;
        this.temFreio = freio;
        this.cor = cor;
        this.situacao = "parada";
        this.velocidade = 0;
    }

    //Ações da bicicleta 
    public void andar() {
        System.out.println("Bicicleta andando");
        this.situacao = "andando";
        this.velocidade += 2;
    }

    public void freiar() {
        this.situacao = "Freiando";
        this.velocidade -= 1;
    }

    public boolean verificarSeTemFreio() {
        return this.temFreio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "qtdeRodas=" + qtdeRodas + ", temMarchas=" + temMarchas + ", qtdeMarchas=" + qtdeMarchas + ", modelo=" + modelo + ", temFreio=" + temFreio + ", cor=" + cor + '}';
    }

}
