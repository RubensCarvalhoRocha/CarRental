/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Marca;
import com.locagyn.persistencia.MarcaDao;
import com.locagyn.persistencia.IMarcaDao;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author arthu
 */
public class MarcaControle implements IMarcaControle {

    IMarcaDao marcaPersistencia = null;

    public MarcaControle() {
        this.marcaPersistencia = new MarcaDao();
    }

    private boolean buscarMarca(String descricao) throws Exception {
        try {
            ArrayList<Marca> listagem = marcaPersistencia.listagem();
            Iterator<Marca> lista = listagem.iterator();
            while (lista.hasNext()) {
                Marca aux = lista.next();
                if (aux.getDescricao().equalsIgnoreCase(descricao)) {
                    return true;
                }
            }
            return false;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void incluir(Marca objeto) throws Exception {
        if (buscarMarca(objeto.getDescricao())) {
            throw new Exception("Marca já foi cadastrada");
        }
        String descricao = objeto.getDescricao();
        if("".equals(descricao)){
            throw new Exception("Digite a Descrição");
        }
        String url = objeto.getUrl();
        if("".equals(url)){
            throw new Exception("Selecione a imagem");
        }
        marcaPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Marca objeto) throws Exception {
        if(buscarMarca(objeto.getDescricao()))  {
             throw new Exception("Marca já foi cadastrada");
        }
        String descricao = objeto.getDescricao();
        if("".equals(descricao)){
            throw new Exception("Digite a Descrição");
        }
        marcaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Marca> listagem() throws Exception {
        return marcaPersistencia.listagem(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Marca buscar(int id) throws Exception {
        return marcaPersistencia.buscar(id);
    }
    public void ChecarTxt() {
        
         try{
                        //Instanceia Marca.txt
            File Marca = new File("./src/com/locagyn/arquivodedados/Marca.txt");
            //condição que verifica se o Marca.txt foi apagado    
            if (!Marca.exists()) {
                    //cria um arquivo (vazio)
                    Marca.createNewFile();
                }
        }
        catch(IOException ex){
            
        }
    }
  
}
