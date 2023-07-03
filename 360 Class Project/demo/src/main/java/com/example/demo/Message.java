package com.example.demo;

public class Message {
    public String _title;
    public String _sender;
    public String _message;
    public int _date;

    Message(String title, String sender, String message, int date)
    {
        _title = title;
        _sender = sender;
        _message = message;
        _date = date;
    }
}
