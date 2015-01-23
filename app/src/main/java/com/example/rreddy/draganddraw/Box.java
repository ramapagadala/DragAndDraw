package com.example.rreddy.draganddraw;

import android.graphics.PointF;

/**
 * Created by rreddy on 1/23/2015.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;
    public Box(PointF origin) {
        mOrigin = mCurrent = origin;
    }
    public PointF getCurrent() {
        return mCurrent;
    }
    public void setCurrent(PointF current) {
        mCurrent = current;
    }
    public PointF getOrigin() {
        return mOrigin;
    }
}
