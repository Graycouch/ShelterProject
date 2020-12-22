package shelterproject;
import java.util.*;


public class Shelter 
{
    private String shelterName;
    private ArrayList<Animal> animals; 
    // this is a constructor that initializes a shelter object
    public Shelter(String shelter)
    {
        shelterName = shelter;
        animals = new ArrayList<>();
    }
    // this adds an animal to the arraylist animals
    public void addAnimal(Animal t)
    {
        animals.add(t);
    }
    // this sorts and outputs the results from creating the objects
    public void listAnimals()
    {
        Collections.sort(animals);
        
        System.out.println("Welcome to Pet Haven Shelter");
        System.out.println("===================================");
        System.out.printf("%-8s%-16s%-10s\n", "Kind", "Age", "Name");
        System.out.println("-----------------------------------");
        
        for(Animal t: animals)
        {
            System.out.println(t.printInfo());
        }
        
        System.out.println("-----------------------------------");
    }
}
