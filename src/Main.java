import java.util.*;

public class Main {
    static void problem1() {
        int x = 7;
        if(x < 10)
            System.out.println("Less than 10");

    }
    static void problem2() {
        int x = 15;
        if(x < 10)
            System.out.println("Less than 10");
        else
            System.out.println("Greater than 10");
    }
    static void problem3() {
        int x = 50;
        if(x < 10)
            System.out.println("Less than 10");
        else if(x >= 10 && x < 20)
            System.out.println("Between 10 and 20");
        else
            System.out.println("Greater than or equal to 20");

    }
    static void problem4() {
        int x = 5;
        if(x >= 10 && x <= 20)
            System.out.println("In range");
        else
            System.out.println("Out of range.");

    }
    static void problem5() {
        System.out.println("Enter score:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();

        if (score > 100 || score < 0)
            System.out.println("Score out of range.");
        else if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 60)
            System.out.println("D");
        else
            System.out.println("E");


    }
    static void problem6() {
        System.out.println("Enter an integer between 1 and 7:");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        sc.close();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }
    }
    static void problem7() {
        String [] statusArray = {"Single", "Married Filing Jointly", "Married Filing Separately", "Head of Household"};
        int status = 0;
        double income = Double.NEGATIVE_INFINITY;

        Scanner sc = new Scanner(System.in);

        while(status <=0 || status >4){
            System.out.println("""
                    Enter filing status by number:
                    [1] Single
                    [2] Married Filing Jointly
                    [3] Married Filing Separately
                    [4] Head of Household
            """);
            if(sc.hasNextInt())
                status = sc.nextInt();
            else {
                sc.nextLine();

            }
        }

        while(income < 0 ) {
            System.out.println("Enter income:");
            if(sc.hasNextDouble())
                income = sc.nextDouble();
            else
                sc.nextLine();
        }

        sc.close();

        int taxRate = 0;
        switch (status) {
            case 1:
                if(income <= 8350)
                    taxRate = 10;
                else if(income <=33950)
                    taxRate = 15;
                else if(income <= 82250)
                    taxRate = 25;
                else if (income <= 171550)
                    taxRate = 28;
                else if(income <= 372950)
                    taxRate = 33;
                else
                    taxRate = 35;
                break;
            case 2:
                if(income <= 16700)
                    taxRate = 10;
                else if(income <=67900)
                    taxRate = 15;
                else if(income <= 137050)
                    taxRate = 25;
                else if (income <= 208850)
                    taxRate = 28;
                else if(income <= 372950)
                    taxRate = 33;
                else
                    taxRate = 35;
                break;
            case 3:
                if(income <= 8350)
                    taxRate = 10;
                else if(income <=33950)
                    taxRate = 15;
                else if(income <= 68525)
                    taxRate = 25;
                else if (income <= 104425)
                    taxRate = 28;
                else if(income <= 186475)
                    taxRate = 33;
                else
                    taxRate = 35;
                break;

            case 4:
                if(income <= 11950)
                    taxRate = 10;
                else if(income <=45500)
                    taxRate = 15;
                else if(income <= 117450)
                    taxRate = 25;
                else if (income <= 190200)
                    taxRate = 28;
                else if(income <= 372950)
                    taxRate = 33;
                else
                    taxRate = 35;
                break;
        }

        System.out.println("The filing status is " + statusArray[status-1]+ "\nThe tax rate  is: " + taxRate + "%.");
        System.out.println("The tax owed is: " + income * taxRate / 100);

    }

    public static void main(String[] args) {

        problem1();
        problem2();
        problem3();
        problem4();
        problem5();
        problem6();
        problem7();
    }



}
