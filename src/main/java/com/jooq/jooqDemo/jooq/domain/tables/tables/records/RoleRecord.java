/*
 * This file is generated by jOOQ.
*/
package com.jooq.jooqDemo.jooq.domain.tables.tables.records;


import com.jooq.jooqDemo.jooq.domain.tables.tables.Role;

import java.sql.Timestamp;

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
public class RoleRecord extends UpdatableRecordImpl<RoleRecord> implements Record8<Long, String, Timestamp, Boolean, String, String, String, Timestamp> {

    private static final long serialVersionUID = 1108592626;

    /**
     * Setter for <code>raadsmarine.Role.RoleId</code>.
     */
    public void setRoleid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>raadsmarine.Role.RoleId</code>.
     */
    public Long getRoleid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>raadsmarine.Role.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>raadsmarine.Role.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(1);
    }

    /**
     * Setter for <code>raadsmarine.Role.CreatedDate</code>.
     */
    public void setCreateddate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>raadsmarine.Role.CreatedDate</code>.
     */
    public Timestamp getCreateddate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>raadsmarine.Role.Enabled</code>.
     */
    public void setEnabled(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>raadsmarine.Role.Enabled</code>.
     */
    public Boolean getEnabled() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>raadsmarine.Role.RoleDesc</code>.
     */
    public void setRoledesc(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>raadsmarine.Role.RoleDesc</code>.
     */
    public String getRoledesc() {
        return (String) get(4);
    }

    /**
     * Setter for <code>raadsmarine.Role.RoleName</code>.
     */
    public void setRolename(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>raadsmarine.Role.RoleName</code>.
     */
    public String getRolename() {
        return (String) get(5);
    }

    /**
     * Setter for <code>raadsmarine.Role.UpdatedBy</code>.
     */
    public void setUpdatedby(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>raadsmarine.Role.UpdatedBy</code>.
     */
    public String getUpdatedby() {
        return (String) get(6);
    }

    /**
     * Setter for <code>raadsmarine.Role.UpdatedDate</code>.
     */
    public void setUpdateddate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>raadsmarine.Role.UpdatedDate</code>.
     */
    public Timestamp getUpdateddate() {
        return (Timestamp) get(7);
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
    public Row8<Long, String, Timestamp, Boolean, String, String, String, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Timestamp, Boolean, String, String, String, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Role.ROLE.ROLEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Role.ROLE.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Role.ROLE.CREATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return Role.ROLE.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Role.ROLE.ROLEDESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Role.ROLE.ROLENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Role.ROLE.UPDATEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Role.ROLE.UPDATEDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getRoleid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRoledesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRolename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getUpdatedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getRoleid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRoledesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRolename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getUpdatedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdateddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value1(Long value) {
        setRoleid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value2(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value3(Timestamp value) {
        setCreateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value4(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value5(String value) {
        setRoledesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value6(String value) {
        setRolename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value7(String value) {
        setUpdatedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord value8(Timestamp value) {
        setUpdateddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleRecord values(Long value1, String value2, Timestamp value3, Boolean value4, String value5, String value6, String value7, Timestamp value8) {
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
     * Create a detached RoleRecord
     */
    public RoleRecord() {
        super(Role.ROLE);
    }

    /**
     * Create a detached, initialised RoleRecord
     */
    public RoleRecord(Long roleid, String createdBy, Timestamp createddate, Boolean enabled, String roledesc, String rolename, String updatedby, Timestamp updateddate) {
        super(Role.ROLE);

        set(0, roleid);
        set(1, createdBy);
        set(2, createddate);
        set(3, enabled);
        set(4, roledesc);
        set(5, rolename);
        set(6, updatedby);
        set(7, updateddate);
    }
}
