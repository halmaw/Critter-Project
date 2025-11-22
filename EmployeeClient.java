public class EmployeeClient {
   public static void main (String[] args) {
      //Create a boss object
      Boss b1 = new Boss(3);
      b1.name = "B1";
      
      // create Employee objects
      Employee e1 = new Employee(5);
      e1.name= "ED";
      
      // Print the work hours (40)
      System.out.println (e1.getHours());
      
      // print the getjob
      System.out.println(e1.getJob());
      System.out.println(e1.getVacation());
      System.out.println(e1.getSalary());
   }
   
}