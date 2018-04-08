package com.egzosn.pay.paypal.api;

import com.egzosn.pay.common.api.BasePayConfigStorage;

/**
 * 贝宝支付配置存储
 * @author  egan
 *
 * email egzosn@gmail.com
 * date 2018-4-8 22:11:42
 */
public class PayPalConfigStorage extends BasePayConfigStorage {

    private volatile String clientID;

    @Override
    public String getAppid() {
        return clientID;
    }

    @Override
    public String getPid() {
        return clientID;
    }

    @Override
    public String getSeller() {
        return clientID;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getClientSecret() {
        return getKeyPrivate();
    }

    public void setClientSecret(String clientSecret) {
       setKeyPrivate(clientSecret);
    }


}
