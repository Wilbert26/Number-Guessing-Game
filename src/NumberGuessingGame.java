import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[]args){
        Scanner keyboard;
        int testing;
        int pickednumber;
        String guess;

        keyboard=new Scanner(System.in);


        pickednumber=(int)(Math.random()*100);
        System.out.println(pickednumber);

        System.out.println(" pick a number from 1-100");
        testing=keyboard.nextInt();

        if(testing!=pickednumber) {

            if (testing < pickednumber) {
                System.out.println("too low 1");
            }

            else  {
                System.out.println("too high 1");
            }

            System.out.println("try a different number v2");
            testing=keyboard.nextInt();

            if(testing!=pickednumber) {

                if (testing < pickednumber) {
                    System.out.println("too low 2");
                }

                else  {
                    System.out.println("too high 2");
                }

                System.out.println("try a different number v3");
                testing=keyboard.nextInt();

                if(testing!=pickednumber) {

                    if (testing < pickednumber) {
                        System.out.println("too low 3");
                    }

                    else  {
                        System.out.println("too high 3");
                    }

                    System.out.println("You lose");
                    //testing=keyboard.nextInt();


                }

                else {
                    System.out.println("YOU WIN");
                }

            }

            else {
                System.out.println("YOU WIN 2");
            }

        }


        else {
            System.out.println("YOU WIN 1");
        }



        System.out.println("the number the is ....");



       /* if (testing<pickednumber) {
            System.out.println("too low");
        }

        else if (testing>pickednumber){
            System.out.println("too high");
        }

        if (testing==pickednumber){
            System.out.println("YOU WIN");
        }






        System.out.println("last try");
        testing=keyboard.nextInt();

        if (testing<pickednumber) {
            System.out.println("too low");
        }

        else if (testing>pickednumber){
            System.out.println("too high");
        }

        if (testing==pickednumber){
            System.out.println("YOU WIN");
        }








        System.out.println("The number was... ");
        System.out.println(pickednumber);


*/












































    }










}
