package redes_en_auge.demo;
import java.util.List;
import java.time.LocalDate;
import jakarta.persistence.*;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;


@Entity
@Table(name = "publicacion")

public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPublicacion;

    @Column
    private String contenido;

    @Column(name = "fecha_publicacion")
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDate fechaPublicacion;

    @Column
    private String ubicacion;

    @OneToOne
    @JoinColumn(name = "usuario", referencedColumnName = "idUsuario")
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    private EstadoPublicacion estado;

    @OneToMany(mappedBy = "publicacion")
    private List<Comentario>comentarios;

}
