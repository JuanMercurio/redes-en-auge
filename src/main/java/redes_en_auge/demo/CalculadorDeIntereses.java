package redes_en_auge.demo;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class CalculadorDeIntereses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario", referencedColumnName = "idPerfil")
    private Perfil perfil;
}
