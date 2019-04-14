package com.example.demo.pojo;


public class KeyValuePair implements Comparable<KeyValuePair> {
    String id;
    Long value;

    public KeyValuePair(String id, Long value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Star: " + id +
                "-- Count: " + value +
                "||";
    }


    @Override
    public int compareTo(KeyValuePair o) {
        if (this.value < o.value) {
            return 1;
        } else if (this.value > o.value) {
            return -1;
        }else {
            return 0;
        }
    }
}
