package d.collection;

import java.util.HashMap;

public class MapSample {
    public static void main(String[] args) {
        MapSample mapSample = new MapSample();
        mapSample.checkHashMap();
    }

    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("A", "1");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
    }
}