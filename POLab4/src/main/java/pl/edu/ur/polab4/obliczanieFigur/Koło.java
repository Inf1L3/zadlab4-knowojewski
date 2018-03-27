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
public class Koło {
    public float średnica;
    public float pole;
    public float obwód;
    
    public Koło(float średnica){
        this.średnica=średnica;
    }
    
    public void Obwod(){
        this.obwód=(float) (2*Math.PI*(this.średnica/2));
    }
    
    public void Pole() {
        this.pole=(float) (Math.PI*((this.średnica/2)*(this.średnica/2)));
    }
    public void WyswietlFigury(){
        this.Pole();
        this.Obwod();
        System.out.println("Koło");
        System.out.println("Pole koła wynosi: " + this.pole );
        System.out.println("Obwód koła wynosi: " + this.obwód );
    }
}
