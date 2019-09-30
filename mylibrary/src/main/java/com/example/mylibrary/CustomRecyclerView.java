package com.example.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class CustomRecyclerView extends RecyclerView {
    public CustomRecyclerView(@NonNull Context context) {
        super(context);
        init();
    }

    public CustomRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init(){

        if(isVerticalScrollBarEnabled()){

            setScrollBarStyle(View.SCROLLBARS_OUTSIDE_INSET);

        }else{
            setScrollBarStyle(View.SCROLLBARS_OUTSIDE_INSET);
        }


    }
}
