import java.util.*;

public class Contains {

    /**
     * This method should search an array to see if that array contains some value.
     * You will need to use a for loop to check every value of the array to see if it matches the target value.
     *
     * @param arr array to be manipulated.
     * @param target the value that the method should be searching for.
     * @return true if arr contains target, false otherwise.
     */
    public boolean arrayContains(int[] arr, int target){
        // iterate through array of 'int' using for-each loop
        for(int num : arr){
            // if 'num' == 'target' in value
            if(num == target){
                // return true
                return true;
            }
        }
        // otw return false
        return false;

        /* below two other ways not really working ... */
        // convert array to List interface & use Collection's .contains() method to check if 'target' is present
        // return Arrays.asList(arr).contains((Object)target);

        // convert to Set as Set don't allow duplicates
        // Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        // search for 'target', if found -> true
        // return set.contains(target);
    }
}