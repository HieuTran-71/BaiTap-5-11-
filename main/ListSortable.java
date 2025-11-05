import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSortable<E> {
    private List<E> list;

    public ListSortable() {
        this.list = new ArrayList<>();
    }

    public void add(E item) {
        list.add(item);
    }

    public void print(Comparator<E> comparator) {
        list.sort(comparator);
        for (E item : list) {
            System.out.println(item.toString());
        }
    }
}
