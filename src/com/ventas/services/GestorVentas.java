package com.ventas.services;

import com.ventas.models.Venta;

import java.util.ArrayList;
import java.util.List;

public class GestorVentas {
    private List<Venta> ventas = new ArrayList<>();
    private int contadorVentas = 1;

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }

    public List<Venta> listarVentas() {
        return ventas;
    }
}
