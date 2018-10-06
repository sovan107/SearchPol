/*
 * This file is generated by jOOQ.
*/
package com.jooq.jooqDemo.jooq.domain.tables.tables;


import com.jooq.jooqDemo.jooq.domain.tables.Indexes;
import com.jooq.jooqDemo.jooq.domain.tables.Keys;
import com.jooq.jooqDemo.jooq.domain.tables.Raadsmarine;
import com.jooq.jooqDemo.jooq.domain.tables.tables.records.OauthClientTokenRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class OauthClientToken extends TableImpl<OauthClientTokenRecord> {

    private static final long serialVersionUID = -2119432047;

    /**
     * The reference instance of <code>raadsmarine.oauth_client_token</code>
     */
    public static final OauthClientToken OAUTH_CLIENT_TOKEN = new OauthClientToken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OauthClientTokenRecord> getRecordType() {
        return OauthClientTokenRecord.class;
    }

    /**
     * The column <code>raadsmarine.oauth_client_token.authentication_id</code>.
     */
    public final TableField<OauthClientTokenRecord, String> AUTHENTICATION_ID = createField("authentication_id", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>raadsmarine.oauth_client_token.client_id</code>.
     */
    public final TableField<OauthClientTokenRecord, String> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>raadsmarine.oauth_client_token.token</code>.
     */
    public final TableField<OauthClientTokenRecord, byte[]> TOKEN = createField("token", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>raadsmarine.oauth_client_token.token_id</code>.
     */
    public final TableField<OauthClientTokenRecord, String> TOKEN_ID = createField("token_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>raadsmarine.oauth_client_token.user_name</code>.
     */
    public final TableField<OauthClientTokenRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>raadsmarine.oauth_client_token</code> table reference
     */
    public OauthClientToken() {
        this(DSL.name("oauth_client_token"), null);
    }

    /**
     * Create an aliased <code>raadsmarine.oauth_client_token</code> table reference
     */
    public OauthClientToken(String alias) {
        this(DSL.name(alias), OAUTH_CLIENT_TOKEN);
    }

    /**
     * Create an aliased <code>raadsmarine.oauth_client_token</code> table reference
     */
    public OauthClientToken(Name alias) {
        this(alias, OAUTH_CLIENT_TOKEN);
    }

    private OauthClientToken(Name alias, Table<OauthClientTokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private OauthClientToken(Name alias, Table<OauthClientTokenRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.OAUTH_CLIENT_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OauthClientTokenRecord> getPrimaryKey() {
        return Keys.KEY_OAUTH_CLIENT_TOKEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OauthClientTokenRecord>> getKeys() {
        return Arrays.<UniqueKey<OauthClientTokenRecord>>asList(Keys.KEY_OAUTH_CLIENT_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientToken as(String alias) {
        return new OauthClientToken(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthClientToken as(Name alias) {
        return new OauthClientToken(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthClientToken rename(String name) {
        return new OauthClientToken(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthClientToken rename(Name name) {
        return new OauthClientToken(name, null);
    }
}
