public class CSC251room
{
   //declare fields
   private String name;
   private double length;
   private double width;
   private String shadeAmount;
   
   public double capacity;
   
   public void setCapacity(double capacity)
   {
      this.capacity = capacity;
   }


   //no-arg constructor
   public CSC251room()
   {
      name = "";
      length = 0;
      width = 0;
      shadeAmount = "";
   }
   
   //constructor that accepts arguments
   public CSC251room(String name, double length, double width, String shadeAmount)
   {
      this.name = name;
      this.length = length;
      this.width = width;
      this.shadeAmount = shadeAmount;
   }

   //setters
   public void setName(String name)
   {
      this.name = name;
   }
   
   public void setShadeAmount(String shadeAmount)
   {
      this.shadeAmount = shadeAmount;
   }
   
   public void setLength(double length)
   {
      this.length = length;
   }
   
   public void setWidth(double width)
   {
      this.width = width;
   } 
   //getters
   public String getName()
   {
      return name;
   }
   
   public String getShadeAmount()
   {
      return shadeAmount;
   }
   
   public double getLength()
   {
      return length;
   }
   
   public double getWidth()
   {
      return width;
   }
   
   public double getArea()
   {
      return length * width;
   }
   
   /**
   Calculates and returns the cooling capacity needed to cool the room
   */
   public double getCoolingCapacityNeeded()
   {
      final double LITTLE_SHADE_PERCENTAGE = 1.15;
      final double ABUNDANT_SHADE_PERCENTAGE = .9;//Multiplying by .9 is the same as decreasing by 10%
      
      double btus = 0;
      
      if(getArea() < 250)
      {
         btus =  5500;
      }
      else if(getArea() <= 500)
      {
         btus =  10000;
      }
      else if(getArea() < 1000)
      {
         btus =  17500;
      }
      else//over 1000
      {
         btus =  24000;
      }
      
      if(getShadeAmount().equalsIgnoreCase("Little"))
         btus = btus * LITTLE_SHADE_PERCENTAGE;
      
      if(getShadeAmount().equalsIgnoreCase("Abundant"))
         btus = btus * ABUNDANT_SHADE_PERCENTAGE;
         
      return btus;
   }
   
      public boolean hasAdequateCooling()
   {
      if(getCoolingCapacityNeeded() < capacity)
      {
         return true;
      }
      else
         return false;
   }
   
}   
