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

    // forma fea
    @OneToOne
    @JoinColumn(name = "usuario", referencedColumnName = "idUsuario")
    private Usuario usuario;

    // forma fea
    @OneToMany
    @JoinColumn(name = "perfil", referencedColumnName = "idPerfil")
    private List<Publicacion> publicaciones;

    @ManyToMany
    @JoinTable(
            name = "seguidos",
            // TODO confirmar que va en este orden el seguidor y el seguido
            joinColumns = { @JoinColumn(name = "seguidor") },
            inverseJoinColumns = { @JoinColumn(name = "seguido") }
    )
    private List<Perfil> seguidores;
}
