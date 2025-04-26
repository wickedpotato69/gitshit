//create class br2file
import java.io.*;
import java.util.Scanner;

public class Br2File {
    private String fileName;
    private File file;
    private BufferedWriter writer;
    private Scanner scanner;
    private boolean isOpen;
    private int count;

    public Br2File(String fileName) {
        this.fileName = fileName;
        this.file = new File(fileName);
        this.isOpen = false;
        this.count = 0;
    }

    public void open() throws IOException {
        if (isOpen) {
            System.out.println("File already open");
            return;
        }
        writer = new BufferedWriter(new FileWriter(file));
        isOpen = true;
        System.out.println("File opened successfully");
    }
}