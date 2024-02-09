import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class ProductName {
    public static void main(String[] args)throws Exception {
        Scanner file = new Scanner(new File("Student Data/product.dat"));
        int size = file.nextInt();
        for (int i = 0; i <= size; i++) {
            char[] name = file.nextLine().toLowerCase(Locale.ROOT).toCharArray();
            for (int i1 = 0; i1 < name.length-1; i1++) {
                if(name[i1] > name[i1+1]) {
                    System.out.println("REJECTED BY COMMITTEE: Back to the drawing board!");
                    break;
                }
                if(i1 == name.length-2 && name[i1] < name[i1+1])
                    System.out.println("APPROVED BY COMMITTEE: It's a go!");
            }
        }
    }
}
