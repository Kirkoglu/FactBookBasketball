package com.anzelmas.factsbook;

import android.graphics.Color;

import java.util.Random;

public class Colors {
    String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#696969", // dim gray
            "#bada55", // bada
            "#7fe5f0", // blue
            "#ff0000", // red
            "#ff80ed", // light pink
            "#407294", // light dark blue
            "#420420", // bordo
            "#133337", // dark grey
            "#065535", // dark green
            "#f7347a", // strong pink
            "#ffe4e1", // light pink
            "#ffd700", // yellow
            "#008080", // electric blue
            "#ffa500", // orange
            "#800080", // purple
            "#800000", // cherry red
            "#fff68f", // sandish
            "#00ff00", // strong green
            "#daa520", // golden
            "#b4eeb4", // light green
            "#000080", // darkish blue
            "#794044", // bordish
            "#dddddd", // silver
            "#66cccc", // water color
            "#b7c0c7" // light gray
    };

    int getColor() {

        // Paspaudus mygtuka bus random parinkta spalva ir saraso
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        return color;
    }
}
