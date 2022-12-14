import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        int progSelect;

        do {
            System.out.println("Select the program you want to run!");
            System.out.println("Enter '1' Calcultor; '2' Number Prediction; '3' Find Larger Number2; '4' Find Larger Number3; '5' Check Numbers (Positive/Negative);");
            System.out.println("Enter '6' FOR Exercise (CountNumber) ;  '7' IF-ELSE Exercise; '8' DO-WHILE Exercise; '9' ODD-EVEN Exercise; 10' NAME-AGE Exercise;");
            String valueSelect = keyboard.next();
            //Check if the first value is a number.

           while (!isInteger(valueSelect)) {
               System.out.println("You entered an invalid number! '" + valueSelect + "' Please re-enter your number! ");
               valueSelect = keyboard.next();
           }
            Integer intSelect = Integer.parseInt(valueSelect);

            switch (intSelect) {
                case 1:
                    Calculator();           //Calcultor;
                    break;
                case 2:
                    PredictNum();           //Number Prediction
                    break;
                case 3:
                    FindLargerNum2();       //Find Larger Number2
                    break;
                case 4:
                    FindLargerNum3();       //Find Larger Number3
                    break;
                case 5:
                    CheckNumber();          //Check Numbers (Positive/Negative)
                    break;
                case 6:
                    CountNumber();          //FOR Exercise (CountNumber)
                    break;
                case 7:
                    IfElseExer();           //IF-ELSE Exercise
                    break;
                case 8:
                    DoWhilexer();           //DO-WHILE Exercise
                    break;
                case 9:
                    OddEvenExer();          //ODD-EVEN Exercise
                    break;
                case 10:
                    NameAgeExer();          //NAME-AGE Exercise
                    break;
                default:
                    System.out.println("You entered an invalid number!");
                    break;
            }

            System.out.println("If you want to run a program again, please Enter '1'. Otherwise, please Enter '0' to exit.");
            progSelect = keyboard.nextInt();

        } while (progSelect == 1);


    }

    //*****************************************************************//
    //********** C A L C U L A T O R ********************//
    //This a basic calculator java code.
        public static void Calculator () {
        double result = 0;

        System.out.println("Welcome to My Calculator! ");
        //Read first number.
        System.out.println("Please enter first number! ");
        String value = keyboard.next();
        //Check if the first value is a number.
        while (!isNumeric(value)) {
            System.out.println("You entered invalid number! '" + value + "' Please re-enter first number! ");
            value = keyboard.next();
        }
        double Number1 = Double.parseDouble(value);
        //Read operation.
        System.out.println("Please enter operation! (+,-,*,/,^)");
        String Operation = keyboard.next();
        //Check if the value is an operation number.
        while (!isOperation(Operation)) {
            System.out.println("You entered invalid operation! '" + Operation + "' Please re-enter operation! (+,-,*,/,^)");
            Operation = keyboard.next();
        }

        //Check if the first value is a number.
        System.out.println("Please enter second number! ");
        value = keyboard.next();
        //Check if the first value is a number.
        while (!isNumeric(value)) {
            System.out.println("You entered invalid number! '" + value + "' Please re-enter second number! ");
            value = keyboard.next();
        }
        double Number2 = Double.parseDouble(value);

        //calculate result.
        switch (Operation) {
            case "+":
                result = Number1 + Number2;
                break;
            case "-":
                result = Number1 - Number2;
                break;
            case "*":
                result = Number1 * Number2;
                break;
            case "/":
                result = Number1 / Number2;
                break;
            case "^":
                result = Math.pow(Number1, Number2);
                break;
            default:
                System.out.println("Invalid Operation!");
        }
        System.out.println("The result is " + result);
    }
    // check the value if it is a number.
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    // check the value if it is an operation.
    public static boolean isOperation(String Operation) {
        switch (Operation) {
            case "+":
                return true;

            case "-":
                return true;
            case "*":
                return true;
            case "/":
                return true;
            case "^":
                return true;
            default:
                return false;
        }
    }
    //********************** C A L C U L A T O R **********************//
    //*****************************************************************//

    //*****************************************************************//
    //**************** P R E D I C T  A  N U M B E R ******************//
    //Bu oyunda bilgisayar??n 0-10 aras??nda rastgele bir say?? ??retmesini sa??layaca????z.
    //Kullan??c??ya  klavyeden bir say?? girmesini isteyece??iz
    //Kullanc??n??n girdi??i say?? ile bilgisayar??n rastgele ??retti??i say?? ile k??yaslaca????z.
    //Kullan??c?? do??ru bilene kadar uygulama ??al????maya devam edicek do??ru sonuncun ard??ndan uygulama sonland??r??lacak.
    public static void PredictNum() {
        double dnumber = Math.round(Math.random()*10);
        int number =(int)dnumber;
        boolean answer = false;
        //System.out.println("random : " + number);

        do {
            //Read  number.
            System.out.println("Please enter number! ");
            String value1 = keyboard.next();
            //Check if the first value is a number.
            while (!isInteger(value1)) {
                System.out.println("You entered invalid number! '" + value1 + "' Please re-enter your number! ");
                value1 = keyboard.next();
            }
            Integer predictnumber = Integer.parseInt(value1);
            if (predictnumber == number) {
                System.out.println("Congratulations! You guessed right number! Try it again!");
                answer=true;
            } else if (predictnumber > number) {
                System.out.println("The number you guessed is the larger! Try it again!");
                answer=false;
            } else if (predictnumber < number) {
                System.out.println("The number you guessed is the lower! Try it again!");
                answer=false;
            }
        }while(answer==false);



        }

        public static boolean isInteger(String strNum) {
            if (strNum == null) {
                return false;
            }
            try {
                Integer inum = Integer.parseInt(strNum);
            } catch (NumberFormatException nfe) {
                return false;
            }
            return true;
        }
    //**************** P R E D I C T  A  N U M B E R ******************//
    //*****************************************************************//


    //************* F I N D  T H E  L A R G E R  N U M B E R **********//
    //*****************************************************************//
    //Klavyeden int tipinden iki say?? girilmesini sa??lay??n??z.HAZIR KODU VER??LD??.
    //??f ???else yap??s??n?? kullanarak bu iki say??y?? birbirleriyle k??yasl??yarak en b??y??k say??y?? bulunuz ve sonucu ekrana yazd??r??n??z.
    public static void FindLargerNum2() {
             //Read  numbers.
            System.out.println("Please enter first integer number! ");
            String valuenum1 = keyboard.next();
            //Check if the first value is a number.
            while (!isInteger(valuenum1)) {
                System.out.println("You entered invalid number! '" + valuenum1 + "' Please re-enter your number! ");
                valuenum1 = keyboard.next();
            }
            Integer intNumber1 = Integer.parseInt(valuenum1);
            //
            System.out.println("Please enter second integer number! ");
            valuenum1 = keyboard.next();
            //Check if the first value is a number.
            while (!isInteger(valuenum1)) {
                System.out.println("You entered invalid number! '" + valuenum1 + "' Please re-enter your number! ");
                valuenum1 = keyboard.next();
            }
            Integer intNumber2 = Integer.parseInt(valuenum1);
            // Finder the larger number
            if (intNumber1 == intNumber2) {
                System.out.println("The first number (" + intNumber1 + ") is equal to the second number (" + intNumber2 + ")!");
            } else if (intNumber1 > intNumber2) {
                System.out.println("The first number (" + intNumber1 + ") is greater than the second number (" + intNumber2 + ")!");
            } else {
                System.out.println("The second number (" + intNumber2 + ") is greater than the first number (" + intNumber1 + ")!");
            }
        }
    //************* F I N D  T H E  L A R G E R  N U M B E R **********//
    //*****************************************************************//


    //**************** C O M P A R E  3   N U M B E R S ***************//
    //*****************************************************************//
    //Klavyeden int tipinden ???? say?? girilmesini sa??lay??n??z.HAZIR KODU VER??LD??.
    //??f ???else yap??s??n?? kullanarak bu ???? say??y?? birbirleriyle k??yasl??yarak en b??y??k say??y?? bulunuz ve ekrana yazd??r??n??z.
    public static void FindLargerNum3() {
        //Read  numbers.
        System.out.println("Please enter first integer number! ");
        String valuenum1 = keyboard.next();
        //Check if the first value is a number.
        while (!isInteger(valuenum1)) {
            System.out.println("You entered invalid number! '" + valuenum1 + "' Please re-enter your number! ");
            valuenum1 = keyboard.next();
        }
        Integer num1 = Integer.parseInt(valuenum1);
        //
        System.out.println("Please enter second integer number! ");
        valuenum1 = keyboard.next();
        //Check if the first value is a number.
        while (!isInteger(valuenum1)) {
            System.out.println("You entered invalid number! '" + valuenum1 + "' Please re-enter your number! ");
            valuenum1 = keyboard.next();
        }
        Integer num2 = Integer.parseInt(valuenum1);
        //
        System.out.println("Please enter third integer number! ");
        valuenum1 = keyboard.next();
        //Check if the first value is a number.
        while (!isInteger(valuenum1)) {
            System.out.println("You entered invalid number! '" + valuenum1 + "' Please re-enter your number! ");
            valuenum1 = keyboard.next();
        }
        Integer num3 = Integer.parseInt(valuenum1);

        // Finder the larger number
        if (num1>num2&&num1>num3) {
            System.out.println("The first number (" + num1 + ") is the greatest!");
        } else if (num2>num1&&num2>num3) {
            System.out.println("The secon number (" + num2 + ") is the greatest!");
        } else if(num3>num1&&num3>num2) {
            System.out.println("The third number (" + num3 + ") is the greatest!");
        }else{
            System.out.println("All numbers are equal!");
        }
    }
    //**************** C O M P A R E  3   N U M B E R S ***************//
    //*****************************************************************//


    //*********************C H E C K   A   N U M B E R  ***************//
    //*****************************************************************//
    //Klavyeden int tipinden bir say?? girilmesini sa??lay??n??z.
    // ??f ???else yap??s??n?? kullanarak bu say??n??n pozitif,negatif veya s??f??ra e??it olmas?? durumunu denetleyiniz  ve sonucu ekrana yazd??r??n??z.
    public static void CheckNumber() {
        //Read  numbers.
        System.out.println("Please enter an integer number! ");
        String valuenum1 = keyboard.next();
        //Check if the first value is a number.
        while (!isInteger(valuenum1)) {
            System.out.println("You entered invalid number! '" + valuenum1 + "' Please re-enter your number! ");
            valuenum1 = keyboard.next();
        }
        Integer num1 = Integer.parseInt(valuenum1);


        //
        if (num1>0) {
            System.out.println("The number (" + num1 + ") is positive!");
        } else if (num1<0) {
            System.out.println("The number (" + num1 + ") is negative!");
        } else if(num1==0) {
            System.out.println("The number (" + num1 + ") is equal to 0!");
        }
    }
    //*********************C H E C K   A   N U M B E R  ***************//
    //*****************************************************************//

    //*************** F O R   E X E R C I S E *************************//
    //*****************************************************************//
    //Bir den ba??l??yarak N???e kadar yani klavyeden girilen say??ya kadar olan  say??lar?? toplarak sonucu ekrana yazd??r??n??z.

    public static void CountNumber() {
        //Read  numbers.
        System.out.println("Please enter an integer number! ");
        String valuenum1 = keyboard.next();
        //Check if the first value is a number.
        while (!isInteger(valuenum1)) {
            System.out.println("You entered invalid number! '" + valuenum1 + "' Please re-enter your number! ");
            valuenum1 = keyboard.next();
        }
        Integer N = Integer.parseInt(valuenum1);
        Integer Total=0;
        for (int i = 1; i <= N; i++) {
            Total=Total+i;
          }
        System.out.println("The total is " + Total );
    }

    //*************** F O R   E X E R C I S E *************************//
    //*****************************************************************//

    //*************** I F - E L S E   E X E R C I S E *****************//
    //*****************************************************************//
    //Klavyeden int tipinden bir say?? girilmesini sa??lay??n??z.
    //??f ???else yap??s??n?? kullanarak bu say??n??n 11 ve 5 tam b??l??ne bilmesini denetleyiniz ve sonucu ekrana yazd??r??n??z.
    public static void IfElseExer() {
        //Read  numbers.
        System.out.println("Please enter an integer number! ");
        String valuenum1 = keyboard.next();
        //Check if the first value is a number.
        while (!isInteger(valuenum1)) {
            System.out.println("You entered invalid number! '" + valuenum1 + "' Please re-enter your number! ");
            valuenum1 = keyboard.next();
        }
        Integer intnumber = Integer.parseInt(valuenum1);
        Integer mod5=intnumber%5;
        Integer mod11=intnumber%11;
        if (mod5==0&&mod11==0) {
            System.out.println("The number is divisible by 5 and 11!");
        } else if (mod5==0) {
            System.out.println("The number is divisible by 5!");
        } else if(mod11==0) {
            System.out.println("The number is divisible by 11!");
        }else {
            System.out.println("The number is not divisible by 5 or 11!");
        }
    }
    //*************** I F - E L S E   E X E R C I S E *****************//
    //*****************************************************************//



    //*************** D O - W H I L E   E X E R C I S E ***************//
    //*****************************************************************//
    //Klavyeden int tipinden bir say?? girilmesini sa??lay??n??z.
    //Do while yap??s??n?? kullanarak s??f??r???dan girilen say??ya kadar tek say??lar?? toplam??n?? bulun.
    public static void DoWhilexer() {
        //Read  numbers.E
        System.out.println("Please enter an integer number! ");
        String valuenum1 = keyboard.next();
        //Check if the first value is a number.
        while (!isInteger(valuenum1)) {
            System.out.println("You entered invalid number! '" + valuenum1 + "' Please re-enter your number! ");
            valuenum1 = keyboard.next();
        }
        Integer N = Integer.parseInt(valuenum1);

        int tot=0;
        int i=0;
        do {
            i++;

            if (i%2 !=0){
                tot=tot+i;
            }

        } while (i<N);
        System.out.println("The total of odd numbers is " + tot );
    }
    //*************** D O - W H I L E   E X E R C I S E ***************//
    //*****************************************************************//

    //*************** O D D - E V E N   N U M B E R *******************//
    //*****************************************************************//
    //Klavyeden int tipinden bir say?? girilmesini sa??lay??n??z.
    //??f ???else yap??s??n?? kullanarak bu say??n??n tek yada ??ift say?? olmas??n?? durumunu denetleyiniz ve sonucu ekrana yazd??r??n??z.
    public static void OddEvenExer() {
        //Read  numbers.
        System.out.println("Please enter an intger number! ");
        String valuenum1 = keyboard.next();
        //Check if the first value is a number.
        while (!isInteger(valuenum1)) {
            System.out.println("You entered invalid number! '" + valuenum1 + "' Please re-enter your number! ");
            valuenum1 = keyboard.next();
        }
        Integer num1 = Integer.parseInt(valuenum1);

        if (num1%2==0) {
            System.out.println("It is even number!");
        } else {
            System.out.println("It is odd number!");
        }
    }
    //*************** O D D - E V E N   N U M B E R *******************//
    //*****************************************************************//


    //*************** O D D - E V E N   N U M B E R *******************//
    //*****************************************************************//
    //Klavye???den ya?? ve isim de??erlerini alarak ekrana yazd??r??n??z.
    //Al??nacak de??erler int,String tipinde olsun
    public static void NameAgeExer() {
        //Read  numbers.
        System.out.println("Please enter your first name! ");
        String Name = keyboard.next();

        System.out.println("Please enter your age! ");
        String valuenum1 = keyboard.next();
        //Check if the first value is a number.
        while (!isInteger(valuenum1)) {
            System.out.println("You entered invalid number! '" + valuenum1 + "' Please re-enter your number! ");
            valuenum1 = keyboard.next();
        }
        Integer Age = Integer.parseInt(valuenum1);
        System.out.println("Your name is "+Name);
        System.out.println("Your age is "+Age);
    }
    //*************** O D D - E V E N   N U M B E R *******************//
    //*****************************************************************//

}