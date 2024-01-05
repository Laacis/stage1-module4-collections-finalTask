package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

        for(Map.Entry<String, Set<String>> entry : projects.entrySet()){
            String project = entry.getKey();
            Set<String> names = entry.getValue();

            if(names.contains(developer)){
                result.add(project);
            }
        }

        sortList(result);

        return result;
    }

    private void sortList(List<String> result) {
        result.sort((a,b) ->
                a.length() < b.length() ? 1 :
                        a.length() == b.length()? a.compareToIgnoreCase(a) : -1 );
    }
}
