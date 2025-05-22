package com.xarvis.marki.memory;

import com.xarvis.marki.domain.MensajeEntrada;

import java.util.ArrayList;
import java.util.List;

public class MemoriaMensajes {
    private final List<MensajeEntrada> mensajes = new ArrayList<>();

    public void guardar(MensajeEntrada mensaje) {
        mensajes.add(mensaje);
    }

    public List<MensajeEntrada> obtenerTodos() {
        return mensajes;
    }
}
