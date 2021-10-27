package ru.geekbrains.lessons;

public class Record implements Comparable {
    private String name;
    private String number;

    public Record(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name + " - " + number;
    }

    @Override
    public int compareTo(Object o) {
        Record another = (Record)o;
        if (!this.name.equals(another.name))
            return this.name.compareTo(another.name);
        else
            return this.number.compareTo(another.number);
    }
}
