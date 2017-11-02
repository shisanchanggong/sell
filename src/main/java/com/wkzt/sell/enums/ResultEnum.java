package com.wkzt.sell.enums;

import lombok.Data;
import lombok.Getter;

/**
 * @Author hanchao
 * @Data 2017/10/31 14:24
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1,"参数不正确"),

    PRODUCT_NOT_EXIST(10,"商品不存在"),
    product_stock_error(11,"商品库存出错"),

    ORDER_NOT_EXIST(12,"订单不存在"),

    ORDERDETAIL_NOT_EXIST(13,"订单详情不存在"),

    ORDER_STA_ERROR(14,"订单状态不正确"),

    ORDER_UPDATE_FAIL(15,"订单更新失败"),

    ORDER_DETAIL_EMPTY(16,"订单详情为空"),
    ORDER_PAY_STATUS_ERROR(17,"订单支付状态不正确"),
    CART_EMPTY(18,"购物车"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }




}