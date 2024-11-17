package Assignment8;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList{
     private ArrayList<Student> students;

  
    public StudentList() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("There are no students in the system!");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }

    public Student searchById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteById(String id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId().equals(id)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
  
    public boolean editById(String id, String newName, int newAge) {
        Student student = searchById(id);
        if (student != null) {
            student.setName(newName);
            student.setAge(newAge);
            return true;
        }
        return false;
    }
}
