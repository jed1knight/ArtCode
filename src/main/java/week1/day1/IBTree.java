package week1.day1;

/**
 * Created by Home on 25.08.2015.
 */
public interface IBTree<E> {
    boolean add(E elem);
    boolean remove(E elem);
    boolean contains(E elem);
    boolean isEmpty();
    int size();
}
