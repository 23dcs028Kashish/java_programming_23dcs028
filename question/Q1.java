

class Student {
    int rollNumber;
    String name;
    String div;

    Student(int rollNumber, String name, String div) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.div = div;

        System.out.println("RollNumber: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Div: " + div);
    }
}

class Exam extends Student {
    int mark1, mark2, mark3, mark4, mark5, mark6;

    Exam(int rollNumber, String name, String div, int mark1, int mark2, int mark3, int mark4, int mark5, int mark6) {
        super(rollNumber, name, div);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;
        this.mark6 = mark6;
    }
}

class Result extends Exam {
    Result(int rollNumber, String name, String div, int mark1, int mark2, int mark3, int mark4, int mark5, int mark6) {
        super(rollNumber, name, div, mark1, mark2, mark3, mark4, mark5, mark6);
        int totalMarks = mark1 + mark2 + mark3 + mark4 + mark5 + mark6;
        System.out.println("Total Marks: " + totalMarks);
    }
}

public class Q1 {
    public static void main(String[] args) {
      
        int rollNumber = 28;
        String name = "Kashish";
        String div = "A";
        int mark1 = 90, mark2 = 60, mark3 = 40, mark4 = 100, mark5 = 90, mark6 = 60;

        Result r = new Result(rollNumber, name, div, mark1, mark2, mark3, mark4, mark5, mark6);
    }
}

