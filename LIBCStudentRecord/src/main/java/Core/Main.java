package Core;

import Core.IO.Exporter;
import Core.Objects.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Storage.studentData.add(new String[]{"John", "Smith", "123456789", "Core.Objects.Package", "$0.00", "0", "0"});
        Exporter.outputStudent("student.csv");
    }
}
