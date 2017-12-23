import javax.persistence.*;

@Entity
@Table(name = "Bilet")
public class Bilet {
    @Id
    @Column(name = "id_biletu")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idBiletu;
    @Column(name = "znizka")
    private double znizka;
    @Column(name = "nazwa")
    private String nazwa;

    public int getIdBiletu() {
        return idBiletu;
    }

    public void setIdBiletu(int idBiletu) {
        this.idBiletu = idBiletu;
    }

    public double getZnizka() {
        return znizka;
    }

    public void setZnizka(double znizka) {
        this.znizka = znizka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
