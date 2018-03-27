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
public class Sześcian {
    
    public float a;
    public double powierzchnia;
    public double objetosc;

    public Sześcian(float a) {
        this.a = a;
    }
    public void Powierzchnia(){
        this.powierzchnia = (a*a)*6;
    }
    public void Objetosc(){
        this.objetosc = a*a*a;
    }
    public void WyswietlFigury(){
        this.Powierzchnia();
        this.Objetosc();
        System.out.println("Sześcian");
        System.out.println("Bok tego sześcianu wynosi: " + this.a);
        System.out.println("Powierzchnia tego sześcianu wynosi: " + this.powierzchnia );
        System.out.println("Objętość tego sześcianu wynosi: " + this.objetosc );
    }
    
}
