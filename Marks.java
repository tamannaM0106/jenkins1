public class Marks {
    String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };
    int[] marks = { 89, 97, 36, 78, 95 };

    public Marks() {
        // You can initialize arrays or perform any other setup in the constructor.
    }

    public void getCourses() {
        System.out.println("THE STUDENT COURSES ARE:");
        for (int i = 0; i < courseCodes.length; i++) {
            System.out.println(courseCodes[i]);
        }
    }

    public void getMarks() {
        System.out.println("THE STUDENT MARKS ARE:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }

    public void displayMarksLessThan40() {
        System.out.println("THE COURSES WHERE THE MARKS OBTAINED ARE LESS THAN 40:");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] <= 40) {
                System.out.println(courseCodes[i] + ":" + marks[i]);
            }
        }
    }
}