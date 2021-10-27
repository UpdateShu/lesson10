package ru.geekbrains.lessons;

import java.util.LinkedList;

public class Directory extends LinkedList<Record> {

    public boolean add(String name, String number)
    {
        Record newRecord = new Record(name, number);
        return super.add(newRecord);
    }

    public LinkedList<Record> get(String name)
    {
        LinkedList<Record> numbers = new LinkedList<Record>();
        for (Record record : this) {
            if (record.getName().equals(name))
                numbers.add(record);
        }
        return numbers;
    }
}
