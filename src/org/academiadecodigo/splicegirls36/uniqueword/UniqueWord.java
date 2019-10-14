package org.academiadecodigo.splicegirls36.uniqueword;

import java.util.Iterator;

public class UniqueWord implements Iterable<String> {

    private String[] words;

    public UniqueWord(String string) {
        this.words = string.split(" ");
    }

    @Override
    public Iterator<String> iterator() {
        return new UniqueWordsIterator();
    }

    private class UniqueWordsIterator implements Iterator<String> {

        private int counter = -1;

        @Override
        public boolean hasNext() {
            return counter < words.length - 1;
        }

        @Override
        public String next() {
            return words[++counter];
        }
    }
}
