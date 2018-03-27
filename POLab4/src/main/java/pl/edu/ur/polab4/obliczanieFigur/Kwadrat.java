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
public class Kwadrat {
    public float a;
    public float pole;
    public float obwód;
    
    public Kwadrat(float a) {
        this.a = a;
    }
    public void Pole(){
        this.pole = this.a*this.a;
    }
    public void Obwod(){
        this.obwód = this.a*4;
    }
    public void WyswietlFigury(){
        this.Pole();
        this.Obwod();
        System.out.println("Kwadrat");
        System.out.println("Bok tego kwadratu wynosi: " + this.a);
        System.out.println("Pole tego kwadratu wynosi: " + this.pole );
        System.out.println("Obwód tego kwadratu wynosi: " + this.obwód );
    }
    
}
