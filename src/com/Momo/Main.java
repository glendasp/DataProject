package com.Momo;

import javax.imageio.IIOException;
import java.io.*;

public class Main {

    public static void main(String[] args) {


        // FileWriter that write to a data file in my direC:\Users\Sheveil Johnson\IdeaProjects\DataProject\src\com\Momo\Main.java
        try {
            String value = System.getProperty("flile.seperator");


            FileWriter hello = new FileWriter("C:\\Users\\Sheveil Johnson\\IdeaProjects\\Data\\myData.txt");
            hello.write("\nName: James Brown\n");

            hello.write("Name: Amos Jackson\n");
            hello.write("Name: Frank Lawson\n");
            hello.write("Name: Momo Jonson\n");
            hello.close();

            FileReader newred = new FileReader("C:\\Users\\Sheveil Johnson\\IdeaProjects\\Data\\myData.txt");
            BufferedReader redsh = new BufferedReader(newred);
            String line = redsh.readLine();
            while (line   != null){
                System.out.println(line);
                line = redsh.readLine();
            }
        }
        catch (IOException e){
            System.out.println(e);
            System.out.println("File not Found!");

        }

    }
}

