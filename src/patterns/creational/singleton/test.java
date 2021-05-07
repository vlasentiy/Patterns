package patterns.creational.singleton;

class test {
    private static final test ourInstance = new test();

    static test getInstance() {
        return ourInstance;
    }

    private test() {
    }
}
