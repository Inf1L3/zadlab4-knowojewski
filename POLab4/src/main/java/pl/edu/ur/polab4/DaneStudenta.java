/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class DaneStudenta {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Podaj imie:");
        String imie =input.next();
        System.out.println("Podaj nazwisko:");
        String nazwisko=input.next();
        System.out.println("Podaj nr indeksu:");
        int nr_indeksu=input.nextInt();
        System.out.println("Podaj nazwę studiów:");
        String specjalnosc=input.next();
        System.out.println("Rok studiów:");
        int rok_studiow=input.nextInt();
        Student czlowiek=new Student(imie,nazwisko,nr_indeksu,specjalnosc,rok_studiow);
                czlowiek.DaneStudenta();
    }
    
}
