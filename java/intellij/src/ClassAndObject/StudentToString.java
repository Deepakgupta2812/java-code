package ClassAndObject;

public class StudentToString {
    String name;
    int age;
    String rollNumber;
    String house;

    public StudentToString(String house, String rollNumber, int age, String name) {
        this.house = house;
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {

        return "Student Details:{name :" +name
                + " ,age:"+age
                + ",roll number:"+rollNumber
                +",house:"+house+"}";
    }

    public static void main(String[] args) {
        StudentToString stu=new StudentToString("Blue","100",19,"Deepak");
        System.out.println(stu);
    }
}
