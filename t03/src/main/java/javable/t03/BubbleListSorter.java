package javable.t03;

import java.util.List;

public class BubbleListSorter<T extends Comparable<T>> implements ListSorter<T> {

    @Override
    public void sort(List<T> list) {
        T temp;
        boolean sorted = false;
        if(list == null || list.isEmpty()) {
            return;
        }
        while (!sorted) {
            sorted = true;

                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                        temp = list.get(i);
                        list.set(i, list.get(i + 1));
                        list.set(i + 1, temp);
                        sorted = false;
                    }
                }

        }
        }
}