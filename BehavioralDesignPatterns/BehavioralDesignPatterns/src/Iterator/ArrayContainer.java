package Iterator;

public class ArrayContainer implements Container {
    String[] array = {"Max", "Jhon", "Mike"};
    @Override
    public Iterator getIterator(){
        return new ArrayIterator();
    }
    class ArrayIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext(){
            return (index < array.length) ? true : false;
        }
        @Override
        public Object next(){
            if (hasNext()){
                return array[index++];
            }
            return null;
        }
    }
}
