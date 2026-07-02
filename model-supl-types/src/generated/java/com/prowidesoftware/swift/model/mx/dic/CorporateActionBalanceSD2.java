
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
 * Provides additional information regarding corporate action balance details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionBalanceSD2", propOrder = {
    "plcAndNm",
    "ttlUcvrdPrtctBal"
})
public class CorporateActionBalanceSD2 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "TtlUcvrdPrtctBal")
    protected SignedQuantityFormat9 ttlUcvrdPrtctBal;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionBalanceSD2 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the ttlUcvrdPrtctBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getTtlUcvrdPrtctBal() {
        return ttlUcvrdPrtctBal;
    }

    /**
     * Sets the value of the ttlUcvrdPrtctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceSD2 setTtlUcvrdPrtctBal(SignedQuantityFormat9 value) {
        this.ttlUcvrdPrtctBal = value;
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
