package Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {

    public static <K, V> Map<K, V> mergeMaps(Map<K, V> map1, Map<K, V> map2) {
        Map<K, V> mergedMap = new HashMap<>();

        if (map1 != null) {
            mergedMap.putAll(map1);
        }

        if (map2 != null) {
            mergedMap.putAll(map2);
        }

        return mergedMap;
    }

    public static <K, V> Map<K, V> mergeMapsWithFunction(Map<K, V> map1, Map<K, V> map2, java.util.function.BiFunction<V, V, V> mergeFunction) {
        Map<K, V> mergedMap = new HashMap<>();

        if (map1 != null) {
            mergedMap.putAll(map1);
        }

        if (map2 != null) {
            map2.forEach((key, value) -> mergedMap.merge(key, value, mergeFunction));
        }

        return mergedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> mapA = new HashMap<>();
        mapA.put("A", 1);
        mapA.put("B", 2);
        mapA.put("C", 3);

        Map<String, Integer> mapB = new HashMap<>();
        mapB.put("B", 20);
        mapB.put("D", 40);

        System.out.println("Map A: " + mapA);
        System.out.println("Map B: " + mapB);
        Map<String, Integer> merged1 = mergeMaps(mapA, mapB);
        System.out.println("Merged Map (simple): " + merged1);


        Map<String, Integer> mapC = new HashMap<>();
        mapC.put("apple", 5);
        mapC.put("banana", 10);

        Map<String, Integer> mapD = new HashMap<>();
        mapD.put("banana", 15);
        mapD.put("orange", 20);

        System.out.println("Map C: " + mapC);
        System.out.println("Map D: " + mapD);
        Map<String, Integer> merged2 = mergeMapsWithFunction(mapC, mapD, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Merged Map (sum values): " + merged2);


        Map<String, String> mapE = new HashMap<>();
        mapE.put("key1", "value1");
        mapE.put("key2", "value2");

        Map<String, String> mapF = new HashMap<>();
        mapF.put("key2", "new_value2");
        mapF.put("key3", "value3");

        System.out.println("Map E: " + mapE);
        System.out.println("Map F: " + mapF);
        Map<String, String> merged3 = mergeMapsWithFunction(mapE, mapF, (oldValue, newValue) -> oldValue);
        System.out.println("Merged Map (keep old value): " + merged3);


        Map<String, Integer> mapG = new HashMap<>();
        mapG.put("X", 100);

        Map<String, Integer> mergedWithNull1 = mergeMaps(mapG, null);
        System.out.println("Merged Map (map2 is null): " + mergedWithNull1);

        Map<String, Integer> mergedWithNull2 = mergeMaps(null, mapG);
        System.out.println("Merged Map (map1 is null): " + mergedWithNull2);

        Map<String, Integer> mergedWithNull3 = mergeMaps(null, null);
        System.out.println("Merged Map (both null): " + mergedWithNull3);
    }
}