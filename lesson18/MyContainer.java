package hillel.pashchenko;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyContainer implements Collection {
    private Object[] objects = new Object[0];

    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public boolean isEmpty() {
        return size() ==0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object obj:objects) {
            if (obj.equals(o))
                return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return objects;
    }

    @Override
    public boolean add(Object o) {
        int size= size();
        Object[] newArray = new Object[size + 1];
        for (int i = 0; i < size; i++) {
            newArray[i] = objects[i];
        }
        newArray[size] = o;
        objects = newArray;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = 0;
        for (int i = 0; i < size(); i++) {
            if (objects[i].equals(o)) {
                index = i;
                break;
            }
        }
            Object[] result = new Object[objects.length - 1];
            System.arraycopy(objects, 0, result, 0, index);
            if (objects.length != index) {
                System.arraycopy(objects, index + 1, result, index, objects.length - index - 1);
            }
            return true;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o:c) {
            add(o);
        }
        return true;
    }

    @Override
    public void clear() {
        objects=new Object[0];
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        for (Object o : c) {
            remove(o);
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        for (Object o : c)
            if (!contains(o)) {
                return false;
            }
        return true;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        return "MyContainer{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }
}
