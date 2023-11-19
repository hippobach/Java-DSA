package array;

public class Test {
    public static void main(String[] args) {
        DynamicArray<String> da = new DynamicArray<>();
        da.add("X");
        da.add("u");
        da.add("a");
        da.add("n");
        da.add("B");
        da.add("a");
        da.add("c");
        da.add("h");

        System.out.println(da.toString());
        System.out.println(da.get(2));
        System.out.println(da.indexOf("u"));
        System.out.println(da.size());
    }
}
