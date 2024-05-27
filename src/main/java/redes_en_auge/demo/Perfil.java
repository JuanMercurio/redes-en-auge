package redes_en_auge.demo;
import jakarta.persistence.*;


import java.util.List;


@Entity
@Table(name = "perfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerfil;

    @Column
    private String sitioWeb;
    @Column
    private String ubicacion;  // corregido de Ubicacion a ubicacion
    @Column
    private String urlFotoPerfil;

    @OneToOne
    @JoinColumn(name = "usuario", referencedColumnName = "id")
    private Usuario usuario;

    @OneToMany
    private List<Publicacion> publicaciones;

    @OneToMany
    private List<Perfil> seguidores;

    @OneToOne
    private CalculadorDeIntereses calculador;
}
