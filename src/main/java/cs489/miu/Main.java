package cs489.miu;

import cs489.miu.problem1.ArrayFlattener;

public class Main {

    public static void main(String[] args) {

        Integer[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};


        ArrayFlattener arrayFlattener = new ArrayFlattener();


        Integer[] flattenedArray = arrayFlattener.flattenArray(inputArray);


        System.out.println("Flattened Array:");
        for (Integer num : flattenedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
