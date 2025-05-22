package com.xarvis.marki.domain;

import java.time.LocalDateTime;

public record MensajeEntrada(String texto, String origen, LocalDateTime timestamp) {}
