/*
 * This file is generated by jOOQ.
*/
package com.jooq.jooqDemo.jooq.domain.tables.tables.records;


import com.jooq.jooqDemo.jooq.domain.tables.tables.Services;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class ServicesRecord extends UpdatableRecordImpl<ServicesRecord> implements Record5<Long, String, String, String, Long> {

    private static final long serialVersionUID = -687498773;

    /**
     * Setter for <code>raadsmarine.Services.SERVICE_ID</code>.
     */
    public void setServiceId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>raadsmarine.Services.SERVICE_ID</code>.
     */
    public Long getServiceId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>raadsmarine.Services.SERVICE_DESCRIPTION</code>.
     */
    public void setServiceDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>raadsmarine.Services.SERVICE_DESCRIPTION</code>.
     */
    public String getServiceDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>raadsmarine.Services.SERVICE_IMAGE_URL</code>.
     */
    public void setServiceImageUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>raadsmarine.Services.SERVICE_IMAGE_URL</code>.
     */
    public String getServiceImageUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>raadsmarine.Services.SERVICE_NAME</code>.
     */
    public void setServiceName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>raadsmarine.Services.SERVICE_NAME</code>.
     */
    public String getServiceName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>raadsmarine.Services.parentService_SERVICE_ID</code>.
     */
    public void setParentserviceServiceId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>raadsmarine.Services.parentService_SERVICE_ID</code>.
     */
    public Long getParentserviceServiceId() {
        return (Long) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, String, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, String, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Services.SERVICES.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Services.SERVICES.SERVICE_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Services.SERVICES.SERVICE_IMAGE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Services.SERVICES.SERVICE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Services.SERVICES.PARENTSERVICE_SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getServiceDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getServiceImageUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getServiceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getParentserviceServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getServiceDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getServiceImageUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getServiceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getParentserviceServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicesRecord value1(Long value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicesRecord value2(String value) {
        setServiceDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicesRecord value3(String value) {
        setServiceImageUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicesRecord value4(String value) {
        setServiceName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicesRecord value5(Long value) {
        setParentserviceServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicesRecord values(Long value1, String value2, String value3, String value4, Long value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServicesRecord
     */
    public ServicesRecord() {
        super(Services.SERVICES);
    }

    /**
     * Create a detached, initialised ServicesRecord
     */
    public ServicesRecord(Long serviceId, String serviceDescription, String serviceImageUrl, String serviceName, Long parentserviceServiceId) {
        super(Services.SERVICES);

        set(0, serviceId);
        set(1, serviceDescription);
        set(2, serviceImageUrl);
        set(3, serviceName);
        set(4, parentserviceServiceId);
    }
}
