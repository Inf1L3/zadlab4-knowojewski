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
public class Stożek {
    public float powierzchnia;
    private float powierzchniabok;
    private float powierzchniapods;
    private float s;
    public float objetosc;
    public float promien;
    public float h;    

    public Stożek(float promien, float h) {
        this.promien = promien;
        this.h = h;
    }
    
    public void Objetosc(){
        this.objetosc = (float)((Math.PI*(this.promien*this.promien)*this.h)/3);
    }
    public void Powierzchnia(){
        this.s = (float) Math.sqrt((this.promien*this.promien)+(this.h*this.h));
        this.powierzchniabok = (float) (Math.PI*this.promien*this.s);
        this.powierzchniapods= (float) (Math.PI*this.promien*this.promien);
        this.powierzchnia = (float) (this.powierzchniabok+this.powierzchniapods);
    }
    public void WyswietlFigury(){
        this.Objetosc();
        this.Powierzchnia();
        System.out.println("Stożek");
        System.out.println("Promień tego stożka wynosi: " + this.promien);
        System.out.println("Wysokość tego stożka wynosi: " + this.h );
        System.out.println("Tworząca tego stożka wynosi: " + this.s);
        System.out.println("Objętość tego stożka wynosi: " + this.objetosc);
        System.out.println("Powierzchnia tego stożka wynosi: " + this.powierzchnia);
    }
    
    
}
