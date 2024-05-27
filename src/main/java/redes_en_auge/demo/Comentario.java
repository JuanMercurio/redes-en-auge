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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "texto")
    private String texto;

    @Column(name = "fecha_publicacion")
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime fechaPublicacion;

    @Column(name = "comentador")
    private Perfil comentador;

    @ManyToOne
    private Publicacion publicacion;
}
