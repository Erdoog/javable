package javable.t03;

import java.util.List;

public class SelectionListSorter<T extends Comparable<T>> implements ListSorter<T> {
    @Override
    public void sort(List<T> list) {
        int size = list.size();
        T temp;
        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {
                if (list.get(i).compareTo(list.get(min_idx)) < 0) {
                    min_idx = i;
                }
            }
            temp = list.get(step);
            list.set(step, list.get(min_idx));
            list.set(min_idx, temp);
        }
    }
}
