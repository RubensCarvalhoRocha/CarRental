/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

/**
 *
 * @author felip
 */
public class Veiculo {
    private int id;
   private String placa;
   private int renavam;
   private float precoCompra;
   private float precoVenda;
   private int anoFabricacao;
   private int anoModelo;
   private Object combustivel;
   private int quilometragem;
   private Object tipodoVeiculo;
   
   
   public Veiculo(){
   }
   
   public Veiculo(String placa, int renavam,int id,
           float precoCompra,
           float precoVenda,
           int anoFabricacao, 
           int anoModelo,
           Object combustivel,
           int quilometragem,
           Object tipodoVeiculo
           ){
       this.id = id;
       this.renavam = renavam;
       this.precoCompra = precoCompra;
       this.placa = placa;
       this.precoVenda = precoVenda;
       this.anoFabricacao = anoFabricacao;
       this.anoModelo = anoModelo;
       this.combustivel = combustivel;
       this.quilometragem = quilometragem;
       this.tipodoVeiculo = tipodoVeiculo;
       
       
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Object getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Object combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Object getTipodoVeiculo() {
        return tipodoVeiculo;
    }

    public void setTipodoVeiculo(Object tipodoVeiculo) {
        this.tipodoVeiculo = tipodoVeiculo;
    }
    
   
  
    
}
