import java.util.Scanner;

class Student{
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name =input.nextLine();

        System.out.print("marks of Math: ");
        double mathMarks =input.nextDouble();

        System.out.print("marks of history: ");
        double historyMarks =input.nextDouble();

        System.out.print("marks of programming: ");
        double programmingMarks =input.nextDouble();

        double totalMarks = mathMarks + historyMarks + programmingMarks;

        double percentage = (totalMarks / 300) * 100;

        if (percentage >= 90) {
            System.out.println("Grade: A");
            System.out.println(name + " has scored " + percentage + "%");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
            System.out.println(name + " has scored " + percentage + "%");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
            System.out.println(name + " has scored " + percentage + "%");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
            System.out.println(name + " has scored " + percentage + "%");
        } else {
            System.out.println("Grade: F");
            System.out.println(name + " has scored%.2f" + percentage + "%");
        }

    }
    
}