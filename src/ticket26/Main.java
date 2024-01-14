/*
 * Copyright (c) Eliza
 */

package ticket26;

class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("I'm sure");
        arrayList.add("we're");
        arrayList.add("taller");
        arrayList.add("in another");
        arrayList.add("dimension...");
        System.out.println("before removing: ");
        arrayList.print();
        arrayList.delete(4);
        System.out.println("\nafter removing: ");
        arrayList.print();

    }
}
