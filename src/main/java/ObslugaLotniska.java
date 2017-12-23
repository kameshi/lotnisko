import javax.persistence.*;

@Entity
@Table(name = "ObslugaLotniska")
public class ObslugaLotniska {
    @Id
    @Column(name = "id_obslugi_lotniska")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idObslugiLotniska;
    @ManyToOne(targetEntity = Pojazdy.class)
    @JoinColumn(name = "id_pojazdu")
    private int idPojazdu;
    @Column(name = "wykonywana_praca")
    private String wykonywanaPraca;
    @Column(name = "czas_start")
    private String czasStart;
    @Column(name = "czas_stop")
    private String czasStop;

    public int getIdObslugiLotniska() {
        return idObslugiLotniska;
    }

    public void setIdObslugiLotniska(int idObslugiLotniska) {
        this.idObslugiLotniska = idObslugiLotniska;
    }

    public int getIdPojazdu() {
        return idPojazdu;
    }

    public void setIdPojazdu(int idPojazdu) {
        this.idPojazdu = idPojazdu;
    }

    public String getWykonywanaPraca() {
        return wykonywanaPraca;
    }

    public void setWykonywanaPraca(String wykonywanaPraca) {
        this.wykonywanaPraca = wykonywanaPraca;
    }

    public String getCzasStart() {
        return czasStart;
    }

    public void setCzasStart(String czasStart) {
        this.czasStart = czasStart;
    }

    public String getCzasStop() {
        return czasStop;
    }

    public void setCzasStop(String czasStop) {
        this.czasStop = czasStop;
    }
}
