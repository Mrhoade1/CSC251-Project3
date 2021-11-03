public class AirConditioner
{
   private String mfr; //manufacturer
   private String type;
   private double coolingCapacity;
   
   //no- arg constructor
   public AirConditioner()
   {
      mfr = "None";
      type = "Window";
      coolingCapacity = 0.0;
      
   }
   
   //Constructor that accepts arguments
   public AirConditioner(String mfr, String type, double coolingCapacity)
   {
      this.mfr = mfr;
      this.type = type;
      this.coolingCapacity = coolingCapacity;
   }
   
   //setters
   public void setMFR(String mfr)
   {
      this.mfr = mfr;
   }
   
   public void setType(String type)
   {
      this.type = type;
   }
   
   public void setCool(double coolingCapacity)
   {
      this.coolingCapacity = coolingCapacity;
   }
   
   //getters
   public String getMFR()
   {
      return mfr;
   }
   
   public String getType()
   {
      return type;
   }
   
   public double getCool()
   {
      return coolingCapacity;
   }
   
   //to String method
   public String toString()
   {
      //creating the string
      String str = ("\nAir Conditioner Manufacturer: " + getMFR() +
                     "\nAir Conditioner Type: " + getType() +
                     "\nAir Conditioner Cooling Capacity (BTUs Per Hour): " 
                     + getCool());
      
      //return the string
      return str;
   }
}