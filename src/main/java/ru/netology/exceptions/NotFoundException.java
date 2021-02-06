package ru.netology.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(int id) {
        System.out.println("Element with id "+ id + " Not Found!"); ;
    }
}
