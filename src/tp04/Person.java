package tp04;

public class Person {
    private final int ID;
    private static int idCounter = 1;
    private String forename;
    private String name;

    public Person(String forename, String name) {
        this.ID = Person.idCounter;
        Person.idCounter++;
        this.forename = forename;
        this.name = name;
    }

    public int getId() {
        return this.ID;
    }
    public String getForename() {
        return this.forename;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String v) {
        this.name = v;
    }
    public void setForename(String v) {
        this.forename = v;
    }
    
    @Override
    public String toString() {
        return this.ID + ": " + this.forename + " " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        if (this.ID != other.ID) return false;
        if (this.name == null && other.name != null) return false;
        if (!this.name.equals(other.name)) return false;
        if (this.forename == null && other.forename != null) return false;
        if (!this.forename.equals(other.forename)) return false;
        return true;
    }
}