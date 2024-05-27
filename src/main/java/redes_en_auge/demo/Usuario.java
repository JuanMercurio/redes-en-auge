package redes_en_auge.demo;

import jakarta.persistence.*;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "nombre_de_usuario")
    private String nombreDeUsuario;

    @Column(name = "contrasenia")
    private String contrasenia;

    // forma fea
    @OneToMany
    @JoinColumn(name = "usuario", referencedColumnName = "idUsuario")
    private List<MedioDeContacto> emails;

    @Column(name = "fecha_registro")
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime fechaRegistro;
}
