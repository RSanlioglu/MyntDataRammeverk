package dataJSON.sorting;

import java.util.*;

public class SortingJSON implements ISortingJSON {

    public SortingJSON() {

    }

    /**
     * The client sends in a hashmap of data. The key values will be sorted ascending
     * with a merge-sort algorithm and a list of sorted objects is then returned
     * to the client. Note! Changes are not printed on datafile until client
     * writes it on there using the DataAccess.
     *
     * @param mapOfObjects - A hashmap containing objects and the keys to the objects
     * @return - A list of objects that are sorted by the key values
     */
    public List<? extends Object> sortIntASC(HashMap<Integer, ?> mapOfObjects) {
        List<Object> sortedList = new ArrayList<>();

        int[] intToBeSorted = new int[mapOfObjects.size()];
        int j = 0;
        for(Integer i : mapOfObjects.keySet()) {
            intToBeSorted[j++] = i;
        }

        SortingAlgorithm.mergeSortINT(intToBeSorted, 0, intToBeSorted.length - 1);

        for(int i : intToBeSorted) {
            sortedList.add(mapOfObjects.get(i));
        }

        return sortedList;
    }

    /**
     * The client sends in a hashmap of data. The key values will be sorted where the int value is descending,
     * with a merge-sort algorithm and a list of sorted objects is then returned
     * to the client. Note! Changes are not printed on datafile until client
     * writes it on there using the DataAccess.
     *
     * @param mapOfObjects - A hashmap containing objects and the keys to the objects
     * @return - A list of objects that are sorted by the key values
     */
    public List<? extends Object> sortIntDESC(HashMap<Integer, ?> mapOfObjects) {
        List<Object> sortedList = new ArrayList<>();

        int[] intToBeSorted = new int[mapOfObjects.size()];
        int j = 0;
        for(Integer i : mapOfObjects.keySet()) {
            intToBeSorted[j++] = i;
        }

        SortingAlgorithm.mergeSortINT(intToBeSorted, 0, intToBeSorted.length - 1 );

        for(int i = mapOfObjects.size() + 1; i-- > 1;) {
            sortedList.add(mapOfObjects.get(i));
        }

        return sortedList;
    }

    /**
     * The client sends in a hashmap of data. The key values will be sorted where the double value is ascending,
     * with a merge-sort algorithm and a list of sorted objects is then returned
     * to the client. Note! Changes are not printed on datafile until client
     * writes it on there using the DataAccess.
     *
     * @param mapOfObjects - A hashmap containing objects and the keys to the objects
     * @return - A list of objects that are sorted by the key values
     */
    public List<? extends Object> sortDoubleASC(HashMap<Double, ?> mapOfObjects) {
        List<Object> sortedList = new ArrayList<>();

        double[] doubleToBeSorted = new double[mapOfObjects.size()];
        int j  = 0;
        for(Double i : mapOfObjects.keySet()) {
            doubleToBeSorted[j++] = i;
        }

        SortingAlgorithm.mergeSortDouble(doubleToBeSorted, 0, doubleToBeSorted.length-1);

        for(double i : doubleToBeSorted) {
            sortedList.add(mapOfObjects.get(i));
        }

        return sortedList;
    }

    /**
     * The client sends in a hashmap of data. The key values will be sorted where the double value is descending,
     * with a merge-sort algorithm and a list of sorted objects is then returned
     * to the client. Note! Changes are not printed on datafile until client
     * writes it on there using the DataAccess.
     *
     * @param mapOfObjects - A hashmap containing objects and the keys to the objects
     * @return - A list of objects that are sorted by the key values
     */
    public List<? extends Object> sortDoubleDESC(HashMap<Double, ?> mapOfObjects) {
        List<Object> sortedList = new ArrayList<>();

        double[] doubleToBeSorted = new double[mapOfObjects.size()];
        int j = 0;
        for(Double i : mapOfObjects.keySet()) {
            doubleToBeSorted[j++] = i;
        }

        SortingAlgorithm.mergeSortDouble(doubleToBeSorted, 0, doubleToBeSorted.length - 1);

        for(double i : doubleToBeSorted) {
            sortedList.add(mapOfObjects.get(i));
        }

        Collections.reverse(sortedList);

        return sortedList;
    }

    /**
     * The client sends a hashmap of data. The key values will be sorted where the string value is ascending
     * with a binary search tree algorithm and a list of sorted objects is then returned to the client.
     * Note! Changes are not printed on datafile until client writes it on there using the DataAccess.
     * @param mapOfObjects - A hashmap containing objects and the keys to the objects
     * @return - A list of objects that are sorted by the key values
     */
    public List<? extends Object> sortStringAlphabeticalASC(HashMap<String, ?> mapOfObjects) {
        List<Object> sortedList = new ArrayList<>();
        List<String> stringToBeSorted = new ArrayList<>(mapOfObjects.keySet());

        SortingAlgorithm.bstSortString(stringToBeSorted);

        for(String s : stringToBeSorted) {
            sortedList.add(mapOfObjects.get(s));
        }

        return sortedList;
    }

    /**
     * The client sends a hashmap of data. The key values will be sorted where the string value is descending
     * with a binary search tree algorithm and a list of sorted objects is then returned to the client.
     * Note! Changes are not printed on datafile until client writes it on there using the DataAccess.
     * @param mapOfObjects - A hashmap containing objects and the keys to the objects
     * @return - A list of objects that are sorted by the key values
     */
    public List<? extends Object> sortStringAlphabeticalDESC(HashMap<String, ?> mapOfObjects) {
        List<Object> sortedList = new ArrayList<>();
        List<String> stringToBeSorted = new ArrayList<>(mapOfObjects.keySet());

        SortingAlgorithm.bstSortString(stringToBeSorted);

        for(String s : stringToBeSorted) {
            sortedList.add(mapOfObjects.get(s));
        }

        Collections.reverse(sortedList);

        return sortedList;
    }
}
