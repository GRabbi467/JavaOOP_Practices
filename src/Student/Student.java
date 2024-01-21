package Student;

public class Student {
    private String name;
    private int id;
    private String dept;
    private double age;

    public Student (String name,int id,String dept,double age){
       this.name = name;
       this.id = id;
       this.dept = dept;
       this.age = age;
    }

    public void display(){
        System.out.println("Name:"+name + " Age:"+age+ " Dept.: "+dept+" Age:"+age);
    }


}
