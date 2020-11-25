package array_of_words;

import java.util.*;

public class ArrayOfWords {



        public  String[] getUniqueItems(String[] arr){
            Set<String > set1 = new HashSet<>(Arrays.asList(arr));
            String[] StrArr1 = new String[set1.size()];
            return StrArr1 =  set1.toArray(StrArr1);
        }
        public  void quantityOfWords(String[] arr){
            int k =0;
            Map<String,Integer> map1 = new HashMap<>();
            String[] uniqueWords = getUniqueItems(arr);
            List<String> list1 = new LinkedList<>(Arrays.asList(arr));
            for (String uniqueWord : uniqueWords) {
                for (int i = 0; i < list1.size(); i++) {

                    if (uniqueWord.matches(list1.get(i))){
                      k++;
                      list1.remove(i);
                      i--;
                    }
                }
                map1.put(uniqueWord,k);
                k=0;
            }

            System.out.println(map1);
        }
    }

