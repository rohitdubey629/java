import java.io.*;

public class redLineFileInbuffered1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("myFile.txt"));
        String s1;
        s1 = bf.readLine();
        System.out.println(s1);
        bf.close();
    }
}
