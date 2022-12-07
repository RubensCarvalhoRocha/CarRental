/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.ID.GeradorIdentificador;
import com.locagyn.persistencia.IVeiculoDao;
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
 * @author felip
 */
public class VeiculoDao implements IVeiculoDao {
    
    private String nomeDoArquivoNoDisco;

    public VeiculoDao() {
        nomeDoArquivoNoDisco = "./src/com/locagyn/arquivodedados/Veiculo.txt";
    }

    @Override
    public void incluir(Veiculo objeto) throws Exception {
          try {
            // cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            // Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorIdentificador.getID());
            // Escreve no arquivo
            bw.write(objeto.toString() + "\n");
            // fecha o arquivo
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }
    
     
    

    @Override
    public void alterar(Veiculo objeto) throws Exception {
        try {
            Veiculo objetoVeiculo = new Veiculo();
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

        } catch (Exception e) {
        }
    }
       
    

    @Override
    public ArrayList<Veiculo> listagem() throws Exception {
       

    try {
            ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();
            File arquivo = new File("./src/com/locagyn/arquivosdedados/Modelo.txt");
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                nomeDoArquivoNoDisco = "./src/com/locagyn/arquivosdedados/Modelo.txt";
            }
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                IModeloDao objetoModelo = new ModeloDao();
                Veiculo objetoVeiculo = new Veiculo();
                String vetorString[] = linha.split(";");
                System.out.printf(linha);
                objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
                objetoVeiculo.setPlaca(vetorString[1]);
                objetoVeiculo.setTipodoVeiculo(vetorString[9]);
                //int idModelo = Integer.parseInt(vetorString[10]);
                //objetoVeiculo.setModelo(objetoModelo.buscar(idModelo));
                //System.out.print(objetoVeiculo);
                listaDeVeiculos.add(objetoVeiculo);

            }
            br.close();
            return listaDeVeiculos;
        } catch (Exception erro) {
            throw erro;
        }
    


    }
}