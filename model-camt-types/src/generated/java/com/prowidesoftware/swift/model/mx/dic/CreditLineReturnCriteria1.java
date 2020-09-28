
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria used to report on credit line.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditLineReturnCriteria1", propOrder = {
    "ccyInd",
    "acctOwnrInd"
})
public class CreditLineReturnCriteria1 {

    @XmlElement(name = "CcyInd")
    protected Boolean ccyInd;
    @XmlElement(name = "AcctOwnrInd")
    protected Boolean acctOwnrInd;

    /**
     * Gets the value of the ccyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCcyInd() {
        return ccyInd;
    }

    /**
     * Sets the value of the ccyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CreditLineReturnCriteria1 setCcyInd(Boolean value) {
        this.ccyInd = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctOwnrInd() {
        return acctOwnrInd;
    }

    /**
     * Sets the value of the acctOwnrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CreditLineReturnCriteria1 setAcctOwnrInd(Boolean value) {
        this.acctOwnrInd = value;
        return this;
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

}
