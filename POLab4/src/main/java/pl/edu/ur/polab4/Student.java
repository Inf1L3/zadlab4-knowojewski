/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
public class Student {
    public String imie;
    public String nazwisko;
    public int nr_indeksu;
    public String specjalnosc;
    public int rok_studiow;
    
    public Student(String imie){
        this.imie=imie;
    }
    
    public Student(String nazwisko, int nr_indeksu){
        this.nazwisko=nazwisko;
        this.nr_indeksu=nr_indeksu;
    }
    
    public Student(int rok_studiow){
    this.rok_studiow=rok_studiow;
}
    public Student(int rok_studiow,String specjalnosc){
       this.rok_studiow=rok_studiow;
       this.specjalnosc=specjalnosc;
    }
    
    public Student(String imie, String nazwisko, int nr_indeksu, int rok_studiow, String specjalnosc){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.nr_indeksu=nr_indeksu;
        this.rok_studiow=rok_studiow;
        this.specjalnosc=specjalnosc;
    }

    Student(String imie, String nazwisko, int nr_indeksu, String specjalnosc, int rok_studiow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void DaneStudenta(){
        System.out.println("Imie: "+this.imie);
        System.out.println("Nazwisko: "+this.nazwisko);
        System.out.println("Numer indeksu: "+this.nr_indeksu);
        System.out.println("Rok studiów: "+this.rok_studiow);
        System.out.println("Specjalność studiów: "+this.specjalnosc);
    }
    
}
