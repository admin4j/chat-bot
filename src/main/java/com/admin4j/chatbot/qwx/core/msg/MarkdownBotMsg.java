package com.admin4j.chatbot.qwx.core.msg;

import com.admin4j.chatbot.qwx.core.BotMsg;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author andanyang
 * @since 2022/10/15 22:08
 */
@Getter
public class MarkdownBotMsg extends BotMsg {
    @Override
    public String getMsgtype() {
        return "markdown";
    }

    private final Map<String, Object> markdown;

    public MarkdownBotMsg(String content) {
        markdown = new HashMap<>();
        markdown.put("content", content);
    }
}
