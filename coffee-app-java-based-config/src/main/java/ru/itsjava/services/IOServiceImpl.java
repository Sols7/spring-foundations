package ru.itsjava.services;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOServiceImpl implements IOService {
    private final BufferedReader reader;

    public IOServiceImpl() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

//    public IOServiceImpl(InputStream inputStream) {
//        this.reader = new BufferedReader(new InputStreamReader(inputStream));
//    }

    @SneakyThrows
    @Override
    public double inputPrice() {
        return Double.parseDouble(reader.readLine());
    }
}
