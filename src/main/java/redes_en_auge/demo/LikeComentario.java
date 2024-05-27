package redes_en_auge.demo;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@DiscriminatorValue("comentario")
public class LikeComentario extends Like {

    @Column(name = "comentario")
    private Comentario comentario;
}
