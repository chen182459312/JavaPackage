package com.em.user;

import com.em.pay.WechatPayment;

public class Student implements IUser {
    @Override
    public void Say() {
        WechatPayment pay = new WechatPayment();
        System.out.println("Student say");
        pay.pay();
    }
}
