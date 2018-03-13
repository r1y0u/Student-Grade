import java.util.ArrayList;
/**
 * Models a student with a name and collection
 * pf grades
 */
public class Student
{
    private String name;
    private ArrayList<Double> grades;

    /**
     * Constructor for Student with name
     * and list of grades
     * @param name the name of the student
     * @param list the list of grades
     */
    public Student(String name, ArrayList<Double> list)
    {
        this.name = name;
        this.grades = list;
    }

    /**
     * Gets the name of the student
     * @return the student's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the average of this student's grades
     * @return the average or 0 if there are no grades
     */
    public double getAverage()
    {
        double sum = 0;
        for ( double g : grades)
        {
            sum = sum + g;
        }

        double average = 0;
        if (grades.size() > 0)
        {
            average = sum / grades.size();
        }

        return average;
    }

    /**
     * @overrides
     */
    public String toString()
    {
        String s = "[Student:name=" + name
           + ",grades=" + grades.toString() +"]";

        return s;
    }

}
