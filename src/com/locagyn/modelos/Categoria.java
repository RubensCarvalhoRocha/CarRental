/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

/**
 *
 * @author arthu
 */
public class Categoria {
     //Atributos
    private int id = 0;
    private String descricao = "";
    private float valor =0;
    //Metodos
    public Categoria(){
    }
    public Categoria(int id, String descricao, float valor){
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getValor(){
        return valor;
    }
    public void setValor(float valor){
        this.valor= valor;
    }

        
    
    @Override
    public String toString() {
        return id + ";" + descricao + ";" + valor;
    }
    
}
