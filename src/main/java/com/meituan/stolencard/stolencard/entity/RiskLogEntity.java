package com.meituan.stolencard.stolencard.entity;

public class RiskLogEntity {
    
    private String timeStamp;
    private Long userid;
    private String uuid;
    private String ip;
    private Integer action;
    private String bankCard;
    //银行卡hash
    private String bankcardno_hash;
    // 身份证hash
    private String idHash;
    
    private Long dealid;
    
    private String bankMobile;
    private String bindMobile;
    
    private String orderCity;
    private String bankMobileCity;
    private String bindMobileCity;
    
    private Integer partner;
    private Integer platform;
    

    private String orderProvince;
    private String bankMobileProvince;
    private String bindMobileProvince;
    
    private String dealTitle;
    
    
    public String getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    public Long getUserid() {
        return userid;
    }
    public void setUserid(Long userid) {
        this.userid = userid;
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public Integer getAction() {
        return action;
    }
    public void setAction(Integer action) {
        this.action = action;
    }
    public String getBankCard() {
        return bankCard;
    }
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }
    public String getIdHash() {
        return idHash;
    }
    public void setIdHash(String idHash) {
        this.idHash = idHash;
    }
    public Long getDealid() {
        return dealid;
    }
    public void setDealid(Long dealid) {
        this.dealid = dealid;
    }
    public String getBankMobile() {
        return bankMobile;
    }
    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile;
    }
    public String getBindMobile() {
        return bindMobile;
    }
    public void setBindMobile(String bindMobile) {
        this.bindMobile = bindMobile;
    }
    public String getOrderCity() {
        return orderCity;
    }
    public void setOrderCity(String orderCity) {
        this.orderCity = orderCity;
    }
    public String getBankMobileCity() {
        return bankMobileCity;
    }
    public void setBankMobileCity(String bankMobileCity) {
        this.bankMobileCity = bankMobileCity;
    }
    public String getBindMobileCity() {
        return bindMobileCity;
    }
    public void setBindMobileCity(String bindMobileCity) {
        this.bindMobileCity = bindMobileCity;
    }
    public String getOrderProvince() {
        return orderProvince;
    }
    public void setOrderProvince(String orderProvince) {
        this.orderProvince = orderProvince;
    }
    public String getBankMobileProvince() {
        return bankMobileProvince;
    }
    public void setBankMobileProvince(String bankMobileProvince) {
        this.bankMobileProvince = bankMobileProvince;
    }
    public String getBindMobileProvince() {
        return bindMobileProvince;
    }
    public void setBindMobileProvince(String bindMobileProvince) {
        this.bindMobileProvince = bindMobileProvince;
    }
    public String getBankcardno_hash() {
        return bankcardno_hash;
    }
    public void setBankcardno_hash(String bankcardno_hash) {
        this.bankcardno_hash = bankcardno_hash;
    }
    public Integer getPartner() {
        return partner;
    }
    public void setPartner(Integer partner) {
        this.partner = partner;
    }
    public Integer getPlatform() {
        return platform;
    }
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }
    public String getDealTitle() {
        return dealTitle;
    }
    public void setDealTitle(String dealTitle) {
        this.dealTitle = dealTitle;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RiskLogEntity [timeStamp=").append(timeStamp).append(", userid=").append(userid)
                .append(", uuid=").append(uuid).append(", ip=").append(ip).append(", action=").append(action)
                .append(", bankCard=").append(bankCard).append(", bankcardno_hash=").append(bankcardno_hash)
                .append(", idHash=").append(idHash).append(", dealid=").append(dealid).append(", bankMobile=")
                .append(bankMobile).append(", bindMobile=").append(bindMobile).append(", orderCity=").append(orderCity)
                .append(", bankMobileCity=").append(bankMobileCity).append(", bindMobileCity=").append(bindMobileCity)
                .append(", partner=").append(partner).append(", platform=").append(platform).append(", orderProvince=")
                .append(orderProvince).append(", bankMobileProvince=").append(bankMobileProvince)
                .append(", bindMobileProvince=").append(bindMobileProvince).append(", dealTitle=").append(dealTitle)
                .append("]");
        return builder.toString();
    }
    
}
