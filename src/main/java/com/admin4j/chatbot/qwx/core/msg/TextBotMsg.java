package com.admin4j.chatbot.qwx.core.msg;

import com.admin4j.chatbot.qwx.core.BotMsg;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author andanyang
 * @since 2022/10/15 22:08
 */
public class TextBotMsg extends BotMsg {
    @Override
    public String getMsgtype() {
        return "text";
    }

    @Getter
    private Map<String, Object> text;

    public TextBotMsg(String content) {
        text = new HashMap<>();
        text.put("content", content);
    }

    /**
     * userid的列表，
     * 提醒群中的指定成员(@某个成员)，@all表示提醒所有人，如果开发者获取不到userid，可以使用mentioned_mobile_list
     *
     * @param mentioned_list
     */
    public void setMentionedList(List<String> mentioned_list) {
        text.put("mentioned_list", mentioned_list);
    }

    /**
     * 手机号列表，提醒手机号对应的群成员(@某个成员)，@all表示提醒所有人
     *
     * @param mentioned_mobile_list
     */
    public void setMobileList(List<String> mentioned_mobile_list) {
        text.put("mentioned_mobile_list", mentioned_mobile_list);
    }

    public void atAll() {
        text.put("mentioned_list", "@all");
    }
}
