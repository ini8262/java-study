package com.example.pattern.state;

public class ModeSwitch {

    private ModeState modeState = new LightModeState();

    public void toggleModeState(ModeState modeState) {
        this.modeState = modeState;
    }

    public void onClick() {
        modeState.toggle(this);
    }

}
