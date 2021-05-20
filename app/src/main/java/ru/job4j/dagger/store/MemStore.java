package ru.job4j.dagger.store;

import java.util.ArrayList;
import java.util.List;

public class MemStore implements Store {
    private final List<String> list = new ArrayList<>();
    @Override
    public void add(String value) {
        list.add(value);
    }
    @Override
    public List<String> getAll() {
        return list;
    }
}
