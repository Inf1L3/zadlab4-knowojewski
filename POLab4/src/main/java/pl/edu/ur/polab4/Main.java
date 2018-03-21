package pl.edu.ur.polab4;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        Student a = new Student("Kamil");
        a.DaneStudenta();
        Student b = new Student("Nowojewski",111);
        b.DaneStudenta();
        Student c = new Student(1);
        c.DaneStudenta();
        Student d= new Student(1 ,"Informatyka");
        d.DaneStudenta();
    }
    
}
