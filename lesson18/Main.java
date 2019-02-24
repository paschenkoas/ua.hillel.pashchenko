package hillel.pashchenko;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyContainer container = new MyContainer();
        System.out.println(container.size());
        container.add(new Student ("Ivan","Ivanov"));
        container.add(new Student ("Petr","Petrov"));
        System.out.println(container.size());
        System.out.println(container);
        Object[] objects=container.toArray();
        objects[0]=null;
        objects[1]=null;
        System.out.println(container);
        container.add(123);
        System.out.println(container);


    }
}
