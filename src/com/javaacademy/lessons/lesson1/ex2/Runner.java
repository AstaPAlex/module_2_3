package com.javaacademy.lessons.lesson1.ex2;

import com.javaacademy.lessons.lesson1.ex2.input.Keyboard;
import com.javaacademy.lessons.lesson1.ex2.input.Mouse;
import com.javaacademy.lessons.lesson1.ex2.output.Monitor;
import com.javaacademy.lessons.lesson1.ex2.output.SoundBox;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        Computer<Mouse, Monitor> computer = new Computer<>(mouse, monitor);

        computer.inputInformation();
        computer.outputInformation();
        Monitor output = computer.getOutput();
        output.changeBright();

        Keyboard keyboard = new Keyboard();
        SoundBox soundBox = new SoundBox();
        Computer<Keyboard, SoundBox> computer2 = new Computer<>(keyboard, soundBox);
        SoundBox box = computer2.getOutput();
        box.changeVolume();

        ArrayList arrayList = new ArrayList();
    }
}
