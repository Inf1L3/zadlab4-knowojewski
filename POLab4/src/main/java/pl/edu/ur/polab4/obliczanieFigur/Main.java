/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import java.util.Scanner;


/**
 *
 * @author XsaRdaS
 */
public class Main {
    public static void main(String[] args){
        int x;
        float a, b, c;
        do{
        System.out.println("Jaką figurę chcesz obliczyć?:");
        System.out.println("1-Koło");
        System.out.println("2-Kwadrat");
        System.out.println("3-Prostokąt");
        System.out.println("4-Sześcian");
        System.out.println("5-Prostopadłościan");
        System.out.println("6-Kula");
        System.out.println("7-Stożek");
        System.out.println("0-KONIEC");

        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        switch(x){
            case 1:
                    System.out.println("Podaj średnice koła");
                    a = input.nextFloat();

                    Koło kolo1 = new Koło(a);
                    kolo1.WyswietlFigury();
                    break;
            case 2:
                    System.out.println("Podaj bok kwadratu");
                    a = input.nextFloat();

                    Kwadrat Kwadrat1 = new Kwadrat(a);
                    Kwadrat1.WyswietlFigury();
                    break;
            case 3:
                    System.out.println("Podaj boki prostokąta");
                    a = input.nextFloat();
                    b = input.nextFloat();

                    Prostokąt Prostokąt1 = new Prostokąt(a, b);
                    Prostokąt1.WyswietlFigury();
                    break;
            case 4:
                    System.out.println("Podaj bok sześcianu");
                    a = input.nextFloat();
                    

                    Sześcian Sześcian1 = new Sześcian(a);
                    Sześcian1.WyswietlFigury();
                    break;      
            case 5:
                    System.out.println("Podaj boki prostopadłościanu");
                    a = input.nextFloat();
                    b = input.nextFloat();
                    c = input.nextFloat();

                    Prostopadłościan Prostopadłościan1 = new Prostopadłościan(a,b,c);
                    Prostopadłościan1.WyswietlFigury();
                    break; 
            case 6:
                    System.out.println("Podaj promień kuli:");
                    a = input.nextFloat();                  

                    Kula Kula1 = new Kula(a);
                    Kula1.WyswietlFigury();
                    break;  
            case 7:
                    System.out.println("Podaj promień i wysokość stożka:");
                    a = input.nextFloat();
                    b = input.nextFloat();
                    

                    Stożek Stożek1 = new Stożek(a,b);
                    Stożek1.WyswietlFigury();
                    break;        
        }
            
        }while(x!=0);
            
        }
    }
    

