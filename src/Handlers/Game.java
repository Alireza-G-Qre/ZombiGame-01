package Handlers;

import java.awt.*;

public class Game extends Canvas implements Runnable {

    protected final Window window;
    protected final int wight, height;
    protected final String title = "Zombi Game";

    protected Thread thread;
    protected boolean isRunning = false;

    public Game(int wight, int height) {
        this.wight = wight;
        this.height = height;
        window = new Window(wight,height,title,this);
        start();
    }

    protected synchronized void start() {

        if (isRunning) return;
        isRunning = true;

        thread = new Thread(this);
        thread.start();
    }

    protected synchronized void stop() throws InterruptedException {

        if (!isRunning) return;

        thread.join();
        isRunning = false;
    }

    @Override
    public void run() {

//        while (true) {
//
//        }
    }
}
