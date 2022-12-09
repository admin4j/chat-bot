package com.admin4j.chatbot.dingtalk.request.base;

import com.admin4j.chatbot.dingtalk.core.At;
import com.admin4j.chatbot.dingtalk.core.MsgType;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author andanyang
 * @since 2022/5/11 11:51
 */
@Data
@NoArgsConstructor
public abstract class AbstractRobotRequest {

    private static At AT_ALL = null;
    private At at;

    /**
     * 休息类型
     *
     * @return
     */
    @JSONField(name = "msgtype", serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
    public abstract MsgType getMsgType();

    public void setAtAll() {
        if (AT_ALL == null) {
            AT_ALL = At.atAll();
        }
        this.at = AT_ALL;
    }
}
