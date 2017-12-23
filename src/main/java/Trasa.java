import javax.persistence.*;

@Entity
@Table(name = "Trasa")
public class Trasa {
    @Id
    @Column(name = "id_trasy")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTrasy;
    @Column(name = "opis")
    private String opis;
    @Column(name = "poczatek")
    private String poczatek;
    @Column(name = "koniec")
    private String koniec;
}
