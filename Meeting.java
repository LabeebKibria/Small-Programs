import java.io.File;
import java.sql.Time;
import java.util.Scanner;
public class Meeting {
    public static void main(String[] args)throws Exception {
        Scanner file = new Scanner(new File("meeting.dat"));
        int numSets = file.nextInt();
        file.nextLine();
        for (int i = 0; i < numSets; i++) {
            Time start = new Time(9,00,0);
            int row = file.nextInt();
            file.nextLine();
            //making the timeslots
            char[][] lot = new char[row][16];
            for (int j = 0; j < lot.length; j++) {
                lot[j] = file.nextLine().toCharArray();
            }
            //sorting through the time slots
            int index = 0;
            for (int k = 0; k < lot[0].length; k++) {
                for(int l = 0; l < lot.length; l++){
                    if(lot[l][k] != '-')
                        l = lot.length;
                    else if(lot[l][k] == '-' && l == lot.length-1){
                        index = k;
                        k = lot[0].length;
                    }
                }
            }
            for (int m = 0; m < index; m++) {
                start.setMinutes(start.getMinutes() + 30);
            }
            if(start.getHours() > 12)
               start.setHours(start.getHours()-12);
            String time =  start.getHours() + ":" + start.getMinutes();
            time = start.getMinutes() == 00 ? time+ "0" : time;
            time = start.getHours() > 7 || start.getHours() == 12 ? time+" AM" : time+ " PM";
            System.out.println(time);
        }
    }
}
