package IteratorPatterm.Iterator;

import java.util.ArrayList;
import java.util.List;

public class NumberArray implements MyCollection<Integer> {

    private List<Integer> data;

    public NumberArray(int[] arr) {
        this.data = new ArrayList<>();
        for (int value : arr) {
            this.data.add(value);
        }
    }

    @Override
    public MyIterator<Integer> createIterator() {
        return new ArrayIterator();
    }

    // ===== Iterator details for ARRAY =====
    private class ArrayIterator implements MyIterator<Integer> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.size();
        }

        @Override
        public Integer next() {
            return data.get(index++);
        }

        @Override
        public void add(Integer value) {
            data.add(value);
        }
    }
}
