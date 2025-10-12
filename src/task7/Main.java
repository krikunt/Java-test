package task7;

public class Main {
     public static void main(String[] args) {
         User user1 = new Admin();
         User user2 = new Customer();

         printUserRole(user1);
         printUserRole(user2);
           }

           public static void  printUserRole(User user) {
         if (user instanceof Admin) {
             System.out.println("Це Admin:" + user.getRole());
           } else if (user instanceof Customer) {
             System.out.println("Це Customer: " + user.getRole());
         } else {
             System.out.println("Невідомий користувач");
         }
     }
}
