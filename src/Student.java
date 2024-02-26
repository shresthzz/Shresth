public class Student {
    int rn;
    String name;
    float age;

    public Student(int rn, String name, float age) {
        this.rn = rn;
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println("name="+name);
    }
}
class Student1 extends Student{
    int rn;
    String name;
    float age;
    public Student1(int rn,String name,int age)
    {
        super(rn,name,age);
    }
    @Override
    void display() {
        System.out.println("name="+name);
    }
    
}

