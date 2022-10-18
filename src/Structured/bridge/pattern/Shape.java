package Structured.bridge.pattern;

import Structured.bridge.pattern.Draw.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {this.drawAPI = drawAPI;}

    public abstract void draw();
}
