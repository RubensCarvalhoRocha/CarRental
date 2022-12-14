/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

import com.locagyn.Enumarations.SituacaoAcessorio;

/**
 *
 * @author arthu
 */
public class Acessorios {
    //Atributos
    private int id = 0;
    private String descricao = "";
    private float valor = 0;
    private SituacaoAcessorio situacaoAcessorio;
    //Metodos
    public Acessorios(){
    }
    public Acessorios(int id, String descricao, float valor,SituacaoAcessorio situacaoAcessorio){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.situacaoAcessorio=situacaoAcessorio;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor= valor;
    }

    public SituacaoAcessorio getSituacaoAcessorio() {
        return situacaoAcessorio;
    }

    public void setSituacaoAcessorio(SituacaoAcessorio situacaoAcessorio) {
        this.situacaoAcessorio = situacaoAcessorio;
    }
    
    @Override
    public String toString() {
        return id + ";" + descricao + ";" + valor+";"+situacaoAcessorio;
    }
    
    
    
    
    
}
