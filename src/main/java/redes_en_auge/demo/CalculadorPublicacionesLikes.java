package redes_en_auge.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class CalculadorPublicacionesLikes {
    private Integer ponderacionesLikes;
    private Integer ponderacionesPublicacion;
}
