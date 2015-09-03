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
public class Users {
    String user;
    String parola;
    String nume;
    String prenume;
    String telefon;
    String adresa;
    int functie;
    String cnp;

    public Users() {
    }

    public Users(String user, String parola, String nume, String prenume, String telefon, String adresa, int functie, String cnp) {
        this.user = user;
        this.parola = parola;
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
        this.adresa = adresa;
        this.functie = functie;
        this.cnp = cnp;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getFunctie() {
        return functie;
    }

    public void setFunctie(int functie) {
        this.functie = functie;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    
    public String Afisare_User() {
        return "Users{" + "user=" + user + ", parola=" + parola + ", nume=" + nume + ", prenume=" + prenume + ", telefon=" + telefon + ", adresa=" + adresa + ", functie=" + functie + ", cnp=" + cnp + '}';
    }
    
    
}
