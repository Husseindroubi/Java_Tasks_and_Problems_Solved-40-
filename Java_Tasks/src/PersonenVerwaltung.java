import java.util.ArrayList;
import java.util.List;

enum Gender { Male, Female, Other }
class Persons {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int yearOfBirth;
    private String address;
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public Gender getGender() {return gender;}
    public void setGender(Gender gender) {this.gender = gender;}
    public int getYearOfBirth() {return yearOfBirth;}
    public void setYearOfBirth(int dateOfBirth) {this.yearOfBirth = dateOfBirth;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public Persons(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
    public Persons(String firstName, String lastName, int yearOfBirth, Gender gender) {
        setFirstName(firstName);
        setLastName(lastName);
        setYearOfBirth(yearOfBirth);
        setGender(gender);
        System.out.println("About me: "+firstName+" "+lastName+", "+yearOfBirth+", "+gender+".");
    }
    public Persons(String firstName, String lastName, int yearOfBirth, Gender gender, String address) {
        System.out.println("Detailed Method: ");
        System.out.println(" - First Name: "+firstName);
        System.out.println(" - Last Name: "+ lastName);
        System.out.println(" - Year of birth: "+ yearOfBirth);
        System.out.println(" - Gender: "+ gender);
        System.out.println(" - Address: "+ address);
    }
}
public class PersonenVerwaltung {
    private List<Persons> myList = new ArrayList<>();
    private List<Persons> PV_Linz = new ArrayList<>();
    private List<Persons> PV_Vienna = new ArrayList<>();
    static final int plz = 4040;
    static final String city = "Linz";
    static final String streetName_Number = "Dornacher str 17";
    static String getMyAddress () {

        return plz+", "+city+", "+streetName_Number;
    }
    void createPerson(String firstName, String lastName) {
        myList.add(new Persons(firstName, lastName));
        System.out.println("Person number: "+myList.size());
    }
    void createPerson(String firstName, String lastName, int yearOfBirth, Gender gender) {
        myList.add(new Persons(firstName, lastName, yearOfBirth, gender));
        System.out.println("Person number: "+myList.size());
    }
    void createPerson(String firstName, String lastName, int yearOfBirth, Gender gender, String address) {
        myList.add(new Persons(firstName, lastName, yearOfBirth, gender, address));
        System.out.println("Person number: "+myList.size());
    }
    void createLinz(String name1, String name2, int year, Gender gen) {
        myList.add(new Persons(name1, name2, year, gen));
    }
    void createVienna(String name3, String name4, int year2, Gender gen2) {
        myList.add(new Persons(name3, name4, year2, gen2));
    }
    void deletePerson(Persons p) {
        myList.remove(p);
        System.out.println("Deleted: ");
        System.out.println("Number of Persons on my list: "+myList.size());
    }
    void deleteLinz(Persons p2) {
        PV_Linz.remove(p2);
        System.out.println("Deleted: ");
    }
    void deleteVienna(Persons p3) {
        PV_Vienna.remove(p3);
        System.out.println("Deleted: ");
    }
    public static void main(String[] args) {
        PersonenVerwaltung pv = new PersonenVerwaltung();
        System.out.print("");
        pv.createPerson("Hussein", "Alhussein");
        System.out.print("");
        pv.createPerson("Hussein", "Alhussein", 1989, Gender.Male);
        System.out.print("");
        pv.createPerson("Hussein", "Alhussein", 1989, Gender.Male, getMyAddress());
        System.out.println();

        Persons del = pv.myList.get(0);
        pv.deletePerson(del);
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("List of PV_Linz: ");
        pv.createLinz("Salma", "Hayek", 1900, Gender.Female);
        System.out.println("......................................................................");

        System.out.println("List of PV_Vienna: ");
        pv.createVienna("Unknown","Person", 2222,Gender.Other);
        System.out.println("--------------------------------------------------------------------------------");
    }
}
