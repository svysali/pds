/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse.pds.model;
import java.util.*;

// line 43 "../../../../../pds.ump"
public abstract class CustomPizza extends Pizza
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //CustomPizza Attributes
  private float basePrice;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public CustomPizza(PDS aPDS)
  {
    super(aPDS);
    basePrice = (float) 5.0;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setBasePrice(float aBasePrice)
  {
    boolean wasSet = false;
    basePrice = aBasePrice;
    wasSet = true;
    return wasSet;
  }

  public float getBasePrice()
  {
    return basePrice;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "basePrice" + ":" + getBasePrice()+ "]";
  }
}