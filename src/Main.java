//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(5,4);
        Triangolo triangolo = new Triangolo(6, 2);
        forma.calcolaArea();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
//A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area,
// aggiungere una ulterioreclasse chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima
// figura