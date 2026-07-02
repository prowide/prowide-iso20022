
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
 * Specific trade account for recording debits and credits to general accounting, cost accounting or budget accounting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingAccount1", propOrder = {
    "id",
    "costRefPttrn"
})
public class AccountingAccount1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "CostRefPttrn")
    protected String costRefPttrn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountingAccount1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the costRefPttrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostRefPttrn() {
        return costRefPttrn;
    }

    /**
     * Sets the value of the costRefPttrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountingAccount1 setCostRefPttrn(String value) {
        this.costRefPttrn = value;
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
