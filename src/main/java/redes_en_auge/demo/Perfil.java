package redes_en_auge.demo;
import jakarta.persistence.*;


import java.util.List;


@Entity
@Table(name = "perfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerfil;

    private String sitioWeb;
    private String ubicacion;  // corregido de Ubicacion a ubicacion
    private String urlFotoPerfil;


    private Usuario usuario;

    @OneToMany
    private List<Publicacion> publicaciones;

    @OneToMany
    private List<Perfil> seguidores;
}
