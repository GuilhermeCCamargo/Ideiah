/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ideiah Computer
 */
@ManagedBean
@ViewScoped
public class ProjetoBean {
    
    private String nomeProjeto;
    private String mensagem;
    private String requisitos;
    private String tipo_req;
    private String status;
    private int dataInicio;
    private int dataTermino;
    private ArrayList<String> listaRequisitos;
    
    public ProjetoBean(){
        listaRequisitos = new ArrayList<>();
    }

    
    public void retornaTudo(){
        
        setMensagem("A mensagem é: " + getNomeProjeto() + getDataInicio() + getDataTermino() + getRequisitos()+ getTipo_req());
    }
    
    public void addRequisito(){
        String novo = new String();
        listaRequisitos.add(novo);
    }

    /**
     * @return the nomeProjeto
     */
    public String getNomeProjeto() {
        return nomeProjeto;
    }

    /**
     * @param nomeProjeto the nomeProjeto to set
     */
    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    /**
     * @return the dataInicio
     */
    public int getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(int dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataTermino
     */
    public int getDataTermino() {
        return dataTermino;
    }

    /**
     * @param dataTermino the dataTermino to set
     */
    public void setDataTermino(int dataTermino) {
        this.dataTermino = dataTermino;
    }

    

    
    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * @return the requisitos
     */
    public String getRequisitos() {
        return requisitos;
    }

    /**
     * @param requisitos the requisitos to set
     */
    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
    
    /**
     * @param tipo_req the tipo_req to set
     */
    public void setTipo_req(String tipo_req) {
        this.tipo_req = tipo_req;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the tipo_req
     */
    public String getTipo_req() {
        return tipo_req;
    }

    /**
     * @return the listaRequisitos
     */
    public ArrayList<String> getListaRequisitos() {
        return listaRequisitos;
    }

    /**
     * @param listaRequisitos the listaRequisitos to set
     */
    public void setListaRequisitos(ArrayList<String> listaRequisitos) {
        this.listaRequisitos = listaRequisitos;
    }
    
    
}