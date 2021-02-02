/**
 * This is the Game class that holds all methods that the Game object that is created does while also holds 
 * the game variables
 * @author christopher nguyen
 * @since 6/13/2018
 * @version 1.0
 * ©CopyRight 2018
 **/
package Gui_Test;

public class Game{
  
  //Instance Variables of the class Game
  public Room[] solarSystem;
  public int currentRoom;
  public Inventory inventory;
  public boolean cloakedMode;
  public boolean givenMineral;
  public boolean givenPass;
  

  /**
   * Beginning constructor to set default values in variables
   */
  public Game(){
    this(new Room[12], 0, null, false,false,false);
    inventory = new Inventory();
    //Room 0
  	solarSystem[0]= new Room(0,"Starting Sector - Sector 0"," the starting sector - Sector 0","There are no items in this sector"
                             ,false,false,false,false,true
                             ,"Computer: Alert welcome to the solar system of PI, this sector is full of pirates so, please be catious"
                             ,1,-1,-1,-1,"Computer: The treasure is hidden somewhere in this solar System, there is a station located"
                             + " somewhere in this sector where you can find Christopher.");
  	//Room 1
  	solarSystem[1]= new Room(1,"Guard Sector 1"," the guard sector - Sector 1","There are no items in this sector"
                             ,false,false,false,false,false,"Computer: Alert!, there is a guard in the sector",5,0,11,2
                             ,"Guard: Hey there, if you want to enter the station you will need to give me a pass to go" 
                             +" through the forcefield i don't know where you can get one but good luck!");
  
  	//Room 2
  	solarSystem[2]= new Room(2,"Sector 2"," sector 2","There are no items in this sector",false,false,false,false,false
                             ,"Computer: Alert!, there is a spaceship in this sector",3,-1,1,-1,"SpaceShip: You need a pass into the station?"
                             +" Sure I can give you one but i forgot it at my base in sector 4. " 
                             +"If you can find my base you can grab it, anyways good luck!");
  
  	//Room 3
  	solarSystem[3]= new Room(3,"Guard Sector 3"," the guard sector - Sector 3","There are no items in this sector"
                             ,false,false,false,false,false," Computer: Alert there is a guard in the sector"
                             ,-1,2,5,4,"Guard :Hey there, if you want to enter the station you will need to give me a pass to go" 
                             +" through the forcefield i don't know where you can get one but good luck!");
  
  	//Room 4
  	solarSystem[4]= new Room(4,"Sector 4"," a sector full of astroids - Sector 4","You look into the astroid and find the pass"
                             ,true,false,false,false,false,"You notice that their is a weird abnormal astroid that is glowing!"
                             ,-1,-1,3,-1,"");
  
  	//Room 5
  	solarSystem[5]= new Room(5,"Station Sector 5"," the merchant station in sector 5","There are no items in this sector"
                             ,false,false,false,false,false,"You notice that christopher your friend is waving at you with a big smile on his face"
                             ,9,1,6,3,"Christopher : There you are I was waiting for you but you can't get to the treasure since their pirates north of here. " +
                            "So, you need to find a way passed the pirates. You have to find a cloak, you can find one off a merchant in sector 8 but remember to comeback"
                             +" since you need me to install it ^_^");
  
  	//Room 6
  
  	solarSystem[6]= new Room(6,"Guard Sector 6"," the guard sector - sector 6","There are no items in this sector"
                             ,false,false,false,false,false,"Computer: Alert there is a guard in the sector"
                             ,8,11,7,5,"Guard: Hey there, if you want to enter the station you will need to give me a pass to go" 
                             +" through the forcefield i don't know where you can get one but good luck!");
  
  
  	//Room 7
  	solarSystem[7]= new Room(7,"Mineral Sector 7"," a astroid sector - Sector 7","You look into a astroid and find a mineral"
                             ,false,false,true,false,false
                             ,"When you enter this sector you notice a unusual glowing object inside an astroid"
                             ,-1,-1,-1,6,"");
  
  	//Room 8
  	solarSystem[8]= new Room(8,"Cloak Sector 8"," a sector full of merchants - Sector 8","You see the Cloak but can't take it"
                             ,false,true,false,false,false,"When you enter the sector you notice the merchant that christopher was refering to"
                             ,-1,6,-1,9,"Merchant: I can give you a cloak in exchange for a mineral. So, if you have a mineral give it to me.");;
  	//Room 9
  	solarSystem[9]= new Room(9,"Pirate Sector 9"," the pirate sector - Sector 9","You look into a astroid and find a secret pass"
                             ,false,false,false,true,false,"Computer: Alert! Their are alot of pirate ships here in this sector and a weird astroid"
                             ,10,5,8,-1,""); 
  	//Room 10
  	solarSystem[10]= new Room(10,"Treasure Sector 10"," the treasure sector - Sector 10"," Wait its a ship and you notice there is treasure all over this ship but you find something big a warp module"
                             + " and it is installed on this ship. You can now warp and this will take this ship full of treasure home to end this journey."
                             ,false,false,false,false,false,"Alert treasure planet is in front of you"
                             ,-1,9,-1,-1,""); 
  	//Room 11
  	solarSystem[11]= new Room(11,"Hidden Room - Sector 11"," the hidden sector away from all","When you enter the gap you found a teleporter in this sector"
                             ,false,false,false,false,false,"You notice a unusual gap in space would you like to look?"
                             ,6,-1,-1,1,"");
  	System.out.println();
    System.out.println("Welcome player to the Treasure Hunter by: Christopher Nguyen!");
    System.out.println("The Treasure Hunter is a advance text based game for experienced players.");
    System.out.println("Your goal in this game is to find the treasure planet and take it's treasure home with you");
    System.out.println("Type 'help' if you need help knowing or remembering the game commands.");
    System.out.println();
    System.out.println("You're in " + solarSystem[currentRoom].getDescription());
    System.out.println(solarSystem[currentRoom].getEvent());
    solarSystem[currentRoom].printExits();
    System.out.println("Thank you for playing the treasure hunter. If you discover any bugs please contact me" +
                       " Christopher Nguyen at ZenonZeni@hotmail.com . Anyways I hope you enjoyed it");
  
  }
  
  /**
   * The constructor used in initalizing values into the variables 
   * @parama Room[] sS standing for solarSystem this is an array that stores each room object
   * @parama int cR standing for currentRoom this variable keeps track of which room player is in
   * @parama Inventory inv Standing for the inventory or backpack in the game to store the items 
   * @parama boolean cm Standing for cloakedMode this boolean indicates if player ship is cloaked
   * @parama boolean gM Standing for givenMineral this boolean indicates if player gave the mineral to the merchant
   * @parama boolean gP standing for givenPass this boolean indiciates if player has given the pass to guard
   */
  public Game(Room[] sS, int cR, Inventory inv, boolean cm, boolean gM, boolean gP ) {
    solarSystem= sS;
    currentRoom = cR;
    inventory = inv;
    cloakedMode = cm;
    givenMineral = gM;  
    givenPass = gP;
  }
  
  /**
   * Additional constructor for Class Game used to reference to class by a name
   * @parama Game x is for reference to duplicate the class
   */
  public Game(Game x){
    this (x.solarSystem, x.currentRoom, x.inventory, x.cloakedMode, x.givenMineral, x.givenPass);
  }
  
  /**
   * getSolarSystem accessor method is used to get the Room[] array of solarSystem
   * @return Room[] solarSystem
   */
  public Room[] getSolarSystem(){
    return solarSystem;
  }
  
  /**
   * getCurrentRoom accesor method is used to get the int number of currentRoom
   * @return int currentRoom
   */
  public int getCurrentRoom(){
    return currentRoom;
  }
  
  /**
   * getInventory accesor method is used to get the Inventory object of inventory
   * @return Inventory inventory
   */
  public Inventory getInventory(){
    return inventory;
  }
  
  /**
   * getCloakedMode accesor method is used to get the boolean cloakedMode
   * @return boolean cloakedMode
   */
  public boolean getCloakedMode(){
    return cloakedMode;
  }
  
  /**
   * getGivenMineral accesor method is used to get the boolean givenMineral
   * @return boolean givenMineral
   */
  public boolean getGivenMineral(){
    return givenMineral;
  }
  
  /**
   * getGivenPass accesor method is used to get the boolean givenPass
   * @return boolean givenPass true if given pass false if not
   */
  public boolean getGivenPass(){
    return givenPass;
  }
  /**
   *setSolarSystem mutator method is used to set the solarSystem to s
   * @parama Room[] sS
   **/
  public void setSolarSystem(Room[] sS){
    solarSystem = sS;
  }
  
  /**
   *setCurrentRoom mutator method is used to set the currentRoom to cr
   * @parama int cr which is the currentroom
   */
  public void setCurrentRoom(int cr){
    currentRoom= cr;
  }
  
  /**
   *setInventory mutator method is used to set the Inventory to inv
   * @parama Inventory inv - the backpack object or inventory which it is called
   */
  public void setInventory(Inventory inv){
    inventory = inv;
  }
  
  /**
   * setCloakedMode to mutator method is used to set the CloakedMode to true or false based on cm
   * @parama boolean cm which is true or false wheither cloaked mode is true or false
   */
  public void setCloakedMode(Boolean cm){
    cloakedMode = cm;
  }
  
  /**
   * setGivenMineral mutator method is used to set the givenMineral to gm
   * @parama boolean gm to givenMineral
   */
  public void setGivenMineral(boolean gm){
    givenMineral = gm;
  }
  
  /**
   * setGivenPass is a mutator method is used to set the givenPass to gp
   * @parama boolean gP to givenPass
   */
  public void setGivenPass(Boolean gP){
    givenPass = gP;
  }
  public String startGame() {
	  System.out.println();
	    System.out.println("Welcome player to the Treasure Hunter by: Christopher Nguyen!");
	    System.out.println("The Treasure Hunter is a advance text based game for experienced players.");
	    System.out.println("Your goal in this game is to find the treasure planet and take it's treasure home with you");
	    System.out.println("Type 'help' if you need help knowing or remembering the game commands.");
	    System.out.println();
	    System.out.println("You're in " + solarSystem[currentRoom].getDescription());
	    System.out.println(solarSystem[currentRoom].getEvent());
	    solarSystem[currentRoom].printExits();
	    System.out.println("Thank you for playing the treasure hunter. If you discover any bugs please contact me" +
	                       " Christopher Nguyen at ZenonZeni@hotmail.com . Anyways I hope you enjoyed it");
	    return ("Welcome player to the Treasure Hunter by: Christopher Nguyen!\n"
	    		+"The Treasure Hunter is a advance text based game for experienced players.\n"
	    		+"Your goal in this game is to find the treasure planet and take it's treasure home with you\n"
	    		+"'help' if you need help knowing or remembering the game commands.\n"
	    		+"You're in " + solarSystem[currentRoom].getDescription() +"\n"
	    		+solarSystem[currentRoom].getEvent() +"\n"
	    		+solarSystem[currentRoom].printExits() +"\n"
	    		+"Thank you for playing the treasure hunter. If you discover any bugs please contact me" +
                " Christopher Nguyen at ZenonZeni@hotmail.com . Anyways I hope you enjoyed it");
  }
  /**
   *processCommand is a special method that is used to check for what the commandWord is and calls a method
   * @parama Command command is sent to this method to be used and sent as arguments to other methods
   * @return boolean it returns true when the game is complete and false if it is not complete 
   */
  public String processCommand(Command command) {
    String s = "";
    
    if(command.isUnknown()) {
      System.out.println("I don't know what you mean...");
      return "I don't know what you mean...";
    }
    String commandWord = command.getCommandWord();
    if (commandWord.equalsIgnoreCase("help")){
      s = printHelp();
    }
    else if (commandWord.equalsIgnoreCase("fly")|| commandWord.equalsIgnoreCase("go")){
      return flyRoom(command);
    }
    else if(commandWord.equalsIgnoreCase("quit")){
      System.out.println("You have failed your journey");
       s = "quit";
    }
    else if(commandWord.equalsIgnoreCase("look")){
      s= lookObject(command);
    } 
    else if(commandWord.equalsIgnoreCase("take")){
      s= takeItem(command);
    }
    else if (commandWord.equalsIgnoreCase("give")){
      s= giveItem(command);
    }
    else if (commandWord.equalsIgnoreCase("ask")){
      s= askPerson(command);
    }
    else if(commandWord.equalsIgnoreCase("warp")){
      s = warpHome(command);
    }
    else if(commandWord.equalsIgnoreCase("teleport")){
      s= randomTeleport();
    }
    else if(commandWord.equalsIgnoreCase("inventory")){
      s= inventory.checkInventory();
    }
    else{
      System.out.println("Error process cammand does not understand");
      s= "Error process cammand does not understand";
    }
    
    return s;
  }
  
  /**
   *printHelp method is called when player needs help remembering the command words
   **/
  private String printHelp() { 
    System.out.println("Here are the commands and if you still don't understand please contact me");
    System.out.println("Note: Do not use brackets in between words");
    System.out.println("Your ship command words are:");
    System.out.println("fly quit help look take give ask warp teleport inventory");
    System.out.println();
    System.out.println("fly (exit) - is for traveling between sector");
    System.out.println("quit - is used for quiting the game even if it is not finished");
    System.out.println("help - is used to list all commands and exits again");
    System.out.println("look - is used to look closer into the sector's event");
    System.out.println("look (exit) - is used to look to see what sector is in that exit");
    System.out.println("take (item) - is used to pick up an item in that sector");
    System.out.println("give (item) - is used when you give an item to someone");
    System.out.println("ask (person) - is used to ask a AI something");
    System.out.println("warp - cannot be used unless in a certain place");
    System.out.println("teleport - can only be used in a certain place");
    System.out.println("inventory - is used to check the contents in your inventory");
    solarSystem[currentRoom].printExits();
    
    return ("Here are the commands and if you still don't understand please contact me\n"
			  +"Note: Do not use brackets in between words\n"
			  +"Your ship command words are:\n"
			  +"fly quit help look take give ask warp teleport inventory \n"
			  +"fly (exit) - is for traveling between sector"
	    	  +"quit - is used for quiting the game even if it is not finished"
	    	  +"help - is used to list all commands and exits again"
	    	  +"look - is used to look closer into the sector's event"
	    	  +"look (exit) - is used to look to see what sector is in that exit"
	          +"take (item) - is used to pick up an item in that sector"
	          +"give (item) - is used when you give an item to someone"
	          +"ask (person) - is used to ask a AI something"
	          +"warp - cannot be used unless in a certain place"
	          +"teleport - can only be used in a certain place"
	          +"inventory - is used to check the contents in your inventory"
	          +solarSystem[currentRoom].printExits() );
  }
  
  /**
   *lookObject method is called when player looks further into the room to find the object there
   * @parama Command command is used to check to find if There is not a second word or if there is than which exit
   **/
  private String lookObject(Command command){
    int nextRoom= -1;
    String exit = command.getSecondWord();
    if(!command.hasSecondWord()) {
      System.out.println(solarSystem[currentRoom].getObject());
      return solarSystem[currentRoom].getObject();
    }
    else if(exit.equalsIgnoreCase("north") &&solarSystem[currentRoom].getNorthExit() != -1){
      nextRoom = solarSystem[currentRoom].getNorthExit();
      System.out.print(" exit: north-");
      System.out.println(solarSystem[nextRoom].getName());
      return ("exit: north-" +solarSystem[nextRoom].getName());
    }
    else if(exit.equalsIgnoreCase("east") && solarSystem[currentRoom].getEastExit() != -1){
      nextRoom = solarSystem[currentRoom].getEastExit();
      System.out.print(" exit: east-");
      System.out.println(solarSystem[nextRoom].getName());
      return (" exit: east-"+solarSystem[nextRoom].getName());
    }
    else if(exit.equalsIgnoreCase("south") && solarSystem[currentRoom].getSouthExit() != -1){
      nextRoom = solarSystem[currentRoom].getSouthExit();
      System.out.print(" exit: south-");
      System.out.println(solarSystem[nextRoom].getName());
      return (" exit: south-"+solarSystem[nextRoom].getName());
    }
    else if(exit.equalsIgnoreCase("west") && solarSystem[currentRoom].getWestExit() != -1){
      nextRoom = solarSystem[currentRoom].getWestExit();
      System.out.print(" exit: west-");
      System.out.println(solarSystem[nextRoom].getName());
      return (" exit: west-"+solarSystem[nextRoom].getName());
    }
    else{
      System.out.println("Look what?");
      return "Look what?";
    }
  }
  
  /**
   *takeItem method is called when player wants to take a item from a specific room
   * @parama Command command sends the words from within this object
   **/
  private String takeItem(Command command){
    String item = command.getSecondWord();
    String item2 = command.getThirdWord();
    if(!command.hasSecondWord()) {
      // if there is no second word, we don't know what to take?
      System.out.println("take what?");
      return "take what?";
    }
    else if (item.equalsIgnoreCase("cloak") && solarSystem[currentRoom].getCm()== true && givenMineral== true ){
      inventory.setCm(true);
      solarSystem[currentRoom].setCm(false);
      solarSystem[currentRoom].setObject("There are no items in this sector");
      System.out.println("You have picked up the cloak");
      solarSystem[5].setObjectiveEvent("You need me to install your Cloak? Sure i can do it. "+
                                         "ZZZZZZZ, There I am done installing the cloak, Good luck!");
      return ("You have picked up the cloak");
    }
    else if (item.equalsIgnoreCase("cloak") && solarSystem[currentRoom].getCm()== true && givenMineral== false){
      System.out.println("you cannot take that!");
      return ("you cannot take that!");
    }
    else if (item.equalsIgnoreCase("pass") && solarSystem[currentRoom].getPass()== true) {
      inventory.setPass(true);
      solarSystem[currentRoom].setObject("There are no item in this sector");
      solarSystem[currentRoom].setPass(false);
      System.out.println("You have picked up the pass and put it in your inventory");
      return ("You have picked up the pass and put it in your inventory");
    }
    else if (item.equalsIgnoreCase("pass") && solarSystem[currentRoom].getPass()== true){
      System.out.println("get what pass?");
      return ("get what pass?");
    }
    else if(item.equalsIgnoreCase("mineral") && solarSystem[currentRoom].getMineral()== true){
      inventory.setMineral(true);
      solarSystem[currentRoom].setObject("There are no items in this sector");
      solarSystem[currentRoom].setMineral(false);
      System.out.println("You have picked up the mineral and put it in your inventory");
      return("You have picked up the mineral and put it in your inventory");
    }
    else if (item.equalsIgnoreCase("secret") && item2.equals("pass") && solarSystem[currentRoom].getSpass()== true){
      inventory.setSpass(true);
      solarSystem[currentRoom].setObject("There are no items in this sector");
      solarSystem[currentRoom].setSpass(true);
      System.out.println("You have picked up the secret pass and put it in your inventory");
      return ("You have picked up the secret pass and put it in your inventory");
    }
    else{
      System.out.println("You cannot take something that does not exists");
      return "You cannot take something that does not exists";
    }
    
  }
  
  /**
   *giveItem method is used when the player wants to give a item to a npc
   * @parama Command command is used to get the second word which is the npc
   **/
  private String giveItem(Command command){
    String item = command.getSecondWord();
    if(!command.hasSecondWord()) {
      // if there is no second word, we don't know what to take?
      System.out.println("give what?");
      return "give what?";
    } 
    else if(item.equalsIgnoreCase("pass") && (currentRoom == 1 || currentRoom == 3 || currentRoom == 6) && inventory.getPass() == true){
      givenPass = true;
      inventory.setPass(false);
      System.out.println("Thank you for the pass you can now pass");
      return "Thank you for the pass you can now pass";
    }
    else if(item.equalsIgnoreCase("mineral") &&solarSystem[currentRoom].getCm() == true && inventory.getMineral() == true){
      givenMineral = true;
      solarSystem[currentRoom].setObject("You can now take the cloak");
      System.out.println("Merchant: A deal is a deal you can have the cloak, I opened the lock you can now take it");
      solarSystem[currentRoom].setObjectiveEvent("You have your cloak go away");
      return "Merchant: A deal is a deal you can have the cloak, I opened the lock you can now take it";
    }
    else{
      System.out.println("You cannot give what does not exist in your inventory");
      return "You cannot give what does not exist in your inventory";
    }
  }
  
  /**
   *goRoom method is used when player wants to travel from room to room 
   * @parama Command command is to get the second word for the exits
   **/
  private String flyRoom(Command command) {
    int nextRoom = -1;
    String exit = "";
    if(command.hasSecondWord()){
      exit = command.getSecondWord();
    }
    if(exit.equalsIgnoreCase("north")){
      nextRoom = solarSystem[currentRoom].getNorthExit();
    }
    if(exit.equalsIgnoreCase("east")){
      nextRoom = solarSystem[currentRoom].getEastExit();
    }
    if(exit.equalsIgnoreCase("south")){
      nextRoom = solarSystem[currentRoom].getSouthExit();
    }
    if(exit.equalsIgnoreCase("west")){
      nextRoom = solarSystem[currentRoom].getWestExit();
    }
    if(!command.hasSecondWord()) {
      System.out.println("fly where?");
      return "fly where?";
    }
    else if (nextRoom == 5 && givenPass== true){
      currentRoom = nextRoom;
      solarSystem[currentRoom].setVisited(true);
      return printLocationInfo();
    }
    else if (nextRoom == 5 && givenPass == false){
      System.out.println("Guard: You require to give me a pass to enter this sector ");
      return (exit= (exit+"\n"+"Guard: You require to give me a pass to enter this sector "));
    }
    else if (nextRoom == 9 && cloakedMode == true){
      currentRoom = nextRoom;
      solarSystem[currentRoom].setVisited(true);
      return printLocationInfo();
    }
    else if(nextRoom == 9 && cloakedMode == false && inventory.getCm()== true){
      System.out.println("Your ship has not installed the cloak to in order enter this sector");
      return (exit= (exit+"\n"+" Your ship has not installed the cloak to in order enter this sector"));
    }
    else if(nextRoom == 9 && cloakedMode == false && inventory.getCm()== false){
      System.out.println("You cannot enter this sector due to pirate blockade");
      return (exit= (exit+"\n"+" You cannot enter this sector due to pirate blockade"));
    }
    else if (nextRoom == 11 && inventory.getSpass() == false){
      System.out.println("A forcefield blocks your way to this sector");
      return (exit= (exit+"\n"+" A forcefield blocks your way to this sector"));
    }
    else if (nextRoom == 11 && inventory.getSpass() == true){
      currentRoom = nextRoom;
      solarSystem[currentRoom].setVisited(true);
      return printLocationInfo();
    }
    else if (nextRoom == -1){
      System.out.println("That is not a place you can fly!");
      return (exit +"\n"+ " That is not a place you can fly!");
    }
    else {
      currentRoom = nextRoom;
      solarSystem[currentRoom].setVisited(true);
      exit = (exit+ "\n"+printLocationInfo());
      return exit;
    }
    
  }
  
  /**
   *askPerson method is used when a player wants to talk to a npc
   * @parama Command command is used to get the secondword to know what npc it is
   **/
  private String askPerson(Command command) 
  {
    String person = command.getSecondWord();
    if(!command.hasSecondWord()) {
      System.out.println("ask who??");
      return "ask who??";
    }
    else if(person.equalsIgnoreCase("computer")){
      System.out.println(solarSystem[0].getObjectiveEvent());
      return solarSystem[0].getObjectiveEvent();
    }
    else if(person.equalsIgnoreCase("guard") && currentRoom == 1 || currentRoom == 3 || currentRoom == 6){
      System.out.println(solarSystem[currentRoom].getObjectiveEvent());
      return solarSystem[currentRoom].getObjectiveEvent();
    }
    else if(person.equalsIgnoreCase("spaceship") && currentRoom == 2){
      System.out.println(solarSystem[currentRoom].getObjectiveEvent());
      return solarSystem[currentRoom].getObjectiveEvent();
    }
    else if(person.equalsIgnoreCase("christopher") && currentRoom == 5 && inventory.getCm() == false){
      System.out.println(solarSystem[currentRoom].getObjectiveEvent());
      return solarSystem[currentRoom].getObjectiveEvent();
    }
    else if(person.equalsIgnoreCase("merchant") && currentRoom == 8){
      System.out.println(solarSystem[currentRoom].getObjectiveEvent());
      return solarSystem[currentRoom].getObjectiveEvent();
    }
    else if(person.equalsIgnoreCase("christopher") && currentRoom == 5 && inventory.getCm() == true){
      System.out.println(solarSystem[currentRoom].getObjectiveEvent());
      cloakedMode = true;
      return solarSystem[currentRoom].getObjectiveEvent();
    }
    //This allows a developer to auto complete objectives and check rooms without restrictions
    else if(person.equalsIgnoreCase("admin")){
      System.out.println("You have activated the admin mode this will grant all items and it automatically completes all objectives");
      cloakedMode = true;
      givenPass = true;
      inventory.setCm(true);
      solarSystem[4].setCm(false);
      solarSystem[4].setObject("There are no items in this sector");
      inventory.setPass(true);
      solarSystem[8].setPass(false);
      solarSystem[8].setObject("There are no items in this sector");
      inventory.setSpass(true);
      solarSystem[8].setSpass(false);
      solarSystem[9].setObject("There are no items in this sector");
      inventory.setMineral(true);
      solarSystem[7].setMineral(false);
      solarSystem[7].setObject("There are no items in this sector");
      return("You have activated the admin mode this will grant all items and it automatically completes all objectives");
    }
    else{
      System.out.println("You cannot ask a person that does not exist here or please check spelling");
      return "You cannot ask a person that does not exist here or please check spelling";
    }
  }
  
  /**
   *randomTeleport method is used when player wants to randomly teleport when in teleporter room
   **/
  private String randomTeleport(){
    if(currentRoom == 11){
      int random = (int )(Math.random() * 12 + 0);
      currentRoom= random;
      printLocationInfo();
      return printLocationInfo();
    }
    else{
      System.out.println("Teleport what?!!!! Thats Impossible!!!");
      return "Teleport what?!!!! Thats Impossible!!!";
    }
  }
  
  /**
   *printLocationInfo method is used when player wants to know where they are currently
   **/
  private String printLocationInfo(){
	 String s =("You are in" + solarSystem[currentRoom].getDescription() +"\n" 
			 +solarSystem[currentRoom].getEvent() +"\n");
	 
    System.out.println("You are in" + solarSystem[currentRoom].getDescription());
    System.out.println(solarSystem[currentRoom].getEvent());
    
    if(solarSystem[currentRoom].getVisited() == true ){
      System.out.println("You have visted this room");
      s = (s+"You have visted this room \n");
    }
    else{
    	s= (s+"You have not visited this room \n");
      System.out.println("You have not visited this room");
    }
    s = (s+ solarSystem[currentRoom].printExits() +"\n");
    solarSystem[currentRoom].printExits();
    
    return s;
  }
  
  /**
   *warp method is used when player wants to end and complete the game - only works in the treasure room
   * @parama Command command is used to check if player uses a second word and produces a message
   * @returns boolean true when game has ended and false when the game is not finished
   **/
  private String warpHome(Command command) {
    if(currentRoom== 10){
      System.out.println("Lets power this ship and hyper jump home");
      return "quit"; // signals when you want to end the game when at the ending
    }
    else if(command.hasSecondWord()) {
      System.out.println("you can only use warp! No second word");
      return "quit"; // signals that you cannot end game using a second word with warp
    }
    else{
      System.out.println("You can't warp");
      return "quit"; // signals that you cannot end the game
    }
  }
}