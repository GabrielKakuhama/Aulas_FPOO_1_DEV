package classe;

public class Carro {

    private String modelo;
    private String marca;
    private CorEnum cor;
    private int ano;
    private int qtdeRodas;
    private int marcha;
    private boolean estaEmRe;

    public Carro(String modelo, String marca, CorEnum cor, int ano, int qtdeRodas) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.qtdeRodas = qtdeRodas;
    }

    public void trocarDeMarcha(MarchaEnum novaMarcha) {
        int diferenca = novaMarcha.getNumeroMarcha();
        if (diferenca == 1) {
            this.marcha = novaMarcha.getNumeroMarcha();
        } else {
            System.out.println("Voce nao pode pulaer a marcha");
        }
    }

    public void engatarRe(boolean re) {
        this.estaEmRe = re;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", qtdeRodas=" + qtdeRodas + '}';
    }

}
