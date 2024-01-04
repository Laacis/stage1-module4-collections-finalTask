package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();

        for(Map.Entry<String, Integer> entry : sourceMap.entrySet()){
            String word = entry.getKey();
            Integer wordLength = word.length();

            if(result.containsKey(wordLength)){
                Set<String> set = result.get(wordLength);
                set.add(word);
            }else{
                result.put(wordLength, new HashSet<>(){{ add(word); }});
            }
        }

        return result;
    }
}
