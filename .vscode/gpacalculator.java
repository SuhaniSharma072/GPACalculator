import java.util.*;

public class gpacalculator {

    public static void main (String[]args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("\t\tWelcome To GPA Calculator!\n\t It is an application that calculates your weighted GPA on 100.0 scale.\t ");
        System.out.println("\tInstructions: Type the extra weight for each type of class ( i.e. Honors or AP)");
        // weightages will be stored in variables
        System.out.print("How many classes do you have?");
        int N=kb.nextInt();
        int APweight = 0;
        int Honorsweight = 0;

        //AP classes boolean
        System.out.println("Are you taking AP classes (true/false)?");
        boolean AP=kb.nextBoolean();
        if(AP==true){
        System.out.print("What is the percentage of weight for AP classes?");
        APweight=kb.nextInt();}
        //Honors classes boolean
        System.out.println("Are you taking Honors classes (true/false)?");
        boolean Honors=kb.nextBoolean();
        if(Honors==true){
        System.out.print("What is the percentage of weight for Honors classes?");
        Honorsweight=kb.nextInt();}

            // start calculating gpa
        double sumtotal=0;

        for(int i = 1; i <= N; i++){
             System.out.print("Enter grade for class ");
             int grade=kb.nextInt();
             kb.nextLine();
             System.out.println("Enter class type: On-level, Honors, AP");
             String classType= kb.nextLine();
             if (classType.equals("On-level")){
                grade=grade;
             } else if (classType.equals("Honors")){
                grade=grade+Honorsweight;
             }else if (classType.equals("AP")){
                grade=grade+APweight;
             }
            
             sumtotal += grade;

            
        }

        double GPA = sumtotal / N;
        System.out.printf("Your weighted GPA on a 100.0 scale is: %.2f ",GPA);
      
   //arrayy
        
        
    }
}