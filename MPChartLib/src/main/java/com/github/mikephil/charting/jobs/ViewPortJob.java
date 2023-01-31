
package com.github.mikephil.charting.jobs;

import android.view.View;

import com.github.mikephil.charting.utils.ObjectPool;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import androidx.annotation.Nullable;
import com.github.mikephil.charting.NullUnmarked;

/**
 * Runnable that is used for viewport modifications since they cannot be
 * executed at any time. This can be used to delay the execution of viewport
 * modifications until the onSizeChanged(...) method of the chart-view is called.
 * This is especially important if viewport modifying methods are called on the chart
 * directly after initialization.
 * 
 * @author Philipp Jahoda
 */
public abstract class ViewPortJob extends ObjectPool.Poolable implements Runnable {

    protected float[] pts = new float[2];

    @SuppressWarnings("NullAway.Init") protected ViewPortHandler mViewPortHandler;
    protected float xValue = 0f;
    protected float yValue = 0f;
    @SuppressWarnings("NullAway.Init") protected Transformer mTrans;
    @SuppressWarnings("NullAway.Init") protected View view;

    @NullUnmarked public ViewPortJob(@Nullable ViewPortHandler viewPortHandler, float xValue, float yValue,
                       @Nullable Transformer trans, @Nullable View v) {

        this.mViewPortHandler = viewPortHandler;
        this.xValue = xValue;
        this.yValue = yValue;
        this.mTrans = trans;
        this.view = v;

    }

    public float getXValue() {
        return xValue;
    }

    public float getYValue() {
        return yValue;
    }
}
