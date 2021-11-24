package site.golets.java9;

public class TryWithResources {

    public static void main(String[] args) throws Exception {

        MyAutoCloseable mac = new MyAutoCloseable();

        try (mac) {

        }catch (Exception e){}

    }

    static class MyAutoCloseable implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Class was closed");
        }
    }

}
