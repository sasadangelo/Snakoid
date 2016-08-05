package org.androidforfun.snakoid.view;

import org.androidforfun.snakoid.framework.Screen;
import org.androidforfun.snakoid.framework.impl.AndroidGame;

public class SnakoidGame extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this);
    }
}