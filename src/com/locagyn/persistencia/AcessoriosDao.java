/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.ID.GeradorIdentificador;
import com.locagyn.modelos.Acessorios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author arthu
 */
public class AcessoriosDao implements IAcessoriosDao{
 private String nomeDoArquivoNoDisco;

    public AcessoriosDao() {
        nomeDoArquivoNoDisco = "./src/com/locagyn/arquivodedados/Acessorios.txt";
    }

    @Override
    public void incluir(Acessorios objeto) throws Exception {
          try {  
                        
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //incluindo o id no objeto******
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
    public void alterar(Acessorios objeto) throws Exception {
          try {
            Iterator<Acessorios> lista = listagem().iterator();
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);

            while (lista.hasNext()) {
                Acessorios aux = lista.next();
                if (aux.getId() == objeto.getId()) {
                    bw.write(objeto.toString() + "\n");
                } else {
                    bw.write(aux.toString() + "\n");
                }
            }
            bw.close();

        } catch (Exception e) {
        }
    }

    @Override
    public ArrayList<Acessorios> listagem() throws Exception {
         try {
            ArrayList<Acessorios> listaDeMarcas = new ArrayList<Acessorios>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Acessorios objetoAcessorios = new Acessorios();
                String vetorString[] = linha.split(";");
                objetoAcessorios.setId(Integer.parseInt(vetorString[0]));
                objetoAcessorios.setDescricao(vetorString[1]);
                objetoAcessorios.setValor(vetorString[2]);
                listaDeMarcas.add(objetoAcessorios);
            }
            br.close();
            return listaDeMarcas;
        } catch (Exception erro) {
            throw erro;
        }
    }
    
}
