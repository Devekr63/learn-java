package org.example;

public class Throw {
    public static void main(String[] args) {
//        Student std = new Student("Devendra", "Kumar", 100.0);
//        printReport(std);

        Student std2 = null;
        printReport(std2);

    }

    public static void printReport(Student student){
        try{
            if(student == null){
                throw new StudentDoesNotExist("Student data does not exists.");
            }
            if(student.firstName.trim().isEmpty()){
                throw new Exception("Student will always have a first name.");
            }
            System.out.println(student.firstName+" "+student.lastName);
            try{
                if(student.totalMarks < 0){
                    throw new Exception("Marks can never be negative.");
                }
                System.out.println("Marks scored by the student: "+student.totalMarks);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }catch (StudentDoesNotExist noStudent){
            System.out.println(noStudent.getMessage());
        }catch (Exception e){
            System.out.println("Student's first name is missing.");
            System.out.println(e.getMessage());
        }


    }
}

class Student{
    String firstName;
    String lastName;

    double totalMarks;

    public Student(String firstName, String lastName, double totalMarks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalMarks = totalMarks;
    }
}

//Custom Exception
class StudentDoesNotExist extends NullPointerException{
    public StudentDoesNotExist(String message){
        super(message);
    }
}
