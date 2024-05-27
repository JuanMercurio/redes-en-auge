package redes_en_auge.demo;

import jakarta.persistence.*;

@Entity
@MappedSuperclass
public abstract class CalculadorDeIntereses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
