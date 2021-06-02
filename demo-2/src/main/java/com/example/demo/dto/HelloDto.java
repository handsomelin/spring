package com.example.demo.dto;
import java.sql.Timestamp;
import java.time.Instant;


public class HelloDto {
	private String message;
	private int word;
	private long date;
	
	public HelloDto(String message, int word, long date) {
        this.message = message;
        this.word = word;
        this.date = date;    }

    public String getMessage() {
        return message;
    }
    public int getWord() {
        return word;
    }
    public long getWord2() {
        return date;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
