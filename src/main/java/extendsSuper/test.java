package extendsSuper;

public class test {

    class Fruit {
    }

    class Apple extends Fruit {
    }

    class Plate<T> {
        private T item;

        public Plate(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        public void aaa() {
//            Plate<Fruit> p=new Plate<Apple>(new Apple()); //报错

            Plate<? extends Fruit> p1 = new Plate<Apple>(new Apple());
//            p1.setItem(new Apple());//报错
//            p1.setItem(new Fruit());//报错

            Fruit item = p1.getItem();


            Plate<? super Fruit> p2 = new Plate<Fruit>(new Fruit());
            p2.setItem(new Fruit());
            p2.setItem(new Apple());

            Object item1 = p2.getItem();


        }
    }

    public static void main(String[] args) {

    }
}
