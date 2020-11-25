package phonebook;

import java.util.*;

public class Tel {
     Map<String, List<String>> map = new HashMap<>();
//     Map<String, String> map2 = new HashMap<>();



    public  void addTelepnoe(String name, String tel){
        String name2 = Arrays.toString(name.toCharArray());
        map.computeIfAbsent(name, k -> new ArrayList<>()).add(tel);
//        map4.merge(name,tel,(v1,v2)->v1+ " or "+v2);
    }
    public List<String> getTelephone(String lastName){
        return map.get(lastName);
    }
}
