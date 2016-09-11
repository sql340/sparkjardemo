package com.meituan.stolencard.stolencard.util;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.meituan.rc.risk.util.Str;

public class JavaUtil {

    public boolean isStringDigit(String targetStr) {
        if (StringUtils.isEmpty(targetStr)) {
            return false;
        }

        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(targetStr);

        return isNum.matches();
    }

    public static int getBirthYear(String bankcardIdentifyNo) {
        if (StringUtils.isEmpty(bankcardIdentifyNo)) {
            return 2016;
        }

        String agePattenStr = bankcardIdentifyNo.substring(6, 10);
        if (StringUtils.isEmpty(agePattenStr)) {
            return 2016;
        }
        
        String ageString = null;
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(agePattenStr);

        if (isNum.matches()) {
            if (bankcardIdentifyNo.substring(6, 8).equals("19") || bankcardIdentifyNo.substring(6, 8).equals("20")) {
                ageString = bankcardIdentifyNo.substring(6, 10);
            } else {
                ageString = bankcardIdentifyNo.substring(6, 8);
                ageString = "19" + ageString; // 15位身份证号出生年份前面需要增加19
            }
            
            return objectToIntZeroIfNullOrNotNum(ageString);
        } else {
            return 2016;
        }
    }

    public static Long objectToLongZeroIfNullOrNotNum(Object params) {
        if (params != null && Str.isNonnegativeInt(params.toString())) {
            return Long.valueOf(params.toString());
        }
        return 0l;
    }

    public static Integer objectToIntZeroIfNullOrNotNum(Object params) {
        if (params != null && Str.isNonnegativeInt(params.toString())) {
            return Integer.valueOf(params.toString());
        }
        return 0;
    }

    public static Float objectToFloatZeroIfNullOrEmptyStr(Object params) {
        if (params != null && !params.toString().equals("")) {
            return Float.valueOf(params.toString());
        }
        return 0f;
    }

    public static String objectToString(Object params) {
        if (params != null) {
            return params.toString();
        }
        return "";
    }

    public static String mapValueToString(Map<String, Object> map, String key) {
        if (map == null || map.get(key) == null) {
            return "";
        }
        return map.get(key).toString();
    }
}
