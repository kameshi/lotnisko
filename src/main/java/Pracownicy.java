import javax.persistence.*;

@Entity
@Table(name = "Pracownicy")
public class Pracownicy {
    @Id
    @Column(name = "id_pracownika")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPracownika;
    @Column(name = "imie")
    private String imie;
    @Column(name = "nazwisko")
    private String nazwisko;
    @Column(name = "pesel")
    private String pesel;
    @Column(name = "nr_telefonu")
    private String nrTelefonu;
    @Column(name = "email")
    private String email;
    @Column(name = "adress")
    private String adress;
    @Column(name = "stanowisko")
    private String stanowisko;
    @Column(name = "pensja")
    private double pensja;
    @Column(name = "opis")
    private String opis;

}
