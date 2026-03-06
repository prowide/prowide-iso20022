
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
 * Intra-position type used to specify pairs of from/to balances.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionType2__1", propOrder = {
    "balFr",
    "balTo"
})
public class IntraPositionType21 {

    @XmlElement(name = "BalFr")
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt028Draft balFr;
    @XmlElement(name = "BalTo")
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt028Draft balTo;

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt028Draft }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt028Draft getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt028Draft }
     *     
     */
    public IntraPositionType21 setBalFr(SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt028Draft value) {
        this.balFr = value;
        return this;
    }

    /**
     * Gets the value of the balTo property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt028Draft }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt028Draft getBalTo() {
        return balTo;
    }

    /**
     * Sets the value of the balTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt028Draft }
     *     
     */
    public IntraPositionType21 setBalTo(SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt028Draft value) {
        this.balTo = value;
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
