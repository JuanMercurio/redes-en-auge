package redes_en_auge.demo;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreDeUsuario;
    private String contrasenia;
    @OneToMany
    private List<MedioDeContacto> emails;
    private LocalDateTime fechaRegistro;
}
