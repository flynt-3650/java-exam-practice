/*
 * Copyright (c) Eliza
 */

package ticket26;

class Main {
    public static void main(String[] args) {
        myArrayList<String> arrayList = new myArrayList<>();
        arrayList.add("I'm sure");
        arrayList.add("we're");
        arrayList.add("taller");
        arrayList.add("in another");
        arrayList.add("dimension...");
        System.out.println("before removing: ");
        arrayList.print();
        arrayList.delite(4);
        System.out.println("\nafter removing: ");
        arrayList.print();
        arrayList.delite("in another");
        System.out.println("\nafter removing: ");
        arrayList.print();

    }
}
