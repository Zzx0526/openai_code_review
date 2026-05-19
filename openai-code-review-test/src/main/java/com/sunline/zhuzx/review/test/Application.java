package com.sunline.zhuzx.review.test;

import com.sunline.zhuzx.review.sdk.OpenAiCodeReview;

public class Application {

    public static void main(String[] args) {
        OpenAiCodeReview codeReview = new OpenAiCodeReview();
        String result = codeReview.review("public class Hello {}");
        System.out.println(result);
    }
}
