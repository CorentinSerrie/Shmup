package com.serriec.shmup;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;


public class Life extends Still {
    private boolean isActive;
    private int screenX;
    private int screenY;

    public Life(int screenX, int screenY) {
        super(Color.argb(255, 0, 255, 0));
        setRadius(screenX/23);
        this.screenX = screenX;
        this.screenY = screenY;
        isActive = false;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setInactive() {
        isActive = false;
    }

    @Override
    public void update(long fps) {

    }

    @Override
    public void reset() {
        isActive = true;
        Random generator = new Random();
        setX(generator.nextFloat() * screenX);
        setY(generator.nextFloat() * screenY);
    }

    @Override
    public void draw(Canvas canvas, Paint paint, int screenX, int screenY) {
        if (isActive) {
            super.draw(canvas, paint, screenX, screenY);
            paint.setColor(Color.argb(255, 0, 0, 0));
            paint.setTextSize(getRadius());
            paint.setTextAlign(Paint.Align.CENTER);
            canvas.drawText("+1", this.getX(), this.getY() + getRadius() * 3 / 8, paint);
        }
    }
}
