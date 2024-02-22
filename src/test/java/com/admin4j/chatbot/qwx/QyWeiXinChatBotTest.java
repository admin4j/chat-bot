package com.admin4j.chatbot.qwx;

import com.admin4j.chatbot.qwx.core.msg.MarkdownBotMsg;
import org.junit.jupiter.api.Test;

/**
 * @author andanyang
 * @since 2024/2/22 10:42
 */
class QyWeiXinChatBotTest {

    QyWeiXinChatBot bot = new QyWeiXinChatBot("https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=1e82d30b-2e64-417a-af06-3ff8e4cda649");


    @Test
    void sendMsg() {
        MarkdownBotMsg markdownBotMsg = new MarkdownBotMsg("实时新增用户反馈 <font color=\"warning\">132例</font>，请相关同事注意。\n>类型: <font color=\"red\">用户反馈</font> \n >普通用户反馈:<font color=\"blue\" \n >117例</font> \n >VIP用户反馈:<font color=\"pink\" \n >15例</font>");
        bot.sendMsg(markdownBotMsg);
    }

    @Test
    void sendTextMsg() {

        bot.sendTextMsg("测试一下啊");
    }
}