package gr.aueb.cf.ch12;

/**
 * Client class that creates a {@link Teacher}
 * instance and populates its state
 */
public class TeacherMain {

    public static void main(String[] args) {

        Teacher elon = new Teacher();

        Teacher anna = new Teacher(2, "Anna" , "Gosh" ) ;

        elon.setId(1);
        elon.setFirstname("Elon");
        elon.setLastname("Musk");

        System.out.println("Elon's state");
        System.out.println("id :" +elon.getId());
        System.out.println("first and lastname " +"" +elon.getFirstname() +" " +elon.getLastname());

        System.out.println();

        System.out.println("Anna's state");
        System.out.println("id :" +anna.getId());
        System.out.println("first and lastname " +"" +anna.getFirstname() +" " +anna.getLastname());
    }
}
