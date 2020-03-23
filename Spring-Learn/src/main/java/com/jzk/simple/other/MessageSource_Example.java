package com.jzk.simple.other;

import org.springframework.context.MessageSource;

/**
 * ClassName:MessageSource_Example
 * Package:com.jzk.simple.other
 * Description:
 *
 * @Date:2020/3/23 10:19
 * @Author:JiangZhikuan
 */

public class MessageSource_Example {
    private MessageSource messages;

    public void setMessages(MessageSource messages) {
        this.messages = messages;
    }

    public void execute(){
        String message=
                this.messages.getMessage("argument.required",
                        new Object[]{"userDao"},"Required",null);
        System.out.println(message);
    }
}
