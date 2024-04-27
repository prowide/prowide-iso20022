
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
 * Settlement details to determine whether payment is a credit or debit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementMethod5Choice", propOrder = {
    "cdt",
    "dbt"
})
public class SettlementMethod5Choice {

    @XmlElement(name = "Cdt")
    protected CreditTransferTransaction59 cdt;
    @XmlElement(name = "Dbt")
    protected CreditTransferTransaction59 dbt;

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction59 }
     *     
     */
    public CreditTransferTransaction59 getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction59 }
     *     
     */
    public SettlementMethod5Choice setCdt(CreditTransferTransaction59 value) {
        this.cdt = value;
        return this;
    }

    /**
     * Gets the value of the dbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction59 }
     *     
     */
    public CreditTransferTransaction59 getDbt() {
        return dbt;
    }

    /**
     * Sets the value of the dbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction59 }
     *     
     */
    public SettlementMethod5Choice setDbt(CreditTransferTransaction59 value) {
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
