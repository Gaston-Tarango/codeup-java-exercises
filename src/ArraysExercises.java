import java.util.Arrays;

public class ArraysExercises {

    // create a method that adds a person object to an array that already contains person objects
    // first line: create public static method, with Person array class called add Person, pass old array and new person parameters
    public static Person[] addPerson(Person[] arrayName, Person newPerson) {

        //next line: set old array parameter to copy of array, plus one to length
        arrayName = Arrays.copyOf(arrayName, arrayName.length + 1);

        // set newly added index ( at end of array) to equal the newPerson parameter that you passed in.
        arrayName[arrayName.length - 1] = newPerson;
        return arrayName;

    }

    public static void main(String[] args) {
        //create persons
        Person person1 = new Person("Jacob");
        Person person2 = new Person("JW");
        Person person3 = new Person("Nico");
        Person person4 = new Person("Andrew");

        //create personArray with first 3 array parameters
        Person[] personArray = new Person[]{person1, person2, person3};

        // this updates array, utilizing newly created addPerson method and person #4
        personArray = addPerson(personArray, person4);

        //loop through array and print out name of each person
        for(Person pers: personArray) {
            System.out.println(pers.getName());
        }
//        newArray[3] = new Person("Andrew");

    }
}