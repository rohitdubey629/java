import java.io.*;

class copyFile {

    public static void main(String args[]) throws IOException {
        FileInputStream fr = new FileInputStream("myFile.txt");
        FileOutputStream fw = new FileOutputStream("myFile1.txt");

        int i;
        while ((i = fr.read()) != -1) {
            fw.write((char) i);
        }
        fr.close();
        fw.close();
        System.out.println("Data Copied Successfully..!");
    }
}