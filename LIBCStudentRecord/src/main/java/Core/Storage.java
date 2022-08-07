package Core;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Storage {
    public static int amountOfStudents = 1;
    public static ArrayList<String[]> studentData = new ArrayList<String[]>();//Name, Siblings, Parent Phone Number, Package, Last Payment, CreditsP, CreditsG, Previous, UpcomingP, UpcomingG
    String[][] coachData = new String[10][2];//Name, minutes
    String[][] packageData = new String[10][];
    String[] SessionData = {"Session 1", "Session 2", "Session 3", "Session 4", "Session 5", "Session 6", "Session 7", "Session 8", "Session 9", "Session 10"};
}
