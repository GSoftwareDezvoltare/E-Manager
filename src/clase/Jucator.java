/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author TechSolutions
 */
public class Jucator {
    String nume;
    String prenume;
    String cnp;
    String adresa;
    int id_grupa;
    int id_post;
    String telefon;
    String nume_tata;
    String nume_mama;

    public Jucator(String nume, String prenume, String cnp, String adresa, int id_grupa, int id_post, String telefon, String nume_tata, String nume_mama) {
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.adresa = adresa;
        this.id_grupa = id_grupa;
        this.id_post = id_post;
        this.telefon = telefon;
        this.nume_tata = nume_tata;
        this.nume_mama = nume_mama;
    }

    public Jucator() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getGrupa() {
        return id_grupa;
    }

    public void setGrupa(int id_grupa) {
        this.id_grupa = id_grupa;
    }

    public int getPost() {
        return id_post;
    }

    public void setPost(int id_post) {
        this.id_post = id_post;
    }
    
    public String getTelefon(){
        return telefon;
    }
    
    public void setTelefon(String telefon){
        this.telefon = telefon;
    }
    public String getNume_tata() {
        return nume_tata;
    }

    public void setNume_tata(String nume_tata) {
        this.nume_tata = nume_tata;
    }

    public String getNume_mama() {
        return nume_mama;
    }

    public void setNume_mama(String nume_mama) {
        this.nume_mama = nume_mama;
    }
    

    
    public String Afisare() {
        return "Jucator{" + "nume=" + nume + ", prenume=" + prenume + ", cnp=" + cnp + ", adresa=" + adresa + ", telefon=" + telefon +", id_grupa=" + id_grupa + ", id_post=" + id_post + ", nume_tata=" + nume_tata + ", nume_mama=" + nume_mama + '}';
    }
    
}
