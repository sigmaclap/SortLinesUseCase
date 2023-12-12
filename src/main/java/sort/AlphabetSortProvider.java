package sort;

import java.util.Collections;
import java.util.List;

public class AlphabetSortProvider implements SortProvider {
    @Override
    public void sort(List<String> list, String... args) {
        Collections.sort(list);
    }
}
