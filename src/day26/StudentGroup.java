package day26;

import java.util.ArrayList;

public class StudentGroup {

    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
    }


    public String addStudent(Student student){
        students.add(student);
        return "1 added";
    }

    public void addStudent(String name, int age, char gender, String id){
       // WarmStudent warmStudent = new WarmStudent(name, age, gender, id);
        students.add(new Student(name, age, gender, id));
    }

    public void removeStudent(String id){
        students.removeIf(p-> p.id.equals(id));
    }


    @Override
    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ",number of students=" + students.size() +
                '}';
    }
}
/*
Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
 */