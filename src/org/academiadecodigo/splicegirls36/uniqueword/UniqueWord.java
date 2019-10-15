package org.academiadecodigo.splicegirls36.uniqueword;

import java.util.*;

public class UniqueWord implements Iterable<String> {

    private Set<String> words;

    public UniqueWord(String string) {
        Collections.addAll(this.words = new HashSet<>(), string.split(" "));
    }

    @Override
    public Iterator<String> iterator() {
        return words.iterator();
    }
}
