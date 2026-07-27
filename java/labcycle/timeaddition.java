import java.util.Scanner;

class Time {
    int hours;
    int minutes;

    // Constructor
    Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // Method to add two time objects
    Time addTime(Time t) {
        int totalHours = this.hours + t.hours;
        int totalMinutes = this.minutes + t.minutes;

        if (totalMinutes >= 60) {
            totalHours = totalHours + (totalMinutes / 60);
            totalMinutes = totalMinutes % 60;
        }

        return new Time(totalHours, totalMinutes);
    }

    // Method to display time
    void display() {
        System.out.println(hours + " Hours " + minutes + " Minutes");
    }
}

public class TimeAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Time");
        System.out.print("Hours: ");
        int h1 = sc.nextInt();

        System.out.print("Minutes: ");
        int m1 = sc.nextInt();

        System.out.println("\nEnter Second Time");
        System.out.print("Hours: ");
        int h2 = sc.nextInt();

        System.out.print("Minutes: ");
        int m2 = sc.nextInt();

        Time t1 = new Time(h1, m1);
        Time t2 = new Time(h2, m2);

        Time result = t1.addTime(t2);

        System.out.println("\nResultant Time:");
        result.display();

        sc.close();
    }
}