/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Motorista;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public interface IMotoristaControle {
    void incluir(Motorista objeto)throws Exception;
    void alterar(Motorista objeto)throws Exception;
    void buscar(int id)throws Exception;
    ArrayList<Motorista> listagem()throws Exception;
    
}
