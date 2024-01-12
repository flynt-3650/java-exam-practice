/*
 * Copyright (c) Eliza
 */

package ticket26;

public class Main {
    public static void main(String[] args) {
        myArrayList<String> arrayList = new myArrayList<>();
        arrayList.add("I'm sure");
        arrayList.add("we're");
        arrayList.add("taller");
        arrayList.add("in another");
        arrayList.add("dimension...");
        System.out.println("before removing: ");
        arrayList.print();
        arrayList.delеte(4);
        System.out.println("\nafter removing: ");
        arrayList.print();
    }
}
