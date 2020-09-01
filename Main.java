class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

double colorTotal, colorBlue, colorBrown, colorGreen, colorOrange, colorRed, colorYellow, colorSum;

colorTotal = 55 * 10;

colorBlue = colorTotal * .24;

colorBrown = colorTotal * .13;

colorGreen = colorTotal * .16;

colorOrange = colorTotal *.2;

colorRed = colorTotal * .13;

colorYellow = colorTotal *.14;

System.out.println("blue: " + colorBlue);
System.out.println("brown: " + colorBrown);
System.out.println("green: " + colorGreen);
System.out.println("orange: " + colorOrange);
System.out.println("red: " + colorRed);
System.out.println("yellow: " + colorYellow);

colorSum = colorBlue + colorBrown + colorGreen + colorOrange + colorRed + colorYellow;

System.out.println("Sum: " + colorSum);

if(colorBlue > colorBrown && colorGreen > colorOrange)System.out.println("Blue over Brown and Green over Orange");

if(colorBrown <= colorRed)
System.out.println("Brown is less than or equal to Red");

if(colorSum == colorTotal)
System.out.println("Numbers match");

 }
} 
