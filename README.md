# Xarvis Mark I

**Xarvis Mark I** es un asistente de IA personalizado, diseñado para integrarse con tu calendario, tus proyectos, y tus flujos de trabajo. Su objetivo es ayudarte a organizar, recordar, y priorizar tareas e ideas de forma inteligente. Si bien existen alternativas gratis o con costos bajos similares, nada mejor que hacer el propio para mayor flexibilidad, máximo control y practicar mientras se desarrolla.

## Objetivos del Proyecto

- Gestionar eventos y recordatorios en Google Calendar
- Conectar con WhatsApp mediante n8n
- Enviar mails o whatsapp a contactos
- Almacenar el estado actual de tus proyectos, ideas y contexto
- Enviar notificaciones automáticas a través de distintos canales
- Aprender de tus rutinas para optimizar tu productividad

## Estructura inicial

```
/src
  /agent
  /calendar
  /projects
  /whatsapp
  /memory
  /notifications
/config
/scripts
Dockerfile
README.md
```

## Requisitos

- Java 17
- Docker y Docker Compose
- Cuenta de Google con acceso a Calendar
- VPS con acceso SSH

## Instalación

Este repositorio es construido como una imagen de Docker y utilizado dentro de `markverse`, que contiene la orquestación completa.

