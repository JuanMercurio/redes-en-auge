package redes_en_auge.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "medio_de_contacto")
public class MedioDeContacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedioDeontacto;

    @Enumerated(EnumType.STRING)
    private TipoContacto tipo;

    @Column(name = "valor")
    private String valor;

}
