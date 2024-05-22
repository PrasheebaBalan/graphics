package com.example.graphics;

import android.content.Context;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.graphics.RectF;
        import android.util.AttributeSet;
        import android.view.View;

public class CustomDrawingView extends View {
    private Paint paint;

    public CustomDrawingView(Context context) {
        super(context);
        init();
    }

    public CustomDrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomDrawingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Draw a rectangle
        paint.setColor(Color.BLUE);
        RectF rectF = new RectF(100, 100, 300, 200);
        canvas.drawRect(rectF, paint);

        // Draw a circle
        paint.setColor(Color.RED);
        canvas.drawCircle(500, 150, 50, paint);

        // Draw a line
        paint.setColor(Color.GREEN);
        canvas.drawLine(50, 300, 500, 300, paint);

        // Draw text
        paint.setColor(Color.BLACK);
        paint.setTextSize(50);
        canvas.drawText("Hello, Android!", 100, 500, paint);

        // Rotate canvas
        canvas.rotate(45, getWidth() / 2, getHeight() / 2);

        // Draw rotated rectangle
        paint.setColor(Color.MAGENTA);
        canvas.drawRect(200, 700, 400, 800, paint);
    }
}
