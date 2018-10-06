/*
 * This file is generated by jOOQ.
*/
package com.jooq.jooqDemo.jooq.domain.tables.tables.records;


import com.jooq.jooqDemo.jooq.domain.tables.tables.NoticeRole;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class NoticeRoleRecord extends TableRecordImpl<NoticeRoleRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = -1865739027;

    /**
     * Setter for <code>raadsmarine.NOTICE_Role.NOTICE_NOTICE_ID</code>.
     */
    public void setNoticeNoticeId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>raadsmarine.NOTICE_Role.NOTICE_NOTICE_ID</code>.
     */
    public Long getNoticeNoticeId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>raadsmarine.NOTICE_Role.targetRoles_RoleId</code>.
     */
    public void setTargetrolesRoleid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>raadsmarine.NOTICE_Role.targetRoles_RoleId</code>.
     */
    public Long getTargetrolesRoleid() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return NoticeRole.NOTICE_ROLE.NOTICE_NOTICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return NoticeRole.NOTICE_ROLE.TARGETROLES_ROLEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getNoticeNoticeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getTargetrolesRoleid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getNoticeNoticeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTargetrolesRoleid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NoticeRoleRecord value1(Long value) {
        setNoticeNoticeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NoticeRoleRecord value2(Long value) {
        setTargetrolesRoleid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NoticeRoleRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NoticeRoleRecord
     */
    public NoticeRoleRecord() {
        super(NoticeRole.NOTICE_ROLE);
    }

    /**
     * Create a detached, initialised NoticeRoleRecord
     */
    public NoticeRoleRecord(Long noticeNoticeId, Long targetrolesRoleid) {
        super(NoticeRole.NOTICE_ROLE);

        set(0, noticeNoticeId);
        set(1, targetrolesRoleid);
    }
}
