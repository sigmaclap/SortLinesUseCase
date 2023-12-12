package sort;

import java.util.Comparator;
import java.util.List;

public class LengthSortProvider implements SortProvider {

    @Override
    public void sort(List<String> list, String... args) {
        list.sort(Comparator.comparingInt(String::length));
    }
}
