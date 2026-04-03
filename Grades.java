import java.util.HashMap;

public class Grades {
    public static void main(String[] args) {
        // A map which stores names of students associated with their gpa
        HashMap<String, Double> grades = new HashMap<String, Double>();
        // Add some students to the map
        grades.put("Murad Huseynov", 2.03);
        grades.put("Samed Babayev", 3.04);
        grades.put("Lala Mirzayeva", 2.98);
        grades.put("Samir Samirov", 4.00);
        grades.put("Aliya Gasimova", 1.75);
        grades.put("Huseyn Mirzayev", 3.57);
        // Find the student(s) with the highest gpa
        double max_gpa = Double.MIN_VALUE;

        for (double gpa : grades.values()) {
            if (gpa > max_gpa) {
                max_gpa = gpa;
            }
        }

        String max_gpa_name = "";

        for (String name : grades.keySet()) {
            if (grades.get(name) == max_gpa) {
                max_gpa_name = name;
            }
        }

        System.out.println("Highest gpa is " + max_gpa + " which belongs to " + max_gpa_name);
        // Find the average gpa of all the students
        double sum = 0;

        for (double gpa : grades.values()) {
            sum += gpa;
        }

        double average = sum / grades.size();

        System.out.println("Average gpa is " + average);
        // Find the number of students who have less gpa than the average
        int count = 0;

        for (String name : grades.keySet()) {
            if (grades.get(name) < average) {
                count += 1;
            }
        }

        System.out.println("The number of students who have less gpa than average is " + count);
    }
}
