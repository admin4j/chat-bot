package com.admin4j.chatbot.dingtalk.request;

import com.admin4j.chatbot.dingtalk.core.MsgType;
import com.admin4j.chatbot.dingtalk.request.base.AbstractRobotRequest;
import com.alibaba.fastjson2.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://help-static-aliyun-doc.aliyuncs.com/assets/img/zh-CN/5099076061/p131219.png
 *
 * @author andanyang
 * @since 2022/5/11 11:56
 */

public class FeedCardRobotRequest extends AbstractRobotRequest {
    @Getter
    private Map<String, Object> feedCard = new HashMap<>(2);
    @JSONField(serialize = false)
    private List<Object> links = new ArrayList<>(8);

    public FeedCardRobotRequest() {
        super();
        feedCard.put("links", links);
    }

    @Override
    public MsgType getMsgType() {
        return MsgType.FEED_CARD;
    }

    public FeedCardRobotRequest addLink(Link link) {
        links.add(link);
        return this;
    }

    public FeedCardRobotRequest addLink(String title,
                                        String messageURL,
                                        String picURL) {
        return addLink(new Link(title, messageURL, picURL));
    }

    public FeedCardRobotRequest setLinks(List<Object> links) {
        this.links = links;
        return this;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Link {
        private String title;
        private String messageURL;
        private String picURL;
    }


}
