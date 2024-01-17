
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Settlement details to determine whether payment is a credit or debit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementMethod4Choice", propOrder = {
    "cdt",
    "dbt"
})
public class SettlementMethod4Choice {

    @XmlElement(name = "Cdt")
    protected CreditTransferTransaction51 cdt;
    @XmlElement(name = "Dbt")
    protected CreditTransferTransaction51 dbt;

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction51 }
     *     
     */
    public CreditTransferTransaction51 getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction51 }
     *     
     */
    public SettlementMethod4Choice setCdt(CreditTransferTransaction51 value) {
        this.cdt = value;
        return this;
    }

    /**
     * Gets the value of the dbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction51 }
     *     
     */
    public CreditTransferTransaction51 getDbt() {
        return dbt;
    }

    /**
     * Sets the value of the dbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction51 }
     *     
     */
    public SettlementMethod4Choice setDbt(CreditTransferTransaction51 value) {
        this.dbt = value;
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
