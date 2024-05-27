package redes_en_auge.demo;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class CalculadorDeIntereses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
