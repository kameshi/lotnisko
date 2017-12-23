import javax.persistence.*;

@Entity
@Table(name = "Bagaz")
public class Bagaz {
    @Id
    @Column(name = "id_bagazu")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBagazu;
    @ManyToOne(targetEntity = Lot.class)
    @JoinColumn(name = "id_lotu")
    private int idLotu;
    @Column(name = "typ")
    private String typ;
    @Column(name = "waga")
    private double waga;
    @Column(name = "opis")
    private String opis;

    public int getIdBagazu() {
        return idBagazu;
    }

    public void setIdBagazu(int idBagazu) {
        this.idBagazu = idBagazu;
    }

    public int getIdLotu() {
        return idLotu;
    }

    public void setIdLotu(int idLotu) {
        this.idLotu = idLotu;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
