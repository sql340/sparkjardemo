package com.meituan.stolencard.stolencard.commonconst;


public enum RiskActionConst {
    // ----动作类型
    /** 动作类型：邮箱注册 */
    ACTION_TYPE_EMAIL_SIGNUP(1, "emailreg", "邮箱注册"),
    /** 动作类型：手机注册 */
    ACTION_TYPE_MOBILE_SIGNUP(2, "mobilereg", "手机注册"),
    /** 动作类型：邮箱注册激活 */
    ACTION_TYPE_VERIFY_EMAIL(3, "", "邮箱注册验证"),
    /** 动作类型：普通登录（普通登录全部接入后改为70） */
    ACTION_TYPE_LOGIN(4, "login", "普通登录"),
    /** 动作类型：手机动态登录 */
    ACTION_TYPE_MOBILE_LOGIN(5, "mobilelogin", "手机动态登录"),
    /** 动作类型：绑定 */
    ACTION_TYPE_BIND(6, "setbindmobile", "绑定手机"),
    /** 动作类型：换绑 */
    ACTION_TYPE_REBIND(7, "rebindmobile", "换绑手机"),
    /** 动作类型：返回值统一支付 */
    ACTION_TYPE_NEWPAY(8, "newpay", "返回值统一支付"),
    /** 动作类型：支付 */
    ACTION_TYPE_PAY(8, "pay", "支付"),
    /** 动作类型：充值 */
    ACTION_TYPE_RECHARGE(9, "recharge", "充值"),
    /** 动作类型：退款 */
    ACTION_TYPE_REFUND(10, "", "退款"),
    /** 动作类型：修改密码 */
    ACTION_TYPE_MODIFY_PASSWORD(11, "modifypassword", "修改密码"),
    /** 动作类型：找回密码 */
    ACTION_TYPE_FIND_PASSWORD(12, "findpassword", "找回密码"),
    /** 动作类型：修改物流地址 */
    ACTION_TYPE_MODIFY_ADDRESS(13, "", "修改物流地址"),
    /** 动作类型：评价 */
    ACTION_TYPE_EVALUATE(14, "evaluate", "评价"),
    /** 动作类型：积分兑换 */
    ACTION_TYPE_REDEEM(15, "", "积分兑换"),
    /** 动作类型：代金券使用 */
    ACTION_TYPE_USE_MAGICCARD(16, "", "使用代金券"),
    /** 动作类型：充值卡使用 */
    ACTION_TYPE_USE_GIFTCARD(17, "", "使用充值卡"),
    /** 动作类型：解锁 */
    ACTION_TYPE_UNLOCK(18, "unlock", "解锁"),
    /** 动作类型：设置支付密码 */
    ACTION_TYPE_SET_PAY_PASSWORD(19, "setpaypassword", "设置支付密码"),
    /** 动作类型：修改支付密码 */
    ACTION_TYPE_MODIFY_PAY_PASSWORD(20, "modifypaypassword", "修改支付密码"),
    /** 动作类型：找回支付密码 */
    ACTION_TYPE_FIND_PAY_PASSWORD(21, "findpaypassword", "找回支付密码"),
    /** 动作类型：快捷签约 */
    ACTION_TYPE_QUICK_SIGN(22, "quicksign", "快捷签约"),
    /** 动作类型：添加提现银行卡 */
    ACTION_TYPE_ADD_WITHDRAW_BANKCARD(23, "", "添加提现银行卡"),
    /** 动作类型：设置安保问题 */
    ACTION_TYPE_ADD_SECURE_ANSWER(26, "", "设置安保问题"),
    /** 动作类型：修改安保问题 */
    ACTION_TYPE_MODIFY_SECURE_ANSWER(27, "modifysecurequestion", "修改安保问题"),
    /** 动作类型：积分抵现金 */
    ACTION_TYPE_POINT_MONEY(28, "", "积分抵现金" ),
    /** 动作类型：注册成功 */
    ACTION_TYPE_SIGNUP_SUCCESS(29, "", "注册成功" ),
    /** 动作类型：支付成功 */
    ACTION_TYPE_PAY_SUCCESS(30, "","支付成功"),
    /** 动作类型：同账号登录 */
    ACTION_TYPE_APP_SAME_ACCOUNT_LOGIN(31, "", "同账号登录" ),
    /** 动作类型：快捷签约二次支付 */
    ACTION_TYPE_QUICK_SIGN_PAY(32, "quicksignpay", "快捷签约二次支付"),
    /** 动作类型：快捷未签约支付 */
    ACTION_TYPE_QUICK_UNSIGN_PAY(33, "quickunsignpay", "快捷未签约支付"),
    /** 动作类型：快捷支付绑卡成功 */
    ACTION_TYPE_QUICKPAY_BINDCARD_SUCCESS(34, "", "快捷支付绑卡成功 "),
    /** 动作类型：支付成功（支付平台） */
    ACTION_TYPE_PAY_SUCCESS_FROM_PAYCENTER(35, "paysuccessfrompaycenter", "支付成功(支付平台)"),
    /** 动作类型：登录成功 */
    ACTION_TYPE_LOGIN_SUCCESS(36, "", "登录成功" ),
    /** 动作类型：登录失败 */
    ACTION_TYPE_LOGIN_FAIL(37, "", "登录失败" ),
    /** 动作类型：UUID注册 */
    ACTION_TYPE_UUID_REGISTER(38, "", "UUID注册" ),
    /** 动作类型：UUID更新 */
    ACTION_TYPE_UUID_UPDATE(39, "", "UUID更新" ),
    /** 动作类型：短信发送 */
    ACTION_TYPE_SEND_SMS(45, "", "短信发送" ),
    /** 动作类型：邮箱换绑 */
    ACTION_TYPE_EMAIL_REBIND(49, "rebindemail", "换绑邮箱" ),
    /** 动作类型：快捷签约成功 */
    ACTION_TYPE_QUICK_SIGN_SUCCESS(55, "", "快捷签约成功" ),
    /** 动作类型：用户退款 */
    ACTION_TYPE_USER_REFUND(56, "userrefund", "用户退款" ),
    /** 动作类型：用户退款成功 */
    ACTION_TYPE_USER_REFUND_SUCCESS(57, "", "用户退款成功" ),
    /** 动作类型 获取详情 */
    ACTION_TYPE_GET_BUY_INFO(59, "", "获取详情页"),
    /** 动作类型 手机邮箱注册 */
    ACTION_TYPE_MOBILE_AND_EMAIL_SIGNUP(68, "", "手机邮箱注册" ),
    /** 动作类型 注册 */
    ACTION_TYPE_SIGNUP(69, "signup", "注册" ),
    ;

    private int action;
    private String name;
    private String desc;

    private RiskActionConst(int action, String name, String desc) {
        this.action = action;
        this.name = name;
        this.desc = desc;
    }

    public int getAction() {
        return action;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public static int getActionByEventName(String name) {
        for (RiskActionConst eventAction : RiskActionConst.values()) {
            if (eventAction.getName().equals(name)) {
                return eventAction.getAction();
            }
        }
        return 0;
    }

    public static RiskActionConst getEventConstantByAction(int action) {
        for (RiskActionConst eventAction : RiskActionConst.values()) {
            if (eventAction.getAction() == action) {
                return eventAction;
            }
        }
        return null;
    }

}
