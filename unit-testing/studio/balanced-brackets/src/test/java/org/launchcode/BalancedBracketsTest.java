package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        boolean condition = BalancedBrackets.hasBalancedBrackets("[");
        assertFalse(condition);
    }

    @Test
    public void emptyStringReturnsFalse() {
        boolean condition = BalancedBrackets.hasBalancedBrackets("");
        assertFalse(condition);
    }

    @Test
public void isANumber(){
        assertThrows(IllegalArgumentException.class, () -> BalancedBrackets.hasBalancedBrackets("5"),"String must include letters,not numbers");
    }
    @Test
    public void unevenBrackets(){
        boolean condition = BalancedBrackets.hasBalancedBrackets("[[]");
        assertFalse(condition);
    }

    @Test
    public void stringWithinBrackets(){
        boolean condition = BalancedBrackets.hasBalancedBrackets("[string]");
        assertTrue(condition);
    }

    @Test
    public void stringWithCurlyBraces(){
        boolean condition = BalancedBrackets.hasBalancedBrackets("}");
        assertFalse(condition);
    }

    @Test
    public void reverseBracket(){
        boolean condition =  BalancedBrackets.hasBalancedBrackets("][");
        assertFalse(condition);
    }


}

