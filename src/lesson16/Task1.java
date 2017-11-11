package lesson16;

/*
Создать обобщенный класс с тремя переменными
 */
public class Task1<T, V, K> {
   T obj1;
   V obj2;
   K obj3;

    Task1(T o1, V o2, K o3) {
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

    public K getObj3() {
        return obj3;
    }
}
