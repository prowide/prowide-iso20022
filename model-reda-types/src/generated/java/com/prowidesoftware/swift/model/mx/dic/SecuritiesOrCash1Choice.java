
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
 * Choice of securities or cash parties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOrCash1Choice", propOrder = {
    "sctiesDtls",
    "cshPtiesDtls"
})
public class SecuritiesOrCash1Choice {

    @XmlElement(name = "SctiesDtls")
    protected SettlementParties35 sctiesDtls;
    @XmlElement(name = "CshPtiesDtls")
    protected CashParties24 cshPtiesDtls;

    /**
     * Gets the value of the sctiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties35 }
     *     
     */
    public SettlementParties35 getSctiesDtls() {
        return sctiesDtls;
    }

    /**
     * Sets the value of the sctiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties35 }
     *     
     */
    public SecuritiesOrCash1Choice setSctiesDtls(SettlementParties35 value) {
        this.sctiesDtls = value;
        return this;
    }

    /**
     * Gets the value of the cshPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties24 }
     *     
     */
    public CashParties24 getCshPtiesDtls() {
        return cshPtiesDtls;
    }

    /**
     * Sets the value of the cshPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties24 }
     *     
     */
    public SecuritiesOrCash1Choice setCshPtiesDtls(CashParties24 value) {
        this.cshPtiesDtls = value;
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
