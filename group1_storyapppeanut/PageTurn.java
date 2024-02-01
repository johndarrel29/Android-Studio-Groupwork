package com.example.group1_storyapppeanut;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class PageTurn {

    public static void nextPage(Context context, Class<?> activity) {
        Intent intent = new Intent(context, activity);
        context.startActivity(intent);
    }

    public static void backPage(Context context, Class<?> activity){
        Intent intent = new Intent(context, activity);
        context.startActivity(intent);
    }
}
