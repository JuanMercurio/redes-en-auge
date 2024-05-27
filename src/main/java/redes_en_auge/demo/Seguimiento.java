package redes_en_auge.demo;

import jakarta.persistence.*;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "seguimiento")
public class Seguimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_seguimiento")
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime fechaSeguimiento;

    @OneToOne
    @JoinColumn(referencedColumnName = "idPerfil")
    private Perfil seguidor;

    @OneToOne
    @JoinColumn(referencedColumnName = "idPerfil")
    private Perfil seguido;
}
