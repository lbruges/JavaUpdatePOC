package org.example.abstracttest;

public class MusicFile extends MediaFile {


    @Override
    public void play() {
        System.out.println("Playing Music");
    }

    public void play(int speed) {
        System.out.printf("Playing music at speed %d%n", speed);
    }
}
