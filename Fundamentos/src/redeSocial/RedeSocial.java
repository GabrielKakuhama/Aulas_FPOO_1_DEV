package redeSocial;

public class RedeSocial {

    public static void main(String[] args) throws UnsupportedOperationException {

        Post num1 = new Post("Papagaio Falando", "Joao12", "Meu papagaio falando", 10);
        num1.COMUM();
        System.out.println(num1);
        Post num2 = new Post("Papagaio dormindo", "Joao12", "Meu papagaio dormindo", 25);
        num2.LEGAL();
        System.out.println(num2);
        Post num3 = new Post("Popo vs Junior Duble", "Fight Music", "Arcelino de Freitas Popo nocauteina Junior Duble no Fight Music ", 1000000);
        num3.SUPER_LEGAL();
        System.out.println(num3);
    }
}
