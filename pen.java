/**
 * Author - Jayspray
 * Team - Dillusioners
 * Program word - pen
 * This is a pen shop simulator
 */
import java.util.*;
class pen{
    //Void method solve to calculate total cost of pens.
    public static void solve(int[] myArr){
        int amount = 0;
        int c = 5;
        for(int i=0;i<4;i++){
            amount += myArr[i] * c;
            c+=5;
        }
        System.out.println("Your total cost for pens is : "+amount+"$");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Some print statements for user.
        System.out.println(">> Welcome to the pen shop\n\n");
        System.out.println("The different types of pens are:\n1.Blue Pens - 5$\n2.Black Pens - 10$\n3.Blue gel pens - 15$ each\n4. Any ink fountain pen - 20$ each");
        String[] pens = {"Blue Pens","Black Pens","Blue gel pens","Fountain pens"};
        int[] cost = new int[4];
        //Try except block to handle errors
        try{
            //Adding amount of pens wanted by user in the array corresponding to the order.
            for(int i=0;i<4;i++){
                System.out.println("How many "+pens[i]+" do you want?");
                int purc = sc.nextInt();
                cost[i] = purc;
            }
        }
        //Catching errors
        catch(Exception e){
            System.out.println("Something went wrong!!");
            System.exit(0);
        }
        //Invoking methods and solving code
        solve(cost);
        System.out.println("Program has ended.");
    }
}