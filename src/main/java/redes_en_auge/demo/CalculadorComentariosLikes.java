package redes_en_auge.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class CalculadorComentariosLikes extends CalculadorDeIntereses {
    private Integer ponderacionesLikes;
    private Integer ponderacionesPublicacion;
}
