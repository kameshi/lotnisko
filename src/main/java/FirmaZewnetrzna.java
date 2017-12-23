import javax.persistence.*;

@Entity
@Table(name = "FirmaZewnetrzna")
public class FirmaZewnetrzna {
    @Id
    @Column(name = "id_firmy_zew")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFirmyZew;
    @Column(name = "nazwa")
    private String nazwa;
    @Column(name = "nip")
    private String nip;
    @Column(name = "regon")
    private String regon;
    @Column(name = "nr_telefonu")
    private String nrTelefonu;
    @Column(name = "email")
    private String email;
    @Column(name = "adress")
    private String adress;
    @Column(name = "opis")
    private String opis;

    public int getIdFirmyZew() {
        return idFirmyZew;
    }

    public void setIdFirmyZew(int idFirmyZew) {
        this.idFirmyZew = idFirmyZew;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
