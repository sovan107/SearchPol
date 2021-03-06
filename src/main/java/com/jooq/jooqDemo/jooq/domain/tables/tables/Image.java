/*
 * This file is generated by jOOQ.
*/
package com.jooq.jooqDemo.jooq.domain.tables.tables;


import com.jooq.jooqDemo.jooq.domain.tables.Indexes;
import com.jooq.jooqDemo.jooq.domain.tables.Keys;
import com.jooq.jooqDemo.jooq.domain.tables.Raadsmarine;
import com.jooq.jooqDemo.jooq.domain.tables.tables.records.ImageRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Image extends TableImpl<ImageRecord> {

    private static final long serialVersionUID = -1872580205;

    /**
     * The reference instance of <code>raadsmarine.Image</code>
     */
    public static final Image IMAGE = new Image();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ImageRecord> getRecordType() {
        return ImageRecord.class;
    }

    /**
     * The column <code>raadsmarine.Image.IMAGE_ID</code>.
     */
    public final TableField<ImageRecord, Long> IMAGE_ID = createField("IMAGE_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>raadsmarine.Image.IMAGE_DESCRIPTION</code>.
     */
    public final TableField<ImageRecord, String> IMAGE_DESCRIPTION = createField("IMAGE_DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>raadsmarine.Image.IMAGE_URL_HD</code>.
     */
    public final TableField<ImageRecord, String> IMAGE_URL_HD = createField("IMAGE_URL_HD", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>raadsmarine.Image.IMAGE_URL_LARGE</code>.
     */
    public final TableField<ImageRecord, String> IMAGE_URL_LARGE = createField("IMAGE_URL_LARGE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>raadsmarine.Image.IMAGE_URL_MEDIUM</code>.
     */
    public final TableField<ImageRecord, String> IMAGE_URL_MEDIUM = createField("IMAGE_URL_MEDIUM", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>raadsmarine.Image.IMAGE_URL_SMALL</code>.
     */
    public final TableField<ImageRecord, String> IMAGE_URL_SMALL = createField("IMAGE_URL_SMALL", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>raadsmarine.Image.product_PRODUCT_ID</code>.
     */
    public final TableField<ImageRecord, Long> PRODUCT_PRODUCT_ID = createField("product_PRODUCT_ID", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>raadsmarine.Image</code> table reference
     */
    public Image() {
        this(DSL.name("Image"), null);
    }

    /**
     * Create an aliased <code>raadsmarine.Image</code> table reference
     */
    public Image(String alias) {
        this(DSL.name(alias), IMAGE);
    }

    /**
     * Create an aliased <code>raadsmarine.Image</code> table reference
     */
    public Image(Name alias) {
        this(alias, IMAGE);
    }

    private Image(Name alias, Table<ImageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Image(Name alias, Table<ImageRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.IMAGE_FK_SI2J3FW2COJH0V72NT5SN0QFY, Indexes.IMAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ImageRecord, Long> getIdentity() {
        return Keys.IDENTITY_IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ImageRecord> getPrimaryKey() {
        return Keys.KEY_IMAGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ImageRecord>> getKeys() {
        return Arrays.<UniqueKey<ImageRecord>>asList(Keys.KEY_IMAGE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ImageRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ImageRecord, ?>>asList(Keys.FK_SI2J3FW2COJH0V72NT5SN0QFY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image as(String alias) {
        return new Image(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Image as(Name alias) {
        return new Image(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Image rename(String name) {
        return new Image(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Image rename(Name name) {
        return new Image(name, null);
    }
}
