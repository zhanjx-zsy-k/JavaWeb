package com.atguigu.utils;

import com.atguigu.pojo.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author k
 * @create 2021-06-04 0:04
 */
public class WebUtils {
    public static <T>T copyParamToBean(Map value, T bean) {
        try {
            System.out.println("注入前:"+bean);
            BeanUtils.populate(bean,value);
            System.out.println("注入后:"+bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    public static int parseInt(String strInt,int defaultValue){
        try {
            return Integer.parseInt(strInt);
        } catch (Exception e) {
//            e.printStackTrace();
        }
        return defaultValue;
    }

}
