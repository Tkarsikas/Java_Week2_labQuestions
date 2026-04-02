package viikko4.lab;

import java.util.LinkedList;

public class StudentRegister {
    private LinkedList<Student> students = new LinkedList<>();

    public void add(String n, Integer c) {
        students.add(new Student(n, c));
    }

    public LinkedList<Student> searchByName(String q) {
        LinkedList<Student> studentsByName = new LinkedList<>();
        if(q != null && !q.trim().isEmpty()){
            for (Student s : students) {
                if(s.getName().equals(q)){
                    studentsByName.add(s);
                }
            }
        }
        return studentsByName;
    }
    
    public LinkedList<Student> searchCreditsLessThan(int x) {
        LinkedList<Student> studentsByCreditsLess = new LinkedList<>();
        
        for (Student s : students) {
            if(s.getCredits() < x){
                studentsByCreditsLess.add(s);
            }
        }        
        return studentsByCreditsLess;
    }
    
    public LinkedList<Student> searchCreditsGreaterOrEqual(int x) {
        LinkedList<Student> studentsCreditsGreater = new LinkedList<>();
        for(Student s : students){
            if(s.getCredits()>=x){
                studentsCreditsGreater.add(s);
            }
        }
        
        return studentsCreditsGreater;
    }
}