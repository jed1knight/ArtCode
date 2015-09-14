package week1.day1;

/**
 * Created by Home on 25.08.2015.
 */
public class TestIBTree {
    public static void main(String[] args) {
        IBTree<Integer> myTree =  new BTreeImpl<Integer>();
        myTree.add(7);
        myTree.add(7);
        myTree.add(7);
        myTree.add(7);
        myTree.add(8);
        System.out.println(myTree.isEmpty());
        System.out.println(myTree.size());
    }
}
