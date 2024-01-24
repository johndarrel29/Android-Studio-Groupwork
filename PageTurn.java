package com.example.storybook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class PageTurn {

    public static void nextPage(Context context, Class<?> activity) {
        Intent intent = new Intent(context, activity);
        context.startActivity(intent);
    }
}
