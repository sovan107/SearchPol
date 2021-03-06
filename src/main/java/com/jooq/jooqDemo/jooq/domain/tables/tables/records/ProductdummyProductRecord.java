/*
 * This file is generated by jOOQ.
*/
package com.jooq.jooqDemo.jooq.domain.tables.tables.records;


import com.jooq.jooqDemo.jooq.domain.tables.tables.ProductdummyProduct;

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
public class ProductdummyProductRecord extends TableRecordImpl<ProductdummyProductRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = -1904106235;

    /**
     * Setter for <code>raadsmarine.ProductDummy_Product.ProductDummy_id</code>.
     */
    public void setProductdummyId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>raadsmarine.ProductDummy_Product.ProductDummy_id</code>.
     */
    public Long getProductdummyId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>raadsmarine.ProductDummy_Product.products_PRODUCT_ID</code>.
     */
    public void setProductsProductId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>raadsmarine.ProductDummy_Product.products_PRODUCT_ID</code>.
     */
    public Long getProductsProductId() {
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
        return ProductdummyProduct.PRODUCTDUMMY_PRODUCT.PRODUCTDUMMY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return ProductdummyProduct.PRODUCTDUMMY_PRODUCT.PRODUCTS_PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getProductdummyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getProductsProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getProductdummyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getProductsProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductdummyProductRecord value1(Long value) {
        setProductdummyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductdummyProductRecord value2(Long value) {
        setProductsProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductdummyProductRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductdummyProductRecord
     */
    public ProductdummyProductRecord() {
        super(ProductdummyProduct.PRODUCTDUMMY_PRODUCT);
    }

    /**
     * Create a detached, initialised ProductdummyProductRecord
     */
    public ProductdummyProductRecord(Long productdummyId, Long productsProductId) {
        super(ProductdummyProduct.PRODUCTDUMMY_PRODUCT);

        set(0, productdummyId);
        set(1, productsProductId);
    }
}
