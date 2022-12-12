/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.persistencia;
import com.locagyn.Enumarations.TipoDeCliente;
import com.locagyn.modelos.Cliente;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public interface IClienteDao {
    void incluir(Cliente objeto, TipoDeCliente tipoDoCliente) throws Exception;

    void alterar(Cliente objeto, TipoDeCliente tipoDoCliente) throws Exception;

    ArrayList<Cliente> listagem(TipoDeCliente tipoDoCliente) throws Exception;

    Cliente buscar(int id, TipoDeCliente tipoDoCliente) throws Exception;


    
}
