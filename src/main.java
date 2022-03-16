import java.util.Scanner;
public class main
{
    public static void  main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();
        System.out.print("Enter current year: ");
        int currentYear = input.nextInt();
        Methods age =new Methods(yearOfBirth, currentYear);


            if (yearOfBirth > 1900 && currentYear >=2022){
                System.out.println("You're " + age.getDifference() + " years old");
            }
            else{
                System.out.println("Invalid input");

            };



    }
}
class Methods{
    int past,present;
    Methods(int newPast, int newPresent)
    {
        past = newPast;
         present =  newPresent ;
    }
    int getDifference (){
        return present - past;
    }
}