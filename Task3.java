public class Task3 {
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        cat1.count = Cat.count + 1;

        Cat cat2 = new Cat();
        cat2.count = Cat.count + 1;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat
    {
        public static int count = 0;

    }
}
