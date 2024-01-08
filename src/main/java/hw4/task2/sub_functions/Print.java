package hw4.task2.sub_functions;

public class Print {
    public static void printArray(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null)
                System.out.println((i + 1) + ". " + objects[i].toString());
        }
    }
}
