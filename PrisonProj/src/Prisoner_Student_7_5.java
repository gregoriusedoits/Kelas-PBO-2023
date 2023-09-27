//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner_Student_7_5 {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    public boolean isOpen;
    public Cell cell;
    
    //Constructor
    public Prisoner_Student_7_5(String name, double height, int sentence, Cell c){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
        this.cell = c;
    }
    
    public Prisoner_Student_7_5(String n, boolean o){
        this.name = n;
        this.isOpen = o;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    
    public void open(){
        cell.isOpen=!cell.isOpen;
        if (cell.isOpen){
        System.out.println("door is open!");
        }else{
        System.out.println("door is closed!");
        }
        }
    
    
    public void display(){
        System.out.println(name + " From : " + cell.name + " Cell");
    }    
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
    }
    
}
