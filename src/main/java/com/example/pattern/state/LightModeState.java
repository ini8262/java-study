package com.example.pattern.state;

public class LightModeState implements ModeState {

    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("라이트 모드");

        modeSwitch.toggleModeState(new DarkModeState());
    }
}
