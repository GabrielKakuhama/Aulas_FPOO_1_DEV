
package classe;


public class Aluno {
    
    private String email;
    private String nome;
    private String ra;

   

    public Aluno(String email, String nome, String ra) {
        this.email = email;
        this.nome = nome;
        this.ra = ra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
}
