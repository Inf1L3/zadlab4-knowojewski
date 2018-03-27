/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author XsaRdaS
 */
public class Kula {
    
    public float promien;
    public float objetosc;
    public float powierzchnia;

    public Kula(float promien) {
        this.promien = promien;
    }    
    public void objetosc(){
        this.objetosc = (float) ((4/3)*(Math.PI*(this.promien*this.promien*this.promien)));
    }
    public void powierzchnia(){
        this.powierzchnia = (float) (4*Math.PI*(this.promien*this.promien));
    }
    public void WyswietlFigury(){
        this.objetosc();
        this.powierzchnia();
        System.out.println("Kula");
        System.out.println("Promień tej kuli wynosi: " + this.promien);
        System.out.println("Powierzchnia tej kuli wynosi: " + this.powierzchnia );
        System.out.println("Objętość tej kuli wynosi: " + this.objetosc );
    }
    
}
