package gr.aueb.cf.ch12;

/**
 * Java Bean - POJO (Plain Old Java Object)
 */
public class  Student {

    private int id;
    private String firstname;
    private String lastname;

    /* make a constructor, with the same name with Class Student*/
    /**
     * Default constructor . Populates the state
     * of a {@link Student} to default values.
     */
    public Student() {
    }

    /**
     * Overloades constructor. Polulates the state of the instance
     * based on specific values tha are given
     * @param id
     *          the id of the {@link Student}
     * @param firstname
     *          the firstname of the {@link Student}
     * @param lastname
     *          the lastname of the {@link Student}
     */
    public Student (int id , String firstname , String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }


    // use set and get methods, because my fields are private
    public void setId (int id) {
        this.id = id;
    }

     public int getId (){
        return id; //meaning return  this.id;
     }

     public void setFirstname (String firstname){
        this.firstname = firstname;
     }

     public String getFirstname () {
        return firstname;
     }

     public void setLastname (String lastname) {
        this.lastname = lastname;
     }

     public String getLastname () {
        return lastname;
     }
}
