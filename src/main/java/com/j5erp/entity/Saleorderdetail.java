package com.j5erp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Saleorderdetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.SOID
     *
     * @mbggenerated
     */
    private String soid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.LINENO
     *
     * @mbggenerated
     */
    private Long lineno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.MID
     *
     * @mbggenerated
     */
    private String mid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.MNAME
     *
     * @mbggenerated
     */
    private String mname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.STANDARD
     *
     * @mbggenerated
     */
    private String standard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.UNITID
     *
     * @mbggenerated
     */
    private String unitid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.UNITNAME
     *
     * @mbggenerated
     */
    private String unitname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.NUM
     *
     * @mbggenerated
     */
    private Long num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.BEFOREDISCOUNT
     *
     * @mbggenerated
     */
    private BigDecimal beforediscount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.DISCOUNT
     *
     * @mbggenerated
     */
    private BigDecimal discount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.PRICE
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.TOTALPRICE
     *
     * @mbggenerated
     */
    private BigDecimal totalprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.TAXRATE
     *
     * @mbggenerated
     */
    private BigDecimal taxrate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.TOTALTAX
     *
     * @mbggenerated
     */
    private BigDecimal totaltax;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.TOTALMONEY
     *
     * @mbggenerated
     */
    private BigDecimal totalmoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.BEFOREOUT
     *
     * @mbggenerated
     */
    private Long beforeout;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.ESTIMATEDATE
     *
     * @mbggenerated
     */
    private Date estimatedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.LEFTNUM
     *
     * @mbggenerated
     */
    private Long leftnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.ISGIFT
     *
     * @mbggenerated
     */
    private Short isgift;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.FROMBILLTYPE
     *
     * @mbggenerated
     */
    private Short frombilltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SALEORDERDETAIL.FROMBILLID
     *
     * @mbggenerated
     */
    private String frombillid;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALEORDERDETAIL
     *
     * @mbggenerated
     */
    public Saleorderdetail(String soid, Long lineno, String mid, String mname, String standard, String unitid, String unitname, Long num, BigDecimal beforediscount, BigDecimal discount, BigDecimal price, BigDecimal totalprice, BigDecimal taxrate, BigDecimal totaltax, BigDecimal totalmoney, Long beforeout, Date estimatedate, Long leftnum, Short isgift, Short frombilltype, String frombillid) {
        this.soid = soid;
        this.lineno = lineno;
        this.mid = mid;
        this.mname = mname;
        this.standard = standard;
        this.unitid = unitid;
        this.unitname = unitname;
        this.num = num;
        this.beforediscount = beforediscount;
        this.discount = discount;
        this.price = price;
        this.totalprice = totalprice;
        this.taxrate = taxrate;
        this.totaltax = totaltax;
        this.totalmoney = totalmoney;
        this.beforeout = beforeout;
        this.estimatedate = estimatedate;
        this.leftnum = leftnum;
        this.isgift = isgift;
        this.frombilltype = frombilltype;
        this.frombillid = frombillid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALEORDERDETAIL
     *
     * @mbggenerated
     */
    public Saleorderdetail() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.SOID
     *
     * @return the value of SALEORDERDETAIL.SOID
     *
     * @mbggenerated
     */
    public String getSoid() {
        return soid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.SOID
     *
     * @param soid the value for SALEORDERDETAIL.SOID
     *
     * @mbggenerated
     */
    public void setSoid(String soid) {
        this.soid = soid == null ? null : soid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.LINENO
     *
     * @return the value of SALEORDERDETAIL.LINENO
     *
     * @mbggenerated
     */
    public Long getLineno() {
        return lineno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.LINENO
     *
     * @param lineno the value for SALEORDERDETAIL.LINENO
     *
     * @mbggenerated
     */
    public void setLineno(Long lineno) {
        this.lineno = lineno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.MID
     *
     * @return the value of SALEORDERDETAIL.MID
     *
     * @mbggenerated
     */
    public String getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.MID
     *
     * @param mid the value for SALEORDERDETAIL.MID
     *
     * @mbggenerated
     */
    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.MNAME
     *
     * @return the value of SALEORDERDETAIL.MNAME
     *
     * @mbggenerated
     */
    public String getMname() {
        return mname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.MNAME
     *
     * @param mname the value for SALEORDERDETAIL.MNAME
     *
     * @mbggenerated
     */
    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.STANDARD
     *
     * @return the value of SALEORDERDETAIL.STANDARD
     *
     * @mbggenerated
     */
    public String getStandard() {
        return standard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.STANDARD
     *
     * @param standard the value for SALEORDERDETAIL.STANDARD
     *
     * @mbggenerated
     */
    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.UNITID
     *
     * @return the value of SALEORDERDETAIL.UNITID
     *
     * @mbggenerated
     */
    public String getUnitid() {
        return unitid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.UNITID
     *
     * @param unitid the value for SALEORDERDETAIL.UNITID
     *
     * @mbggenerated
     */
    public void setUnitid(String unitid) {
        this.unitid = unitid == null ? null : unitid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.UNITNAME
     *
     * @return the value of SALEORDERDETAIL.UNITNAME
     *
     * @mbggenerated
     */
    public String getUnitname() {
        return unitname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.UNITNAME
     *
     * @param unitname the value for SALEORDERDETAIL.UNITNAME
     *
     * @mbggenerated
     */
    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.NUM
     *
     * @return the value of SALEORDERDETAIL.NUM
     *
     * @mbggenerated
     */
    public Long getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.NUM
     *
     * @param num the value for SALEORDERDETAIL.NUM
     *
     * @mbggenerated
     */
    public void setNum(Long num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.BEFOREDISCOUNT
     *
     * @return the value of SALEORDERDETAIL.BEFOREDISCOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getBeforediscount() {
        return beforediscount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.BEFOREDISCOUNT
     *
     * @param beforediscount the value for SALEORDERDETAIL.BEFOREDISCOUNT
     *
     * @mbggenerated
     */
    public void setBeforediscount(BigDecimal beforediscount) {
        this.beforediscount = beforediscount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.DISCOUNT
     *
     * @return the value of SALEORDERDETAIL.DISCOUNT
     *
     * @mbggenerated
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.DISCOUNT
     *
     * @param discount the value for SALEORDERDETAIL.DISCOUNT
     *
     * @mbggenerated
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.PRICE
     *
     * @return the value of SALEORDERDETAIL.PRICE
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.PRICE
     *
     * @param price the value for SALEORDERDETAIL.PRICE
     *
     * @mbggenerated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.TOTALPRICE
     *
     * @return the value of SALEORDERDETAIL.TOTALPRICE
     *
     * @mbggenerated
     */
    public BigDecimal getTotalprice() {
        return totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.TOTALPRICE
     *
     * @param totalprice the value for SALEORDERDETAIL.TOTALPRICE
     *
     * @mbggenerated
     */
    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.TAXRATE
     *
     * @return the value of SALEORDERDETAIL.TAXRATE
     *
     * @mbggenerated
     */
    public BigDecimal getTaxrate() {
        return taxrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.TAXRATE
     *
     * @param taxrate the value for SALEORDERDETAIL.TAXRATE
     *
     * @mbggenerated
     */
    public void setTaxrate(BigDecimal taxrate) {
        this.taxrate = taxrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.TOTALTAX
     *
     * @return the value of SALEORDERDETAIL.TOTALTAX
     *
     * @mbggenerated
     */
    public BigDecimal getTotaltax() {
        return totaltax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.TOTALTAX
     *
     * @param totaltax the value for SALEORDERDETAIL.TOTALTAX
     *
     * @mbggenerated
     */
    public void setTotaltax(BigDecimal totaltax) {
        this.totaltax = totaltax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.TOTALMONEY
     *
     * @return the value of SALEORDERDETAIL.TOTALMONEY
     *
     * @mbggenerated
     */
    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.TOTALMONEY
     *
     * @param totalmoney the value for SALEORDERDETAIL.TOTALMONEY
     *
     * @mbggenerated
     */
    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.BEFOREOUT
     *
     * @return the value of SALEORDERDETAIL.BEFOREOUT
     *
     * @mbggenerated
     */
    public Long getBeforeout() {
        return beforeout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.BEFOREOUT
     *
     * @param beforeout the value for SALEORDERDETAIL.BEFOREOUT
     *
     * @mbggenerated
     */
    public void setBeforeout(Long beforeout) {
        this.beforeout = beforeout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.ESTIMATEDATE
     *
     * @return the value of SALEORDERDETAIL.ESTIMATEDATE
     *
     * @mbggenerated
     */
    public Date getEstimatedate() {
        return estimatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.ESTIMATEDATE
     *
     * @param estimatedate the value for SALEORDERDETAIL.ESTIMATEDATE
     *
     * @mbggenerated
     */
    public void setEstimatedate(Date estimatedate) {
        this.estimatedate = estimatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.LEFTNUM
     *
     * @return the value of SALEORDERDETAIL.LEFTNUM
     *
     * @mbggenerated
     */
    public Long getLeftnum() {
        return leftnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.LEFTNUM
     *
     * @param leftnum the value for SALEORDERDETAIL.LEFTNUM
     *
     * @mbggenerated
     */
    public void setLeftnum(Long leftnum) {
        this.leftnum = leftnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.ISGIFT
     *
     * @return the value of SALEORDERDETAIL.ISGIFT
     *
     * @mbggenerated
     */
    public Short getIsgift() {
        return isgift;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.ISGIFT
     *
     * @param isgift the value for SALEORDERDETAIL.ISGIFT
     *
     * @mbggenerated
     */
    public void setIsgift(Short isgift) {
        this.isgift = isgift;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.FROMBILLTYPE
     *
     * @return the value of SALEORDERDETAIL.FROMBILLTYPE
     *
     * @mbggenerated
     */
    public Short getFrombilltype() {
        return frombilltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.FROMBILLTYPE
     *
     * @param frombilltype the value for SALEORDERDETAIL.FROMBILLTYPE
     *
     * @mbggenerated
     */
    public void setFrombilltype(Short frombilltype) {
        this.frombilltype = frombilltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SALEORDERDETAIL.FROMBILLID
     *
     * @return the value of SALEORDERDETAIL.FROMBILLID
     *
     * @mbggenerated
     */
    public String getFrombillid() {
        return frombillid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SALEORDERDETAIL.FROMBILLID
     *
     * @param frombillid the value for SALEORDERDETAIL.FROMBILLID
     *
     * @mbggenerated
     */
    public void setFrombillid(String frombillid) {
        this.frombillid = frombillid == null ? null : frombillid.trim();
    }
}