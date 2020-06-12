package com.em.pay;

public class WechatPayment implements IPayment {
    private boolean result;
    private int price;
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public void pay() {
        System.out.println("WechatPayment");
    }
}
