package com.github.mikephil.charting.interfaces.dataprovider;

import androidx.annotation.Nullable;
import com.github.mikephil.charting.components.YAxis.AxisDependency;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    @Nullable
    Transformer getTransformer(AxisDependency axis);

    boolean isInverted(AxisDependency axis);

    float getLowestVisibleX();

    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}
