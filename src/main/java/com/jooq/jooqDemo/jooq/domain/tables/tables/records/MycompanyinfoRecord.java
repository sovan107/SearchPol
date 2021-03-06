/*
 * This file is generated by jOOQ.
*/
package com.jooq.jooqDemo.jooq.domain.tables.tables.records;


import com.jooq.jooqDemo.jooq.domain.tables.tables.Mycompanyinfo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MycompanyinfoRecord extends UpdatableRecordImpl<MycompanyinfoRecord> implements Record8<Long, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 249235920;

    /**
     * Setter for <code>raadsmarine.MyCompanyInfo.COMPANY_ID</code>.
     */
    public void setCompanyId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>raadsmarine.MyCompanyInfo.COMPANY_ID</code>.
     */
    public Long getCompanyId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>raadsmarine.MyCompanyInfo.ADDRESS</code>.
     */
    public void setAddress(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>raadsmarine.MyCompanyInfo.ADDRESS</code>.
     */
    public String getAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>raadsmarine.MyCompanyInfo.COMPANY_LATITUDE</code>.
     */
    public void setCompanyLatitude(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>raadsmarine.MyCompanyInfo.COMPANY_LATITUDE</code>.
     */
    public String getCompanyLatitude() {
        return (String) get(2);
    }

    /**
     * Setter for <code>raadsmarine.MyCompanyInfo.COMPANY_LONGITUDE</code>.
     */
    public void setCompanyLongitude(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>raadsmarine.MyCompanyInfo.COMPANY_LONGITUDE</code>.
     */
    public String getCompanyLongitude() {
        return (String) get(3);
    }

    /**
     * Setter for <code>raadsmarine.MyCompanyInfo.COMPANY_NAME</code>.
     */
    public void setCompanyName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>raadsmarine.MyCompanyInfo.COMPANY_NAME</code>.
     */
    public String getCompanyName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>raadsmarine.MyCompanyInfo.CONTACT_PERSON</code>.
     */
    public void setContactPerson(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>raadsmarine.MyCompanyInfo.CONTACT_PERSON</code>.
     */
    public String getContactPerson() {
        return (String) get(5);
    }

    /**
     * Setter for <code>raadsmarine.MyCompanyInfo.EMAIL</code>.
     */
    public void setEmail(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>raadsmarine.MyCompanyInfo.EMAIL</code>.
     */
    public String getEmail() {
        return (String) get(6);
    }

    /**
     * Setter for <code>raadsmarine.MyCompanyInfo.PHONE</code>.
     */
    public void setPhone(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>raadsmarine.MyCompanyInfo.PHONE</code>.
     */
    public String getPhone() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Mycompanyinfo.MYCOMPANYINFO.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Mycompanyinfo.MYCOMPANYINFO.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Mycompanyinfo.MYCOMPANYINFO.COMPANY_LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Mycompanyinfo.MYCOMPANYINFO.COMPANY_LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Mycompanyinfo.MYCOMPANYINFO.COMPANY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Mycompanyinfo.MYCOMPANYINFO.CONTACT_PERSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Mycompanyinfo.MYCOMPANYINFO.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Mycompanyinfo.MYCOMPANYINFO.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCompanyLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCompanyLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getContactPerson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCompanyLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCompanyLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getContactPerson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MycompanyinfoRecord value1(Long value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MycompanyinfoRecord value2(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MycompanyinfoRecord value3(String value) {
        setCompanyLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MycompanyinfoRecord value4(String value) {
        setCompanyLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MycompanyinfoRecord value5(String value) {
        setCompanyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MycompanyinfoRecord value6(String value) {
        setContactPerson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MycompanyinfoRecord value7(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MycompanyinfoRecord value8(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MycompanyinfoRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MycompanyinfoRecord
     */
    public MycompanyinfoRecord() {
        super(Mycompanyinfo.MYCOMPANYINFO);
    }

    /**
     * Create a detached, initialised MycompanyinfoRecord
     */
    public MycompanyinfoRecord(Long companyId, String address, String companyLatitude, String companyLongitude, String companyName, String contactPerson, String email, String phone) {
        super(Mycompanyinfo.MYCOMPANYINFO);

        set(0, companyId);
        set(1, address);
        set(2, companyLatitude);
        set(3, companyLongitude);
        set(4, companyName);
        set(5, contactPerson);
        set(6, email);
        set(7, phone);
    }
}
