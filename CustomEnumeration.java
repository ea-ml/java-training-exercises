// Exercise 3
public interface CustomEnumeration {
    default void enumerate(String stringValue) {
        (new StringBuilder(stringValue)).chars()
                .forEach(i -> System.out.printf("%c%n", i));

    }
}
