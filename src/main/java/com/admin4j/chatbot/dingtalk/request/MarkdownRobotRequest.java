package com.admin4j.chatbot.dingtalk.request;

import com.admin4j.chatbot.dingtalk.core.MsgType;
import com.admin4j.chatbot.dingtalk.request.base.AbstractRobotRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * https://help-static-aliyun-doc.aliyuncs.com/assets/img/zh-CN/4099076061/p131227.png
 *
 * @author andanyang
 * @since 2022/5/11 11:56
 */
@NoArgsConstructor
public class MarkdownRobotRequest extends AbstractRobotRequest {
    @Getter
    private Map<String, String> markdown = new HashMap<>(8);

    /**
     * @param title 标题
     * @param text  markdown
     */
    public MarkdownRobotRequest(String title, String text) {
        setText(text);
        setTitle(title);
    }

    @Override
    public MsgType getMsgType() {
        return MsgType.MARKDOWN;
    }

    /**
     * 消息内容。如果太长只会部分展示。
     * markdown 格式
     *
     * @param text
     * @return
     */
    public MarkdownRobotRequest setText(String text) {

        markdown.put("text", text);
        return this;
    }

    /**
     * 消息标题。
     *
     * @param title
     * @return
     */
    public MarkdownRobotRequest setTitle(String title) {

        markdown.put("title", title);
        return this;
    }
}
