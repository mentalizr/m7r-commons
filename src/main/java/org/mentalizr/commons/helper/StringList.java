package org.mentalizr.commons.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {

    private final List<String> list;

    public StringList() {
        this.list = new ArrayList<>();
    }

    public void add(String item) {
        this.list.add(item);
    }

    public void add(List<String> items) {
        this.list.addAll(items);
    }

    public void add(StringList items) {
        this.list.addAll(items.list);
    }

    public void add(String... strings) {
        this.list.addAll(Arrays.asList(strings));
    }

    public List<String> asList() {
        return this.list;
    }

    public List<String> asImmutableList() {
        return List.copyOf(this.list);
    }

    public String[] asArray() {
        return this.list.toArray(String[]::new);
    }

}
