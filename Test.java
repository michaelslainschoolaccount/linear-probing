public class Test {
    private static int testAmount = 0;
    private static int passedAmount = 0;

    public static void run() {
        HashTable obj;
        boolean criteria;

        obj = new HashTable(10);

        criteria = obj.getSize() == 0;
        create(criteria, "get size");

        criteria = obj.isEmpty();
        create(criteria, "check if empty");

        criteria = obj.getSize() == 0 && obj.isEmpty();
        create(criteria, "constructor");

        criteria = obj.isFull() == false;
        create(criteria, "check if full");

        obj.insert("greeting", "hello");
        System.out.println(obj.get("hello"));
        create(criteria, "insert and get");

        criteria = obj.contains("greeting");
        create(criteria, "contains");

        obj.remove("greeting");
        criteria = obj.isEmpty();
        create(criteria, "remove");

        stop();
    }

    private static void create(boolean criteria, String name) {
        System.out.println("-- Test " + ++testAmount + ": " + name);

        if (criteria) {
            System.out.println("---- passed (>^-^)>");
            passedAmount++;
            return;
        }

        System.out.println("---- failed");
    }

    private static void stop() {
        System.out.println(passedAmount + "out of " + testAmount + " passed");

        if (passedAmount < testAmount)
            System.out.println("Haha you suck get better (:");
    }
}
