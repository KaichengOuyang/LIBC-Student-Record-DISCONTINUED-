package Core.IO;
import Core.Storage;
import java.util.Arrays;

public class Exporter {
    //static String outputStudentS = "Name,Siblings,Parent Phone Number,Package,Last Payment, CreditsP, CreditsG, Previous Sessions, Upcoming private, Upcoming group\n";
    public static String outputStudent() {
        String outputStudentS = "";
        for (int i = 0; i < Storage.studentData.size(); i++) {
            outputStudentS += Storage.studentData.get(i)[0] + "," + Storage.studentData.get(i)[1] + "," + Storage.studentData.get(i)[2] + "," + Storage.studentData.get(i)[3] + "," + Storage.studentData.get(i)[4] + "," + Storage.studentData.get(i)[5] + "," + Storage.studentData.get(i)[6] + "," + Storage.studentData.get(i)[7] + "," + Storage.studentData.get(i)[8] + "\n";
        }
        return outputStudentS;
    }
}
