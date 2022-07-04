public class SortingContext {
    private Sorter sortStrategy;

    public SortingContext(Sorter sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void execute(int[] array) {
        sortStrategy.sort(array);
    }

}
