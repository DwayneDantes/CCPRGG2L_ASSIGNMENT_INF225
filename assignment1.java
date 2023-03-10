import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String studentEmail = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student Email");
        } else {
            System.out.println("invalid student Email");
        }

        System.out.print("Enter student phone number: ");
        String studentPhoneNum = scan.nextLine();
        
        boolean match1 = Pattern.matches("09\\d{9}", studentPhoneNum);
  
                if (match1) 
                {
                    System.out.println("valid student phone number");
                } 
                else 
                {
                    System.out.println("invalid student phone number");
                }    
        
        }
    }
