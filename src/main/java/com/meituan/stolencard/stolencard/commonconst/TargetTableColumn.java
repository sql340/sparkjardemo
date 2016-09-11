package com.meituan.stolencard.stolencard.commonconst;

public enum TargetTableColumn {
    COLUMN_USERID(1, "userid","用户id"),
    COLUMN_IP(2, "uuid","用户uuid"),
    COLUMN_UUID(3, "ip","用户uuid"),
    COLUMN_BANKCARD(4, "bankcard","绑定银行卡"),
    COLUMN_BANKMOBILE(5, "bankmobile","绑卡手机"),
    COLUMN_BINDMOBILE(6, "bindmobile","绑定手机"),
    COLUMN_REGIP(7, "regip","注册ip"),
    COLUMN_REGUUID(8, "reguuid","注册uuid"),
    
    COLUMN_ORDERCITY(9, "ordercity","订单城"),
    COLUMN_ORDERPROVINCE(10, "orderprovince","订单省"),
    COLUMN_IPCITY(11, "ipcity","ip城"),
    COLUMN_IPPROVINCE(12, "ipprovince","ip省"),
    
    COLUMN_BINDMOBILECITY(13, "bindmobilecity","绑定手机城"),
    COLUMN_BINDMOBILEPROVINCE(14, "bindmobileprovince","绑定手机省"),
    COLUMN_BANKMOBILECITY(15, "bankmobilecity","绑卡手机城"),
    COLUMN_BANKMOBILEPROVINCE(16, "bankmobileprovince","绑卡手机省"),
    
    COLUMN_BINDMOBILETIME(17, "bindmobiletime","绑定手机时间"),
    COLUMN_BINDCARDTIME(18, "bindcardtime","绑卡时间"),
    COLUMN_REGTIME(19, "regtime","注册时间"),
    COLUMN_REGPLATFORM(20, "regplatform","注册平台"),
    
    COLUMN_IS_LOGIN_MANY_PLATFORMS(25, "isloginplatforms1d","24小时内是否多平台登录"),
    COLUMN_IS_UUID_LOGIN_MANY_USERIDS(26, "isuuidloginuserids1d","uuid24小时内是否登录多个userid"),
    COLUMN_IS_USERID_LOGIN_MANY_CITIES(26, "isuseridlogincities","userid24小时内是否登录多个城市"),
    COLUMN_IS_USERID_LOGIN_MANY_PROVINICES(26, "isuseridloginprovinces","userid24小时内是否登录多个省"),
    COLUMN_IS_USERID_LOGIN_MANY_UUIDS(26, "isuseridloginuuids1d","userid24小时内是否在多个设备上登录"),
    
    
    ;

    private Integer columnId;
    private String columnName;
    private String desc;

    private TargetTableColumn(Integer columnId, String columnName, String desc) {
        this.columnId = columnId;
        this.columnName = columnName;
        this.desc = desc;
    }

    
    public Integer getColumnId() {
        return columnId;
    }

    public String getColumnName() {
        return columnName;
    }

    public String getDesc() {
        return desc;
    }

    public static Integer getColumnIdByColumnName(String columnName) {
        for (TargetTableColumn tableColumn : TargetTableColumn.values()) {
            if (tableColumn.getColumnName().equals(columnName)) {
                return tableColumn.getColumnId();
            }
        }
        return 0;
    }

    public static String getColumnNameByColumnId(Integer columnId) {
        for (TargetTableColumn tableColumn : TargetTableColumn.values()) {
            if (tableColumn.getColumnId().equals(columnId)) {
                return tableColumn.getColumnName();
            }
        }
        return "";
    }
}
