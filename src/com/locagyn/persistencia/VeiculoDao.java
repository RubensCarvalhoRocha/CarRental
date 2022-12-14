/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.controle.CategoriaControle;
import com.locagyn.controle.ModeloControle;
import com.locagyn.Enumarations.SituacaoDoVeiculo;
import com.locagyn.Enumarations.TipoDeCombustivel;
import com.locagyn.Enumarations.TipoDoVeiculo;
import com.locagyn.ID.GeradorIdentificador;
import com.locagyn.modelos.Veiculo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author balta
 */
public class VeiculoDao implements IVeiculoDao {
    
    private String nomeDoArquivoNoDisco;
    
    public VeiculoDao() {
        
        this.nomeDoArquivoNoDisco =".\\src\\com\\locagyn\\arquivodedados\\Veiculo.txt";
    }
    
    @Override
    public void incluir(Veiculo objeto) throws Exception {
        try {
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorIdentificador.getID());
            //Escreve no arquivo
            bw.write(objeto.toString() + "\n");
            //fecha o arquivo
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    @Override
    public void alterar(Veiculo objeto) throws Exception {
        
        try {
            Iterator<Veiculo> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            
            while (lista.hasNext()) {
                
                Veiculo aux = lista.next();
                if (aux.getId() == objeto.getId()) {
                    bw.write(objeto.toString() + "\n");
                } else {
                    bw.write(aux.toString() + "\n");
                }
                
            }
            
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    @Override
    public ArrayList<Veiculo> listagem() throws Exception {
        
        try {
            ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                ModeloControle modelocontrole = new ModeloControle();
                CategoriaControle categoriaControle = new CategoriaControle();
                Veiculo objetoVeiculo = new Veiculo();
                String vetorString[] = linha.split(";");
                objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
                objetoVeiculo.setPlaca(vetorString[1]);
                objetoVeiculo.setRenavam(vetorString[2]);
                objetoVeiculo.setPrecoDeCompra(Float.parseFloat(vetorString[3]));
                objetoVeiculo.setPrecoDeVenda(Float.parseFloat(vetorString[4]));
                objetoVeiculo.setAnoFabricacao(Integer.parseInt(vetorString[5]));
                objetoVeiculo.setAnoModelo(Integer.parseInt(vetorString[6]));
                objetoVeiculo.setCombustivel(TipoDeCombustivel.valueOf(vetorString[7]));
                objetoVeiculo.setQuilometragem(Integer.parseInt(vetorString[8]));
                objetoVeiculo.setTipoVeiculo(TipoDoVeiculo.valueOf(vetorString[9]));
                objetoVeiculo.setSituacao(SituacaoDoVeiculo.valueOf(vetorString[10]));
                int idModelo = Integer.parseInt(vetorString[11]);
                objetoVeiculo.setModelo(modelocontrole.buscar(idModelo));
                int idCat = Integer.parseInt(vetorString[12]);
                objetoVeiculo.setCategoria(categoriaControle.buscar(idCat));
                
                listaDeVeiculos.add(objetoVeiculo);
            }
            br.close();
            return listaDeVeiculos;
        } catch (Exception erro) {
            throw erro;
        }
        
    }
    
    @Override
    public Veiculo buscar(int id) throws Exception {
        
        try {
            
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                ModeloControle modelocontrole = new ModeloControle();
                CategoriaControle categoriaControle = new CategoriaControle();
                Veiculo objetoVeiculo = new Veiculo();
                String vetorString[] = linha.split(";");
                objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
                objetoVeiculo.setPlaca(vetorString[1]);
                objetoVeiculo.setRenavam(vetorString[2]);
                objetoVeiculo.setPrecoDeCompra(Float.parseFloat(vetorString[3]));
                objetoVeiculo.setPrecoDeVenda(Float.parseFloat(vetorString[4]));
                objetoVeiculo.setAnoFabricacao(Integer.parseInt(vetorString[5]));
                objetoVeiculo.setAnoModelo(Integer.parseInt(vetorString[6]));
                objetoVeiculo.setCombustivel(TipoDeCombustivel.valueOf(vetorString[7]));
                objetoVeiculo.setQuilometragem(Integer.parseInt(vetorString[8]));
                objetoVeiculo.setTipoVeiculo(TipoDoVeiculo.valueOf(vetorString[9]));
                objetoVeiculo.setSituacao(SituacaoDoVeiculo.valueOf(vetorString[10]));
                int idModelo = Integer.parseInt(vetorString[11]);
                objetoVeiculo.setModelo(modelocontrole.buscar(idModelo));
                int idCat = Integer.parseInt(vetorString[12]);
                objetoVeiculo.setCategoria(categoriaControle.buscar(idCat));
                if (objetoVeiculo.getId() == id) {
                    br.close();
                    return new Veiculo(Integer.parseInt(vetorString[0]), vetorString[1], vetorString[2], Float.parseFloat(vetorString[3]), Float.parseFloat(vetorString[4]), Integer.parseInt(vetorString[5]), Integer.parseInt(vetorString[6]), TipoDeCombustivel.valueOf(vetorString[7]), Integer.parseInt(vetorString[8]), TipoDoVeiculo.valueOf(vetorString[9]), SituacaoDoVeiculo.valueOf(vetorString[10]), modelocontrole.buscar(idModelo), categoriaControle.buscar(idCat));
                }
                
            }
            
            return null;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    
    
}
