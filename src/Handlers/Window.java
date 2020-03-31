package Handlers;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    protected final Dimension dimension;
    protected final String title;
    protected final Game game;

    public Window(int wight, int height, String title, Game game) throws HeadlessException {

        dimension = new Dimension(wight,height);
        this.title = title;
        this.game = game;
    }

    protected void initialize() {

        add(game);

        setSize(dimension);
        setVisible(true);
    }
}
