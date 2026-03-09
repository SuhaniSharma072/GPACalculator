import java.util.*;

public class gpacalculator {

    public static void main (String[]args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("\t\tWelcome To GPA Calculator!\n\t It is an application that calculates your GPA on 100.0 scale.\n\t It can calculate both weigted and unweigted. ");
        System.out.println("Instructions: Type the extra weight for each type of class ( i.e. Honors or AP_)");
        // weightages will be stored in variables
        System.out.print("How many classes do you have?");
        int N=kb.nextInt();
        int APweight = 0;
        int Honorsweight = 0;
        //AP classes boolean
        System.out.println("Are you taking AP classes?");
        boolean AP=kb.nextBoolean();
        if(AP==true){
        System.out.print("What is the percentage of weight for AP classes?");
        int APweight=kb.nextInt();}
        //Honors classes boolean
        System.out.println("Are you taking Honors classes?");
        boolean Honors=kb.nextBoolean();
        if(Honors==true){
        System.out.print("What is the percentage of weight for Honors classes?");
        int Honorsweight=kb.nextInt();}
            // start calculating gpa
        double sumtotal=0;

        for(int i = 1; i <= N; i++){
             System.out.print("Enter grade for class ");
             int grade=kb.nextInt();
             System.out.println("Enter class type: On-level, Honors, AP");
             String classType= kb.nextLine();
             if (classType="On-level"){
                grade=grade;
             } else if (classType="Honors"){
                grade=grade+Honorsweight;
             }else if (classType="AP"){
                grade=grade+APweight;
             }else{
                System.out.println("Enter valid type");
             }
            

            
        }
      
        
        
        
    }
}