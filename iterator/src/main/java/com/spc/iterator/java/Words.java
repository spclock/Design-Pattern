package com.spc.iterator.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words implements Container {

    List<String> wordsList = Arrays.asList("hello", "World", "java", "Spring");
    private int size = wordsList.size();

    @Override
    public  Iterator<String> iterator() {
        return new WordsIterator();
    }


    private class WordsIterator implements Iterator<String> {
        public int post = 0;

        @Override
        public boolean hashNext() {
            return post < size;
        }

        @Override
        public String next() {
            String s = wordsList.get(post);
            post += 1;
            return s;
        }
    }
}
