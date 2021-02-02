/**
 * CommandWords is a object that is used to hold all commandWord and compares them to user input in parser Class
 * @author christopher nguyen
 * @since 6/13/2018
 * @version 1.0
 **/
package Gui_Test;
class CommandWords{
  // a constant array that holds all valid command words
  public String[] validCommands;
  
  /**
   * default value constructor it initalizes the array
   */
  public CommandWords(){
    this(new String[10]);
  }
  /**
   * Constructor - initialise the command words.
   * @parama String[] vC holds valid commands
   */
  public CommandWords(String[] vC){
    validCommands = vC;
  }
  
  /**
   * Additional constructor used when dublicating object
   * @parama CommandWord x is the duplicate object
   */
  public CommandWords(CommandWords x){
    this(x.validCommands);
  }
  
  /**
   * getValidCommands is a accessor method to access validCommands
   * @returns String[] validCommands which hold command words in a string array
   */
  public String[] getValidCommands(){
    return validCommands;
  }
  
  /**
   * setValidCommands is a mutator method to set validCommands to parama
   * @parama String[] v sets the validCommands array to v array
   */
  public void setValidCommands(String[] v){
    validCommands = v;
  }
  
  /**
   * Check whether a given String is a valid command word. 
   * @Return boolean true if it is, false if it isn't.
   */
  public boolean isCommand(String aString){
    for(int i = 0; i < validCommands.length; i++) {
      if(validCommands[i].equalsIgnoreCase(aString))
        return true;
    }
    // if we get here, the string was not found in the commands
    return false;
  }
  
}