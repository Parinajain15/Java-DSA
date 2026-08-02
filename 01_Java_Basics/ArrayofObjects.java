class Student
{
    String name;
    int rollno;
}
public class ArrayofObjects
{    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "Parina";
        s1.rollno = 1927;
        
        Student s2 = new Student();
        s2.name = "Abhinab";
        s2.rollno = 1234;

        Student info[] = new Student[2];
        info[0] = s1;
        info[1] = s2;
        System.out.println(s2.name + " " + " : " + " " + s2.rollno );
    }
}
