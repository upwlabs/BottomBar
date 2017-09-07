package com.example.bottombar.sample;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class CustomView extends View {
  public CustomView(Context context) {
    this(context, null);
  }

  public CustomView(Context context, @Nullable AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    Log.d("CustomView", "constructor");
  }


  @Override
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    Log.d("CustomView", "onAttachedToWindow");
  }

  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    Log.d("CustomView", "onMeasure");
  }


  @Override
  protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    super.onLayout(changed, left, top, right, bottom);
    Log.d("CustomView", "onLayout");
  }

  @Override
  protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    super.onSizeChanged(w, h, oldw, oldh);
    Log.d("CustomView", "onSizeChanged");
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    Log.d("CustomView", "onDraw");
  }

  @Nullable
  @Override
  protected Parcelable onSaveInstanceState() {
    Log.d("CustomView", "onSaveInstanceState");
    return super.onSaveInstanceState();
  }

  @Override
  protected void onRestoreInstanceState(Parcelable state) {
    super.onRestoreInstanceState(state);
    Log.d("CustomView", "onRestoreInstanceState");
  }

  @Override
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    Log.d("CustomView", "onDetachedFromWindow");
  }

}
