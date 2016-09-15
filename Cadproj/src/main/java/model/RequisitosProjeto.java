package model;
// Generated 15/09/2016 15:10:23 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * RequisitosProjeto generated by hbm2java
 */
public class RequisitosProjeto  implements java.io.Serializable {


     private int requisitosProjetoId;
     private String nomeProjeto;
     private String dataInicio;
     private String dataFinal;
     private Set requisitoses = new HashSet(0);
     private Set cadastroRequisitoses = new HashSet(0);

    public RequisitosProjeto() {
    }

	
    public RequisitosProjeto(int requisitosProjetoId, String nomeProjeto) {
        this.requisitosProjetoId = requisitosProjetoId;
        this.nomeProjeto = nomeProjeto;
    }
    public RequisitosProjeto(int requisitosProjetoId, String nomeProjeto, String dataInicio, String dataFinal, Set requisitoses, Set cadastroRequisitoses) {
       this.requisitosProjetoId = requisitosProjetoId;
       this.nomeProjeto = nomeProjeto;
       this.dataInicio = dataInicio;
       this.dataFinal = dataFinal;
       this.requisitoses = requisitoses;
       this.cadastroRequisitoses = cadastroRequisitoses;
    }
   
    public int getRequisitosProjetoId() {
        return this.requisitosProjetoId;
    }
    
    public void setRequisitosProjetoId(int requisitosProjetoId) {
        this.requisitosProjetoId = requisitosProjetoId;
    }
    public String getNomeProjeto() {
        return this.nomeProjeto;
    }
    
    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }
    public String getDataInicio() {
        return this.dataInicio;
    }
    
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getDataFinal() {
        return this.dataFinal;
    }
    
    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }
    public Set getRequisitoses() {
        return this.requisitoses;
    }
    
    public void setRequisitoses(Set requisitoses) {
        this.requisitoses = requisitoses;
    }
    public Set getCadastroRequisitoses() {
        return this.cadastroRequisitoses;
    }
    
    public void setCadastroRequisitoses(Set cadastroRequisitoses) {
        this.cadastroRequisitoses = cadastroRequisitoses;
    }




}

