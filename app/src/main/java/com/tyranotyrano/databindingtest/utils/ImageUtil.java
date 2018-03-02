package com.tyranotyrano.databindingtest.utils;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by cyj on 2018-03-02.
 */

public class ImageUtil {

    /**
     * loadImage()
     *   1. public static void 로 정의
     *   2. BindingAdapter 어노테이션에 설정해준 속성값들은 해당 함수의 2번째 매개변수부터 차례대로 대입
     *   3. 해당 함수의 첫번째 매개변수는 BindingAdapter 어노테이션으로 설정한 속성값들을 적용할 View
     *
     * imageView : src 속성을 적용할 view
     * resId : BindingAdapter 어노테이션으로 가져온 src 속성에 설정한 값
     * */
    @BindingAdapter("src")
    public static void loadImage(ImageView imageView, Drawable imageDrawable) {
        // 1. Drawable 로 가져온 경우 : loadImage(ImageView imageView, Drawable imageDrawable)
        imageView.setImageDrawable(imageDrawable);

        // 2. Resource ID 로 가져온 경우 : loadImage(ImageView imageView, int resId)
        //imageView.setImageResource(resId);
    }
}
