import javax.persistence.*;

@Entity
@Table(name = "Zaloga")
public class Zaloga {
    @Id
    @Column(name = "id_zaloga")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idZaloga;
    @ManyToOne(targetEntity = Lot.class)
    @JoinColumn(name = "id_lotu")
    private int idLotu;
    @ManyToOne(targetEntity = Pracownicy.class)
    @JoinColumn(name = "id_pracownika")
    private int idPracownika;
}
