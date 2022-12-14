/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

//import com.locagyn.Enumarations.TipoDeCliente;
import com.locagyn.Enumarations.TipoDeCliente;
import static com.locagyn.Enumarations.TipoDeCliente.PESSOA_FISICA;
import static com.locagyn.Enumarations.TipoDeCliente.PESSOA_JURIDICA;
import com.locagyn.modelos.Cliente;
import com.locagyn.persistencia.ClienteDao;
import com.locagyn.persistencia.IClienteDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Felps
 */
public class ClienteControle implements IClienteControle {

    IClienteDao clientePersistencia = null;

    public ClienteControle() {
        this.clientePersistencia = new ClienteDao();
    }

    private boolean buscarCliente(String cpf_cnpj, TipoDeCliente tipoDoCliente) throws Exception {
        try {
            ArrayList<Cliente> listagem = clientePersistencia.listagem(tipoDoCliente);
            Iterator<Cliente> lista = listagem.iterator();
            if (tipoDoCliente == PESSOA_FISICA) {
                while (lista.hasNext()) {
                    Cliente aux = lista.next();
                    if (aux.getCpf().equalsIgnoreCase(cpf_cnpj)) {
                        return true;
                    }
                }
            }
            if (tipoDoCliente == PESSOA_JURIDICA) {
                while (lista.hasNext()) {
                    Cliente aux = lista.next();
                    if (aux.getCnpj().equalsIgnoreCase(cpf_cnpj)) {
                        return true;
                    }
                }
            }

            return false;
        } catch (Exception error) {
            throw error;
        }
    }

    @Override
    public void incluir(Cliente objeto, TipoDeCliente tipoDoCliente) throws Exception {
    
      
        
        clientePersistencia.incluir(objeto, tipoDoCliente);

    }

    @Override
    public void alterar(Cliente objeto, TipoDeCliente tipoDoCliente) throws Exception {

     
        clientePersistencia.alterar(objeto, tipoDoCliente);

    }

    @Override
    public ArrayList<Cliente> listagem(TipoDeCliente tipoDoCliente) throws Exception {

        return clientePersistencia.listagem(tipoDoCliente);

    }

    @Override
    public Cliente buscar(int id, TipoDeCliente tipoDoCliente) throws Exception {

        return clientePersistencia.buscar(id, tipoDoCliente);

    }

    
}