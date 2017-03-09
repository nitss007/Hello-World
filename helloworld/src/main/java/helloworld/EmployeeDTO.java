package helloworld;

public class EmployeeDTO {
	 
    private Integer id;
    private String firstName;
    private String lastName;
    private String designation;
 
    //Setters and Getters are hidden behind this comment.
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", type=" + designation + "]";
    }
}
