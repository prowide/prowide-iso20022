
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between account information or an error report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReportOrError1Choice", propOrder = {
    "err",
    "acctRpt"
})
public class AccountReportOrError1Choice {

    @XmlElement(name = "Err")
    protected List<ErrorHandling3> err;
    @XmlElement(name = "AcctRpt")
    protected List<AccountReport14> acctRpt;

    /**
     * Gets the value of the err property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the err property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling3 }
     * 
     * 
     */
    public List<ErrorHandling3> getErr() {
        if (err == null) {
            err = new ArrayList<ErrorHandling3>();
        }
        return this.err;
    }

    /**
     * Gets the value of the acctRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountReport14 }
     * 
     * 
     */
    public List<AccountReport14> getAcctRpt() {
        if (acctRpt == null) {
            acctRpt = new ArrayList<AccountReport14>();
        }
        return this.acctRpt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the err list.
     * @see #getErr()
     * 
     */
    public AccountReportOrError1Choice addErr(ErrorHandling3 err) {
        getErr().add(err);
        return this;
    }

    /**
     * Adds a new item to the acctRpt list.
     * @see #getAcctRpt()
     * 
     */
    public AccountReportOrError1Choice addAcctRpt(AccountReport14 acctRpt) {
        getAcctRpt().add(acctRpt);
        return this;
    }

}
