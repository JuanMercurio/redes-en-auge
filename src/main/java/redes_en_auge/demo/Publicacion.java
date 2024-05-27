package redes_en_auge.demo;
import java.util.List;
import java.time.LocalDate;
import jakarta.persistence.*;


@Entity
@Table(name = "publicacion")

public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPublicacion;

    private String contenido;
    private LocalDate fechaPublicacion;
    private String ubicacion;
    private Usuario usuario;
    private EstadoPublicacion estado;

    @OneToMany
    private List<Comentario>comentarios;

}
