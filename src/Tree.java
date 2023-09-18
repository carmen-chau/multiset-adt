public class Tree implements MultiSet{

    @java.lang.Override
    public boolean add(Object item) {
        return false;
    }

    @java.lang.Override
    public void remove(Object item) {

    }

    @java.lang.Override
    public boolean contains(Object item) {
        return false;
    }

    @java.lang.Override
    public boolean is_empty() {
        return false;
    }

    @java.lang.Override
    public int count(Object item) {
        return 0;
    }

    @java.lang.Override
    public int size() {
        return 0;
    }
}
/*
    Carmen Chau's understanding of adts.py
    There is the MultiSet ADT. This ADT is like a "blueprint" that models the development of the followung classes
        1. TreeMultiSet (this not only uses the MultiSet ADT but also uses another class called Tree)
        2. ArrayListMultiSet
        3. LinkedListMultiSet

     Finally, there is a 4th thing to implement:
        4. A method called profileMultiSet that runs timing experiments for a given MultiSet implementation

 */