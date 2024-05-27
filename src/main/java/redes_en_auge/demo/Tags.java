package redes_en_auge.demo;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "tags")

public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTags;
    private String nombre;
}
