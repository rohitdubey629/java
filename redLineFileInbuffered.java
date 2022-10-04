import java.io.*;;

public class redLineFileInbuffered {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("myFile1.txt"));
        String s1;
        while ((s1 = bf.readLine()) != null) {
            System.out.println(s1);
        }
        bf.close();

    }
}
