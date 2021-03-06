package com.newbiest.commom.sm.model;

import com.newbiest.base.model.NBBase;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 事件状态关联类(触发事件状态的变更)
 * Created by guoxunbo on 2017/11/5.
 */
@Entity
@Table(name="COM_SM_EVENT_STATUS")
@Data
public class EventStatus extends NBBase {

    /**
     * 拒绝此状态变更
     */
    public static String CHECKFLAG_REJECT = "Reject";
    /**
     * 允许此状态变更
     */
    public static String CHECKFLAG_ALLOW = "Allow";

    /**
     * 表示所有的状态
     */
    public static String ALL_FLAG = "*";

    @Column(name="EVENT_RRN")
    private Long eventRrn;

    @Column(name="CHECK_FLAG")
    private String checkFlag;

    /**
     * 源状态大类
     */
    @Column(name="SOURCE_STATUS_CATEGORY")
    private String sourceStatusCategory;

    /**
     * 源状态
     */
    @Column(name="SOURCE_STATE")
    private String sourceState;

    /**
     * 源状态小类
     */
    @Column(name="SOURCE_SUB_STATE")
    private String sourceSubState;

    /**
     * 目标状态大类
     */
    @Column(name="TARGET_STATUS_CATEGORY")
    private String targetStatusCategory;

    /**
     * 目标状态
     */
    @Column(name="TARGET_STATE")
    private String targetState;

    /**
     * 目标状态小类
     */
    @Column(name="TARGET_SUB_STATE")
    private String targetSubState;

}
