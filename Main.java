import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


 List<Kniha> seznamKnih = new ArrayList<>();

 for (int i = 0; i < 10;i++){
     Kniha kniha = new Kniha();
     seznamKnih.add(kniha);
 }


 Policka policka = new Policka(seznamKnih);


    List<Knniha>book = policka.getBook();
    Taska taska = new Taska(book);
    taska.datdoTasky(1);

    for (Kniha kniha : taska.getBook()){
        System.out.println(kniha.jevTasce);
    }


    }
}