package com.rawsaurus.model.accounts;

public class Players {
    private final String account_id;
    private final String nickname;

    Players(Builder builder){
        this.account_id = builder.account_id;
        this.nickname = builder.nickname;
    }

    public static class Builder{
        private String account_id;
        private String nickname;

        public Builder account_id(String account_id){
            this.account_id = account_id;
            return this;
        }

        public Builder nickname(String nickname){
            this.nickname = nickname;
            return this;
        }

        public Players build(){
            return new Players(this);
        }
    }

    public String getAccount_id() {
        return account_id;
    }

    public String getNickname() {
        return nickname;
    }
}
