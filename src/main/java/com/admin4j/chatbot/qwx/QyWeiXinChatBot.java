package com.admin4j.chatbot.qwx;

import com.admin4j.chatbot.qwx.core.BotMsg;
import com.admin4j.chatbot.qwx.core.msg.TextBotMsg;
import io.github.admin4j.http.util.HttpUtil;

/**
 * 企业微信群聊机器人
 * https://developer.work.weixin.qq.com/document/path/99110
 *
 * @author andanyang
 * @since 2022/10/15 22:00
 */
public class QyWeiXinChatBot {


    private static final String BASE_URL = "https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=";
    private String webhookUrl = "";

    public QyWeiXinChatBot(String webhookUrl) {
        setWebhookUrl(webhookUrl);
    }

    public void setWebhookUrl(String webhookUrl) {
        if (webhookUrl.contains("http")) {
            this.webhookUrl = webhookUrl;
        } else {
            webhookUrl = BASE_URL + webhookUrl;
        }
    }

    public void sendMsg(BotMsg msg) {

        HttpUtil.post(webhookUrl, msg);
    }

    public void sendTextMsg(String msg) {

        TextBotMsg textBotMsg = new TextBotMsg(msg);
        sendMsg(textBotMsg);
    }
}
