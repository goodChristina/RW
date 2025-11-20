
import java.util.Scanner;

void main() {
  //IO.println(String.format("Hello!"));
    String originalText = "This is a string I will extract a substring from";
    String sub = originalText.substring(10,17);
    System.out.println(sub);

}

// Validate User Commands

    public static boolean checkifEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        //String reEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String reEmail = "^(?i)[a-z0-9.!#$%&'*+/=?^_`{|}~-]+" +
                "@[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?" +
                "(?:\\.[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?)*$";
        return email.matches(reEmail);

    }
     void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your email address: ");
        String userEmail = scanner.nextLine();

        if (checkifEmail(userEmail)) {
            System.out.println("Email is valid!");
        } else {
            System.out.println("Invalid email. Please try again.");
        }

        scanner.close();
    }

