public class App {

public static void main(String[] args){
int time = 3;
boolean isOpen = false;
String hall = "Dukes";
int dukesClosingTime = 10;
String color = "Green";

if (hall.equalsIgnoreCase("Dukes") && (dukesClosingTime - time) < 30)
{
   color = "Yellow";
}else if (hall.equalsIgnoreCase("Dukes") && (dukesClosingTime - time) > 30)
{
   color = "Green";
}else if (hall.equalsIgnoreCase("Dukes") && isOpen == false)
{
   color = "Red";
}

System.out.println("Color: " + color);



}
}