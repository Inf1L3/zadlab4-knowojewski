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
public class Prostopadłościan {
    public float a,b,c;
    public double powierzchnia;

    public double objetosc;  

    public Prostopadłościan(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void Powierzchnia(){
        this.powierzchnia = 2*(a*b+a*c+b*c);
    }
    public void Objetosc(){
        this.objetosc = a*b*c;
    }    
    public void WyswietlFigury(){
        this.Powierzchnia();
        this.Objetosc();
        System.out.println("Prostopadłościan");
        System.out.println("Bok a tego prostopadłościanu wynosi: " + this.a);
        System.out.println("Bok b tego prostopadłościanu wynosi: " + this.b);
        System.out.println("Bok c tego prostopadłościanu wynosi: " + this.c);
        System.out.println("Powierzchnia tego prostopadłościanu wynosi: " + this.powierzchnia );
        System.out.println("Objętość tego prostopadłościanu wynosi: " + this.objetosc );
    } 
    
}
