# Xarvis Mark I Core

**Xarvis Mark I Core** es el núcleo lógico del asistente de IA personalizado **Xarvis Mark I**. Este componente se encarga del razonamiento, la memoria, el procesamiento de lenguaje y la toma de decisiones internas. No maneja entradas o salidas directamente, sino que funciona como cerebro del sistema, consultado por otros módulos como n8n o interfaces externas.

Este proyecto forma parte de un ecosistema mayor orquestado desde [`markverse`](https://github.com/tu-usuario/markverse), donde se integran todos los servicios necesarios: interfaz gráfica, conectores como WhatsApp y Google Calendar, y automatización mediante n8n.

---

## 🧠 ¿Qué hace este Core?

- Procesa instrucciones de alto nivel provenientes de otros sistemas.
- Almacena y recupera memoria de corto y largo plazo.
- Evalúa el estado de proyectos y tareas para tomar decisiones.
- Aplica lógica personalizada para priorizar, responder o accionar.
- Expone una interfaz programática (API) para ser consumido por otros módulos.

---

## 🎯 Objetivos del Proyecto

- Mantener el estado actualizado de tu agenda personal y proyectos.
- Aprender de tus rutinas para anticipar necesidades y ayudarte a decidir.
- Integrarse fácilmente con flujos externos como WhatsApp, email o eventos.
- Servir como backend semántico para un asistente de IA extendido.

---

## 📁 Estructura del repositorio

Este proyecto contiene la lógica interna de Xarvis. Su estructura está pensada para separar claramente los distintos aspectos del razonamiento:

```
/src
  /agent           ← Motor principal de razonamiento y decisiones
  /calendar        ← Interpretación de datos de agenda y rutinas
  /projects        ← Estado y análisis de ideas y proyectos en curso
  /whatsapp        ← Lógica abstracta de interacción por chat
  /memory          ← Manejo del conocimiento y contexto persistente
  /notifications   ← Generación de alertas y mensajes proactivos
/config            ← Configuración de reglas y comportamientos
/scripts           ← Scripts de utilidad para pruebas o setup
```

---

## ⚙️ Requisitos

- Java 17+
- Docker y Docker Compose
- Cuenta de Google con acceso a Calendar (para uso integrado)
- VPS con acceso por SSH (para despliegue en entorno productivo)

---

## 🚀 Instalación y uso

Este repositorio **no se ejecuta de forma autónoma**. Está pensado para ser utilizado como un servicio dentro de [`markverse`](https://github.com/tu-usuario/markverse), el entorno completo donde se orquesta todo el ecosistema Xarvis.

1. Cloná el repositorio `markverse`:
   ```bash
   git clone https://github.com/tu-usuario/markverse.git
   cd markverse
   ```

2. Asegurate de tener variables de entorno necesarias y configuraciones en orden.

3. Levantá todos los servicios:
   ```bash
   docker compose up --build
   ```

4. Accedé a n8n para crear flujos que usen este core como backend lógico.

---

## 📦 ¿Por qué construir tu propio asistente?

Si bien existen soluciones como Zapier, Notion AI, Google Assistant o Alexa, **Xarvis Mark I** te permite:
- Control total sobre datos, privacidad y lógica.
- Personalización infinita adaptada a tu forma de trabajar.
- Aprendizaje y práctica en desarrollo real de IA, backends y automatización.

---

## 🧩 Próximos pasos

- Integrar una base de conocimiento semántica.
- Implementar un sistema de reglas y prioridades evolutivo.
- Exponer una API externa para acceso desde apps móviles o web.
- Mejorar los modelos de memoria contextual y rutinas.

---

## Licencia

MIT. Usá, adaptá y mejorá este proyecto a tu gusto. Aprender es parte del viaje.
