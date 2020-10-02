import java.util.List;

public class Policka {

    private List<Kniha>book;

    public Policka(List<Kniha>book){
        this.book = book;
    }

    public List<Kniha> getBook() {
        return book;
    }
}