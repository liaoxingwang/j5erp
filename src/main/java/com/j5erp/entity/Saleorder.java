package com.j5erp.entity;

import java.util.Date;
import java.util.List;

public class Saleorder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.CUSID
     *
     * @mbggenerated
     */
    private String cusid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.TOADDRESS
     *
     * @mbggenerated
     */
    private String toaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.SALETYPE
     *
     * @mbggenerated
     */
    private Integer saletype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.ISTAX
     *
     * @mbggenerated
     */
    private Integer istax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.ORDERSTATUS
     *
     * @mbggenerated
     */
    private Integer orderstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.ORDERTIME
     *
     * @mbggenerated
     */
    private Date ordertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.COINTYPE
     *
     * @mbggenerated
     */
    private Integer cointype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.PAITIES
     *
     * @mbggenerated
     */
    private Double paities;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.WANDNAME
     *
     * @mbggenerated
     */
    private String wandname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.DANDNAME
     *
     * @mbggenerated
     */
    private String dandname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.CANDNAME
     *
     * @mbggenerated
     */
    private String candname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.MANDNAME
     *
     * @mbggenerated
     */
    private String mandname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.CHECKSTATUS
     *
     * @mbggenerated
     */
    private Integer checkstatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDER.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    private List<Saleorderdetail> dlist;

    public List<Saleorderdetail> getDlist() {
        return dlist;
    }

    public void setDlist(List<Saleorderdetail> dlist) {
        this.dlist = dlist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALEORDER
     *
     * @mbggenerated
     */
    public Saleorder(String id, String cusid, String toaddress, Integer saletype, Integer istax, Integer orderstatus, Date ordertime, Integer cointype, Double paities, String wandname, String dandname, String candname, String mandname, Integer checkstatus, String remark) {
        this.id = id;
        this.cusid = cusid;
        this.toaddress = toaddress;
        this.saletype = saletype;
        this.istax = istax;
        this.orderstatus = orderstatus;
        this.ordertime = ordertime;
        this.cointype = cointype;
        this.paities = paities;
        this.wandname = wandname;
        this.dandname = dandname;
        this.candname = candname;
        this.mandname = mandname;
        this.checkstatus = checkstatus;
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALEORDER
     *
     * @mbggenerated
     */
    public Saleorder() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.ID
     *
     * @return the value of SALEORDER.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.ID
     *
     * @param id the value for SALEORDER.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.CUSID
     *
     * @return the value of SALEORDER.CUSID
     *
     * @mbggenerated
     */
    public String getCusid() {
        return cusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.CUSID
     *
     * @param cusid the value for SALEORDER.CUSID
     *
     * @mbggenerated
     */
    public void setCusid(String cusid) {
        this.cusid = cusid == null ? null : cusid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.TOADDRESS
     *
     * @return the value of SALEORDER.TOADDRESS
     *
     * @mbggenerated
     */
    public String getToaddress() {
        return toaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.TOADDRESS
     *
     * @param toaddress the value for SALEORDER.TOADDRESS
     *
     * @mbggenerated
     */
    public void setToaddress(String toaddress) {
        this.toaddress = toaddress == null ? null : toaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.SALETYPE
     *
     * @return the value of SALEORDER.SALETYPE
     *
     * @mbggenerated
     */
    public Integer getSaletype() {
        return saletype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.SALETYPE
     *
     * @param saletype the value for SALEORDER.SALETYPE
     *
     * @mbggenerated
     */
    public void setSaletype(Integer saletype) {
        this.saletype = saletype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.ISTAX
     *
     * @return the value of SALEORDER.ISTAX
     *
     * @mbggenerated
     */
    public Integer getIstax() {
        return istax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.ISTAX
     *
     * @param istax the value for SALEORDER.ISTAX
     *
     * @mbggenerated
     */
    public void setIstax(Integer istax) {
        this.istax = istax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.ORDERSTATUS
     *
     * @return the value of SALEORDER.ORDERSTATUS
     *
     * @mbggenerated
     */
    public Integer getOrderstatus() {
        return orderstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.ORDERSTATUS
     *
     * @param orderstatus the value for SALEORDER.ORDERSTATUS
     *
     * @mbggenerated
     */
    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.ORDERTIME
     *
     * @return the value of SALEORDER.ORDERTIME
     *
     * @mbggenerated
     */
    public Date getOrdertime() {
        return ordertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.ORDERTIME
     *
     * @param ordertime the value for SALEORDER.ORDERTIME
     *
     * @mbggenerated
     */
    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.COINTYPE
     *
     * @return the value of SALEORDER.COINTYPE
     *
     * @mbggenerated
     */
    public Integer getCointype() {
        return cointype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.COINTYPE
     *
     * @param cointype the value for SALEORDER.COINTYPE
     *
     * @mbggenerated
     */
    public void setCointype(Integer cointype) {
        this.cointype = cointype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.PAITIES
     *
     * @return the value of SALEORDER.PAITIES
     *
     * @mbggenerated
     */
    public Double getPaities() {
        return paities;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.PAITIES
     *
     * @param paities the value for SALEORDER.PAITIES
     *
     * @mbggenerated
     */
    public void setPaities(Double paities) {
        this.paities = paities;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.WANDNAME
     *
     * @return the value of SALEORDER.WANDNAME
     *
     * @mbggenerated
     */
    public String getWandname() {
        return wandname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.WANDNAME
     *
     * @param wandname the value for SALEORDER.WANDNAME
     *
     * @mbggenerated
     */
    public void setWandname(String wandname) {
        this.wandname = wandname == null ? null : wandname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.DANDNAME
     *
     * @return the value of SALEORDER.DANDNAME
     *
     * @mbggenerated
     */
    public String getDandname() {
        return dandname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.DANDNAME
     *
     * @param dandname the value for SALEORDER.DANDNAME
     *
     * @mbggenerated
     */
    public void setDandname(String dandname) {
        this.dandname = dandname == null ? null : dandname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.CANDNAME
     *
     * @return the value of SALEORDER.CANDNAME
     *
     * @mbggenerated
     */
    public String getCandname() {
        return candname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.CANDNAME
     *
     * @param candname the value for SALEORDER.CANDNAME
     *
     * @mbggenerated
     */
    public void setCandname(String candname) {
        this.candname = candname == null ? null : candname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.MANDNAME
     *
     * @return the value of SALEORDER.MANDNAME
     *
     * @mbggenerated
     */
    public String getMandname() {
        return mandname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.MANDNAME
     *
     * @param mandname the value for SALEORDER.MANDNAME
     *
     * @mbggenerated
     */
    public void setMandname(String mandname) {
        this.mandname = mandname == null ? null : mandname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.CHECKSTATUS
     *
     * @return the value of SALEORDER.CHECKSTATUS
     *
     * @mbggenerated
     */
    public Integer getCheckstatus() {
        return checkstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.CHECKSTATUS
     *
     * @param checkstatus the value for SALEORDER.CHECKSTATUS
     *
     * @mbggenerated
     */
    public void setCheckstatus(Integer checkstatus) {
        this.checkstatus = checkstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDER.REMARK
     *
     * @return the value of SALEORDER.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDER.REMARK
     *
     * @param remark the value for SALEORDER.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}