
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between account details or an operational error when the requested data cannot be retrieved.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountOrOperationalError2Choice", propOrder = {
    "acctRpt",
    "oprlErr"
})
public class AccountOrOperationalError2Choice {

    @XmlElement(name = "AcctRpt")
    protected List<AccountReport17> acctRpt;
    @XmlElement(name = "OprlErr")
    protected List<ErrorHandling4> oprlErr;

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
     * {@link AccountReport17 }
     * 
     * 
     */
    public List<AccountReport17> getAcctRpt() {
        if (acctRpt == null) {
            acctRpt = new ArrayList<AccountReport17>();
        }
        return this.acctRpt;
    }

    /**
     * Gets the value of the oprlErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oprlErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOprlErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling4 }
     * 
     * 
     */
    public List<ErrorHandling4> getOprlErr() {
        if (oprlErr == null) {
            oprlErr = new ArrayList<ErrorHandling4>();
        }
        return this.oprlErr;
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
     * Adds a new item to the acctRpt list.
     * @see #getAcctRpt()
     * 
     */
    public AccountOrOperationalError2Choice addAcctRpt(AccountReport17 acctRpt) {
        getAcctRpt().add(acctRpt);
        return this;
    }

    /**
     * Adds a new item to the oprlErr list.
     * @see #getOprlErr()
     * 
     */
    public AccountOrOperationalError2Choice addOprlErr(ErrorHandling4 oprlErr) {
        getOprlErr().add(oprlErr);
        return this;
    }

}
