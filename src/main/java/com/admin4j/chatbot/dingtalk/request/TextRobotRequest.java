package com.admin4j.chatbot.dingtalk.request;

import com.admin4j.chatbot.dingtalk.core.MsgType;
import com.admin4j.chatbot.dingtalk.request.base.AbstractRobotRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author andanyang
 * @since 2022/5/11 11:56
 */
@NoArgsConstructor
public class TextRobotRequest extends AbstractRobotRequest {
    @Getter
    private Map<String, String> text;

    public TextRobotRequest(String content) {
        setContent(content);
    }

    @Override
    public MsgType getMsgType() {
        return MsgType.TEXT;
    }

    public void setContent(String content) {
        if (text == null) {
            text = new HashMap<>(2);
        }
        text.put("content", content);
    }
}
