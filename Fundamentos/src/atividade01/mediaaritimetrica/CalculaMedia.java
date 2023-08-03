package atividade01.mediaaritimetrica;

public class CalculaMedia {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("aluno01", "al@gmail.com", "a2345", 8, 9);
        
        int media = a1.calcularMedia();
        System.out.println("A media e: " + media);
        
    }
}
