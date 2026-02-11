class College {
    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }
}

class Student {
    String name;
    College college;   // Association

    Student(String name, College college) {
        this.name = name;
        this.college = college;
    }

    void display() {
        System.out.println(name + " studies in " + college.collegeName);
    }
}

public class Example {
    public static void main(String[] args) {
        College c = new College("ABC Engineering College");
        Student s = new Student("Akansha", c);

        s.display();
    }
}

