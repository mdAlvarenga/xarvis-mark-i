package com.xarvis.marki.nlp;

import com.xarvis.marki.domain.MensajeEntrada;
import com.xarvis.marki.domain.MensajeRespuesta;
import org.springframework.stereotype.Component;

@Component
public class InterpreteBasico implements InterpreteDeMensajes {

    @Override
    public MensajeRespuesta interpretar(MensajeEntrada entrada) {
        String texto = entrada.texto().toLowerCase();

        String respuesta = switch (texto) {
            case "¿qué tengo hoy?", "que tengo hoy" -> "Tenés 3 eventos en tu agenda.";
            case "anotá esto" -> "Decime qué querés que anote.";
            case "recordame x" -> "Lo anoto para recordarte.";
            default -> "Todavía no entiendo eso, pero estoy aprendiendo.";
        };

        return new MensajeRespuesta(respuesta);
    }
}
