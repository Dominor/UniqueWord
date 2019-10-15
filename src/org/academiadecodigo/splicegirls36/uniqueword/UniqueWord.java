package org.academiadecodigo.splicegirls36.uniqueword;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class UniqueWord implements Iterable<String> {

    private HashSet<String> words;

    public UniqueWord(String string) {
        this.words = new HashSet<>(Arrays.asList(string.split(" ")));
    }

    @Override
    public Iterator<String> iterator() {
        return words.iterator();
    }
}
