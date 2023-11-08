package com.duckrace.client;

import com.duckrace.app.RuckRaceApp;

// this is the only thing that goes in Main

public class Main {
    public static void main(String[] args) {
        // instantiate controller and say "go"
        RuckRaceApp app = new RuckRaceApp();
        app.execute();
    }
}
