package site.golets.java9;

public class DiamondOperatorExtension {

    public static void main(String[] args) {

        FooClass<Integer> fc = new FooClass<>() {
            @Override
            public Integer getT() {
                return 1;
            } // anonymous inner class
        };

        FooClass<? extends Integer> fc0 = new FooClass<>() {
            @Override
            public Integer getT() {
                return null;
            }
            // anonymous inner class
        };

        FooClass<?> fc1 = new FooClass<>() {
            @Override
            public Object getT() {
                return null;
            } // anonymous inner class
        };

    }

    interface FooClass<T> {
      T  getT();
    }

}
