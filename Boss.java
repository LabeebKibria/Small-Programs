import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Boss {
    public static void main(String[] args)throws Exception {
        Scanner file = new Scanner(new File("Student Data/boss.dat"));
        int size = file.nextInt();
        file.nextLine();
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            names.add(file.nextLine());
        }
        int checks = file.nextInt();
        file.nextLine();
        for (int i = 0; i < checks; i++) {
            String person = file.nextLine();
            for (int j =0; j<names.size(); j++) {
                if(person.equals(names.get(j)) && j == 0)
                    System.out.println("no boss");
                else if(person.equals(names.get(j)))
                    System.out.println(names.get(j-1));
            }
        }
    }
}
