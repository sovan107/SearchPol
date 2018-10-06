/*
 * This file is generated by jOOQ.
*/
package com.jooq.jooqDemo.jooq.domain.tables.tables.records;


import com.jooq.jooqDemo.jooq.domain.tables.tables.ChildLookup;

import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class ChildLookupRecord extends UpdatableRecordImpl<ChildLookupRecord> implements Record10<Long, String, Date, String, Boolean, String, BigDecimal, String, Date, Long> {

    private static final long serialVersionUID = -999426014;

    /**
     * Setter for <code>raadsmarine.CHILD_LOOKUP.CHILD_LOOKUP_ID</code>.
     */
    public void setChildLookupId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>raadsmarine.CHILD_LOOKUP.CHILD_LOOKUP_ID</code>.
     */
    public Long getChildLookupId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>raadsmarine.CHILD_LOOKUP.CREATED_BY</code>.
     */
    public void setCreatedBy(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>raadsmarine.CHILD_LOOKUP.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(1);
    }

    /**
     * Setter for <code>raadsmarine.CHILD_LOOKUP.CREATED_DATE</code>.
     */
    public void setCreatedDate(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>raadsmarine.CHILD_LOOKUP.CREATED_DATE</code>.
     */
    public Date getCreatedDate() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>raadsmarine.CHILD_LOOKUP.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>raadsmarine.CHILD_LOOKUP.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>raadsmarine.CHILD_LOOKUP.IS_ACTIVE</code>.
     */
    public void setIsActive(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>raadsmarine.CHILD_LOOKUP.IS_ACTIVE</code>.
     */
    public Boolean getIsActive() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>raadsmarine.CHILD_LOOKUP.NON_NUMERIC_VALUE</code>.
     */
    public void setNonNumericValue(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>raadsmarine.CHILD_LOOKUP.NON_NUMERIC_VALUE</code>.
     */
    public String getNonNumericValue() {
        return (String) get(5);
    }

    /**
     * Setter for <code>raadsmarine.CHILD_LOOKUP.NUMERIC_VALUE</code>.
     */
    public void setNumericValue(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>raadsmarine.CHILD_LOOKUP.NUMERIC_VALUE</code>.
     */
    public BigDecimal getNumericValue() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>raadsmarine.CHILD_LOOKUP.UPDATED_BY</code>.
     */
    public void setUpdatedBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>raadsmarine.CHILD_LOOKUP.UPDATED_BY</code>.
     */
    public String getUpdatedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>raadsmarine.CHILD_LOOKUP.UPDATED_DATE</code>.
     */
    public void setUpdatedDate(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>raadsmarine.CHILD_LOOKUP.UPDATED_DATE</code>.
     */
    public Date getUpdatedDate() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>raadsmarine.CHILD_LOOKUP.parentLookup_PARENT_LOOKUP_ID</code>.
     */
    public void setParentlookupParentLookupId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>raadsmarine.CHILD_LOOKUP.parentLookup_PARENT_LOOKUP_ID</code>.
     */
    public Long getParentlookupParentLookupId() {
        return (Long) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, String, Date, String, Boolean, String, BigDecimal, String, Date, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, String, Date, String, Boolean, String, BigDecimal, String, Date, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ChildLookup.CHILD_LOOKUP.CHILD_LOOKUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ChildLookup.CHILD_LOOKUP.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return ChildLookup.CHILD_LOOKUP.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ChildLookup.CHILD_LOOKUP.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return ChildLookup.CHILD_LOOKUP.IS_ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ChildLookup.CHILD_LOOKUP.NON_NUMERIC_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return ChildLookup.CHILD_LOOKUP.NUMERIC_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ChildLookup.CHILD_LOOKUP.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return ChildLookup.CHILD_LOOKUP.UPDATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return ChildLookup.CHILD_LOOKUP.PARENTLOOKUP_PARENT_LOOKUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getChildLookupId();
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
    public Date component3() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getNonNumericValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getNumericValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component9() {
        return getUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getParentlookupParentLookupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getChildLookupId();
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
    public Date value3() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getNonNumericValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getNumericValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getParentlookupParentLookupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildLookupRecord value1(Long value) {
        setChildLookupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildLookupRecord value2(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildLookupRecord value3(Date value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildLookupRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildLookupRecord value5(Boolean value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildLookupRecord value6(String value) {
        setNonNumericValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildLookupRecord value7(BigDecimal value) {
        setNumericValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildLookupRecord value8(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildLookupRecord value9(Date value) {
        setUpdatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildLookupRecord value10(Long value) {
        setParentlookupParentLookupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChildLookupRecord values(Long value1, String value2, Date value3, String value4, Boolean value5, String value6, BigDecimal value7, String value8, Date value9, Long value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ChildLookupRecord
     */
    public ChildLookupRecord() {
        super(ChildLookup.CHILD_LOOKUP);
    }

    /**
     * Create a detached, initialised ChildLookupRecord
     */
    public ChildLookupRecord(Long childLookupId, String createdBy, Date createdDate, String description, Boolean isActive, String nonNumericValue, BigDecimal numericValue, String updatedBy, Date updatedDate, Long parentlookupParentLookupId) {
        super(ChildLookup.CHILD_LOOKUP);

        set(0, childLookupId);
        set(1, createdBy);
        set(2, createdDate);
        set(3, description);
        set(4, isActive);
        set(5, nonNumericValue);
        set(6, numericValue);
        set(7, updatedBy);
        set(8, updatedDate);
        set(9, parentlookupParentLookupId);
    }
}