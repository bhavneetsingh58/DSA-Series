import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class reverse {
    private ArrayList<Integer> Input = new ArrayList<Integer>();
    private int IterVal = 0;

    public void getIter(){
        boolean error = false;
        do {
            try {
                System.out.println("Enter Number of Inputs");
                Scanner Iter = new Scanner(System.in);
                this.IterVal = Iter.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input ,Please Enter Correct Input");
                error = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input ,Please Enter Correct Input");
                error = true;
            }
        } while(error);
    }
    public int setIter(){
        return this.IterVal;
    }
    public void getInput(int IterValue){
        boolean error = false;

        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter Numbers");
                for(int i=0;i<IterValue;i++){
                    int Value = scan.nextInt();
                    //System.out.println(Value);
                    this.Input.add(Value);
                }
                scan.close();
                error = false;
            } catch (Exception e) {
                System.out.println("Invalid Input ,Please Enter Correct Input");
                error = true ;
            }
        } while (error);
    }
    public ArrayList<Integer> setInput(){
        return this.Input;
    }

    public ArrayList<Integer> reverseLogic(ArrayList<Integer> ToBeRevered){
        ArrayList<Integer> Output = new ArrayList<Integer>();
        int reversed = 0;
        int Current  = 0;
        int digit    = 0;
        for(Integer num : ToBeRevered){
            Current = num;
            //System.out.println(Current);
            while(Current!=0) {
                digit = Current % 10;
                reversed = ((reversed * 10) + digit);
                Current = Current / 10;
            }
            Output.add(reversed);
            reversed=0;
        }
        return Output;
    }

    public void reverse(){
        getIter();
        getInput(setIter());
        ArrayList<Integer> Outputter = new ArrayList<Integer>();
        Outputter = reverseLogic(setInput());
        for(Integer num :Outputter) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        reverse one = new reverse();
        one.reverse();
    }
}
