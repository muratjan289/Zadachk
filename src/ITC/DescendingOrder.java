package ITC;
import java.util.Arrays;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        int a = num;
        String str = String.valueOf(a);
        StringBuilder sb1 = new StringBuilder(str);
        sb1.reverse();
        String str1 = sb1.toString();
        int b = Integer.parseInt(str1);
        return b;
    }


}
class sortTest {
    public static void main(String[] args) {
        DescendingOrder d1 = new DescendingOrder();
        System.out.println("Число для сортировки - 123456789");
        System.out.print("Результат:  ");
        System.out.print(DescendingOrder.sortDesc( 12345689));


    }
}
