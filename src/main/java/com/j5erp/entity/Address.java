package com.j5erp.entity;

public class Address {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADDRESS.ADDRESSID
     *
     * @mbggenerated
     */
    private String addressid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADDRESS.ADDRESS
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADDRESS.EMAIL_CODE
     *
     * @mbggenerated
     */
    private String emailCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADDRESS.CONTACTS
     *
     * @mbggenerated
     */
    private String contacts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADDRESS.ADDRESSID_TITLE
     *
     * @mbggenerated
     */
    private String addressidTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADDRESS.TELEPHONE
     *
     * @mbggenerated
     */
    private String telephone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADDRESS.ROUTE
     *
     * @mbggenerated
     */
    private String route;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADDRESS.REMARKS
     *
     * @mbggenerated
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbggenerated
     */
    public Address(String addressid, String address, String emailCode, String contacts, String addressidTitle, String telephone, String route, String remarks) {
        this.addressid = addressid;
        this.address = address;
        this.emailCode = emailCode;
        this.contacts = contacts;
        this.addressidTitle = addressidTitle;
        this.telephone = telephone;
        this.route = route;
        this.remarks = remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbggenerated
     */
    public Address() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADDRESS.ADDRESSID
     *
     * @return the value of ADDRESS.ADDRESSID
     *
     * @mbggenerated
     */
    public String getAddressid() {
        return addressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADDRESS.ADDRESSID
     *
     * @param addressid the value for ADDRESS.ADDRESSID
     *
     * @mbggenerated
     */
    public void setAddressid(String addressid) {
        this.addressid = addressid == null ? null : addressid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADDRESS.ADDRESS
     *
     * @return the value of ADDRESS.ADDRESS
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADDRESS.ADDRESS
     *
     * @param address the value for ADDRESS.ADDRESS
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADDRESS.EMAIL_CODE
     *
     * @return the value of ADDRESS.EMAIL_CODE
     *
     * @mbggenerated
     */
    public String getEmailCode() {
        return emailCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADDRESS.EMAIL_CODE
     *
     * @param emailCode the value for ADDRESS.EMAIL_CODE
     *
     * @mbggenerated
     */
    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode == null ? null : emailCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADDRESS.CONTACTS
     *
     * @return the value of ADDRESS.CONTACTS
     *
     * @mbggenerated
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADDRESS.CONTACTS
     *
     * @param contacts the value for ADDRESS.CONTACTS
     *
     * @mbggenerated
     */
    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADDRESS.ADDRESSID_TITLE
     *
     * @return the value of ADDRESS.ADDRESSID_TITLE
     *
     * @mbggenerated
     */
    public String getAddressidTitle() {
        return addressidTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADDRESS.ADDRESSID_TITLE
     *
     * @param addressidTitle the value for ADDRESS.ADDRESSID_TITLE
     *
     * @mbggenerated
     */
    public void setAddressidTitle(String addressidTitle) {
        this.addressidTitle = addressidTitle == null ? null : addressidTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADDRESS.TELEPHONE
     *
     * @return the value of ADDRESS.TELEPHONE
     *
     * @mbggenerated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADDRESS.TELEPHONE
     *
     * @param telephone the value for ADDRESS.TELEPHONE
     *
     * @mbggenerated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADDRESS.ROUTE
     *
     * @return the value of ADDRESS.ROUTE
     *
     * @mbggenerated
     */
    public String getRoute() {
        return route;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADDRESS.ROUTE
     *
     * @param route the value for ADDRESS.ROUTE
     *
     * @mbggenerated
     */
    public void setRoute(String route) {
        this.route = route == null ? null : route.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADDRESS.REMARKS
     *
     * @return the value of ADDRESS.REMARKS
     *
     * @mbggenerated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADDRESS.REMARKS
     *
     * @param remarks the value for ADDRESS.REMARKS
     *
     * @mbggenerated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}