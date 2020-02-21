package com.company;

import Alogoritm.HanoiTower;
import Execute.ExecuteInMain;
import Utils.UserInput.GetInput;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int DISC_QUANTITIES = 4;
        GetInput getInput = new GetInput();
        System.out.println("Решение головоломки \"Ханойская башня\"");
        System.out.print("Введите начальное число дисков на штыре A: ");
        DISC_QUANTITIES = getInput.getNumber();
        ExecuteInMain<Object> execute = new ExecuteInMain<Object>(new HanoiTower(DISC_QUANTITIES));
        System.out.println(execute.run());
    }
}
