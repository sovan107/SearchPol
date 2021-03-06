/*
 * This file is generated by jOOQ.
*/
package com.jooq.jooqDemo.jooq.domain.tables.tables;


import com.jooq.jooqDemo.jooq.domain.tables.Indexes;
import com.jooq.jooqDemo.jooq.domain.tables.Keys;
import com.jooq.jooqDemo.jooq.domain.tables.Raadsmarine;
import com.jooq.jooqDemo.jooq.domain.tables.tables.records.BallRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Ball extends TableImpl<BallRecord> {

    private static final long serialVersionUID = -475516516;

    /**
     * The reference instance of <code>raadsmarine.ball</code>
     */
    public static final Ball BALL = new Ball();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BallRecord> getRecordType() {
        return BallRecord.class;
    }

    /**
     * The column <code>raadsmarine.ball.id</code>.
     */
    public final TableField<BallRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>raadsmarine.ball.tenant</code>.
     */
    public final TableField<BallRecord, String> TENANT = createField("tenant", org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>raadsmarine.ball.name</code>.
     */
    public final TableField<BallRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * Create a <code>raadsmarine.ball</code> table reference
     */
    public Ball() {
        this(DSL.name("ball"), null);
    }

    /**
     * Create an aliased <code>raadsmarine.ball</code> table reference
     */
    public Ball(String alias) {
        this(DSL.name(alias), BALL);
    }

    /**
     * Create an aliased <code>raadsmarine.ball</code> table reference
     */
    public Ball(Name alias) {
        this(alias, BALL);
    }

    private Ball(Name alias, Table<BallRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ball(Name alias, Table<BallRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.BALL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BallRecord> getPrimaryKey() {
        return Keys.KEY_BALL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BallRecord>> getKeys() {
        return Arrays.<UniqueKey<BallRecord>>asList(Keys.KEY_BALL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BallRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BallRecord, ?>>asList(Keys.FK_APPLE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ball as(String alias) {
        return new Ball(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ball as(Name alias) {
        return new Ball(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ball rename(String name) {
        return new Ball(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Ball rename(Name name) {
        return new Ball(name, null);
    }
}
