package com.company;

import Alogoritm.HanoiTower;
import Execute.ExecuteInMain;

public class Main {

    public static void main(String[] args) {
        ExecuteInMain<Object> execute = new ExecuteInMain<Object>(new HanoiTower(4));
        execute.run();
    }
}
