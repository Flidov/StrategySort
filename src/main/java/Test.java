import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
       int[] a={5,4,7,8};
        Sorter sortStrategy=new  SelectionSorts();
        SortingContext context=new SortingContext(sortStrategy);
        context.execute(a);
        System.out.println(Arrays.toString(a));

    }
}
