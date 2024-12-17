package boletin_objetos_1.mensajes;

import java.time.LocalDate;

public class Mensaje {
    private String asunto, cuerpo;
    private LocalDate fechaEnvio;
    private Persona remitente, destinatario;

    public Mensaje(String asunto, String cuerpo, Persona remitente, Persona destinatario) {
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }
}
