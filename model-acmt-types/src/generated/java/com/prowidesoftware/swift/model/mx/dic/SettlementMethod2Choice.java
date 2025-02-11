
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
@XmlType(name = "SettlementMethod2Choice", propOrder = {
    "cdt",
    "dbt"
})
public class SettlementMethod2Choice {

    @XmlElement(name = "Cdt")
    protected CreditTransferTransaction33 cdt;
    @XmlElement(name = "Dbt")
    protected CreditTransferTransaction33 dbt;

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction33 }
     *     
     */
    public CreditTransferTransaction33 getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction33 }
     *     
     */
    public SettlementMethod2Choice setCdt(CreditTransferTransaction33 value) {
        this.cdt = value;
        return this;
    }

    /**
     * Gets the value of the dbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction33 }
     *     
     */
    public CreditTransferTransaction33 getDbt() {
        return dbt;
    }

    /**
     * Sets the value of the dbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction33 }
     *     
     */
    public SettlementMethod2Choice setDbt(CreditTransferTransaction33 value) {
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
