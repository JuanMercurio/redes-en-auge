package redes_en_auge.demo;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@DiscriminatorValue("publicacion")
public class LikePublicacion extends Like{

    @ManyToOne
    @JoinColumn(referencedColumnName = "idPublicacion")
    private Publicacion publicacion;

    @Column(name = "motivo")
    private String motivo;
}
