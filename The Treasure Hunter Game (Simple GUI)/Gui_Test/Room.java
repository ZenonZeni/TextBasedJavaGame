/**
 * This is the Room class that holds all variables that apply to the sector in the game
 * @since 6/13/2018
 * @author christopher nguyen
 * @version 1.0
 * ©CopyRight 2018
 **/
package Gui_Test;
public class Room{
  public int num;
  public String name;
  public String description;
  public String object;
  public boolean pass;
  public boolean cm;
  public boolean mineral;
  public boolean spass;
  public boolean visited;
  public String event;
  public int northExit;
  public int southExit;
  public int eastExit;
  public int westExit;
  public String objectiveEvent;
  
  /**
   * default constructor to initalize default values
   **/
  public Room(){
    this (0,"","","",false,false,false,false,false,"",0,0,0,0,"");
  }
  
  /**
   * constructor to recieve arguments and initalize my variables to values send to consturctor
   * @parama int number
   * @parama String theName
   * @parama String theDescription
   * @parama String theObject
   * @parama boolean thePass
   * @parama boolean newCm
   * @parama boolean mineral1
   * @parama boolean spass1
   * @parama boolean newVisited
   * @parama int northExit2
   * @parama int southExit2
   * @parama int eastExit2
   * @parama int westExit2
   * @parama String objEvent
   **/
  public Room(int number, String theName, String theDescription, String theObject, boolean thePass, boolean newCm, boolean mineral1, boolean spass1, boolean newVisited, String theEvent,
              int northExit2, int southExit2, int eastExit2, int westExit2, String objEvent){
    num= number;
    name= theName;
    description= theDescription;
    object= theObject;
    pass= thePass;
    cm= newCm;
    mineral= mineral1;
    spass= spass1;
    visited= newVisited;
    event= theEvent;
    northExit= northExit2;
    southExit= southExit2;
    eastExit= eastExit2;
    westExit= westExit2;
    objectiveEvent= objEvent;
  }
  
  /**
   * constructor for duplicating the class
   * @parama Room x is the object of room x is the name
   **/
  public Room(Room x){
    this (x.num, x.name, x.description, x.object, x.pass, x.cm, x.mineral, x.spass, x.visited, x.event, x.northExit, x.southExit, x.eastExit, x.westExit
         ,x.objectiveEvent);
  }
  
  /**
   * getNum is a acessor to get the number of the class Room num
   * @return num the room number
   **/
  public int getNum(){
    return num;
  }
  
  /**
   * getName is used to get the Name of the class Room
   * @return name the name of the room
   **/
  public String getName(){
    return name;
  }
  
  /**
   * getDescription is a acessor to get the description of the class Room
   * @return description of the Room class
   **/
  public String getDescription(){
    return description;
  }
  
  /**
   * getObject is a acessor to get the Object description of the class Room
   * @return object this returns the object description
   **/
  public String getObject(){
    return object;
  }
  
  /**
   * getPass is a acessor to get the boolean pass
   * @returns pass this returns true or false if pass is in the room
   **/
  public boolean getPass(){
    return pass;
  }
  
  /**
   * getCm is a acessor method to get the cloakModule
   * @returns cm which is true or false depending if its in the room
   **/
  public boolean getCm(){
    return cm;
  }
  
  /**
   * getMineral is a acessor method to get the mineral
   * @returns mineral which is true or false depending if its in the room
   **/
  public boolean getMineral(){
    return mineral;
  }
  
  /**
   * getSpass is a acessor method to get the spass
   * @returns spass which is true or false depedning if its in the room
   **/
  public boolean getSpass(){
    return spass;
  }
  
  /**
   * getVisited is a acessor method to get if the room has been visited
   * @returns boolean visited true or false
   **/
  public boolean getVisited(){
    return visited;
  }
  
  /**
   * getEvent is a acessor method to get the room event
   * @returns string event
   **/
  public String getEvent(){
    return event;
  }
  
  /**
   * getNorthExit is a acessor method to get the room northExit
   * @returns int northExit which is the integer repersenting the north exit room
   **/
  public int getNorthExit(){
    return northExit;
  }
  
  /**
   * getSouthExit is a acessor memthod to get the room southExit
   * @returns int southExit which is the interger repersenting the south exit room
   **/
  public int getSouthExit(){
    return southExit;
  }
  
  /**
   * getEastExit is a acessor method to get the room southExit
   * @returns int eastExit which is the interger repersenting the east exit room
   **/
  public int getEastExit(){
    return eastExit;
  }
  
  /**
   * getWestExit is a acessor method to get the room westExit
   * @returns int westExit which is the interger repersenting the west exit room
   **/
  public int getWestExit(){
    return westExit;
  }
  
  /**
   * getObjectiveEvent is a acessor method to get the Room objective Event if there is one
   * @returns String objectiveEvent which is the rooms objective event if there is one
   */
  public String getObjectiveEvent(){
    return objectiveEvent;
  }
  
  /**
   * setNum is a mutator method to set the room num to n
   * @parama int n is used to set num to n
   **/
  public void setNum(int n){
    num = n;
  }
  
  /**
   * setName is a mutator method to set the room Name to na
   * @parama String na is used to set the name to the string na
   **/
  public void setName(String na){
    name= na;
  }
  
  /**
   * setDescription is a mutator method to set the room description to d
   * @parama String d is the other description that we are setting description to
   **/
  public void setDescription(String d){
    description= d;
  }
  
  /**
   * setobject is a mutator method to set the object room description to o
   * @parama String o is the object description that we set object to
   **/
  public void setObject(String o){
    object= o;
  }
  
  /**
   * setPass is a mutator method to set the pass to true or false
   * @parama boolean p which repersents pass and sets it to true or false
   **/
  public void setPass(boolean p){
    pass= p;
  }
  
  /**
   * setCm is a mutator method to set the cloakModule to true or false
   * @parama boolean c which repersents true or false to set mutate the cm
   **/
  public void setCm(boolean c){
    cm= c;
  }
  
  /**
   * setMineral is a mutator method to set Mineral to true or false
   * @parama boolean m which repersents true or false to set mutate mineral
   **/
  public void setMineral(boolean m){
    mineral= m;
  }
  
  /**
   * setSpass is a mutator method to set spass to true or false
   * @parama boolean s which repersents true or false to set mutate the spass
   **/
  public void setSpass(boolean s){
    spass= s;
  }
  
  /**
   * setVisited is a mutator method too set visited to true or false
   * @parama boolean v which repersents true or false to set mutate visited
   **/
  public void setVisited(boolean v){
    visited= v;
  }
  
  /**
   * setEvent is a mutator method too set the event to the String
   * @parama String e which is the event for which we will set it to the event variable
   **/
  public void setEvent(String e){
    event= e;
  }
  
  /**
   * setNorthExit is a mutator method too set the northExit to match the int
   * @parama int ne which is the northexit for which will be mutated and set it to ne
   **/
  public void setNorthExit(int ne){
    northExit= ne;
  }
  
  /**
   * setSouthExit is a mutator method too set the southExit too se
   * @parama int se is the southExit int that we will set it to
   **/
  public void setSouthExit(int se){
    southExit= se;
  }
  
  /**
   * setEastExit is a mutator method too set the eastExit too ex
   * @parama int ex is the eastExit int that we will set it to
   **/
  public void setEastExit(int ex){
    eastExit= ex;
  }
  
  /**
   * setWestExit is a mutator method too set the westExit too we
   * @parama int we is the westExit int that we will set it to
   **/
  public void setWestExit(int we){
    westExit= we;
  }
  /**
   * setObjectiveEvent is a mutator method too set the objectiveEvent for the room
   * @parama String objEvent this is the strong to hold the rooms objectiveEvent for which it will be
   */
  public void setObjectiveEvent(String objEvent){
    objectiveEvent= objEvent;
  }
  
  /**
   * printExits is a method used to output the currentExits of the Room
   */
  public String printExits(){
	  String exits="";
	  exits= "The Current Exits: \n";
    System.out.print("The Current Exits: ");
    if(northExit != -1){
      System.out.print("north ");
      exits = (exits + "north \n");
    }
    if(eastExit != -1){
      System.out.print("east ");
      exits = (exits + "east \n");
    }
    if(southExit != -1){
      System.out.print("south ");
      exits = (exits + "south \n");
    }
    if(westExit != -1){
      System.out.print("west ");
      exits = (exits + "west \n");
    }
    System.out.println();
    return exits;
  }
 }
