public class my7thLecture {

    enum TrafficLight {
        RED, YELLOW, GREEN;
    }

    public static void main(String[] args) {

        String fruit = "Mango";

        switch (fruit) {
            case "Apple":
                System.out.println("Fruit: Apple → It's red");
                break;
            case "Banana":
                System.out.println("Fruit: Banana → It's yellow");
                break;
            case "Mango":
                System.out.println("Fruit: Mango → It's sweet");
                break;
            default:
                System.out.println("Fruit: Unknown fruit");
        }

        System.out.println(); // blank line

        TrafficLight currentLight = TrafficLight.RED;

        switch (currentLight) {
            case RED:
                System.out.println("Traffic Light: RED → Stop!");
                break;
            case YELLOW:
                System.out.println("Traffic Light: YELLOW → Caution!");
                break;
            case GREEN:
                System.out.println("Traffic Light: GREEN → Go!");
                break;
            default:
                System.out.println("Invalid traffic light state.");
        }

        System.out.println(); // blank line

        // Check if this part is running
        System.out.println("Now running nested switch:");

        int departmentId = 2;
        int employeeLevel = 1;

        switch (departmentId) {
            case 1:
                System.out.println("Department: Sales");
                break;

            case 2:
                System.out.println("Department: IT");

                switch (employeeLevel) {
                    case 1:
                        System.out.println("Level 1: Junior Developer");
                        break;
                    case 2:
                        System.out.println("Level 2: Senior Developer");
                        break;
                    default:
                        System.out.println("Unknown Level");
                }
                break;

            case 3:
                System.out.println("Department: HR");
                break;

            default:
                System.out.println("Invalid Department");
        }
    }
}


