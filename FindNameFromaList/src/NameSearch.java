import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader input = null;

        List<String> allNames = new ArrayList<>();
        String path="FindNameFromaList/src/namesList.txt";


        try {
            input = new BufferedReader(new FileReader(path));

            String str;
            while ((str = input.readLine()) != null) {
                allNames.add((str));
            }
            System.out.println("Number of name in the List: " + allNames.size());
            System.out.println("Schreiben Sie bitte ein Name");
        } finally {
            if (input != null) {
                input.close();
            }
        }

        Scanner sc = new Scanner(System.in);
        String enteredName = sc.nextLine();


        List<String> foundedNames = new ArrayList<>();


      /* for (String actualName : allNames) {
            {
                if (actualName.length() == enteredName.length()) {
                    boolean bushtabencheck = true;
                    for (int i = 0; i < enteredName.length(); i++) {
                        if (!(enteredName.charAt(i) == actualName.charAt(i) || enteredName.charAt(i) == '.')) {
                            bushtabencheck = false;
                            break;
                        }
                    }
                    if (bushtabencheck) {
                        foundedNames.add(actualName);
                    }
                }
            }

        }*/

            for (String actualName : allNames) {
                {
                    if (actualName.length() == enteredName.length()) {
                        int controlNumber = 0;
                        for (int i = 0; i < enteredName.length(); i++) {
                            if (enteredName.toUpperCase().charAt(i) == actualName.toUpperCase().charAt(i) || enteredName.charAt(i) == '.') {
                                controlNumber++;
                            }
                        }
                        if (controlNumber == enteredName.length()) {
                            foundedNames.add(actualName);
                            System.out.println(actualName);
                        }
                    }
                }
            }

            //System.out.println(foundedNames);
        }
    }



