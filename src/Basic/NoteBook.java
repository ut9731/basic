package Basic;

public class NoteBook {
	
		   /*This is default constructor. A constructor does
		    * not have a return type and it's name
		    * should exactly match with class name
		    */
		   NoteBook(){
		      System.out.println("Default constructor");
		   }
		   public void mymethod()
		   {
		      System.out.println("Void method of the class");
		   }
		   public static void main(String args[]){
			/* new keyword creates the object of the class
		         * and invokes constructor to initialize object
		         */
			NoteBook obj = new NoteBook();
			obj.mymethod();
		   }
		}


