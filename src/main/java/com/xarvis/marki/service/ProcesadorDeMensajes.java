package com.xarvis.marki.service;

import com.xarvis.marki.domain.MensajeEntrada;
import com.xarvis.marki.domain.MensajeRespuesta;
import com.xarvis.marki.memory.MemoriaMensajes;
import com.xarvis.marki.nlp.InterpreteDeMensajes;
import org.springframework.stereotype.Service;

@Service
public class ProcesadorDeMensajes {
    private final MemoriaMensajes memoria = new MemoriaMensajes();
    private final InterpreteDeMensajes interprete;

    public ProcesadorDeMensajes(InterpreteDeMensajes interprete) {
        this.interprete = interprete;
    }

    public MensajeRespuesta procesar(MensajeEntrada entrada) {
        memoria.guardar(entrada);
        return interprete.interpretar(entrada);
    }
}