package model;
// Generated 15/09/2016 15:10:23 by Hibernate Tools 4.3.1



/**
 * CadastroRequisitos generated by hbm2java
 */
public class CadastroRequisitos  implements java.io.Serializable {


     private int crId;
     private RequisitosProjeto requisitosProjeto;
     private String descricao;
     private String status;
     private String formato;

    public CadastroRequisitos() {
    }

    public CadastroRequisitos(int crId, RequisitosProjeto requisitosProjeto, String descricao, String status, String formato) {
       this.crId = crId;
       this.requisitosProjeto = requisitosProjeto;
       this.descricao = descricao;
       this.status = status;
       this.formato = formato;
    }
   
    public int getCrId() {
        return this.crId;
    }
    
    public void setCrId(int crId) {
        this.crId = crId;
    }
    public RequisitosProjeto getRequisitosProjeto() {
        return this.requisitosProjeto;
    }    
    public void setRequisitosProjeto(RequisitosProjeto requisitosProjeto) {
        this.requisitosProjeto = requisitosProjeto;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getFormato() {
        return this.formato;
    }
    
    public void setFormato(String formato) {
        this.formato = formato;
    }




}

