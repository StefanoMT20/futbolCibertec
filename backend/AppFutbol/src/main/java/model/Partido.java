package model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Equipo equipoLocal;

    @ManyToOne
    private Equipo equipoVisitante;

    private LocalDate fecha;

    private String resultado;
}
