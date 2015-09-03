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
public class Antrenamente {
    String data;
    String denumire;
    String grupa;
    String antrenor;

    public Antrenamente() {
    }

    public Antrenamente(String data, String denumire, String grupa, String antrenor) {
        this.data = data;
        this.denumire = denumire;
        this.grupa = grupa;
        this.antrenor = antrenor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String Antrenament() {
        return "Antrenamente{" + "data=" + data + ", denumire=" + denumire + ", grupa=" + grupa + ", antrenor=" + antrenor + '}';
    }
    
    

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public String getAntrenor() {
        return antrenor;
    }

    public void setAntrenor(String antrenor) {
        this.antrenor = antrenor;
    }
    
}
