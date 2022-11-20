
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Operational construct of a central counterparty that defines the relationship between collateral, margin and position accounts and upon default of a clearing member defines the segregation of losses on positions and assets held in such accounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingAccount1", propOrder = {
    "acctTp",
    "collAcctOwnr"
})
public class ClearingAccount1 {

    @XmlElement(name = "AcctTp", required = true)
    @XmlSchemaType(name = "string")
    protected ClearingAccountType3Code acctTp;
    @XmlElement(name = "CollAcctOwnr", required = true)
    protected List<CollateralAccount5> collAcctOwnr;

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingAccountType3Code }
     *     
     */
    public ClearingAccountType3Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingAccountType3Code }
     *     
     */
    public ClearingAccount1 setAcctTp(ClearingAccountType3Code value) {
        this.acctTp = value;
        return this;
    }

    /**
     * Gets the value of the collAcctOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collAcctOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollAcctOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralAccount5 }
     * 
     * 
     */
    public List<CollateralAccount5> getCollAcctOwnr() {
        if (collAcctOwnr == null) {
            collAcctOwnr = new ArrayList<CollateralAccount5>();
        }
        return this.collAcctOwnr;
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
     * Adds a new item to the collAcctOwnr list.
     * @see #getCollAcctOwnr()
     * 
     */
    public ClearingAccount1 addCollAcctOwnr(CollateralAccount5 collAcctOwnr) {
        getCollAcctOwnr().add(collAcctOwnr);
        return this;
    }

}
