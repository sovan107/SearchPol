/*
 * This file is generated by jOOQ.
*/
package com.jooq.jooqDemo.jooq.domain.tables;


import com.jooq.jooqDemo.jooq.domain.tables.tables.Apple;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Audit;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Ball;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Category;
import com.jooq.jooqDemo.jooq.domain.tables.tables.ChildLookup;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Feedback;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Image;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Manufacturer;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Meeting;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Module;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Mycompanyinfo;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Notice;
import com.jooq.jooqDemo.jooq.domain.tables.tables.NoticeRole;
import com.jooq.jooqDemo.jooq.domain.tables.tables.OauthAccessToken;
import com.jooq.jooqDemo.jooq.domain.tables.tables.OauthApprovals;
import com.jooq.jooqDemo.jooq.domain.tables.tables.OauthClientDetails;
import com.jooq.jooqDemo.jooq.domain.tables.tables.OauthClientToken;
import com.jooq.jooqDemo.jooq.domain.tables.tables.OauthCode;
import com.jooq.jooqDemo.jooq.domain.tables.tables.OauthRefreshToken;
import com.jooq.jooqDemo.jooq.domain.tables.tables.ParentLookup;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Product;
import com.jooq.jooqDemo.jooq.domain.tables.tables.ProductDetails;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Productdummy;
import com.jooq.jooqDemo.jooq.domain.tables.tables.ProductdummyProduct;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Role;
import com.jooq.jooqDemo.jooq.domain.tables.tables.RoleModule;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Services;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Staff;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Standard;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Student;
import com.jooq.jooqDemo.jooq.domain.tables.tables.User;
import com.jooq.jooqDemo.jooq.domain.tables.tables.Userrolemapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Raadsmarine extends SchemaImpl {

    private static final long serialVersionUID = -1911796110;

    /**
     * The reference instance of <code>raadsmarine</code>
     */
    public static final Raadsmarine RAADSMARINE = new Raadsmarine();

    /**
     * The table <code>raadsmarine.apple</code>.
     */
    public final Apple APPLE = com.jooq.jooqDemo.jooq.domain.tables.tables.Apple.APPLE;

    /**
     * The table <code>raadsmarine.Audit</code>.
     */
    public final Audit AUDIT = com.jooq.jooqDemo.jooq.domain.tables.tables.Audit.AUDIT;

    /**
     * The table <code>raadsmarine.ball</code>.
     */
    public final Ball BALL = com.jooq.jooqDemo.jooq.domain.tables.tables.Ball.BALL;

    /**
     * The table <code>raadsmarine.Category</code>.
     */
    public final Category CATEGORY = com.jooq.jooqDemo.jooq.domain.tables.tables.Category.CATEGORY;

    /**
     * The table <code>raadsmarine.CHILD_LOOKUP</code>.
     */
    public final ChildLookup CHILD_LOOKUP = com.jooq.jooqDemo.jooq.domain.tables.tables.ChildLookup.CHILD_LOOKUP;

    /**
     * The table <code>raadsmarine.Feedback</code>.
     */
    public final Feedback FEEDBACK = com.jooq.jooqDemo.jooq.domain.tables.tables.Feedback.FEEDBACK;

    /**
     * The table <code>raadsmarine.Image</code>.
     */
    public final Image IMAGE = com.jooq.jooqDemo.jooq.domain.tables.tables.Image.IMAGE;

    /**
     * The table <code>raadsmarine.Manufacturer</code>.
     */
    public final Manufacturer MANUFACTURER = com.jooq.jooqDemo.jooq.domain.tables.tables.Manufacturer.MANUFACTURER;

    /**
     * The table <code>raadsmarine.MEETING</code>.
     */
    public final Meeting MEETING = com.jooq.jooqDemo.jooq.domain.tables.tables.Meeting.MEETING;

    /**
     * The table <code>raadsmarine.MODULE</code>.
     */
    public final Module MODULE = com.jooq.jooqDemo.jooq.domain.tables.tables.Module.MODULE;

    /**
     * The table <code>raadsmarine.MyCompanyInfo</code>.
     */
    public final Mycompanyinfo MYCOMPANYINFO = com.jooq.jooqDemo.jooq.domain.tables.tables.Mycompanyinfo.MYCOMPANYINFO;

    /**
     * The table <code>raadsmarine.NOTICE</code>.
     */
    public final Notice NOTICE = com.jooq.jooqDemo.jooq.domain.tables.tables.Notice.NOTICE;

    /**
     * The table <code>raadsmarine.NOTICE_Role</code>.
     */
    public final NoticeRole NOTICE_ROLE = com.jooq.jooqDemo.jooq.domain.tables.tables.NoticeRole.NOTICE_ROLE;

    /**
     * The table <code>raadsmarine.oauth_access_token</code>.
     */
    public final OauthAccessToken OAUTH_ACCESS_TOKEN = com.jooq.jooqDemo.jooq.domain.tables.tables.OauthAccessToken.OAUTH_ACCESS_TOKEN;

    /**
     * The table <code>raadsmarine.oauth_approvals</code>.
     */
    public final OauthApprovals OAUTH_APPROVALS = com.jooq.jooqDemo.jooq.domain.tables.tables.OauthApprovals.OAUTH_APPROVALS;

    /**
     * The table <code>raadsmarine.oauth_client_details</code>.
     */
    public final OauthClientDetails OAUTH_CLIENT_DETAILS = com.jooq.jooqDemo.jooq.domain.tables.tables.OauthClientDetails.OAUTH_CLIENT_DETAILS;

    /**
     * The table <code>raadsmarine.oauth_client_token</code>.
     */
    public final OauthClientToken OAUTH_CLIENT_TOKEN = com.jooq.jooqDemo.jooq.domain.tables.tables.OauthClientToken.OAUTH_CLIENT_TOKEN;

    /**
     * The table <code>raadsmarine.oauth_code</code>.
     */
    public final OauthCode OAUTH_CODE = com.jooq.jooqDemo.jooq.domain.tables.tables.OauthCode.OAUTH_CODE;

    /**
     * The table <code>raadsmarine.oauth_refresh_token</code>.
     */
    public final OauthRefreshToken OAUTH_REFRESH_TOKEN = com.jooq.jooqDemo.jooq.domain.tables.tables.OauthRefreshToken.OAUTH_REFRESH_TOKEN;

    /**
     * The table <code>raadsmarine.PARENT_LOOKUP</code>.
     */
    public final ParentLookup PARENT_LOOKUP = com.jooq.jooqDemo.jooq.domain.tables.tables.ParentLookup.PARENT_LOOKUP;

    /**
     * The table <code>raadsmarine.Product</code>.
     */
    public final Product PRODUCT = com.jooq.jooqDemo.jooq.domain.tables.tables.Product.PRODUCT;

    /**
     * The table <code>raadsmarine.ProductDummy</code>.
     */
    public final Productdummy PRODUCTDUMMY = com.jooq.jooqDemo.jooq.domain.tables.tables.Productdummy.PRODUCTDUMMY;

    /**
     * The table <code>raadsmarine.ProductDummy_Product</code>.
     */
    public final ProductdummyProduct PRODUCTDUMMY_PRODUCT = com.jooq.jooqDemo.jooq.domain.tables.tables.ProductdummyProduct.PRODUCTDUMMY_PRODUCT;

    /**
     * The table <code>raadsmarine.PRODUCT_DETAILS</code>.
     */
    public final ProductDetails PRODUCT_DETAILS = com.jooq.jooqDemo.jooq.domain.tables.tables.ProductDetails.PRODUCT_DETAILS;

    /**
     * The table <code>raadsmarine.Role</code>.
     */
    public final Role ROLE = com.jooq.jooqDemo.jooq.domain.tables.tables.Role.ROLE;

    /**
     * The table <code>raadsmarine.ROLE_MODULE</code>.
     */
    public final RoleModule ROLE_MODULE = com.jooq.jooqDemo.jooq.domain.tables.tables.RoleModule.ROLE_MODULE;

    /**
     * The table <code>raadsmarine.Services</code>.
     */
    public final Services SERVICES = com.jooq.jooqDemo.jooq.domain.tables.tables.Services.SERVICES;

    /**
     * The table <code>raadsmarine.STAFF</code>.
     */
    public final Staff STAFF = com.jooq.jooqDemo.jooq.domain.tables.tables.Staff.STAFF;

    /**
     * The table <code>raadsmarine.STANDARD</code>.
     */
    public final Standard STANDARD = com.jooq.jooqDemo.jooq.domain.tables.tables.Standard.STANDARD;

    /**
     * The table <code>raadsmarine.STUDENT</code>.
     */
    public final Student STUDENT = com.jooq.jooqDemo.jooq.domain.tables.tables.Student.STUDENT;

    /**
     * The table <code>raadsmarine.user</code>.
     */
    public final User USER = com.jooq.jooqDemo.jooq.domain.tables.tables.User.USER;

    /**
     * The table <code>raadsmarine.UserRoleMapping</code>.
     */
    public final Userrolemapping USERROLEMAPPING = com.jooq.jooqDemo.jooq.domain.tables.tables.Userrolemapping.USERROLEMAPPING;

    /**
     * No further instances allowed
     */
    private Raadsmarine() {
        super("raadsmarine", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Apple.APPLE,
            Audit.AUDIT,
            Ball.BALL,
            Category.CATEGORY,
            ChildLookup.CHILD_LOOKUP,
            Feedback.FEEDBACK,
            Image.IMAGE,
            Manufacturer.MANUFACTURER,
            Meeting.MEETING,
            Module.MODULE,
            Mycompanyinfo.MYCOMPANYINFO,
            Notice.NOTICE,
            NoticeRole.NOTICE_ROLE,
            OauthAccessToken.OAUTH_ACCESS_TOKEN,
            OauthApprovals.OAUTH_APPROVALS,
            OauthClientDetails.OAUTH_CLIENT_DETAILS,
            OauthClientToken.OAUTH_CLIENT_TOKEN,
            OauthCode.OAUTH_CODE,
            OauthRefreshToken.OAUTH_REFRESH_TOKEN,
            ParentLookup.PARENT_LOOKUP,
            Product.PRODUCT,
            Productdummy.PRODUCTDUMMY,
            ProductdummyProduct.PRODUCTDUMMY_PRODUCT,
            ProductDetails.PRODUCT_DETAILS,
            Role.ROLE,
            RoleModule.ROLE_MODULE,
            Services.SERVICES,
            Staff.STAFF,
            Standard.STANDARD,
            Student.STUDENT,
            User.USER,
            Userrolemapping.USERROLEMAPPING);
    }
}