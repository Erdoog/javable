package javable.t03;

import java.util.List;

public class QuickListSorter<T extends Comparable<T>> implements ListSorter<T> {

    @Override
    public void sort(List<T> list) {
        int low = 0;
        int high = list.size() - 1;

        if (list.size() == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;



        int i = low, j = high;
        while (i <= j) {
            while (list.get(i).compareTo(list.get(middle)) < 0) {
                i++;
            }

            while (list.get(i).compareTo(list.get(middle)) > 0) {
                j--;
            }

            if (i <= j) {
                T temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                i++;
                j--;
            }
        }


        if (low < j) {
            high = j;
            sort(list);
        }
        if (high > i) {
            low = i;
            sort(list);
        }
    }
}