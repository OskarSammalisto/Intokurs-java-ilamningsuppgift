import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//testing this outswdfr
        // loop med en exit
        menu();
        int menuSelection = scanner.nextInt();
       // System.out.println(menuSelection);

        while (menuSelection != 1 && menuSelection != 2 && menuSelection != 3 && menuSelection != 4) {

            System.out.println("Du kan bara välja mellan 1-4!");
            menu();
            menuSelection = scanner.nextInt();  //denna rad kanske inte behövs


        }
       // while (menuSelection != e) {
            switch (menuSelection) {
                case 1:
                    addTwoNumbers();
                    break;
                case 2:
                    calculateLengthOfString();
                    break;
                case 3:
                    mirrorString();
                    break;
                case 4:
                    addUpNumbersInString();
                    break;
               // case e:
                   // System.out.println("Hejdå");
                  //  break;

                default:
                    break;


            }
   // }





    }

    static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad vill du göra?");
        System.out.println("1. Addera två tal.");
        System.out.println("2. Räkna bokstäver i en streng.");
        System.out.println("3. Spegelvänd en streng.");
        System.out.println("4. Summera alla tal i en sträng.");
        System.out.println("Välj e för att avsluta programmet.");
       // int menuSelection = scanner.nextInt();
        //return menuSelection;

    }
    static void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in det första talet!");
        int number1 = scanner.nextInt();
        System.out.println("Skriv in det andra talet!");
        int number2 = scanner.nextInt();
        int addedNumbers = number1 + number2;
        System.out.println("Talen: " + number1 +" och " +number2 +" adderas till: " +addedNumbers);



    }
    static void calculateLengthOfString(){
        Scanner scanner = new Scanner(System.in);
        int ammountOfLetters = 0;
        System.out.println("Skriv in den string som skal räknas!");
        String stringHowMany = scanner.nextLine();
        System.out.println("Vilken bokstav skal räknas?");
        char searchLetter = scanner.nextLine().charAt(0);
        String stringSearchLetter = Character.toString(searchLetter);

        for (int i = 0; i < stringHowMany.length(); i++){
            char letterCheck = stringHowMany.charAt(i);
            if(searchLetter == letterCheck){
                ammountOfLetters++;
            }

        }
        // int stringLength = stringHowLong.length();
        System.out.println("Din string har: " +ammountOfLetters +" av bokstaven: " +stringSearchLetter);

    }
    static void mirrorString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in string som skal speglas:");
        String stringToMirror = scanner.nextLine();
        System.out.print("Du skrev in: " +stringToMirror +", bakvänt blir det: ");
        for(int i = stringToMirror.length() -1; i > -1; i--){




            System.out.print( stringToMirror.charAt(i));
        }


    }
    static void addUpNumbersInString(){
        Scanner scanner = new Scanner(System.in);
        double addNumbersSum = 0;
        double testDouble;
        //boolean integerTest;
        System.out.println("Skriv in en mening och sen skal jag addera alla siffror i den!");
        String addNumbersString = scanner.nextLine();
        for (int i = 0; i < addNumbersString.length(); i++){
            char test = addNumbersString.charAt(i);

            if (Character.isDigit(test)){
                String testString = Character.toString(test);
                 testDouble = Double.valueOf(testString);
                 addNumbersSum += testDouble;


            }

        }
        System.out.println(addNumbersSum);

    }




}
