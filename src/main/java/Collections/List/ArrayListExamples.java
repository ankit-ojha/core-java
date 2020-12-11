package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExamples {

    public static void main(String[] args) {
        ArrayListExamples arrayListExamples = new ArrayListExamples();
        arrayListExamples.basic();
        arrayListExamples.initializing();
        arrayListExamples.loop();
        arrayListExamples.sort();

    }

    private void basic(){
        /* Creating ArrayList of type "String" which means
         * we can only add "String" elements
         */
        ArrayList<String> obj = new ArrayList<String>();

        /*This is how we add elements to an ArrayList*/
        obj.add("Ajeet");
        obj.add("Harry");
        obj.add("Chaitanya");
        obj.add("Steve");
        obj.add("Anuj");

        // Displaying elements
        System.out.println("Original ArrayList:");
        for (String str : obj)
            System.out.println(str);

        /* Add element at the given index
         * obj.add(0, "Rahul") - Adding element "Rahul" at first position
         * obj.add(1, "Justin") - Adding element "Justin" at second position
         */
        obj.add(0, "Rahul");
        obj.add(1, "Justin");

        // Displaying elements
        System.out.println("ArrayList after add operation:");
        for (String str : obj)
            System.out.println(str);

        //Remove elements from ArrayList like this
        obj.remove("Chaitanya"); //Removes "Chaitanya" from ArrayList
        obj.remove("Harry"); //Removes "Harry" from ArrayList

        // Displaying elements
        System.out.println("ArrayList after remove operation:");
        for (String str : obj)
            System.out.println(str);

        //Remove element from the specified index
        obj.remove(1); //Removes Second element from the List

        // Displaying elements
        System.out.println("Final ArrayList:");
        for (String str : obj)
            System.out.println(str);
    }

    private void initializing() {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Object o1");
        obj.add("Object o2");
        obj.add("Object o3");

        ArrayList<String> obj2 = new ArrayList<String>(Arrays.asList("Pratap", "Peter", "Harsh"));

        ArrayList<String> obj3 = new ArrayList<String>() {{
            add("Delhi");
            add("Agra");
            add("Chennai");
        }};
        ArrayList<Integer> obj4 = new ArrayList<Integer>(Collections.nCopies(10, 5));
    }

    private void loop() {
        ArrayList<String> arrlist = new ArrayList<String>(Arrays.asList("Pratap", "Peter", "Harsh"));
        for (int counter = 0; counter < arrlist.size(); counter++) System.out.println(arrlist.get(counter));
        for (String arr : arrlist) System.out.println(arr);
        int count = 5;
        while (arrlist.size() > count) {
            System.out.println(arrlist.get(count));
            count++;
        }
        Iterator iter = arrlist.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    private void sort() {
        ArrayList<String> listofcountries = new ArrayList<String>();
        listofcountries.add("India");
        listofcountries.add("US");
        listofcountries.add("China");
        listofcountries.add("Denmark");

        /*Unsorted List*/
        System.out.println("Before Sorting:");
        for (String counter : listofcountries) {
            System.out.println(counter);
        }

        /* Sort statement*/
        Collections.sort(listofcountries);

        /* Sorted List*/
        System.out.println("After Sorting:");
        for (String counter : listofcountries) {
            System.out.println(counter);
        }
    }





}


