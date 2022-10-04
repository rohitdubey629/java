import java.io.*;

public class redLineFileInbuffered2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("myFile.txt"));
        char s[] = new char[20];
        bf.read(s, 0, 20);
        System.out.println(s);
        bf.close();
    }
}
