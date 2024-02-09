import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class SupplyOrder {
    public static void main(String[] args)throws Exception {
        Scanner file = new Scanner(new File("Student Data/supply.dat"));
        int size = file.nextInt();
        file.nextLine();
        int[] num = new int[size]; String[] item = new String[size];
        System.out.print("ORDER_START ");
        for (int i = 0; i < size; i++) {
            String[] items = file.nextLine().split("x");
            num[i] = Integer.parseInt(items[0]);
            item[i] = items[1];
            for(int j = 0; j < num[i]; j++)
                System.out.print(item[i] + " ");
        }
        System.out.print("ORDER_END ");
    }
}
