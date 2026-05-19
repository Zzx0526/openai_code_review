package com.sunline.zhuzx.review.sdk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OpenAiCodeReviewTest {

    @Test
    void testReview() {
        OpenAiCodeReview codeReview = new OpenAiCodeReview();
        String result = codeReview.review("test code");
        assertTrue(result.contains("test code"));
    }
}
