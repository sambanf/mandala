/*
 * This file is generated by jOOQ.
*/
package database.generated.tables;


import database.generated.DefaultSchema;
import database.generated.Keys;
import database.generated.tables.records.AccountRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Account extends TableImpl<AccountRecord> {

    private static final long serialVersionUID = 1218587334;

    /**
     * The reference instance of <code>Account</code>
     */
    public static final Account ACCOUNT = new Account();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountRecord> getRecordType() {
        return AccountRecord.class;
    }

    /**
     * The column <code>Account.ID</code>.
     */
    public final TableField<AccountRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Account.USER_TYPE</code>.
     */
    public final TableField<AccountRecord, byte[]> USER_TYPE = createField("USER_TYPE", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>Account.NAMA_DEPAN</code>.
     */
    public final TableField<AccountRecord, String> NAMA_DEPAN = createField("NAMA_DEPAN", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>Account.NAMA_BELAKANG</code>.
     */
    public final TableField<AccountRecord, String> NAMA_BELAKANG = createField("NAMA_BELAKANG", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Account.email</code>.
     */
    public final TableField<AccountRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Account.phonenumber</code>.
     */
    public final TableField<AccountRecord, String> PHONENUMBER = createField("phonenumber", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Account.state_id</code>.
     */
    public final TableField<AccountRecord, Integer> STATE_ID = createField("state_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Account.country_id</code>.
     */
    public final TableField<AccountRecord, Integer> COUNTRY_ID = createField("country_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Account.city_id</code>.
     */
    public final TableField<AccountRecord, Integer> CITY_ID = createField("city_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Account</code> table reference
     */
    public Account() {
        this(DSL.name("Account"), null);
    }

    /**
     * Create an aliased <code>Account</code> table reference
     */
    public Account(String alias) {
        this(DSL.name(alias), ACCOUNT);
    }

    /**
     * Create an aliased <code>Account</code> table reference
     */
    public Account(Name alias) {
        this(alias, ACCOUNT);
    }

    private Account(Name alias, Table<AccountRecord> aliased) {
        this(alias, aliased, null);
    }

    private Account(Name alias, Table<AccountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AccountRecord> getPrimaryKey() {
        return Keys.PK_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AccountRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountRecord>>asList(Keys.PK_ACCOUNT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<AccountRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AccountRecord, ?>>asList(Keys.FK_ACCOUNT_STATES_1, Keys.FK_ACCOUNT_COUNTRIES_1, Keys.FK_ACCOUNT_CITIES_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account as(String alias) {
        return new Account(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account as(Name alias) {
        return new Account(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Account rename(String name) {
        return new Account(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Account rename(Name name) {
        return new Account(name, null);
    }
}