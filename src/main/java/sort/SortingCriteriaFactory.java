package sort;


public class SortingCriteriaFactory {
    public static SortProvider criteriaFactory(String sortingCriterion) {

        switch (sortingCriterion) {
            case "alphabet":
                return new AlphabetSortProvider();
            case "length":
                return new LengthSortProvider();
            case "word":
                return new WordSortProvider();
            default:
                throw new InvalidDataException("Invalid sorting criterion");
        }
    }
}
