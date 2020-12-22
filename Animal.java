package shelterproject;


public class Animal implements Comparable<Animal>
{
    private String name;
    private String kind;
    private double age;
    // This is a constructor that uses parameters to initalize an animal
    public Animal(String animalName, String animalKind, double animalAge)
    {
        this.name = animalName;
        this.kind = animalKind;
        this.age = animalAge;
    }
    // this formats the information about the animal
    public String printInfo()
    {
        if(age < 1)
        {
            return String.format("%s\t%.1f months\t%s",kind ,age*12 ,name );
        }
        else
        {
            return  String.format("%s\t%.1f years\t%s",kind ,age ,name );
        }
    }
    // this is used to compare two seperate instances of the animal object
    public int compareTo(Animal other)
    {
        if(this.kind.compareTo(other.kind) != 0)
        {
            return this.kind.compareTo(other.kind);
        }
        else if (Double.compare(this.age , other.age) != 0)
        {
            return - Double.compare(this.age , other.age);
        }
        else
        {
            return this.name.compareTo(other.name);
        } 
    }
}
