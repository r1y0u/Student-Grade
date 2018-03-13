import java.util.ArrayList;
/**
 * Write a description of class UniversityTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClassroomTester
{
public static void main(String[] args)
    {
       ArrayList<Double> grades1 = new ArrayList<>();
       grades1.add(82.0);
       grades1.add(91.5);
       grades1.add(85.0);
       Student student1 = new Student("Srivani", grades1);

       ArrayList<Double> grades2 = new ArrayList<>();
       grades2.add(95.0);
       grades2.add(87.0);
       grades2.add(99.0);
       grades2.add(100.0);
       Student student2 = new Student("Carlos", grades2);

       ArrayList<Double> grades3 = new ArrayList<>();
       grades3.add(100.0);
       grades3.add(98.0);
       grades3.add(100.0);
       grades3.add(97.0);
       Student student3 = new Student("Maria", grades3);

       ArrayList<Double> grades4 = new ArrayList<>();
       grades4.add(80.0);
       grades4.add(70.0);
       grades4.add(82.0);
       grades4.add(75.0);
       Student student4 = new Student("Fred", grades4);

       Classroom myClass = new Classroom();
       myClass.add(student1);
       myClass.add(student2);
       myClass.add(student3);
       myClass.add(student4);

       System.out.println(myClass);
       System.out.println("Expected: [[Student:name=Srivani,grades=[82.0, 91.5, 85.0]], [Student:name=Carlos,grades=[95.0, 87.0, 99.0, 100.0]], [Student:name=Maria,grades=[100.0, 98.0, 100.0, 97.0]], [Student:name=Fred,grades=[80.0, 70.0, 82.0, 75.0]]]");

       System.out.println(">90 GPA: " + myClass.hasAverageGreaterThan(90.0));
       System.out.println("Expected: Carlos");

       System.out.println(">99 GPA: " + myClass.hasAverageGreaterThan(99));
       System.out.println("Expected: ");

       Student best = myClass.bestStudent();
       if (best != null)
       {
          System.out.println(best.getName());
          System.out.println("Expected: Maria");
       }

       System.out.println(myClass.getStudents());
       System.out.println("Expected: [Srivani, Carlos, Maria, Fred]");

       //test with an empty classroom
       myClass = new Classroom();
       System.out.println(myClass);
       System.out.println("Expected: []");

       System.out.println(">90 GPA: " + myClass.hasAverageGreaterThan(90.0));
       System.out.println("Expected: ");


       best = myClass.bestStudent();
       if (best != null)
       {
          System.out.println(best.getName());

       }

       System.out.println(myClass.getStudents());
       System.out.println("Expected: []");

    }
}
