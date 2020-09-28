
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
@XmlType(name = "SettlementMethod1Choice", propOrder = {
    "cdt",
    "dbt"
})
public class SettlementMethod1Choice {

    @XmlElement(name = "Cdt")
    protected CreditTransferTransaction27 cdt;
    @XmlElement(name = "Dbt")
    protected CreditTransferTransaction27 dbt;

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction27 }
     *     
     */
    public CreditTransferTransaction27 getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction27 }
     *     
     */
    public SettlementMethod1Choice setCdt(CreditTransferTransaction27 value) {
        this.cdt = value;
        return this;
    }

    /**
     * Gets the value of the dbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferTransaction27 }
     *     
     */
    public CreditTransferTransaction27 getDbt() {
        return dbt;
    }

    /**
     * Sets the value of the dbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferTransaction27 }
     *     
     */
    public SettlementMethod1Choice setDbt(CreditTransferTransaction27 value) {
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
