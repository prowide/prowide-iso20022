
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
 * Provides the summation of the call amounts per margin type and optionaly the default fund amount (only for CCP).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCallResult3", propOrder = {
    "dfltFndAmt",
    "mrgnCallRslt"
})
public class MarginCallResult3 {

    @XmlElement(name = "DfltFndAmt")
    protected ActiveCurrencyAndAmount dfltFndAmt;
    @XmlElement(name = "MrgnCallRslt", required = true)
    protected MarginCallResult2Choice mrgnCallRslt;

    /**
     * Gets the value of the dfltFndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDfltFndAmt() {
        return dfltFndAmt;
    }

    /**
     * Sets the value of the dfltFndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public MarginCallResult3 setDfltFndAmt(ActiveCurrencyAndAmount value) {
        this.dfltFndAmt = value;
        return this;
    }

    /**
     * Gets the value of the mrgnCallRslt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCallResult2Choice }
     *     
     */
    public MarginCallResult2Choice getMrgnCallRslt() {
        return mrgnCallRslt;
    }

    /**
     * Sets the value of the mrgnCallRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCallResult2Choice }
     *     
     */
    public MarginCallResult3 setMrgnCallRslt(MarginCallResult2Choice value) {
        this.mrgnCallRslt = value;
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
