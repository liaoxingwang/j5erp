package com.j5erp.entity;

import java.util.Date;

public class SalesReturn {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALES_RETURN.REJECTEDID
     *
     * @mbggenerated
     */
    private String rejectedid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALES_RETURN.CLIENTID
     *
     * @mbggenerated
     */
    private String clientid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALES_RETURN.REJECTEDDATE
     *
     * @mbggenerated
     */
    private Date rejecteddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALES_RETURN.ADDRESS
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALES_RETURN.TAX
     *
     * @mbggenerated
     */
    private Short tax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALES_RETURN.REPOSITORY
     *
     * @mbggenerated
     */
    private Short repository;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALES_RETURN.CURRENCY
     *
     * @mbggenerated
     */
    private String currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALES_RETURN.WAREHOUSEID
     *
     * @mbggenerated
     */
    private String warehouseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALES_RETURN.STAFFID
     *
     * @mbggenerated
     */
    private String staffid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALES_RETURN.DEPARTMENTID
     *
     * @mbggenerated
     */
    private String departmentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALES_RETURN.COMPOSITEID
     *
     * @mbggenerated
     */
    private String compositeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALES_RETURN.STATE
     *
     * @mbggenerated
     */
    private String state;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALES_RETURN
     *
     * @mbggenerated
     */
    public SalesReturn(String rejectedid, String clientid, Date rejecteddate, String address, Short tax, Short repository, String currency, String warehouseid, String staffid, String departmentid, String compositeid, String state) {
        this.rejectedid = rejectedid;
        this.clientid = clientid;
        this.rejecteddate = rejecteddate;
        this.address = address;
        this.tax = tax;
        this.repository = repository;
        this.currency = currency;
        this.warehouseid = warehouseid;
        this.staffid = staffid;
        this.departmentid = departmentid;
        this.compositeid = compositeid;
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALES_RETURN
     *
     * @mbggenerated
     */
    public SalesReturn() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALES_RETURN.REJECTEDID
     *
     * @return the value of SALES_RETURN.REJECTEDID
     *
     * @mbggenerated
     */
    public String getRejectedid() {
        return rejectedid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALES_RETURN.REJECTEDID
     *
     * @param rejectedid the value for SALES_RETURN.REJECTEDID
     *
     * @mbggenerated
     */
    public void setRejectedid(String rejectedid) {
        this.rejectedid = rejectedid == null ? null : rejectedid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALES_RETURN.CLIENTID
     *
     * @return the value of SALES_RETURN.CLIENTID
     *
     * @mbggenerated
     */
    public String getClientid() {
        return clientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALES_RETURN.CLIENTID
     *
     * @param clientid the value for SALES_RETURN.CLIENTID
     *
     * @mbggenerated
     */
    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALES_RETURN.REJECTEDDATE
     *
     * @return the value of SALES_RETURN.REJECTEDDATE
     *
     * @mbggenerated
     */
    public Date getRejecteddate() {
        return rejecteddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALES_RETURN.REJECTEDDATE
     *
     * @param rejecteddate the value for SALES_RETURN.REJECTEDDATE
     *
     * @mbggenerated
     */
    public void setRejecteddate(Date rejecteddate) {
        this.rejecteddate = rejecteddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALES_RETURN.ADDRESS
     *
     * @return the value of SALES_RETURN.ADDRESS
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALES_RETURN.ADDRESS
     *
     * @param address the value for SALES_RETURN.ADDRESS
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALES_RETURN.TAX
     *
     * @return the value of SALES_RETURN.TAX
     *
     * @mbggenerated
     */
    public Short getTax() {
        return tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALES_RETURN.TAX
     *
     * @param tax the value for SALES_RETURN.TAX
     *
     * @mbggenerated
     */
    public void setTax(Short tax) {
        this.tax = tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALES_RETURN.REPOSITORY
     *
     * @return the value of SALES_RETURN.REPOSITORY
     *
     * @mbggenerated
     */
    public Short getRepository() {
        return repository;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALES_RETURN.REPOSITORY
     *
     * @param repository the value for SALES_RETURN.REPOSITORY
     *
     * @mbggenerated
     */
    public void setRepository(Short repository) {
        this.repository = repository;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALES_RETURN.CURRENCY
     *
     * @return the value of SALES_RETURN.CURRENCY
     *
     * @mbggenerated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALES_RETURN.CURRENCY
     *
     * @param currency the value for SALES_RETURN.CURRENCY
     *
     * @mbggenerated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALES_RETURN.WAREHOUSEID
     *
     * @return the value of SALES_RETURN.WAREHOUSEID
     *
     * @mbggenerated
     */
    public String getWarehouseid() {
        return warehouseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALES_RETURN.WAREHOUSEID
     *
     * @param warehouseid the value for SALES_RETURN.WAREHOUSEID
     *
     * @mbggenerated
     */
    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid == null ? null : warehouseid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALES_RETURN.STAFFID
     *
     * @return the value of SALES_RETURN.STAFFID
     *
     * @mbggenerated
     */
    public String getStaffid() {
        return staffid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALES_RETURN.STAFFID
     *
     * @param staffid the value for SALES_RETURN.STAFFID
     *
     * @mbggenerated
     */
    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALES_RETURN.DEPARTMENTID
     *
     * @return the value of SALES_RETURN.DEPARTMENTID
     *
     * @mbggenerated
     */
    public String getDepartmentid() {
        return departmentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALES_RETURN.DEPARTMENTID
     *
     * @param departmentid the value for SALES_RETURN.DEPARTMENTID
     *
     * @mbggenerated
     */
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALES_RETURN.COMPOSITEID
     *
     * @return the value of SALES_RETURN.COMPOSITEID
     *
     * @mbggenerated
     */
    public String getCompositeid() {
        return compositeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALES_RETURN.COMPOSITEID
     *
     * @param compositeid the value for SALES_RETURN.COMPOSITEID
     *
     * @mbggenerated
     */
    public void setCompositeid(String compositeid) {
        this.compositeid = compositeid == null ? null : compositeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALES_RETURN.STATE
     *
     * @return the value of SALES_RETURN.STATE
     *
     * @mbggenerated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALES_RETURN.STATE
     *
     * @param state the value for SALES_RETURN.STATE
     *
     * @mbggenerated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}