
package enumeracao;


public enum StatusEnum {
    EM_PREPARACAO("Em preparação"),
    EM_TRANSPORTE("Em transporte"),
    EMTREGUE("Entregue ao cliente");
    
    private String status;
            
    private StatusEnum(String status){
        this.status = status;
    }
    public  String getStatus(){
        return this.status;
    }
    
}
