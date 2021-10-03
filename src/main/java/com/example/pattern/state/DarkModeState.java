package com.example.pattern.state;

public class DarkModeState implements ModeState {

    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("다크 모드");

        modeSwitch.toggleModeState(new LightModeState());
    }
}
