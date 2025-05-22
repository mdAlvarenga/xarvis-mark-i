package com.xarvis.marki.controller;

import com.xarvis.marki.domain.MensajeEntrada;
import com.xarvis.marki.domain.MensajeRespuesta;
import com.xarvis.marki.service.ProcesadorDeMensajes;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/mensaje")
@RequiredArgsConstructor
public class MensajeController {
    private final ProcesadorDeMensajes procesador;

    @PostMapping
    public MensajeRespuesta recibir(@RequestBody String texto) {
        var entrada = new MensajeEntrada(texto, "whatsapp", LocalDateTime.now());
        return procesador.procesar(entrada);
    }
}
