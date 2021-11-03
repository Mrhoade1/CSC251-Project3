import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class CSC251demoRoom
{
   public static void main(String[] args) throws IOException
   {
      final int LITTLE_SHADE = 1;
      final int MODERATE_SHADE = 2;
      final int ABUNDANT_SHADE = 3;
   
      String name, mfr, type;
      double length, width, coolingCapacity;
      String shade = "";
      int littleShade = 0, moderateShade = 0, abundantShade = 0;
      
      //declare an ArrayList to hold all of our Room objects we will create
      ArrayList<CSC251room> roomList = new ArrayList<CSC251room>();
      
      //declare an ArrayList to hold all of our Unit objects we will create
      ArrayList<AirConditioner> unitList = new ArrayList<>();
      
      try 
      {
         //create a File object that will be used to read the info from the file
         File file = new File("Room2.txt");
         Scanner inputFile = new Scanner(file);
      
         //Loop to read the file    
         while(inputFile.hasNext())
         {
            name = inputFile.nextLine();
            length = inputFile.nextDouble();
            width = inputFile.nextDouble();
            inputFile.nextLine();
            shade = inputFile.nextLine();
            mfr = inputFile.nextLine();
            type = inputFile.nextLine();
            coolingCapacity = inputFile.nextDouble();
            if(inputFile.hasNext())
                inputFile.nextLine();
            if(inputFile.hasNext())
                inputFile.nextLine();
         
         //create a new Room object and add it to the ArrayList
            CSC251room myRoom = new CSC251room(name, length, width, shade);
            roomList.add(myRoom);
            AirConditioner unit = new AirConditioner(mfr, type, coolingCapacity);
            unitList.add(unit);
            myRoom.setCapacity(coolingCapacity);//used to send cooling capacity of the AC to the room class
            
         }
      
         for(CSC251room myRoom : roomList)
         {
            System.out.println("Room Name: " + myRoom.getName());
            System.out.printf("Room Area: %,.1f\n", myRoom.getArea());
            //System.out.println("Amount of Shade: " + myRoom.getShadeAmount()); This is not displayed due to change in output requirements.
            System.out.printf("BTUs Per Hour needed: %,.0f\n", myRoom.getCoolingCapacityNeeded());
            System.out.print(unitList);
            if (myRoom.hasAdequateCooling() == true)
               System.out.print("\nThis room is adequately cooled.");
            else
               System.out.print("\nThis room is not adequately cooled.");
            System.out.print("\n\n");//To make a blank space
            //keep track of the number of rooms with each type of shade amount
            if(myRoom.getShadeAmount().equalsIgnoreCase("Little"))
               littleShade++;
            else if(myRoom.getShadeAmount().equalsIgnoreCase("Moderate"))
               moderateShade++;
            else
               abundantShade++;
         }
         System.out.println();
         //This is not displayed due to change in output requirements.
         /*System.out.println("Number of rooms with little shade: " + littleShade); 
         System.out.println("Number of rooms with moderate shade: " + moderateShade);
         System.out.println("Number of rooms with abundant shade: " + abundantShade);*/
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      }//closing try block
      catch(IOException ex)//to catch the exception
      {
         //Using get message method to send error message
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
   }
}

