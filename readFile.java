import java.io.*;

public class readFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fr = new FileInputStream("myFile.txt");
        do {
            i = fr.read();
            if (i != -1) {
                System.out.print((char) i);
            }
        } while (i != -1);
        fr.close();

    }
}
