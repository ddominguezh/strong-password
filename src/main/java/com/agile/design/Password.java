package com.agile.design;

import java.util.regex.Pattern;

public class Password {

    private static final int MIN_LENGTH = 6;
    private final String value;
    protected Password(String value){
        this.value = value;
    }
    public static Password create(String value) {
        return new Password(value);
    }

    public boolean isStrong() {
        return isValidLength()
            && containsSomeNumber()
            && containsSomeUpperLetter()
            && containsSomeLowerLetter();
    }
    
    private boolean isValidLength(){
        return value.length() >= MIN_LENGTH;
    }

    private boolean containsSomeNumber(){
        return Pattern.compile("[0-9]+").matcher(value).find();
    }

    private boolean containsSomeUpperLetter(){
        return Pattern.compile("[A-Z]+").matcher(value).find();
    }

    private boolean containsSomeLowerLetter(){
        return Pattern.compile("[a-z]+").matcher(value).find();
    }
}
