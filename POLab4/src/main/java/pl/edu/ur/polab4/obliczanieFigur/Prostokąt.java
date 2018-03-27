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
public class Prostokąt {
    public float a;
    public float b;
    public float pole;
    public float obwód;
    
    public Prostokąt(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void Pole(){
        this.pole = this.a*this.b;
    }
    public void Obwod(){
        this.obwód = this.a*2+this.b*2;
    }
    public void WyswietlFigury(){
        this.Pole();
        this.Obwod();
        System.out.println("Prostokąt");
        System.out.println("Bok a tego prostokąta wynosi: " + this.a);
        System.out.println("Bok b tego prostokąta wynosi: " + this.b);
        System.out.println("Pole tego prostokąta wynosi: " + this.pole );
        System.out.println("Obwód tego prostokąta wynosi: " + this.obwód );
    }
    
}
