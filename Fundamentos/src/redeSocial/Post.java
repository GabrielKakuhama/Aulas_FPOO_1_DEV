package redeSocial;

public class Post {

          private String titulo;
    private String usuario;
    private String descricao;
    private int comentarios;
    private int estrelas ;

    public Post(String titulo, String usuario, String descricao, int comentarios) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.descricao = descricao;
        this.comentarios = comentarios;
    }
    
 public int COMUM(){
     estrelas = 1;
     return estrelas;
 }
    public int LEGAL(){
        estrelas = 3;
        return estrelas;
    }
    public int SUPER_LEGAL(){
        estrelas = 5;
        return estrelas;
    }

    @Override
    public String toString() {
        return "RedeSocial{" + 
                "titulo=" + titulo +
                ", usuario=" + usuario + 
                ", descricao=" + descricao + 
                ", comentarios=" + comentarios + 
                ", estrelas=" + estrelas + '}';
    }
        
}
