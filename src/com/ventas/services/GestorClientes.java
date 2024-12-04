package com.ventas.services;

import com.ventas.models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class GestorClientes {
    private List<Cliente> clientes = new ArrayList<>();

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente buscarClientePorId(int idCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente() == idCliente) {
                return cliente;
            }
        }
        return null; // Si no se encuentra, retornamos null
    }
}
