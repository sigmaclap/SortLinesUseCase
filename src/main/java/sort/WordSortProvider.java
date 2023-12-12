package sort;

import java.util.Comparator;
import java.util.List;

public class WordSortProvider implements SortProvider {

    @Override
    public void sort(List<String> list, String... args) {
        int wordIndex = args.length != 0 ? Integer.parseInt(args[0]) : 1;
        list.sort(Comparator.comparing(s -> s.split(" ")[wordIndex]));
    }
}
