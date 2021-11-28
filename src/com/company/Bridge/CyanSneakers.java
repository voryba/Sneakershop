package com.company.Bridge;

import com.company.Factory.Nike;

public class CyanSneakers implements SneakersColor{

    @Override
    public String fill() {
        return "The color of the sneakers is Cyan";
    }
}
