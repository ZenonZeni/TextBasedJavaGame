/**
 * Command class is for holding the user input words
 * @author christopher nguyen
 * @since 6/13/2018
 * @version 1.0
 **/
package Gui_Test;
class Command{
  //instance variables
  public String commandWord;
  public String secondWord;
  public String thirdWord;
  
  /**
   * Default constructor to set default values to instance variables
   */
  public Command(){
    this("","","");
  }
  
  /**
   * Command Constructor for parama to initalize values to variables
   * @parama String firstWord
   * @parama String secondWord1
   * @parama String thirdWord1
   */
  public Command(String firstWord, String secondWord1, String thirdWord1){
    commandWord = firstWord;
    secondWord = secondWord1;
    thirdWord = thirdWord1;
  }
  
  /**
   * Class Duplicator constructor
   * @parama Command x is duplicate class the object
   */
  public Command(Command x){
    this (x.commandWord, x.secondWord, x.thirdWord);
  }
  
  /**
   * getCommandWords gets the command word or first word
   * @Return String commandWord (the first word) of the user command
   */
  public String getCommandWord(){
    return commandWord;
  }
  
  /**
   * getSecondWord accesor method used to get the secondWord
   * @Return String secondWord of this command
   */
  public String getSecondWord(){
    return secondWord;
  }
  
  /**
   * getThirdWord accesor method used to get the thirdWord
   * @return String thirdWord of this command
   */
  public String getThirdWord(){
    return thirdWord;
  }
  
  /**
   * setCommandWord mutator method used to set the commandWord
   * @parama String cW is the commandWord we are setting to
   */
  public void setCommandWord(String cW){
    commandWord = cW;
  }
  
  /**
   * setSecondWord mutator method used to set the secondWord
   *@parama String sW is the secondWord we are setting to
   */
  public void setSecondWord(String sW){
    secondWord = sW;
  }
  
  /**
   * setThirdWord is a mutator method used to set the thirdWord
   * @parama String tW is the thirdWord we are setting to
   */
  public void setThirdWord(String tW){
    thirdWord = tW;
  }
  
  /**
   * isUnkown when a commandWord is null
   * @Return boolean true if this command was not understood.
   */
  public boolean isUnknown(){
    return (commandWord == null);
  }
  
  /**
   * hasSecondWord check if there is a second word when its not needed
   * @Return true if the command has a second word.
   */
  public boolean hasSecondWord(){
    return (secondWord != null);
  }
}
