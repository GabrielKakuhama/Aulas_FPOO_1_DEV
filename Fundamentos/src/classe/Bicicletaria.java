package classe;

public class Bicicletaria {
    public static void main(String[] args) {
        Bicicleta caloiCross = new Bicicleta(2, true, 
                8, "caloiCross", true, "Azul");
        System.out.println(caloiCross);
        
        caloiCross.andar();
        caloiCross.andar();
        caloiCross.andar();
         System.out.println(caloiCross);
    }
}
