package ru.job4j.dagger.store;

import java.util.List;

public interface Store {
    void add(String value);
    List<String> getAll();
}
