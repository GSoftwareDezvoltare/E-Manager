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
public class Grupe {
    String denumire;
    
    public Grupe(){
    }

    public Grupe(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        return "Grupe{" + "denumire=" + denumire + '}';
    }
    
}
