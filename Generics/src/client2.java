import java.util.ArrayList;
import java.util.List;

public class client2 {

    public static void print(Animal a)
    {
        System.out.println(a.getName());
    }

    public static void printName(List<Animal> animals)
    {
        for(Animal a : animals)
        {
            System.out.println(a.getName());
        }
    }

    public static void printNameFixed(List<? extends Animal> animals) // upper bound of animal
    {
        for(Animal a : animals)
        {
            System.out.println(a.getName());
        }
    }

    public static void AddAnimal(List<? super Animal> animal)
    {
        animal.add(new Animal());
    }
    public static void main(String[] args)
    {

        Animal a = new Animal("Animal");
        print(a);

        Animal a1 = new Dog("Dog");
        print(a1);

        // List of animal will work
        List<Animal> animalList = new ArrayList<>();
        animalList.add(a);
        animalList.add(a1);

        printName(animalList);

        // but list of dog will not work
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("D1"));
        dogList.add(new Dog("D2"));

       // printName(dogList); not allowed

        printNameFixed(dogList);

        List<Creatures> creatures = new ArrayList<>();

        AddAnimal(creatures);

    }
}
