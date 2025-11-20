import java.util.Scanner;

void main() {

        // extract substring
        String basicText = "This is a string I will extract a substring from!";
        String sub = basicText.substring(10, 17);
        System.out.println(sub);

        //names to Upper
        String randomNames = "Pedro Pascal, Carlos Sainz, Charles Leclerc";
        String makeUpperCaseNames = randomNames.toUpperCase();
        System.out.println(makeUpperCaseNames);

        // check names
        String carlos = "Carlos";
        String sainz = "Carlos";

        if (carlos.equals(sainz)) {
            System.out.println("Carlos and Sainz are the same CARLOS.");
        } else {
            System.out.println("Carlos and Sainz are not the same.");
    }


        // validate user commands
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your email address: ");
        String userEmail = scanner.nextLine();

        if (checkIfEmail(userEmail)) {
            System.out.println("Email is valid!");
        } else {
            System.out.println("Invalid email. Please try again.");
        }

        scanner.close();
    }


    // using regex
    public static boolean checkIfEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        String reEmail =
                "^(?i)[a-z0-9.!#$%&'*+/=?^_`{|}~-]+" + "@[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?" + "(?:\\.[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?)*$";
        return email.matches(reEmail);



    }



