package com.example.mindtrack.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class EmotionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String thought;     // Pensamento registrado
    private String emotion;     //Emoção (ex: "Ansiedade", "Felicidade")
    private Integer intensity;  // INtensidade de 1 a 1
    private String situation;   // Contexto
    private LocalDateTime timestamp = LocalDateTime.now();  //data/hora automatica
}
