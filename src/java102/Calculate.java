package java102;

public class Calculate {


    public static void calcAverage(Coursee[] notes){
        int total=0;
        for(Coursee c:notes){
            total+=c.note;
        }
        double average=total/notes.length;
        System.out.println("Your average:"+average);

    }
}
