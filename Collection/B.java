import java.util.HashSet;

class B{
    public static void main(String[] args) {
        HashSet<Student> x = new HashSet<Student>();

        x.add(new Student("mohan", 12));
        x.add(new Student("sohan", 23));
        x.add(new Student("rohan", 7));
        x.add(new Student("gohan", 17));
        x.add(new Student("tohan", 20));

        System.out.println(x);

        Student y = new Student("rohan", 7);
        x.remove(y);

        System.out.println(x);
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name+"-"+age;
    }

    public boolean equals(Object o) {
        boolean flag = false;

        if(o instanceof Student) {
            Student a = this;
            Student b = (Student)o;

            String nm1 = a.name;
            String nm2 = b.name;

            flag = nm1.equals(nm2);
        }

        return flag;
    }
}