package example.codeclan.com.wrestling;

import java.util.Scanner;

import static android.R.id.input;

/**
 * Created by user on 26/06/2017.
 */

public class Runner {

    public static void main(String[] args) {
        Subject.displayIdName();
        System.out.println();
        int choice = input();
        Subject.getMoreDetails(choice);
    }


    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose: ");
        return sc.nextInt();
    }

}