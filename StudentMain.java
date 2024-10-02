package gr.aueb.cf.ch12;
/**
 * like a client
 * 1. creates an {@link  Student} instance (alice)
 * 2. invokes public methods (setters / getters) from Student
 *
 * @author vasiliskr
 * @version 1.0
 */
public class StudentMain {

    public static void main(String[] args) {

        //alice uses default constructor
        Student alice = new Student();
        //bob uses overloaded constructor
        Student bob = new Student(2,"Bob","Marley");

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");


        System.out.println("id : " + alice.getId());
        System.out.println("firstname " + alice.getFirstname());
        System.out.println("lastname " + alice.getLastname());

        System.out.println("");

        System.out.println("id : " + bob.getId());
        System.out.println("firstname " + bob.getFirstname());
        System.out.println("lastname " + bob.getLastname());


//        //set the values state
//        alice.id = 1;
//        alice.firstname = "Alice";
//        alice.lastname = "Wonderland";
//
//        //get tha values state
//        System.out.println("id : " +alice.id);
//        System.out.println("firstname : " +alice.firstname);
//        System.out.println("lastname :" + alice.lastname) ;
    }
}
