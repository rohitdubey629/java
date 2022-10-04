import java.io.*;

public class redingFomFilebuffered {
    public static void main(String[] args) throws IOException {
        int ch;
        BufferedReader bf = new BufferedReader(new FileReader("myFile.txt"));
        while ((ch = bf.read()) != -1) {
            System.out.print((char) ch);
        }
        bf.close();
    }
}
