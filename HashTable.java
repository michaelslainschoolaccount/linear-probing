class HashTable {
    private int currentSize;
    private int maxSize;
    private String[] keys;
    private String[] values;

    public HashTable(int capacity) {
        currentSize = 0;
        maxSize = capacity;
        keys = new String[maxSize];
        values = new String[maxSize];
    }

    public void makeEmpty() {
        currentSize = 0;
        keys = new String[maxSize];
        values = new String[maxSize];
    }

    public int getSize() {
        return currentSize;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean contains(String key) {
        return get(key) != null;
    }

    private int hash(String key) {
        return key.hashCode() % maxSize;
    }

    public void insert(String key, String val) {
        int tmp = hash(key);
        int i = tmp;

        while (i != tmp) {
            if (keys[i] == null) {
                keys[i] = key;
                values[i] = val;
                currentSize++;
                return;
            }

            if (keys[i].equals(key)) {
                values[i] = val;
                return;
            }

            i = (i + 1) % maxSize;
        }
    }

    public String get(String key) {
        int i = hash(key);
        while (keys[i] != null) {
            if (keys[i].equals(key))
                return values[i];
            i = (i + 1) % maxSize;
        }
        return null;
    }

    public void remove(String key) {
        if (!contains(key))
            return;

        int i = hash(key);

        while (!key.equals(keys[i]))
            i = (i + 1) % maxSize;

        keys[i] = values[i] = null;

        for (i = (i + 1) % maxSize; keys[i] != null; i = (i + 1) % maxSize) {
            String tmp1 = keys[i], tmp2 = values[i];
            keys[i] = values[i] = null;
            currentSize--;
            insert(tmp1, tmp2);
        }
        currentSize--;
    }

    public void print() {
        System.out.println("\nHash Table: ");
        for (int i = 0; i < maxSize; i++)
            if (keys[i] != null)
                System.out.println(keys[i] + " " + values[i]);
        System.out.println();
    }
}