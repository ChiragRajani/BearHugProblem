import java.util.*;

public class invertMerge {
    public static String invertMergeLists(Map<String, Integer> map1, Map<String, Integer>  map2){

        Map<Integer, Set<String>> ans = new HashMap<>();

        for(Map.Entry<String, Integer> i: map1.entrySet()){

            if(ans.containsKey(i.getValue())){
                ans.get(i.getValue()).add(i.getKey());
            }
            else {
                ans.put(i.getValue(), new HashSet<>(Arrays.asList(i.getKey())));
            }
        }
        for(Map.Entry<String, Integer> i: map2.entrySet()){

            if(ans.containsKey(i.getValue())){
                ans.get(i.getValue()).add(i.getKey());
            }
            else {
                ans.put(i.getValue(), new HashSet<>(Arrays.asList(i.getKey())));
            }
        }

        String answer = "";

        for(Map.Entry<Integer, Set<String>> i : ans.entrySet()){
            answer = answer +i.getKey()+" : "+i.getValue().toString()+"\n";
        }
        return answer;

    }
    public static void initializeManualInput(Map<String, Integer> map1, Map<String, Integer> map2){

        map1.put("A",1);
        map1.put("B",2);
        map1.put("C",3);
        map1.put("D",1);
        map1.put("G",4);


        map2.put("A",1);
        map2.put("D",3);
        map2.put("E",1);
        map2.put("F",2);
        map2.put("G",4);

    }
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        initializeManualInput(map1, map2);

        String answer = invertMergeLists(map1, map2);

        System.out.println(answer);

    }
}
