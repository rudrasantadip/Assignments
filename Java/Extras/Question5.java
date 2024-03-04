import java.util.Scanner;

class Temperature {
    // c/5=(f-32)/9
    public double farToCel(double temp) {
        double celcius = ((temp - 32) / 9) * 5;
        return celcius;
    }

    public double celToFar(double temp) {
        double farhenite = ((temp / 5) * 9) + 32;
        return farhenite;
    }

    public double calcTemp(String flag, double temp) {
        if (flag.toUpperCase().equals("C")) {
            return celToFar(temp);
        } else if (flag.toUpperCase().equals("F")) {
            return farToCel(temp);
        } else {
            System.out.println("Unrecognized flag");
            return -1.0;
        }
    }
}

public class Question5 {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        Scanner sc = new Scanner(System.in);
        double temperature;
        try {
            String key = args[0];
            if (key.equalsIgnoreCase("C"))
            {
                System.out.println("Enter temperature in celcius: ");
                temperature = sc.nextDouble();
                System.out.println(
                        "Temperature : " + temp.celToFar(temperature) + " Farenhite");
            } 
            else if (key.equalsIgnoreCase("F"))
            {
                System.out.println("Enter temperature in farhenite");
                temperature = sc.nextDouble();
                System.out.println(
                        "Temperature : " + temp.farToCel(temperature) + " Celcius");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
