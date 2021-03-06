/*
 * This file is generated by jOOQ.
*/
package com.jooq.jooqDemo.jooq.domain.tables.tables;


import com.jooq.jooqDemo.jooq.domain.tables.Indexes;
import com.jooq.jooqDemo.jooq.domain.tables.Keys;
import com.jooq.jooqDemo.jooq.domain.tables.Raadsmarine;
import com.jooq.jooqDemo.jooq.domain.tables.tables.records.StandardRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Standard extends TableImpl<StandardRecord> {

    private static final long serialVersionUID = -1191730602;

    /**
     * The reference instance of <code>raadsmarine.STANDARD</code>
     */
    public static final Standard STANDARD = new Standard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StandardRecord> getRecordType() {
        return StandardRecord.class;
    }

    /**
     * The column <code>raadsmarine.STANDARD.STANDARD_ID</code>.
     */
    public final TableField<StandardRecord, Long> STANDARD_ID = createField("STANDARD_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>raadsmarine.STANDARD.CREATED_BY</code>.
     */
    public final TableField<StandardRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>raadsmarine.STANDARD.CREATED_DATE</code>.
     */
    public final TableField<StandardRecord, Timestamp> CREATED_DATE = createField("CREATED_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>raadsmarine.STANDARD.DESCRIPTION</code>.
     */
    public final TableField<StandardRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>raadsmarine.STANDARD.SECTION</code>.
     */
    public final TableField<StandardRecord, String> SECTION = createField("SECTION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>raadsmarine.STANDARD.STANDARD</code>.
     */
    public final TableField<StandardRecord, Integer> STANDARD_ = createField("STANDARD", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>raadsmarine.STANDARD.UPDATED_BY</code>.
     */
    public final TableField<StandardRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>raadsmarine.STANDARD.UPDATED_DATE</code>.
     */
    public final TableField<StandardRecord, Timestamp> UPDATED_DATE = createField("UPDATED_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>raadsmarine.STANDARD</code> table reference
     */
    public Standard() {
        this(DSL.name("STANDARD"), null);
    }

    /**
     * Create an aliased <code>raadsmarine.STANDARD</code> table reference
     */
    public Standard(String alias) {
        this(DSL.name(alias), STANDARD);
    }

    /**
     * Create an aliased <code>raadsmarine.STANDARD</code> table reference
     */
    public Standard(Name alias) {
        this(alias, STANDARD);
    }

    private Standard(Name alias, Table<StandardRecord> aliased) {
        this(alias, aliased, null);
    }

    private Standard(Name alias, Table<StandardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Raadsmarine.RAADSMARINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.STANDARD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StandardRecord, Long> getIdentity() {
        return Keys.IDENTITY_STANDARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StandardRecord> getPrimaryKey() {
        return Keys.KEY_STANDARD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StandardRecord>> getKeys() {
        return Arrays.<UniqueKey<StandardRecord>>asList(Keys.KEY_STANDARD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Standard as(String alias) {
        return new Standard(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Standard as(Name alias) {
        return new Standard(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Standard rename(String name) {
        return new Standard(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Standard rename(Name name) {
        return new Standard(name, null);
    }
}
