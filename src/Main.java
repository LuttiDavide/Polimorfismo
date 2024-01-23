public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.calcolaArea();
        Rettangolo rettangolo = new Rettangolo(10, 20);
        rettangolo.calcolaArea();
        Triangolo triangolo = new Triangolo(10,20);
        triangolo.calcolaArea();
    }
}