import java.util.Scanner;
public class questions {
    public static void task1(){
        int baseSalary=105000;
        int dearAllownce=(105000/100)*40;
        int homeAllownce=(105000/100)*20;
        int grossSalary=baseSalary+dearAllownce+homeAllownce;
        System.out.println("GrossSalary:"+grossSalary);
    }
    public static void task2(){
    double distanceInKm=2614;
    double distanceInMeters=2614*1000;
    double distanceInFeets=distanceInMeters*3.28084;
    double distanceInInches=distanceInFeets*12;
    double distanceInCenti=distanceInInches*2.54;
        System.out.println("Distance in Meters:"+distanceInMeters+" meters");
        System.out.println("Distance in Feets:"+distanceInFeets+" Feets");
        System.out.println("Distance in Inches:"+distanceInInches+" Inches");
        System.out.println("Distance in Centimeters:"+distanceInCenti+" Centimeters");
    }
    public static void task3(){
        int english=80;
        int biology=90;
        int chemistry=75;
        int urdu=60;
        int physics=100;
        double totalMarks=100*5;
        double obtainedMarks=english+biology+chemistry+urdu+physics;
        double percentage=(obtainedMarks/totalMarks)*100;
        System.out.println("Aggregate Marks:"+obtainedMarks);
        System.out.println("Obtained Percentage:"+percentage+"  %");
    }
    public static void task4(){
        System.out.println("Enter Temperature in Fahrenheit:");
        Scanner temp_In_F=new Scanner(System.in);
        double temp_In_C=(temp_In_F.nextDouble()-32.0)/1.8;
        System.out.println("Temperature in Celsius:"+temp_In_C);
    }
    public static void task5(){
        double length=36;
        double width=36;
        double radius=36;
        double areaOfRec=length*width;
        double perimeterOfRec=2*areaOfRec;
        double areaOfCir=(3.14)*(radius*radius);
        double circum_OfCir=2*(3.14*radius);
        System.out.println("Area of Rectangle:"+areaOfRec);
        System.out.println("Perimeter of Rectangle:"+perimeterOfRec);
        System.out.println("Area of Circle:"+areaOfCir);
        System.out.println("Circumferance of Circle:"+circum_OfCir);
    }
    public static void task6(){
        double result;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of base:");
        double base= input.nextDouble();
        System.out.println("Enter the value of exponent:");
        double exponent= input.nextDouble();
        result=Math.pow(base,exponent);
        System.out.println("Result:"+result);
    }
    public static void task7(){
        int number=12345;
        int sum=0;
        while (number>0){
            int digit=number%10;
            sum+=digit;
            number=number/10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
    public static void task8(){
        int totalPopulation = 80000;
        double percentageMen = 52;
        double percentageLiteracy = 48;
        double percentageLite_Men = 35;

        double numberOfMen = totalPopulation * (percentageMen / 100);
        double numberOfWomen = totalPopulation - numberOfMen;

        double numberOfLite_Men = totalPopulation * (percentageLite_Men / 100);
        double numberOfLite_People = totalPopulation * (percentageLiteracy / 100);

        double numberOfLite_Women = numberOfLite_People - numberOfLite_Men;
        double numberOfIllite_Men = numberOfMen - numberOfLite_Men;
        double numberOfIllite_Women = numberOfWomen - numberOfLite_Women;
        System.out.println("Total number of illiterate men: " + (int)numberOfIllite_Men);
        System.out.println("Total number of illiterate women: " + (int)numberOfIllite_Women);
    }
    public static void task9(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to be withdrawn: ");
        int amount = scanner.nextInt();
        int notes100 = amount / 100;
        amount %= 100;
        int notes50 = amount / 50;
        amount %= 50;
        int notes10 = amount / 10;
        amount %= 10;

        System.out.println( " notes of 100:"+ notes100 );
        System.out.println( " notes of 50:"+ notes50 );
        System.out.println( " notes of 10:"+ notes10);
    }
    public static void task10(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total selling price of 15 items: ");
        double totalSellingPrice = scanner.nextDouble();
        System.out.print("Enter the profit percentage: ");
        double profitPercentage = scanner.nextDouble();
        double totalCostPrice = totalSellingPrice / (1 + profitPercentage / 100);
        double costPricePerItem = totalCostPrice / 15;
        System.out.println("The cost price of one item is: " + costPricePerItem);
    }

}
