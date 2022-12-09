package com.admin4j.chatbot.dingtalk;

import com.admin4j.chatbot.dingtalk.request.MarkdownRobotRequest;
import com.admin4j.chatbot.dingtalk.request.TextRobotRequest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author andanyang
 * @since 2022/12/9 14:34
 */
class DingRobotTest {
    static DingRobot dingRobot;

    @BeforeAll
    static void init() {
        String assessToken = "d54bd0d41decb444d8e716fa661c03233d10f75559a0041c60148a1de8bb8028";
        String secret = "SEC7f5baedc3bc637942041077a6e5aeb4275cf403ad3c057e75b0ed8921dc26625";
        dingRobot = new DingRobot(assessToken, secret);
    }

    @Test
    void sendTest() {

        TextRobotRequest textRobotRequest = new TextRobotRequest();
        textRobotRequest.setContent("Hello, this is a test");
        dingRobot.send(textRobotRequest);
    }

    @Test
    void sendAt() {

        TextRobotRequest textRobotRequest = new TextRobotRequest();
        textRobotRequest.setContent("Hello, this is a test");
        textRobotRequest.setAtAll();
        dingRobot.send(textRobotRequest);
    }

    @Test
    void sendMarkDown() {

        MarkdownRobotRequest robotRequest = new MarkdownRobotRequest("杭州天气", "#### 杭州天气 @150XXXXXXXX \\n > 9度，西北风1级，空气良89，相对温度73%\\n > ![screenshot](https://img.alicdn.com/tfs/TB1NwmBEL9TBuNjy1zbXXXpepXa-2400-1218.png)\\n > ###### 10点20分发布 [天气](https://www.dingtalk.com) \\n");
        dingRobot.send(robotRequest);
    }
}