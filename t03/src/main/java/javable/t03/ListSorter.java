package javable.t03;

import java.util.List;

public interface ListSorter<T extends Comparable<T>> {
    void sort(List<T> list);
}
