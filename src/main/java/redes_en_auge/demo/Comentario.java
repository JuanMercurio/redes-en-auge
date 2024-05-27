package redes_en_auge.demo;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDateTime;

@Entity
@Table(name = "comentario")
@NoArgsConstructor
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComentario;

    @Column(name = "texto")
    private String texto;

    @Column(name = "fecha_publicacion")
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime fechaPublicacion;

    @ManyToOne
    @JoinColumn(name = "comentador", referencedColumnName = "idPerfil")
    private Perfil comentador;

    @ManyToOne
    @JoinColumn(name = "publicacion", referencedColumnName = "idPublicacion")
    private Publicacion publicacion;
}
