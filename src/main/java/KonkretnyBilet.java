import javax.persistence.*;

@Entity
@Table(name = "KonkretnyBilet")
public class KonkretnyBilet {
    @Id
    @Column(name = "id_konkretny_bilet")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idKonkretnyBilet;
    @ManyToOne(targetEntity = Bagaz.class)
    @JoinColumn(name = "id_bagazu")
    private int idBagazu;
    @ManyToOne(targetEntity = Klient.class)
    @JoinColumn(name = "id_klienta")
    private int idKlienta;
    @ManyToOne(targetEntity = Lot.class)
    @JoinColumn(name = "id_lotu")
    private int idLotu;

    public int getIdBagazu() {
        return idBagazu;
    }

    public void setIdBagazu(int idBagazu) {
        this.idBagazu = idBagazu;
    }

    public int getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(int idKlienta) {
        this.idKlienta = idKlienta;
    }

    public int getIdLotu() {
        return idLotu;
    }

    public void setIdLotu(int idLotu) {
        this.idLotu = idLotu;
    }
}
