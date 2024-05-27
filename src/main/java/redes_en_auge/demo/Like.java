package redes_en_auge.demo;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDateTime;


@Entity
@Table(name = "like_tabla")
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_de_like")
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "fecha_megusta")
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime fechaMegusta;

    @ManyToOne
    @JoinColumn(referencedColumnName = "idPerfil")
    private Perfil likeador;

    @Column(name = "esta_activo")
    private Boolean activo;
}
