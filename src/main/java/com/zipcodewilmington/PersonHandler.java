package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int currentPersonIndex = 0;
        while (currentPersonIndex < personArray.length) {
            String nameOfPerson = personArray[currentPersonIndex].toString();
            result += nameOfPerson;
            currentPersonIndex++;
        }
        return result;
    }

    public String forLoop() {
        String result = "";

        for (int currentPersonIndex = 0; currentPersonIndex < personArray.length; currentPersonIndex++){
            String nameOfPerson = personArray[currentPersonIndex].toString();
            result += nameOfPerson;
        }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
    for (Person currentPerson : personArray){
        result += currentPerson;
    }
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
