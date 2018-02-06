package de.authada.wrapper;

import android.content.Context;

import de.authada.core.Core;

/**
 * Created by dineshvg on 06.02.18 for parentproject in de.authada.wrapper.
 * 10: 43
 */

public class Wrapper {
    Context ctx;
    Core core;

    public Wrapper(Context context) {
        this.ctx = context;
        core = new Core();
    }


    public int getCoreScore() {
        return core.getCoreTime();
    }

    public void setCoreScore(int score) {
        core.setCoreTime(score);
    }

}
