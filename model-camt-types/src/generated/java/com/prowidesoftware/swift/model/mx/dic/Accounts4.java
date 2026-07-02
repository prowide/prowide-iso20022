
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
 * Reports on accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accounts4", propOrder = {
    "acctRpt"
})
public class Accounts4 {

    @XmlElement(name = "AcctRpt", required = true)
    protected List<AccountReport10> acctRpt;

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
     * {@link AccountReport10 }
     * 
     * 
     */
    public List<AccountReport10> getAcctRpt() {
        if (acctRpt == null) {
            acctRpt = new ArrayList<AccountReport10>();
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
     * Adds a new item to the acctRpt list.
     * @see #getAcctRpt()
     * 
     */
    public Accounts4 addAcctRpt(AccountReport10 acctRpt) {
        getAcctRpt().add(acctRpt);
        return this;
    }

}
