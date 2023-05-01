package com.agile.design;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class PasswordTest {
    
    @Test
    public void the_password_is_invalid_when_the_size_is_less_than_six(){
        Password password = Password.create("aA3_");
        assertFalse(password.isStrong());
    }
}
