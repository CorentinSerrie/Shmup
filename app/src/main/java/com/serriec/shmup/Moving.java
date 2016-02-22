package com.serriec.shmup;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by serriec on 20/02/2016.
 */
public abstract class Moving extends Item {
    private float speed;
    private Circle circle;

    public Moving(int color) {
        super();
        circle = new Circle(0, 0, 0, color);
    }

    @Override
    public void setX(float x) {
        super.setX(x);
        circle.setX(x);
    }

    @Override
    public void setY(float y) {
        super.setY(y);
        circle.setY(y);
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getRadius() {
        return circle.getRadius();
    }

    public void setRadius(float radius) {
        circle.setRadius(radius);
    }

    @Override
    public void draw(Canvas canvas, Paint paint, int screenX, int screenY) {
        circle.draw(canvas, paint, screenX, screenY);
    }
}
