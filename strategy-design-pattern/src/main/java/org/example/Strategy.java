package org.example;

public interface Strategy {
    default void start(StringBuilder sb) {
    };

    void addListItem(StringBuilder sb, String item);

    default void end(StringBuilder sb) {
    };
}
