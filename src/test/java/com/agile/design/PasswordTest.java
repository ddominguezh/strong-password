package com.agile.design;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordTest {
    
    @Test
    public void the_password_is_not_strong_when_the_size_is_less_than_six(){
        Password password = Password.create("aA3_");
        assertFalse(password.isStrong());
    }

    @Test
    public void the_password_is_not_strong_when_not_contains_some_number(){
        Password password = Password.create("aA_eDj");
        assertFalse(password.isStrong());
    }

    @Test
    public void the_password_is_not_strong_when_not_contains_some_upper_letter(){
        Password password = Password.create("a38d3_");
        assertFalse(password.isStrong());
    }

    @Test
    public void the_password_is_not_strong_when_not_contains_some_lower_letter(){
        Password password = Password.create("A38D3_");
        assertFalse(password.isStrong());
    }

    @Test
    public void the_password_is_strong(){
        Password password = Password.create("aA34_3d");
        assertTrue(password.isStrong());
    }

    @Test
    public void add_support_ñ(){
        Password password = Password.create("ñÑ34_3ñ");
        assertTrue(password.isStrong());
    }
}
