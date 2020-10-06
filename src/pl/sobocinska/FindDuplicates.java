package pl.sobocinska;

//    As you can see, the `findDuplicates` method is missing its implementation.
//    It should return a list of values, that are repeated `numberOfDuplicates` times.
//    For instance, if you invoke:
//            ```java
//    findDuplicates(asList(-1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6), 2);
//```
//    it should return `-1, 3 and 6` since these values are repeated `numberOfDuplicates = 2` times,
//    but not `2` which is repeated 3 times.
//            _Note: null values should be omitted:_
//```java
//    findDuplicates(asList(-1, -1, 2, 2, null, null), 2);
//```
//    should return `-1 and 2`.


import java.util.*;

import static java.util.Arrays.asList;


public class FindDuplicates {

    public static void main(String[] args) {

        System.out.println(findDuplicates(asList(-1, 1, 3, 2, 2, 2, 5, 6, -1, 3, 6), 3));

        System.out.println(findDuplicates(asList(-1, -1, 2, 2, null, null), 2));
    }


    public static List<Integer> findDuplicates(List<Integer> arr, int i) {
        Map<Integer, Integer> map = new HashMap();
        List<Integer> result = new ArrayList();

        for (Integer el : arr) {
            if (!map.containsKey(el)) {
                map.put(el, 1);
            } else {
                map.put(el, map.get(el) + 1);
            }
        }
        for(Integer el : map.keySet()){
            if(map.get(el) == i){
                result.add(el);
            }
        }

        result.removeIf(Objects::isNull);
        return result;
    }
}
