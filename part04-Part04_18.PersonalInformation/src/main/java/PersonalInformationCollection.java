import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        ArrayList<PersonalInformation> personalInfos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Identification number: ");
            String idNumber = scanner.nextLine();

            personalInfos.add(new PersonalInformation(firstName, lastName, idNumber));
        }

        System.out.println();
        for (PersonalInformation info : personalInfos) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}
