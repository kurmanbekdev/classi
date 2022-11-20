import java.util.Arrays;

public class Class {
    private String name;
    private int age;
    private int[] array;

    public Class(String name, int age, int[] array) {
        this.name = name;
        this.age = age;
        this.array = array;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
