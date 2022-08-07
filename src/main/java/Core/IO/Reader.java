package Core.IO;

import Core.Storage;

public class Reader {
    public static void readStudent(String fileName) {
        try {
            java.io.FileReader fr = new java.io.FileReader(fileName);
            java.io.BufferedReader br = new java.io.BufferedReader(fr);
            String line = br.readLine();
            while (line != null || line.length() > 0) {
                String[] data = line.split(",");
                Storage.studentData.add(data);
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
