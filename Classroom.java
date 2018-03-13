
import java.util.ArrayList;
/**
 * Models a classroom that manages the name
 * of students in the classroom
 *
 * @author ryujiroyoshioka
 *
 */
	public class Classroom {
	
	ArrayList<Student> studentMain;
	
	/**
	 * a no-argument constructor
	 */
	public Classroom() {
		
		studentMain = new ArrayList<>();
		
	}
	
	/**
	 * adds the student to this Classroom
	 * @param s the student to add to
	 * the array list
	 */
	public void add(Student s){
		
		studentMain.add(s);
		
	}
	
	/**
	 * gets an ArrayList<String> containing
	 * the names of all the Students in this Classroom.
	 * @return the student list
	 */
	public ArrayList<String> getStudents(){
		
		ArrayList<String> studentList = new ArrayList<>();
		
		// Enhanced Loopで全てのスチューデントの名前を
		// Array listに置く事ができる
		for(Student student: studentMain) {
			
			studentList.add(student.getName());
		}
		
		return studentList;
	}
	
	/**
	 *  gets the name of the first student in the 
	 *  Classroom who has an average greater than 
	 *  the target or the empty string.
	 * @param target 
	 * @return the name of the student who has
	 * the average greater than the target or 
	 * return empty if there is no one.
	 */
	public String hasAverageGreaterThan(double target) {
		
		String name ="";
		boolean found = false;
		int i = 0;
		
		while(!found && i < studentMain.size()) {
			
			Student theStudent = studentMain.get(i);
			
			if(theStudent.getAverage() > target) {
				
				found = true;
				name = theStudent.getName();
				
			}
			// Increment to the next student
			i++;
		}
		
		return name;
	}

	/**
	 * gets the Student with the highest average
	 *  in this classroom or null there are no students
	 * @return the best student in the classroom
	 */
	public Student bestStudent() {
		
		Student theBest = null;
		int i = 0;
		
		if(i < studentMain.size()) {
			
			theBest = studentMain.get(0);
			
			for(Student student: studentMain) {
				if(theBest.getAverage() < student.getAverage()) {
					
					theBest = student;
				}
				
			}
			
		}
		return theBest;	
	}
	
	/**
	 *  gets a string represent ion
	 *  using ArrayList's toString method
	 * @return the string representation
	 */
	public String toString() {
        
		return  studentMain.toString();
		
    }
	
}
