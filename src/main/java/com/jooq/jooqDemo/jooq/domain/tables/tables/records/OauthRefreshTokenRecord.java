/*
 * This file is generated by jOOQ.
*/
package com.jooq.jooqDemo.jooq.domain.tables.tables.records;


import com.jooq.jooqDemo.jooq.domain.tables.tables.OauthRefreshToken;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class OauthRefreshTokenRecord extends UpdatableRecordImpl<OauthRefreshTokenRecord> implements Record3<String, byte[], byte[]> {

    private static final long serialVersionUID = -411861199;

    /**
     * Setter for <code>raadsmarine.oauth_refresh_token.token_id</code>.
     */
    public void setTokenId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>raadsmarine.oauth_refresh_token.token_id</code>.
     */
    public String getTokenId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>raadsmarine.oauth_refresh_token.authentication</code>.
     */
    public void setAuthentication(byte... value) {
        set(1, value);
    }

    /**
     * Getter for <code>raadsmarine.oauth_refresh_token.authentication</code>.
     */
    public byte[] getAuthentication() {
        return (byte[]) get(1);
    }

    /**
     * Setter for <code>raadsmarine.oauth_refresh_token.token</code>.
     */
    public void setToken(byte... value) {
        set(2, value);
    }

    /**
     * Getter for <code>raadsmarine.oauth_refresh_token.token</code>.
     */
    public byte[] getToken() {
        return (byte[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, byte[], byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, byte[], byte[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return OauthRefreshToken.OAUTH_REFRESH_TOKEN.TOKEN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field2() {
        return OauthRefreshToken.OAUTH_REFRESH_TOKEN.AUTHENTICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field3() {
        return OauthRefreshToken.OAUTH_REFRESH_TOKEN.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTokenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component2() {
        return getAuthentication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component3() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTokenId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value2() {
        return getAuthentication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value3() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthRefreshTokenRecord value1(String value) {
        setTokenId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthRefreshTokenRecord value2(byte... value) {
        setAuthentication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthRefreshTokenRecord value3(byte... value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthRefreshTokenRecord values(String value1, byte[] value2, byte[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OauthRefreshTokenRecord
     */
    public OauthRefreshTokenRecord() {
        super(OauthRefreshToken.OAUTH_REFRESH_TOKEN);
    }

    /**
     * Create a detached, initialised OauthRefreshTokenRecord
     */
    public OauthRefreshTokenRecord(String tokenId, byte[] authentication, byte[] token) {
        super(OauthRefreshToken.OAUTH_REFRESH_TOKEN);

        set(0, tokenId);
        set(1, authentication);
        set(2, token);
    }
}