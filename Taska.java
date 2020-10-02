import java.util.List;

public class Taska {

    private List<Kniha>book;

    public Taska(List<Kniha>book) {
        this.book = book;
    }

    public void datdoTasky(int kolikTasek){
        for (Kniha kniha : book){
            if (kolikTasek >= kniha.tloustka){
                kniha.jevTasce= true
            }

        }

    }

    public List<Kniha> getBook() {
        return book;
    }
}