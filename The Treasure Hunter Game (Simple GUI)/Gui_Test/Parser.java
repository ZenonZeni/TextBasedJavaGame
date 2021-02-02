/**
 * This is the parser class that is used to get user input and seperate the words then check if the words are commands
 * @since 6/13/2018
 * @author christopher nguyen
 * @version 1.0
 **/
package Gui_Test;
import java.util.StringTokenizer;
public class Parser {
 
  //Instance Variables
  public CommandWords commands;  // holds all valid command words
  
  /**
   * default constructor for default values
   */
  public Parser(){
    this(new CommandWords());
  }
  
  /**
   * Constructor to recieve arguments and commands equals  to the CommandWords object
   * @parama CommandWord vC which is the valid commands user can do
   */
  public Parser(CommandWords vC) {
    commands = vC;
  }
  
  /**
   * constructor to reference or create duplicated objects
   * @parama Parser x which is the object
   **/
  public Parser(Parser x){
    this(x.commands);
  }
  /**
   * getCommands is an accessor method to get the commandWords
   * @return CommandWords commands used to get commands from object CommandWords
   */
  public CommandWords getCommands(){
    return commands;
  }
  
  /**
   * setCommands is an mutator method to set the commands
   * @parama CommandWords c is the paramater that will be set to commands
   */
  public void setCommands(CommandWords c){
    commands = c;
  }
  /**
   * getCommand class is called when game demands user input and seperates them into words then checks them if valid
   * @returns new Command - this sends it back to the game for use if not valid it returns null
   **/
  public Command getCommand(String c) {
    
    String inputLine = "";   // will hold the full input line
    String word1;
    String word2;
    String word3;
    
    System.out.print("> ");     // print prompt
    

      inputLine = c;
    
    StringTokenizer tokenizer = new StringTokenizer(inputLine);
    
    if(tokenizer.hasMoreTokens()){
      word1 = tokenizer.nextToken();      // get first word
    }
    else{
      word1 = null;
    }
    if(tokenizer.hasMoreTokens()){
      word2 = tokenizer.nextToken();      // get second word
    }
    else{
      word2 = null;
    }
    if(tokenizer.hasMoreTokens()){
      word3 = tokenizer.nextToken();      // get second word
    }
    else{
      word3 = null;
    }
    // note: we just ignore the rest of the input line.
    
    // Now check whether this word is known. If so, create a command object
    // with it. If not, create a "null" command (for unknown command).
    
    if(commands.isCommand(word1)){
      return new Command(word1, word2, word3);
    }
    else{
      return new Command(null, word2, word3);
    }
  }
}