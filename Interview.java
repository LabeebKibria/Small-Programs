import java.io.File;
import java.util.*;

public class Interview {
    public static void main(String[] args)throws Exception {
        Scanner file = new Scanner(new File("Student Data/interview.dat"));
        int numSets = file.nextInt();
        file.nextLine();
        for (int i = 0; i < numSets; i++) {
            int size = file.nextInt();
            file.nextLine();
            ArrayList<Candidate> order = new ArrayList<>();
            for (int i1 = 0; i1 < size; i1++) {
                Candidate person = new Candidate(file.next(),file.nextInt(),file.nextInt(),file.nextInt());
                order.add(person);
            }
            Collections.sort(order);
            for (int j = 0; j < order.size(); j++) {
                if(j == order.size()-1)
                    System.out.print(order.get(j).getName());
                else
                    System.out.print(order.get(j).getName() + ",");
            }
            System.out.println();
        }

    }
}

class Candidate implements Comparable<Candidate>{
    private String name;
    private int experience;
    private int problem;
    private int communication;

    public Candidate(String n, int e, int p, int c){
        name = n;
        experience = e;
        problem = p;
        communication = c;
    }
    public String getName(){
        return name;
    }
    @Override
    public int compareTo(Candidate o) {
        if(this.experience + this.problem + this.communication > o.experience + o.problem + o.communication)
            return -1;
        if(this.experience + this.problem + this.communication < o.experience + o.problem + o.communication)
            return 1;
        if(this.experience > o.experience)
            return -1;
        if(this.experience < o.experience)
            return 1;
        if(this.problem > o.problem)
            return -1;
        if(this.problem < o.problem)
            return 1;
        if(this.communication > o.communication)
            return -1;
        if(this.communication < o.communication)
            return 1;
        return this.name.compareTo(o.name);
    }

}
