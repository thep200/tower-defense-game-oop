package com.gdx.game.component.enemytype;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gdx.game.component.attribute.HitPoint;

public class Monster2 extends Enemy {

    public Monster2(int x, int y) {
        super("Monster",6, x, y,"Enemy/Monster2");
        speed = 0.95;    // tốc độ của monster
        //   adjustRotation -= 180;      // xoay hình ảnh monster
        hitPoint = new HitPoint(500, widthSprite); // blood monster
    }

    @Override
    public void draw(SpriteBatch spriteBatch) {
        super.draw(spriteBatch);
    }
    @Override
    public void dispose(){ super.dispose(); }
}

