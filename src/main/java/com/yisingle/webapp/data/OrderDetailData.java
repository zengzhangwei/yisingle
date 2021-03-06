package com.yisingle.webapp.data;

import com.yisingle.webapp.entity.DriverEntity;
import com.yisingle.webapp.entity.OrderEntity;
import com.yisingle.webapp.entity.UserEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by jikun on 17/7/13.
 */
public class OrderDetailData implements Serializable {


    private int id;


    private String phoneNum;


    private String startLatitude;


    private String startLongitude;


    private String endLatitude;


    private String endLongitude;


    private String startPlaceName;


    private String endPlaceName;


    //订单创建时间
    private long createTime;


    //司机端收到回复时间
    private long driverRelyTime;


    private int orderState;

    //乘客司机是否收到改变
    private int passengerRelyState;


    private BigDecimal orderPrice;

    //花费的总时间
    private long costTime;


    private DriverEntity driver;

    private UserEntity user;


    public OrderDetailData() {
        super();
    }

    public OrderDetailData(OrderEntity entity) {
        this.id = entity.getId();
        this.phoneNum = entity.getPhoneNum();
        this.startLatitude = entity.getStartLatitude();
        this.startLongitude = entity.getStartLongitude();
        this.endLatitude = entity.getEndLatitude();
        this.endLongitude = entity.getEndLongitude();
        this.startPlaceName = entity.getStartPlaceName();
        this.endPlaceName = entity.getEndPlaceName();
        this.orderState = entity.getOrderState();
        this.createTime = entity.getCreateTime();
        this.driverRelyTime = entity.getDriverRelyTime();
        this.costTime = entity.getCostTime();
        this.orderPrice = entity.getOrderPrice();
        this.passengerRelyState = entity.getPassengerRelyState();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(String startLatitude) {
        this.startLatitude = startLatitude;
    }

    public String getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(String startLongitude) {
        this.startLongitude = startLongitude;
    }

    public String getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(String endLatitude) {
        this.endLatitude = endLatitude;
    }

    public String getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(String endLongitude) {
        this.endLongitude = endLongitude;
    }

    public String getStartPlaceName() {
        return startPlaceName;
    }

    public void setStartPlaceName(String startPlaceName) {
        this.startPlaceName = startPlaceName;
    }

    public String getEndPlaceName() {
        return endPlaceName;
    }

    public void setEndPlaceName(String endPlaceName) {
        this.endPlaceName = endPlaceName;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public DriverEntity getDriver() {
        return driver;
    }

    public void setDriver(DriverEntity driver) {
        this.driver = driver;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }


    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getDriverRelyTime() {
        return driverRelyTime;
    }

    public void setDriverRelyTime(long driverRelyTime) {
        this.driverRelyTime = driverRelyTime;
    }

    public long getCostTime() {
        return costTime;
    }

    public void setCostTime(long costTime) {
        this.costTime = costTime;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }


    public int getPassengerRelyState() {
        return passengerRelyState;
    }

    public void setPassengerRelyState(int passengerRelyState) {
        this.passengerRelyState = passengerRelyState;
    }
}
