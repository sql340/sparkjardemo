package com.meituan.stolencard.stolencard.entity;


public class QuickSignPayFactor {
    private String timeStamp;
    private Long userid;
    private String requestId;
    private Integer action;

    private Integer partner;
    private Integer platform;

    // 银行卡是否一天、三天、七天内被绑定
    private Integer isBankCardBinded1D; // factor_quickpay_sample_is_bankcard_binded_1d
    private Integer isBankCardBinded3D; // factor_quickpay_sample_is_bankcard_binded_3d
    private Integer isBankCardBinded7D; // factor_quickpay_sample_is_bankcard_binded_1w
    
    // 用户在一天、三天、七天内是否有绑卡操作
    private Integer isUserBinded1D; // factor_quickpay_sample_is_user_quicksign_1d
    private Integer isUserBinded3D; // factor_quickpay_sample_is_user_quicksign_3d
    private Integer isUserBinded7D; // factor_quickpay_sample_is_user_quicksign_1w
    
    // 银行卡在一天、一个礼拜、一个月内绑定过的用户数
    private Integer bankCardBindedUseridsCnt1D; // factor_quickpay_sample_bankcard_binded_userid_cnts_1d
    private Integer bankCardBindedUseridsCnt7D; // factor_quickpay_sample_bankcard_binded_userid_cnts_1w
    private Integer bankCardBindedUseridsCnt1M; // factor_quickpay_sample_bankcard_binded_userid_cnts_1m
    
    // 用户在一天、一个礼拜、一个月内绑定过的银行卡数
    private Integer userBindedCardsCnt1D; // factor_quickpay_sample_user_quicksign_bankcard_cnts_1d
    private Integer userBindedCardsCnt7D; // factor_quickpay_sample_user_quicksign_bankcard_cnts_1w
    private Integer userBindedCardsCnt1M; // factor_quickpay_sample_user_quicksign_bankcard_cnts_1m
    
    // uuid在一天、一个礼拜、一个月内绑定过的银行卡数
    private Integer uuidBindedCardsCnt1D; // factor_quickpay_sample_uuid_quicksign_bankcard_cnts_1d
    private Integer uuidBindedCardsCnt7D; // factor_quickpay_sample_uuid_quicksign_bankcard_cnts_1w
    private Integer uuidBindedCardsCnt1M; // factor_quickpay_sample_uuid_quicksign_bankcard_cnts_1m
    
    // imsi在一天、一个礼拜、一个月内绑定过的银行卡数
    private Integer imsiBindedCardsCnt1D;
    private Integer imsiBindedCardsCnt7D;
    private Integer imsiBindedCardsCnt1M;
    
    // 各城市是否一致
    private Integer isBankMobileCityEqBindMobileCity; // factor_quickpay_sample_is_bankmobilecity_eq_bindmobilecity
    private Integer isBankMobileCityEqOrderCity;  // factor_quickpay_sample_is_bankmobilecity_eq_ordercity
    private Integer isBankMobileCityEqDealCity;   // **** dealcity 会是一个列表 **** 暂时空缺
    private Integer isBindMobileCityEqOrderCity;  // factor_quickpay_sample_is_bindmobilecity_eq_ordercity
    private Integer isBindMobileCityEqDealCity;   // **** dealcity 会是一个列表 **** 暂时空缺
    
    // 各省是否一致
    private Integer isBankMobileProvEqBindMobileProv; // factor_quickpay_sample_is_bankmobileprov_eq_bindmobileprov
    private Integer isBankMobileProvEqOrderProv; // factor_quickpay_sample_is_bankmobileprov_eq_orderprov
    private Integer isBankMobileProvEqDealProv;  // 
    private Integer isBindMobileProvEqOrderProv; // factor_quickpay_sample_is_bindmobileprov_eq_orderprov
    private Integer isBindMobileProvEqDealProv;  // 
    
    // 用户是否一天、一个礼拜、一个月内注册
    private Integer isUserRegIn1D;     // factor_quickpay_sample_is_user_reg_in_1d
    private Integer isUserRegIn7D;     // factor_quickpay_sample_is_user_reg_in_1w
    private Integer isUserRegIn1M;     // factor_quickpay_sample_is_user_reg_in_1m

    //TODO: 身份证归属地的服务？


    // 身份证年龄是否70前,70后,80后,90后,00后
    private Integer isAgeBefore70;   // factor_quickpay_sample_is_user_age_before_70
    private Integer isAgeAfter70;    // factor_quickpay_sample_is_user_age_after_70
    private Integer isAgeAfter80;    // factor_quickpay_sample_is_user_age_after_80
    private Integer isAgeAfter90;    // factor_quickpay_sample_is_user_age_after_90
    private Integer isAgeAfter00;    // factor_quickpay_sample_is_user_age_after_00
    
    // 是否模拟器
    private Integer isSimulator;     // factor_quickpay_sample_is_use_simulator
    
    // uuid 1天、3天内是否操作过多个userid
    private Integer isUuidActManyUserids1D;   //
    private Integer isUuidActManyUserids3D;   //
    
    // imsi 1天、3天内是否操作过多个userid
    private Integer isImsiActManyUserids1D;   //
    private Integer isImsiActManyUserids3D;   //
    
    // ip 1天、3天内是否操作过多个userid
    private Integer isIpActManyUserids1D;   //
    private Integer isIpActManyUserids3D;   //
    
    // userid是否批量注册userid
    private Integer isUseridBatchReg;       //
    
    // deal,uuid,imsi,银行卡 是否在黑名单中
    private Integer isDealInBlackList;             // factor_quickpay_sample_is_dealid_in_blacklist
    private Integer isUuidInSibshipBlackList;      // factor_quickpay_sample_is_uuid_in_blacklist
    private Integer isImsiInSibshipBlackList;      // factor_quickpay_sample_is_imsi_in_blacklist
    private Integer isBankcardInSibshipBlackList;  // factor_quickpay_sample_is_bankcard_in_blacklist
    
    // userid一天内购买金额是否超过100,200,300,500,800
    private Integer isUseridConsumeMoneyMT100;   // factor_quickpay_sample_is_user_consume_money_mt100_1d
    private Integer isUseridConsumeMoneyMT200;   // factor_quickpay_sample_is_user_consume_money_mt200_1d
    private Integer isUseridConsumeMoneyMT300;   // factor_quickpay_sample_is_user_consume_money_mt300_1d
    private Integer isUseridConsumeMoneyMT500;   // factor_quickpay_sample_is_user_consume_money_mt500_1d
    private Integer isUseridConsumeMoneyMT800;   // factor_quickpay_sample_is_user_consume_money_mt800_1d
    
    // uuid一天内购买金额是否超过100,200,300,500,800
    private Integer isUuidConsumeMoneyMT100;   // factor_quickpay_sample_is_uuid_consume_money_mt100_1d
    private Integer isUuidConsumeMoneyMT200;   // factor_quickpay_sample_is_uuid_consume_money_mt200_1d
    private Integer isUuidConsumeMoneyMT300;   // factor_quickpay_sample_is_uuid_consume_money_mt300_1d
    private Integer isUuidConsumeMoneyMT500;   // factor_quickpay_sample_is_uuid_consume_money_mt500_1d
    private Integer isUuidConsumeMoneyMT800;   // factor_quickpay_sample_is_uuid_consume_money_mt800_1d
    
    // imsi一天内购买金额是否超过100,200,300,500,800
    private Integer isImsiConsumeMoneyMT100;
    private Integer isImsiConsumeMoneyMT200;
    private Integer isImsiConsumeMoneyMT300;
    private Integer isImsiConsumeMoneyMT500;
    private Integer isImsiConsumeMoneyMT800;
    
    // 银行卡一天内购买金额是否超过100,200,300,500,800
    private Integer isBankcardConsumeMoneyMT100; // factor_quickpay_sample_is_bankcard_consume_money_mt100_1d
    private Integer isBankcardConsumeMoneyMT200; // factor_quickpay_sample_is_bankcard_consume_money_mt200_1d
    private Integer isBankcardConsumeMoneyMT300; // factor_quickpay_sample_is_bankcard_consume_money_mt300_1d
    private Integer isBankcardConsumeMoneyMT500; // factor_quickpay_sample_is_bankcard_consume_money_mt500_1d
    private Integer isBankcardConsumeMoneyMT800; // factor_quickpay_sample_is_bankcard_consume_money_mt800_1d
    
    // userid一天内购买次数是否超过2,3,4,5,8
    private Integer isUseridConsumeTimesMT2;  // factor_quickpay_sample_userid_quickpaytimes_mt2_1d
    private Integer isUseridConsumeTimesMT3;  // factor_quickpay_sample_userid_quickpaytimes_mt3_1d
    private Integer isUseridConsumeTimesMT4;  // factor_quickpay_sample_userid_quickpaytimes_mt4_1d
    private Integer isUseridConsumeTimesMT5;  // factor_quickpay_sample_userid_quickpaytimes_mt5_1d
    private Integer isUseridConsumeTimesMT8;  // factor_quickpay_sample_userid_quickpaytimes_mt8_1d
    
    // uuid一天内购买次数是否超过2,3,4,5,8
    private Integer isUuidConsumeTimesMT2;  // factor_quickpay_sample_uuid_quickpaytimes_mt2_1d
    private Integer isUuidConsumeTimesMT3;  // factor_quickpay_sample_uuid_quickpaytimes_mt3_1d
    private Integer isUuidConsumeTimesMT4;  // factor_quickpay_sample_uuid_quickpaytimes_mt4_1d
    private Integer isUuidConsumeTimesMT5;  // factor_quickpay_sample_uuid_quickpaytimes_mt5_1d
    private Integer isUuidConsumeTimesMT8;  // factor_quickpay_sample_uuid_quickpaytimes_mt8_1d
    
    // imsi一天内购买次数是否超过2,3,4,5,8
    private Integer isImsiConsumeTimesMT2;
    private Integer isImsiConsumeTimesMT3;
    private Integer isImsiConsumeTimesMT4;
    private Integer isImsiConsumeTimesMT5;
    private Integer isImsiConsumeTimesMT8;
    
    // bankcard一天内购买次数是否超过2,3,4,5,8
    private Integer isBankcardConsumeTimesMT2;  // factor_quickpay_sample_bankcard_quickpaytimes_mt2_1d
    private Integer isBankcardConsumeTimesMT3;  // factor_quickpay_sample_bankcard_quickpaytimes_mt3_1d
    private Integer isBankcardConsumeTimesMT4;  // factor_quickpay_sample_bankcard_quickpaytimes_mt4_1d
    private Integer isBankcardConsumeTimesMT5;  // factor_quickpay_sample_bankcard_quickpaytimes_mt5_1d
    private Integer isBankcardConsumeTimesMT8;  // factor_quickpay_sample_bankcard_quickpaytimes_mt8_1d
    
    //购买成功到验券时间是否低于3分钟
    private Integer isVerifyLT3min;       // 

    
    
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

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
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

    public Integer getIsBankCardBinded1D() {
        return isBankCardBinded1D;
    }

    public void setIsBankCardBinded1D(Integer isBankCardBinded1D) {
        this.isBankCardBinded1D = isBankCardBinded1D;
    }

    public Integer getIsBankCardBinded3D() {
        return isBankCardBinded3D;
    }

    public void setIsBankCardBinded3D(Integer isBankCardBinded3D) {
        this.isBankCardBinded3D = isBankCardBinded3D;
    }

    public Integer getIsBankCardBinded7D() {
        return isBankCardBinded7D;
    }

    public void setIsBankCardBinded7D(Integer isBankCardBinded7D) {
        this.isBankCardBinded7D = isBankCardBinded7D;
    }

    public Integer getIsUserBinded1D() {
        return isUserBinded1D;
    }

    public void setIsUserBinded1D(Integer isUserBinded1D) {
        this.isUserBinded1D = isUserBinded1D;
    }

    public Integer getIsUserBinded3D() {
        return isUserBinded3D;
    }

    public void setIsUserBinded3D(Integer isUserBinded3D) {
        this.isUserBinded3D = isUserBinded3D;
    }

    public Integer getIsUserBinded7D() {
        return isUserBinded7D;
    }

    public void setIsUserBinded7D(Integer isUserBinded7D) {
        this.isUserBinded7D = isUserBinded7D;
    }

    public Integer getBankCardBindedUseridsCnt1D() {
        return bankCardBindedUseridsCnt1D;
    }

    public void setBankCardBindedUseridsCnt1D(Integer bankCardBindedUseridsCnt1D) {
        this.bankCardBindedUseridsCnt1D = bankCardBindedUseridsCnt1D;
    }

    public Integer getBankCardBindedUseridsCnt7D() {
        return bankCardBindedUseridsCnt7D;
    }

    public void setBankCardBindedUseridsCnt7D(Integer bankCardBindedUseridsCnt7D) {
        this.bankCardBindedUseridsCnt7D = bankCardBindedUseridsCnt7D;
    }

    public Integer getBankCardBindedUseridsCnt1M() {
        return bankCardBindedUseridsCnt1M;
    }

    public void setBankCardBindedUseridsCnt1M(Integer bankCardBindedUseridsCnt1M) {
        this.bankCardBindedUseridsCnt1M = bankCardBindedUseridsCnt1M;
    }

    public Integer getUserBindedCardsCnt1D() {
        return userBindedCardsCnt1D;
    }

    public void setUserBindedCardsCnt1D(Integer userBindedCardsCnt1D) {
        this.userBindedCardsCnt1D = userBindedCardsCnt1D;
    }

    public Integer getUserBindedCardsCnt7D() {
        return userBindedCardsCnt7D;
    }

    public void setUserBindedCardsCnt7D(Integer userBindedCardsCnt7D) {
        this.userBindedCardsCnt7D = userBindedCardsCnt7D;
    }

    public Integer getUserBindedCardsCnt1M() {
        return userBindedCardsCnt1M;
    }

    public void setUserBindedCardsCnt1M(Integer userBindedCardsCnt1M) {
        this.userBindedCardsCnt1M = userBindedCardsCnt1M;
    }

    public Integer getUuidBindedCardsCnt1D() {
        return uuidBindedCardsCnt1D;
    }

    public void setUuidBindedCardsCnt1D(Integer uuidBindedCardsCnt1D) {
        this.uuidBindedCardsCnt1D = uuidBindedCardsCnt1D;
    }

    public Integer getUuidBindedCardsCnt7D() {
        return uuidBindedCardsCnt7D;
    }

    public void setUuidBindedCardsCnt7D(Integer uuidBindedCardsCnt7D) {
        this.uuidBindedCardsCnt7D = uuidBindedCardsCnt7D;
    }

    public Integer getUuidBindedCardsCnt1M() {
        return uuidBindedCardsCnt1M;
    }

    public void setUuidBindedCardsCnt1M(Integer uuidBindedCardsCnt1M) {
        this.uuidBindedCardsCnt1M = uuidBindedCardsCnt1M;
    }

    public Integer getImsiBindedCardsCnt1D() {
        return imsiBindedCardsCnt1D;
    }

    public void setImsiBindedCardsCnt1D(Integer imsiBindedCardsCnt1D) {
        this.imsiBindedCardsCnt1D = imsiBindedCardsCnt1D;
    }

    public Integer getImsiBindedCardsCnt7D() {
        return imsiBindedCardsCnt7D;
    }

    public void setImsiBindedCardsCnt7D(Integer imsiBindedCardsCnt7D) {
        this.imsiBindedCardsCnt7D = imsiBindedCardsCnt7D;
    }

    public Integer getImsiBindedCardsCnt1M() {
        return imsiBindedCardsCnt1M;
    }

    public void setImsiBindedCardsCnt1M(Integer imsiBindedCardsCnt1M) {
        this.imsiBindedCardsCnt1M = imsiBindedCardsCnt1M;
    }

    public Integer getIsBankMobileCityEqBindMobileCity() {
        return isBankMobileCityEqBindMobileCity;
    }

    public void setIsBankMobileCityEqBindMobileCity(Integer isBankMobileCityEqBindMobileCity) {
        this.isBankMobileCityEqBindMobileCity = isBankMobileCityEqBindMobileCity;
    }

    public Integer getIsBankMobileCityEqOrderCity() {
        return isBankMobileCityEqOrderCity;
    }

    public void setIsBankMobileCityEqOrderCity(Integer isBankMobileCityEqOrderCity) {
        this.isBankMobileCityEqOrderCity = isBankMobileCityEqOrderCity;
    }

    public Integer getIsBankMobileCityEqDealCity() {
        return isBankMobileCityEqDealCity;
    }

    public void setIsBankMobileCityEqDealCity(Integer isBankMobileCityEqDealCity) {
        this.isBankMobileCityEqDealCity = isBankMobileCityEqDealCity;
    }

    public Integer getIsBindMobileCityEqOrderCity() {
        return isBindMobileCityEqOrderCity;
    }

    public void setIsBindMobileCityEqOrderCity(Integer isBindMobileCityEqOrderCity) {
        this.isBindMobileCityEqOrderCity = isBindMobileCityEqOrderCity;
    }

    public Integer getIsBindMobileCityEqDealCity() {
        return isBindMobileCityEqDealCity;
    }

    public void setIsBindMobileCityEqDealCity(Integer isBindMobileCityEqDealCity) {
        this.isBindMobileCityEqDealCity = isBindMobileCityEqDealCity;
    }

    public Integer getIsBankMobileProvEqBindMobileProv() {
        return isBankMobileProvEqBindMobileProv;
    }

    public void setIsBankMobileProvEqBindMobileProv(Integer isBankMobileProvEqBindMobileProv) {
        this.isBankMobileProvEqBindMobileProv = isBankMobileProvEqBindMobileProv;
    }

    public Integer getIsBankMobileProvEqOrderProv() {
        return isBankMobileProvEqOrderProv;
    }

    public void setIsBankMobileProvEqOrderProv(Integer isBankMobileProvEqOrderProv) {
        this.isBankMobileProvEqOrderProv = isBankMobileProvEqOrderProv;
    }

    public Integer getIsBankMobileProvEqDealProv() {
        return isBankMobileProvEqDealProv;
    }

    public void setIsBankMobileProvEqDealProv(Integer isBankMobileProvEqDealProv) {
        this.isBankMobileProvEqDealProv = isBankMobileProvEqDealProv;
    }

    public Integer getIsBindMobileProvEqOrderProv() {
        return isBindMobileProvEqOrderProv;
    }

    public void setIsBindMobileProvEqOrderProv(Integer isBindMobileProvEqOrderProv) {
        this.isBindMobileProvEqOrderProv = isBindMobileProvEqOrderProv;
    }

    public Integer getIsBindMobileProvEqDealProv() {
        return isBindMobileProvEqDealProv;
    }

    public void setIsBindMobileProvEqDealProv(Integer isBindMobileProvEqDealProv) {
        this.isBindMobileProvEqDealProv = isBindMobileProvEqDealProv;
    }

    public Integer getIsUserRegIn1D() {
        return isUserRegIn1D;
    }

    public void setIsUserRegIn1D(Integer isUserRegIn1D) {
        this.isUserRegIn1D = isUserRegIn1D;
    }

    public Integer getIsUserRegIn7D() {
        return isUserRegIn7D;
    }

    public void setIsUserRegIn7D(Integer isUserRegIn7D) {
        this.isUserRegIn7D = isUserRegIn7D;
    }

    public Integer getIsUserRegIn1M() {
        return isUserRegIn1M;
    }

    public void setIsUserRegIn1M(Integer isUserRegIn1M) {
        this.isUserRegIn1M = isUserRegIn1M;
    }

    public Integer getIsAgeBefore70() {
        return isAgeBefore70;
    }

    public void setIsAgeBefore70(Integer isAgeBefore70) {
        this.isAgeBefore70 = isAgeBefore70;
    }

    public Integer getIsAgeAfter70() {
        return isAgeAfter70;
    }

    public void setIsAgeAfter70(Integer isAgeAfter70) {
        this.isAgeAfter70 = isAgeAfter70;
    }

    public Integer getIsAgeAfter80() {
        return isAgeAfter80;
    }

    public void setIsAgeAfter80(Integer isAgeAfter80) {
        this.isAgeAfter80 = isAgeAfter80;
    }

    public Integer getIsAgeAfter90() {
        return isAgeAfter90;
    }

    public void setIsAgeAfter90(Integer isAgeAfter90) {
        this.isAgeAfter90 = isAgeAfter90;
    }

    public Integer getIsAgeAfter00() {
        return isAgeAfter00;
    }

    public void setIsAgeAfter00(Integer isAgeAfter00) {
        this.isAgeAfter00 = isAgeAfter00;
    }

    public Integer getIsSimulator() {
        return isSimulator;
    }

    public void setIsSimulator(Integer isSimulator) {
        this.isSimulator = isSimulator;
    }

    public Integer getIsUuidActManyUserids1D() {
        return isUuidActManyUserids1D;
    }

    public void setIsUuidActManyUserids1D(Integer isUuidActManyUserids1D) {
        this.isUuidActManyUserids1D = isUuidActManyUserids1D;
    }

    public Integer getIsUuidActManyUserids3D() {
        return isUuidActManyUserids3D;
    }

    public void setIsUuidActManyUserids3D(Integer isUuidActManyUserids3D) {
        this.isUuidActManyUserids3D = isUuidActManyUserids3D;
    }

    public Integer getIsImsiActManyUserids1D() {
        return isImsiActManyUserids1D;
    }

    public void setIsImsiActManyUserids1D(Integer isImsiActManyUserids1D) {
        this.isImsiActManyUserids1D = isImsiActManyUserids1D;
    }

    public Integer getIsImsiActManyUserids3D() {
        return isImsiActManyUserids3D;
    }

    public void setIsImsiActManyUserids3D(Integer isImsiActManyUserids3D) {
        this.isImsiActManyUserids3D = isImsiActManyUserids3D;
    }

    public Integer getIsIpActManyUserids1D() {
        return isIpActManyUserids1D;
    }

    public void setIsIpActManyUserids1D(Integer isIpActManyUserids1D) {
        this.isIpActManyUserids1D = isIpActManyUserids1D;
    }

    public Integer getIsIpActManyUserids3D() {
        return isIpActManyUserids3D;
    }

    public void setIsIpActManyUserids3D(Integer isIpActManyUserids3D) {
        this.isIpActManyUserids3D = isIpActManyUserids3D;
    }

    public Integer getIsUseridBatchReg() {
        return isUseridBatchReg;
    }

    public void setIsUseridBatchReg(Integer isUseridBatchReg) {
        this.isUseridBatchReg = isUseridBatchReg;
    }

    public Integer getIsDealInBlackList() {
        return isDealInBlackList;
    }

    public void setIsDealInBlackList(Integer isDealInBlackList) {
        this.isDealInBlackList = isDealInBlackList;
    }

    public Integer getIsUuidInSibshipBlackList() {
        return isUuidInSibshipBlackList;
    }

    public void setIsUuidInSibshipBlackList(Integer isUuidInSibshipBlackList) {
        this.isUuidInSibshipBlackList = isUuidInSibshipBlackList;
    }

    public Integer getIsImsiInSibshipBlackList() {
        return isImsiInSibshipBlackList;
    }

    public void setIsImsiInSibshipBlackList(Integer isImsiInSibshipBlackList) {
        this.isImsiInSibshipBlackList = isImsiInSibshipBlackList;
    }

    public Integer getIsBankcardInSibshipBlackList() {
        return isBankcardInSibshipBlackList;
    }

    public void setIsBankcardInSibshipBlackList(Integer isBankcardInSibshipBlackList) {
        this.isBankcardInSibshipBlackList = isBankcardInSibshipBlackList;
    }

    public Integer getIsUseridConsumeMoneyMT100() {
        return isUseridConsumeMoneyMT100;
    }

    public void setIsUseridConsumeMoneyMT100(Integer isUseridConsumeMoneyMT100) {
        this.isUseridConsumeMoneyMT100 = isUseridConsumeMoneyMT100;
    }

    public Integer getIsUseridConsumeMoneyMT200() {
        return isUseridConsumeMoneyMT200;
    }

    public void setIsUseridConsumeMoneyMT200(Integer isUseridConsumeMoneyMT200) {
        this.isUseridConsumeMoneyMT200 = isUseridConsumeMoneyMT200;
    }

    public Integer getIsUseridConsumeMoneyMT300() {
        return isUseridConsumeMoneyMT300;
    }

    public void setIsUseridConsumeMoneyMT300(Integer isUseridConsumeMoneyMT300) {
        this.isUseridConsumeMoneyMT300 = isUseridConsumeMoneyMT300;
    }

    public Integer getIsUseridConsumeMoneyMT500() {
        return isUseridConsumeMoneyMT500;
    }

    public void setIsUseridConsumeMoneyMT500(Integer isUseridConsumeMoneyMT500) {
        this.isUseridConsumeMoneyMT500 = isUseridConsumeMoneyMT500;
    }

    public Integer getIsUseridConsumeMoneyMT800() {
        return isUseridConsumeMoneyMT800;
    }

    public void setIsUseridConsumeMoneyMT800(Integer isUseridConsumeMoneyMT800) {
        this.isUseridConsumeMoneyMT800 = isUseridConsumeMoneyMT800;
    }

    public Integer getIsUuidConsumeMoneyMT100() {
        return isUuidConsumeMoneyMT100;
    }

    public void setIsUuidConsumeMoneyMT100(Integer isUuidConsumeMoneyMT100) {
        this.isUuidConsumeMoneyMT100 = isUuidConsumeMoneyMT100;
    }

    public Integer getIsUuidConsumeMoneyMT200() {
        return isUuidConsumeMoneyMT200;
    }

    public void setIsUuidConsumeMoneyMT200(Integer isUuidConsumeMoneyMT200) {
        this.isUuidConsumeMoneyMT200 = isUuidConsumeMoneyMT200;
    }

    public Integer getIsUuidConsumeMoneyMT300() {
        return isUuidConsumeMoneyMT300;
    }

    public void setIsUuidConsumeMoneyMT300(Integer isUuidConsumeMoneyMT300) {
        this.isUuidConsumeMoneyMT300 = isUuidConsumeMoneyMT300;
    }

    public Integer getIsUuidConsumeMoneyMT500() {
        return isUuidConsumeMoneyMT500;
    }

    public void setIsUuidConsumeMoneyMT500(Integer isUuidConsumeMoneyMT500) {
        this.isUuidConsumeMoneyMT500 = isUuidConsumeMoneyMT500;
    }

    public Integer getIsUuidConsumeMoneyMT800() {
        return isUuidConsumeMoneyMT800;
    }

    public void setIsUuidConsumeMoneyMT800(Integer isUuidConsumeMoneyMT800) {
        this.isUuidConsumeMoneyMT800 = isUuidConsumeMoneyMT800;
    }

    public Integer getIsImsiConsumeMoneyMT100() {
        return isImsiConsumeMoneyMT100;
    }

    public void setIsImsiConsumeMoneyMT100(Integer isImsiConsumeMoneyMT100) {
        this.isImsiConsumeMoneyMT100 = isImsiConsumeMoneyMT100;
    }

    public Integer getIsImsiConsumeMoneyMT200() {
        return isImsiConsumeMoneyMT200;
    }

    public void setIsImsiConsumeMoneyMT200(Integer isImsiConsumeMoneyMT200) {
        this.isImsiConsumeMoneyMT200 = isImsiConsumeMoneyMT200;
    }

    public Integer getIsImsiConsumeMoneyMT300() {
        return isImsiConsumeMoneyMT300;
    }

    public void setIsImsiConsumeMoneyMT300(Integer isImsiConsumeMoneyMT300) {
        this.isImsiConsumeMoneyMT300 = isImsiConsumeMoneyMT300;
    }

    public Integer getIsImsiConsumeMoneyMT500() {
        return isImsiConsumeMoneyMT500;
    }

    public void setIsImsiConsumeMoneyMT500(Integer isImsiConsumeMoneyMT500) {
        this.isImsiConsumeMoneyMT500 = isImsiConsumeMoneyMT500;
    }

    public Integer getIsImsiConsumeMoneyMT800() {
        return isImsiConsumeMoneyMT800;
    }

    public void setIsImsiConsumeMoneyMT800(Integer isImsiConsumeMoneyMT800) {
        this.isImsiConsumeMoneyMT800 = isImsiConsumeMoneyMT800;
    }

    public Integer getIsBankcardConsumeMoneyMT100() {
        return isBankcardConsumeMoneyMT100;
    }

    public void setIsBankcardConsumeMoneyMT100(Integer isBankcardConsumeMoneyMT100) {
        this.isBankcardConsumeMoneyMT100 = isBankcardConsumeMoneyMT100;
    }

    public Integer getIsBankcardConsumeMoneyMT200() {
        return isBankcardConsumeMoneyMT200;
    }

    public void setIsBankcardConsumeMoneyMT200(Integer isBankcardConsumeMoneyMT200) {
        this.isBankcardConsumeMoneyMT200 = isBankcardConsumeMoneyMT200;
    }

    public Integer getIsBankcardConsumeMoneyMT300() {
        return isBankcardConsumeMoneyMT300;
    }

    public void setIsBankcardConsumeMoneyMT300(Integer isBankcardConsumeMoneyMT300) {
        this.isBankcardConsumeMoneyMT300 = isBankcardConsumeMoneyMT300;
    }

    public Integer getIsBankcardConsumeMoneyMT500() {
        return isBankcardConsumeMoneyMT500;
    }

    public void setIsBankcardConsumeMoneyMT500(Integer isBankcardConsumeMoneyMT500) {
        this.isBankcardConsumeMoneyMT500 = isBankcardConsumeMoneyMT500;
    }

    public Integer getIsBankcardConsumeMoneyMT800() {
        return isBankcardConsumeMoneyMT800;
    }

    public void setIsBankcardConsumeMoneyMT800(Integer isBankcardConsumeMoneyMT800) {
        this.isBankcardConsumeMoneyMT800 = isBankcardConsumeMoneyMT800;
    }

    public Integer getIsUseridConsumeTimesMT2() {
        return isUseridConsumeTimesMT2;
    }

    public void setIsUseridConsumeTimesMT2(Integer isUseridConsumeTimesMT2) {
        this.isUseridConsumeTimesMT2 = isUseridConsumeTimesMT2;
    }

    public Integer getIsUseridConsumeTimesMT3() {
        return isUseridConsumeTimesMT3;
    }

    public void setIsUseridConsumeTimesMT3(Integer isUseridConsumeTimesMT3) {
        this.isUseridConsumeTimesMT3 = isUseridConsumeTimesMT3;
    }

    public Integer getIsUseridConsumeTimesMT4() {
        return isUseridConsumeTimesMT4;
    }

    public void setIsUseridConsumeTimesMT4(Integer isUseridConsumeTimesMT4) {
        this.isUseridConsumeTimesMT4 = isUseridConsumeTimesMT4;
    }

    public Integer getIsUseridConsumeTimesMT5() {
        return isUseridConsumeTimesMT5;
    }

    public void setIsUseridConsumeTimesMT5(Integer isUseridConsumeTimesMT5) {
        this.isUseridConsumeTimesMT5 = isUseridConsumeTimesMT5;
    }

    public Integer getIsUseridConsumeTimesMT8() {
        return isUseridConsumeTimesMT8;
    }

    public void setIsUseridConsumeTimesMT8(Integer isUseridConsumeTimesMT8) {
        this.isUseridConsumeTimesMT8 = isUseridConsumeTimesMT8;
    }

    public Integer getIsUuidConsumeTimesMT2() {
        return isUuidConsumeTimesMT2;
    }

    public void setIsUuidConsumeTimesMT2(Integer isUuidConsumeTimesMT2) {
        this.isUuidConsumeTimesMT2 = isUuidConsumeTimesMT2;
    }

    public Integer getIsUuidConsumeTimesMT3() {
        return isUuidConsumeTimesMT3;
    }

    public void setIsUuidConsumeTimesMT3(Integer isUuidConsumeTimesMT3) {
        this.isUuidConsumeTimesMT3 = isUuidConsumeTimesMT3;
    }

    public Integer getIsUuidConsumeTimesMT4() {
        return isUuidConsumeTimesMT4;
    }

    public void setIsUuidConsumeTimesMT4(Integer isUuidConsumeTimesMT4) {
        this.isUuidConsumeTimesMT4 = isUuidConsumeTimesMT4;
    }

    public Integer getIsUuidConsumeTimesMT5() {
        return isUuidConsumeTimesMT5;
    }

    public void setIsUuidConsumeTimesMT5(Integer isUuidConsumeTimesMT5) {
        this.isUuidConsumeTimesMT5 = isUuidConsumeTimesMT5;
    }

    public Integer getIsUuidConsumeTimesMT8() {
        return isUuidConsumeTimesMT8;
    }

    public void setIsUuidConsumeTimesMT8(Integer isUuidConsumeTimesMT8) {
        this.isUuidConsumeTimesMT8 = isUuidConsumeTimesMT8;
    }

    public Integer getIsImsiConsumeTimesMT2() {
        return isImsiConsumeTimesMT2;
    }

    public void setIsImsiConsumeTimesMT2(Integer isImsiConsumeTimesMT2) {
        this.isImsiConsumeTimesMT2 = isImsiConsumeTimesMT2;
    }

    public Integer getIsImsiConsumeTimesMT3() {
        return isImsiConsumeTimesMT3;
    }

    public void setIsImsiConsumeTimesMT3(Integer isImsiConsumeTimesMT3) {
        this.isImsiConsumeTimesMT3 = isImsiConsumeTimesMT3;
    }

    public Integer getIsImsiConsumeTimesMT4() {
        return isImsiConsumeTimesMT4;
    }

    public void setIsImsiConsumeTimesMT4(Integer isImsiConsumeTimesMT4) {
        this.isImsiConsumeTimesMT4 = isImsiConsumeTimesMT4;
    }

    public Integer getIsImsiConsumeTimesMT5() {
        return isImsiConsumeTimesMT5;
    }

    public void setIsImsiConsumeTimesMT5(Integer isImsiConsumeTimesMT5) {
        this.isImsiConsumeTimesMT5 = isImsiConsumeTimesMT5;
    }

    public Integer getIsImsiConsumeTimesMT8() {
        return isImsiConsumeTimesMT8;
    }

    public void setIsImsiConsumeTimesMT8(Integer isImsiConsumeTimesMT8) {
        this.isImsiConsumeTimesMT8 = isImsiConsumeTimesMT8;
    }

    public Integer getIsBankcardConsumeTimesMT2() {
        return isBankcardConsumeTimesMT2;
    }

    public void setIsBankcardConsumeTimesMT2(Integer isBankcardConsumeTimesMT2) {
        this.isBankcardConsumeTimesMT2 = isBankcardConsumeTimesMT2;
    }

    public Integer getIsBankcardConsumeTimesMT3() {
        return isBankcardConsumeTimesMT3;
    }

    public void setIsBankcardConsumeTimesMT3(Integer isBankcardConsumeTimesMT3) {
        this.isBankcardConsumeTimesMT3 = isBankcardConsumeTimesMT3;
    }

    public Integer getIsBankcardConsumeTimesMT4() {
        return isBankcardConsumeTimesMT4;
    }

    public void setIsBankcardConsumeTimesMT4(Integer isBankcardConsumeTimesMT4) {
        this.isBankcardConsumeTimesMT4 = isBankcardConsumeTimesMT4;
    }

    public Integer getIsBankcardConsumeTimesMT5() {
        return isBankcardConsumeTimesMT5;
    }

    public void setIsBankcardConsumeTimesMT5(Integer isBankcardConsumeTimesMT5) {
        this.isBankcardConsumeTimesMT5 = isBankcardConsumeTimesMT5;
    }

    public Integer getIsBankcardConsumeTimesMT8() {
        return isBankcardConsumeTimesMT8;
    }

    public void setIsBankcardConsumeTimesMT8(Integer isBankcardConsumeTimesMT8) {
        this.isBankcardConsumeTimesMT8 = isBankcardConsumeTimesMT8;
    }

    public Integer getIsVerifyLT3min() {
        return isVerifyLT3min;
    }

    public void setIsVerifyLT3min(Integer isVerifyLT3min) {
        this.isVerifyLT3min = isVerifyLT3min;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("QuickSignPayFactor [timeStamp=").append(timeStamp).append(", userid=").append(userid)
                .append(", requestId=").append(requestId).append(", action=").append(action).append(", partner=")
                .append(partner).append(", platform=").append(platform).append(", isBankCardBinded1D=")
                .append(isBankCardBinded1D).append(", isBankCardBinded3D=").append(isBankCardBinded3D)
                .append(", isBankCardBinded7D=").append(isBankCardBinded7D).append(", isUserBinded1D=")
                .append(isUserBinded1D).append(", isUserBinded3D=").append(isUserBinded3D).append(", isUserBinded7D=")
                .append(isUserBinded7D).append(", bankCardBindedUseridsCnt1D=").append(bankCardBindedUseridsCnt1D)
                .append(", bankCardBindedUseridsCnt7D=").append(bankCardBindedUseridsCnt7D)
                .append(", bankCardBindedUseridsCnt1M=").append(bankCardBindedUseridsCnt1M)
                .append(", userBindedCardsCnt1D=").append(userBindedCardsCnt1D).append(", userBindedCardsCnt7D=")
                .append(userBindedCardsCnt7D).append(", userBindedCardsCnt1M=").append(userBindedCardsCnt1M)
                .append(", uuidBindedCardsCnt1D=").append(uuidBindedCardsCnt1D).append(", uuidBindedCardsCnt7D=")
                .append(uuidBindedCardsCnt7D).append(", uuidBindedCardsCnt1M=").append(uuidBindedCardsCnt1M)
                .append(", imsiBindedCardsCnt1D=").append(imsiBindedCardsCnt1D).append(", imsiBindedCardsCnt7D=")
                .append(imsiBindedCardsCnt7D).append(", imsiBindedCardsCnt1M=").append(imsiBindedCardsCnt1M)
                .append(", isBankMobileCityEqBindMobileCity=").append(isBankMobileCityEqBindMobileCity)
                .append(", isBankMobileCityEqOrderCity=").append(isBankMobileCityEqOrderCity)
                .append(", isBankMobileCityEqDealCity=").append(isBankMobileCityEqDealCity)
                .append(", isBindMobileCityEqOrderCity=").append(isBindMobileCityEqOrderCity)
                .append(", isBindMobileCityEqDealCity=").append(isBindMobileCityEqDealCity)
                .append(", isBankMobileProvEqBindMobileProv=").append(isBankMobileProvEqBindMobileProv)
                .append(", isBankMobileProvEqOrderProv=").append(isBankMobileProvEqOrderProv)
                .append(", isBankMobileProvEqDealProv=").append(isBankMobileProvEqDealProv)
                .append(", isBindMobileProvEqOrderProv=").append(isBindMobileProvEqOrderProv)
                .append(", isBindMobileProvEqDealProv=").append(isBindMobileProvEqDealProv).append(", isUserRegIn1D=")
                .append(isUserRegIn1D).append(", isUserRegIn7D=").append(isUserRegIn7D).append(", isUserRegIn1M=")
                .append(isUserRegIn1M).append(", isAgeBefore70=").append(isAgeBefore70).append(", isAgeAfter70=")
                .append(isAgeAfter70).append(", isAgeAfter80=").append(isAgeAfter80).append(", isAgeAfter90=")
                .append(isAgeAfter90).append(", isAgeAfter00=").append(isAgeAfter00).append(", isSimulator=")
                .append(isSimulator).append(", isUuidActManyUserids1D=").append(isUuidActManyUserids1D)
                .append(", isUuidActManyUserids3D=").append(isUuidActManyUserids3D).append(", isImsiActManyUserids1D=")
                .append(isImsiActManyUserids1D).append(", isImsiActManyUserids3D=").append(isImsiActManyUserids3D)
                .append(", isIpActManyUserids1D=").append(isIpActManyUserids1D).append(", isIpActManyUserids3D=")
                .append(isIpActManyUserids3D).append(", isUseridBatchReg=").append(isUseridBatchReg)
                .append(", isDealInBlackList=").append(isDealInBlackList).append(", isUuidInSibshipBlackList=")
                .append(isUuidInSibshipBlackList).append(", isImsiInSibshipBlackList=")
                .append(isImsiInSibshipBlackList).append(", isBankcardInSibshipBlackList=")
                .append(isBankcardInSibshipBlackList).append(", isUseridConsumeMoneyMT100=")
                .append(isUseridConsumeMoneyMT100).append(", isUseridConsumeMoneyMT200=")
                .append(isUseridConsumeMoneyMT200).append(", isUseridConsumeMoneyMT300=")
                .append(isUseridConsumeMoneyMT300).append(", isUseridConsumeMoneyMT500=")
                .append(isUseridConsumeMoneyMT500).append(", isUseridConsumeMoneyMT800=")
                .append(isUseridConsumeMoneyMT800).append(", isUuidConsumeMoneyMT100=").append(isUuidConsumeMoneyMT100)
                .append(", isUuidConsumeMoneyMT200=").append(isUuidConsumeMoneyMT200)
                .append(", isUuidConsumeMoneyMT300=").append(isUuidConsumeMoneyMT300)
                .append(", isUuidConsumeMoneyMT500=").append(isUuidConsumeMoneyMT500)
                .append(", isUuidConsumeMoneyMT800=").append(isUuidConsumeMoneyMT800)
                .append(", isImsiConsumeMoneyMT100=").append(isImsiConsumeMoneyMT100)
                .append(", isImsiConsumeMoneyMT200=").append(isImsiConsumeMoneyMT200)
                .append(", isImsiConsumeMoneyMT300=").append(isImsiConsumeMoneyMT300)
                .append(", isImsiConsumeMoneyMT500=").append(isImsiConsumeMoneyMT500)
                .append(", isImsiConsumeMoneyMT800=").append(isImsiConsumeMoneyMT800)
                .append(", isBankcardConsumeMoneyMT100=").append(isBankcardConsumeMoneyMT100)
                .append(", isBankcardConsumeMoneyMT200=").append(isBankcardConsumeMoneyMT200)
                .append(", isBankcardConsumeMoneyMT300=").append(isBankcardConsumeMoneyMT300)
                .append(", isBankcardConsumeMoneyMT500=").append(isBankcardConsumeMoneyMT500)
                .append(", isBankcardConsumeMoneyMT800=").append(isBankcardConsumeMoneyMT800)
                .append(", isUseridConsumeTimesMT2=").append(isUseridConsumeTimesMT2)
                .append(", isUseridConsumeTimesMT3=").append(isUseridConsumeTimesMT3)
                .append(", isUseridConsumeTimesMT4=").append(isUseridConsumeTimesMT4)
                .append(", isUseridConsumeTimesMT5=").append(isUseridConsumeTimesMT5)
                .append(", isUseridConsumeTimesMT8=").append(isUseridConsumeTimesMT8)
                .append(", isUuidConsumeTimesMT2=").append(isUuidConsumeTimesMT2).append(", isUuidConsumeTimesMT3=")
                .append(isUuidConsumeTimesMT3).append(", isUuidConsumeTimesMT4=").append(isUuidConsumeTimesMT4)
                .append(", isUuidConsumeTimesMT5=").append(isUuidConsumeTimesMT5).append(", isUuidConsumeTimesMT8=")
                .append(isUuidConsumeTimesMT8).append(", isImsiConsumeTimesMT2=").append(isImsiConsumeTimesMT2)
                .append(", isImsiConsumeTimesMT3=").append(isImsiConsumeTimesMT3).append(", isImsiConsumeTimesMT4=")
                .append(isImsiConsumeTimesMT4).append(", isImsiConsumeTimesMT5=").append(isImsiConsumeTimesMT5)
                .append(", isImsiConsumeTimesMT8=").append(isImsiConsumeTimesMT8)
                .append(", isBankcardConsumeTimesMT2=").append(isBankcardConsumeTimesMT2)
                .append(", isBankcardConsumeTimesMT3=").append(isBankcardConsumeTimesMT3)
                .append(", isBankcardConsumeTimesMT4=").append(isBankcardConsumeTimesMT4)
                .append(", isBankcardConsumeTimesMT5=").append(isBankcardConsumeTimesMT5)
                .append(", isBankcardConsumeTimesMT8=").append(isBankcardConsumeTimesMT8).append(", isVerifyLT3min=")
                .append(isVerifyLT3min).append("]");
        return builder.toString();
    }
    
}
