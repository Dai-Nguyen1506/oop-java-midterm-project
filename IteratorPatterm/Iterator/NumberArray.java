package IteratorPatterm.Iterator;

public class NumberArray implements MyCollection<Integer> {

    private int[] data;

    public NumberArray(int[] data) {
        this.data = data;
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
            return index < data.length;
        }

        @Override
        public Integer next() {
            return data[index++];
        }
    }
}
