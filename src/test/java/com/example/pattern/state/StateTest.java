package com.example.pattern.state;

import org.junit.jupiter.api.Test;

public class StateTest {


    @Test
    public void test1() {
        ModeSwitch modeSwitch = new ModeSwitch();

        modeSwitch.onClick();
        modeSwitch.onClick();
        modeSwitch.onClick();
        modeSwitch.onClick();
        modeSwitch.onClick();
        modeSwitch.onClick();
    }
}
