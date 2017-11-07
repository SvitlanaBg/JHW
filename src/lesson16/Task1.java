package lesson16;

/*
Создать обобщенный класс с тремя переменными
 */
public class Task1<T, V, E> {
    T obj1;
    V obj2;
    E obj3;

    Task1(T o1, V o2, E o3) {
        obj1 = o1;
        obj2 = o2;
        obj3 = o3;
    }

    void showNameClass() {
        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass().getName());
        System.out.println(obj3.getClass().getName());
        }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public E getObj3() {
        return obj3;
    }
}
