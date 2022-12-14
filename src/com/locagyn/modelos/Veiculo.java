/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

import com.locagyn.Enumarations.SituacaoDoVeiculo;
import com.locagyn.Enumarations.TipoDeCombustivel;
import com.locagyn.Enumarations.TipoDoVeiculo;

/**
 *
 * @author felipe
 */
public class Veiculo {

    private int id;
    private String placa;
    private String renavam;
    private float precoDeCompra;
    private float precoDeVenda;
    private int anoFabricacao;
    private int anoModelo;
    private TipoDeCombustivel combustivel;
    private int quilometragem;
    private TipoDoVeiculo tipoVeiculo;
    private SituacaoDoVeiculo situacao;
    private Modelo modelo;
    private Categoria categoria;

    public Veiculo() {
    }

    public Veiculo(int id, String placa, String renavam, float precoDeCompra, float precoDeVenda, int anoFabricacao, int anoModelo, TipoDeCombustivel combustivel, int quilometragem, TipoDoVeiculo tipoVeiculo, SituacaoDoVeiculo situacao, Modelo modelo, Categoria categoria) {
        this.id = id;
        this.placa = placa;
        this.renavam = renavam;
        this.precoDeCompra = precoDeCompra;
        this.precoDeVenda = precoDeVenda;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.tipoVeiculo = tipoVeiculo;
        this.situacao = situacao;
        this.modelo = modelo;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
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

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public float getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(float precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public float getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(float precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
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

    public TipoDeCombustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(TipoDeCombustivel combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public TipoDoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoDoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public SituacaoDoVeiculo getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoDoVeiculo situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return id + ";"+ placa + ";"+ renavam + ";"+ precoDeCompra + ";"+ precoDeVenda + ";"+ anoFabricacao + ";"+ anoModelo + ";"+ combustivel + ";"+ quilometragem + ";"+ tipoVeiculo + ";"+ situacao + ";"+ modelo.getId() + ";"+ categoria.getId();
    }

}
