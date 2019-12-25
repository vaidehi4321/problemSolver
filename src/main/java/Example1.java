import java.sql.SQLOutput;
import java.util.*;

public class Example1 {
    public char findChar(String s, int index) {
        char c = s.charAt(index);
        return c;
    }

    public int findCode(String s, int index) {
        char c = s.charAt(index);
        int value = c;
        return value;
    }

    public char findCharWithCodeGiven(String s, int codePoint) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == codePoint)
                return c;
        }

        return '$';

    }

    public Integer mostCommon(Integer[] array) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        //this is the map of list element and occurrence
        int updateCount = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (!map.containsKey(list.get(i))) {
                map.put(list.get(i), 1);
            } else {
                updateCount = map.get(list.get(i)) + 1;
                map.put(list.get(i), updateCount);
            }
        }
        System.out.println(map);
        Integer max = 0;
        Integer mostCommon = map.get(0);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                mostCommon = entry.getKey();
            }
        }
        return mostCommon;
    }

    public Integer leastCommon(Integer[] array){
        //lets create a map to hold elements in array and their count
        int updateCount = 0;
        Map<Integer,Integer>map = new HashMap<Integer, Integer>();
        for(int i = 0;i<array.length ; i++ ){
          if(!map.containsKey(array[i])){
              map.put(array[i],1);
          }
          else{
              updateCount = map.get(array[i])+1;
              map.put(array[i],updateCount);
          }

        }
        System.out.println(map);
        Integer min = Integer.MAX_VALUE;
        Integer leastCommon = map.get(0);
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue() < min){
                min =entry.getValue();
                leastCommon = entry.getKey();
            };
        }
        return leastCommon;
    }


    public Integer[] bubbleSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }

    public Boolean binarySearch(Integer[] array, int value) {
        int start = 0;
        int end = array.length - 1;
        int mid = end / 2;
        while (start <= end) {
            mid = (end + start) / 2;
            if (array[mid] == value) {
                return true;


            } else if (array[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return false;
    }




}


