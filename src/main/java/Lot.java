import javax.persistence.*;

@Entity
@Table(name = "Lot")
public class Lot {
    @Id
    @Column(name = "id_lotu")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idLotu;
    @ManyToOne(targetEntity = Pojazdy.class)
    @JoinColumn(name = "id_pojazdu")
    private int idPojazdu ;
    @ManyToOne(targetEntity = Trasa.class)
    @JoinColumn(name = "id_trasy")
    private int idTrasy;
    @Column(name = "cena")
    private double cena;
    @Column(name = "data_wylotu")
    private String dataWylotu;
    @Column(name = "data_przylotu")
    private String dataPrzylotu;
    @Column(name = "pozwolenia")
    private  String pozwolenia;
}
