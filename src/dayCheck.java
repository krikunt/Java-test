public class dayCheck {
    public static void main(String[] args) {
        String day = "Saturday";

        switch(day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Робочий день");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Некоректний день");
        }
    }
}
