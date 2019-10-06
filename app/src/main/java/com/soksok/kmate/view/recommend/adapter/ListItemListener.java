package com.soksok.kmate.view.recommend.adapter;

import android.view.View;

public interface ListItemListener {

    void onLayoutClick(View v, int position);

    void onLikeClick(View v, int position);
}
