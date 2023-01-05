package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws WrongIdException {
    if (studentID>10 || studentID <1 ) throw  new WrongIdException(studentID);
    return Student.getValueOf(studentID);
  }


  public static void main(String[] args) {
    StudentManager manager = new StudentManager();
      for (int i = 1; i < IDs.length; i++) {
       try{ Student student = manager.find(i);
        System.out.println("Student name " + student.getName());}
       catch (WrongIdException e){
         System.out.println(e.getMessage());
       }
      }

    }

}