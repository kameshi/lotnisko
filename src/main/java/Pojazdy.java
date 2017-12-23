import javax.persistence.*;

@Entity
@Table(name = "Pojazdy")
public class Pojazdy {
    @Id
    @Column(name = "id_pojazdu")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPojazdu;
    @ManyToOne(targetEntity = FirmaZewnetrzna.class)
    @JoinColumn(name = "id_firmy_zew")
    private int idFirmyZew;
    @Column(name = "rodzaj")
    private String rodzaj;
    @Column(name = "marka")
    private String marka;
    @Column(name = "model")
    private String model;
    @Column(name = "rok_produkcji")
    private String rokProdukcji;
    @Column(name = "stan_techniczny")
    private String stanTechniczny;
    @Column(name = "dostepnosc")
    private String dostepnosc;
    @Column(name = "ladownosc")
    private String ladownosc;
    @Column(name = "ilosc_miejsc")
    private String iloscMiejsc;
    @Column(name = "bak")
    private String bak;
    @Column(name = "opis")
    private String opis;

    public int getIdPojazdu() {
        return idPojazdu;
    }

    public void setIdPojazdu(int idPojazdu) {
        this.idPojazdu = idPojazdu;
    }

    public int getIdFirmyZew() {
        return idFirmyZew;
    }

    public void setIdFirmyZew(int idFirmyZew) {
        this.idFirmyZew = idFirmyZew;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(String rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getStanTechniczny() {
        return stanTechniczny;
    }

    public void setStanTechniczny(String stanTechniczny) {
        this.stanTechniczny = stanTechniczny;
    }

    public String getDostepnosc() {
        return dostepnosc;
    }

    public void setDostepnosc(String dostepnosc) {
        this.dostepnosc = dostepnosc;
    }

    public String getLadownosc() {
        return ladownosc;
    }

    public void setLadownosc(String ladownosc) {
        this.ladownosc = ladownosc;
    }

    public String getIloscMiejsc() {
        return iloscMiejsc;
    }

    public void setIloscMiejsc(String iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
