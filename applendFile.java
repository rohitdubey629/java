import java.io.*;
import java.util.Scanner;

public class applendFile {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int id, age;
        String name, gen;

        FileOutputStream frw = new FileOutputStream("myFile1.txt", true);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your gender");
        gen = sc.nextLine();
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Enter your id");
        id = sc.nextInt();
        sc.close();
        String s = "\nName : " + name + "\nGender : " + gen + "\nAge : " + age + "\nId : " + id;
        char ch[] = s.toCharArray();
        int i;
        for (i = 0; i < s.length(); i++) {
            frw.write(ch[i]);
        }
        frw.close();
        System.out.println("Data Copied Successfully..!");

    }
}
