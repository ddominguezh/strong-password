package com.agile.design;

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
        return isValidLength();
    }
    
    private boolean isValidLength(){
        return value.length() >= MIN_LENGTH;
    }
}
