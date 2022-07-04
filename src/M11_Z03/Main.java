package M11_Z03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задача 3
Дан код с использованием try-catch, перепишите данный код с использованием try-with-resources.
 */
public class Main {
    public static void main(String[] args) {

    }
    public String input() throws MyException1{
        //;
        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }// finally {

//            try {
//                System.out.println(e.getMessage());
//            }
//        }

        if (s.equals("")) {
            throw new MyException1("String can not be empty!");
            //reader.close();
        } //catch (IOException e) {}

        return s;
    }


}
