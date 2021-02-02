/**
 * Inventory class is the player's inventory to store his or her's items
 * @author christopher nguyen
 * @since 6/13/2018
 * @version 1.0
 * ©CopyRight 2018
 **/
package Gui_Test;
public class Inventory{
  //Instance Variables
  public boolean pass;
  public boolean cm;
  public boolean mineral;
  public boolean spass;
  
  /**
   * Constructor to initalize the default values
   **/
  public Inventory(){
    this (false,false,false,false);
  }
  
  /**
   * Additional constructor for initalizing values from parama
   * @parama boolean thePass is true or false if pass is in inventory
   * @parama boolean newCm is true or false if cloak (originally cloakModule is in inventory)
   * @parama boolean mineral1 true or false if mineral is in inventory
   * @parama boolean spass1 true or false if special pass is in inventory
   **/
  public Inventory(boolean thePass, boolean newCm, boolean mineral1, boolean spass1){
    
    pass= thePass;
    cm= newCm;
    mineral= mineral1;
    spass= spass1;
    
  }
  
  /**
   * Additional constructor for duplicate objects
   **/
  public Inventory(Inventory x){
    this (x.pass, x.cm, x.mineral, x.spass);
  }
  
  /**
   * getPass accessor method use to get pass
   * @return boolean pass which is the pass
   **/
  public boolean getPass(){
    return pass;
  }
  
  /**
   * getCm accessor method use to get the cloak (originally cloakModule)
   * @return boolean cm which is the cloak
   **/
  public boolean getCm(){
    return cm;
  }
  
  /**
   * getSpass accessor method use to get the secret pass
   * @return boolean spass which is special pass
   **/
  public boolean getSpass(){
    return spass;
  }
  
  /**
   * getMineral accessor method use to get get mineral
   * @return boolean mineral which is the mineral in the inventory
   **/
  public boolean getMineral(){
    return mineral;
  }
  
  /**
   * setPass mutator method use to set the pass to true or false
   * @parama boolean p which sets true or false
   **/
  public void setPass(boolean p){
    pass= p;
  }
  
  /**
   * setCm mutator method use to set the cloak (cloakModule) to true or false
   * @parama boolean c which set the cm to true or false
   **/
  public void setCm(boolean c){
    cm= c;
  }
  
  /**
   * setMineral mutator method use to set the mineral to true or false
   * @parama boolean m which is to set the mineral to true or false
   **/
  public void setMineral(boolean m){
    mineral= m;
  }
  
  /**
   * setSpass mutator method use to set the spass to true or false
   * @parama boolean s which is to set the spass to truue or false
   **/
  public void setSpass(boolean s){
    spass= s;
  }
  
  /**
   * checkInventory is like a toString that outputs all current items in the inventory
   */
  public String checkInventory(){
	String i ="";
    System.out.println("Inventory: ");
    i = (i + "Inventory: \n");
    if(pass == true){
      System.out.println("pass");
      i = (i+ "pass\n");
    }
    else{
      System.out.println("Empty");
      return (i+ "Empty");
    }
    if(mineral == true){
      System.out.println("mineral");
      i = (i+"mineral\n");
      
    }
    if(cm == true){
      System.out.println("cloak");
      i = (i +"cloak\n");
    }
    if(spass == true){
      System.out.println("secret pass");
      i= (i+"secret pass\n");
    }
    return i;
  }
  
}