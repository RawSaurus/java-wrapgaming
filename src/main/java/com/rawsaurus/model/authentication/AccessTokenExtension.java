package com.rawsaurus.model.authentication;

public class AccessTokenExtension {
    private String access_token;
    private int account_id;
    private long expires_at;

    public String getAccess_token() {
        return access_token;
    }

    public int getAccount_id() {
        return account_id;
    }

    public long getExpires_at() {
        return expires_at;
    }

    @Override
    public String toString() {
        return "AccessTokenExtension{" +
                "access_token='" + access_token + '\'' +
                ", account_id=" + account_id +
                ", expires_at=" + expires_at +
                '}';
    }
}
