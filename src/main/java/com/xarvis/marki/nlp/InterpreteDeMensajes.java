package com.xarvis.marki.nlp;

import com.xarvis.marki.domain.MensajeEntrada;
import com.xarvis.marki.domain.MensajeRespuesta;

public interface InterpreteDeMensajes {
    MensajeRespuesta interpretar(MensajeEntrada entrada);
}
