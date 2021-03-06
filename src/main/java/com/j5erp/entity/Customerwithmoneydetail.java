package com.j5erp.entity;

import java.util.Date;

public class Customerwithmoneydetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CUSTOMERWITHMONEYDETAIL.BILLNO
     *
     * @mbggenerated
     */
    private String billno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CUSTOMERWITHMONEYDETAIL.BILLTYPEID
     *
     * @mbggenerated
     */
    private Integer billtypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CUSTOMERWITHMONEYDETAIL.DATEANDTIME
     *
     * @mbggenerated
     */
    private Date dateandtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CUSTOMERWITHMONEYDETAIL.CUSID
     *
     * @mbggenerated
     */
    private String cusid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CUSTOMERWITHMONEYDETAIL.SOURCEMONEY
     *
     * @mbggenerated
     */
    private Double sourcemoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CUSTOMERWITHMONEYDETAIL.LEFTGETMONEY
     *
     * @mbggenerated
     */
    private Double leftgetmoney;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMERWITHMONEYDETAIL
     *
     * @mbggenerated
     */
    public Customerwithmoneydetail(String billno, Integer billtypeid, Date dateandtime, String cusid, Double sourcemoney, Double leftgetmoney) {
        this.billno = billno;
        this.billtypeid = billtypeid;
        this.dateandtime = dateandtime;
        this.cusid = cusid;
        this.sourcemoney = sourcemoney;
        this.leftgetmoney = leftgetmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMERWITHMONEYDETAIL
     *
     * @mbggenerated
     */
    public Customerwithmoneydetail() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CUSTOMERWITHMONEYDETAIL.BILLNO
     *
     * @return the value of CUSTOMERWITHMONEYDETAIL.BILLNO
     *
     * @mbggenerated
     */
    public String getBillno() {
        return billno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CUSTOMERWITHMONEYDETAIL.BILLNO
     *
     * @param billno the value for CUSTOMERWITHMONEYDETAIL.BILLNO
     *
     * @mbggenerated
     */
    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CUSTOMERWITHMONEYDETAIL.BILLTYPEID
     *
     * @return the value of CUSTOMERWITHMONEYDETAIL.BILLTYPEID
     *
     * @mbggenerated
     */
    public Integer getBilltypeid() {
        return billtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CUSTOMERWITHMONEYDETAIL.BILLTYPEID
     *
     * @param billtypeid the value for CUSTOMERWITHMONEYDETAIL.BILLTYPEID
     *
     * @mbggenerated
     */
    public void setBilltypeid(Integer billtypeid) {
        this.billtypeid = billtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CUSTOMERWITHMONEYDETAIL.DATEANDTIME
     *
     * @return the value of CUSTOMERWITHMONEYDETAIL.DATEANDTIME
     *
     * @mbggenerated
     */
    public Date getDateandtime() {
        return dateandtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CUSTOMERWITHMONEYDETAIL.DATEANDTIME
     *
     * @param dateandtime the value for CUSTOMERWITHMONEYDETAIL.DATEANDTIME
     *
     * @mbggenerated
     */
    public void setDateandtime(Date dateandtime) {
        this.dateandtime = dateandtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CUSTOMERWITHMONEYDETAIL.CUSID
     *
     * @return the value of CUSTOMERWITHMONEYDETAIL.CUSID
     *
     * @mbggenerated
     */
    public String getCusid() {
        return cusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CUSTOMERWITHMONEYDETAIL.CUSID
     *
     * @param cusid the value for CUSTOMERWITHMONEYDETAIL.CUSID
     *
     * @mbggenerated
     */
    public void setCusid(String cusid) {
        this.cusid = cusid == null ? null : cusid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CUSTOMERWITHMONEYDETAIL.SOURCEMONEY
     *
     * @return the value of CUSTOMERWITHMONEYDETAIL.SOURCEMONEY
     *
     * @mbggenerated
     */
    public Double getSourcemoney() {
        return sourcemoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CUSTOMERWITHMONEYDETAIL.SOURCEMONEY
     *
     * @param sourcemoney the value for CUSTOMERWITHMONEYDETAIL.SOURCEMONEY
     *
     * @mbggenerated
     */
    public void setSourcemoney(Double sourcemoney) {
        this.sourcemoney = sourcemoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CUSTOMERWITHMONEYDETAIL.LEFTGETMONEY
     *
     * @return the value of CUSTOMERWITHMONEYDETAIL.LEFTGETMONEY
     *
     * @mbggenerated
     */
    public Double getLeftgetmoney() {
        return leftgetmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CUSTOMERWITHMONEYDETAIL.LEFTGETMONEY
     *
     * @param leftgetmoney the value for CUSTOMERWITHMONEYDETAIL.LEFTGETMONEY
     *
     * @mbggenerated
     */
    public void setLeftgetmoney(Double leftgetmoney) {
        this.leftgetmoney = leftgetmoney;
    }
}