package cat.itacademy.barcelonactiva.medina.arleny.s04.t02.n01.model.domain;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "frutas")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Fruta {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "cantidadKg")
    private int cantidadKg;



}
