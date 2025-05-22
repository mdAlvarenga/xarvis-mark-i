package com.xarvis.marki;

import com.xarvis.marki.domain.MensajeEntrada;
import com.xarvis.marki.nlp.InterpreteBasico;
import com.xarvis.marki.service.ProcesadorDeMensajes;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class ProcesadorDeMensajesTest {

    @Test
    void respondeMensajeConTextoEsperado() {
        var servicio = new ProcesadorDeMensajes(new InterpreteBasico());
        var entrada = new MensajeEntrada("¿Qué tengo hoy?", "test", LocalDateTime.now());

        var respuesta = servicio.procesar(entrada);

        assertThat(respuesta.respuesta()).isEqualTo("Tenés 3 eventos en tu agenda.");
    }

    @Test
    void respondePorDefectoCuandoNoEntiende() {
        var servicio = new ProcesadorDeMensajes(new InterpreteBasico());
        var entrada = new MensajeEntrada("mensaje desconocido", "test", LocalDateTime.now());

        var respuesta = servicio.procesar(entrada);

        assertThat(respuesta.respuesta()).contains("no entiendo");
    }
}
