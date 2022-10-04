import java.io.*;

public class bufferedWriterInFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("bufferRedFile.txt", true);
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("computer");
        bf.close();
    }
}
