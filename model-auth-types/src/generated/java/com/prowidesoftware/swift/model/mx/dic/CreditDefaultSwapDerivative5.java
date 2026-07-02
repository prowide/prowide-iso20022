
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
 * Credit default swap derivative specific for reporting derivatives on a credit default swap index.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDefaultSwapDerivative5", propOrder = {
    "undrlygCdtDfltSwpId",
    "undrlygCdtDfltSwpIndx"
})
public class CreditDefaultSwapDerivative5 {

    @XmlElement(name = "UndrlygCdtDfltSwpId")
    protected String undrlygCdtDfltSwpId;
    @XmlElement(name = "UndrlygCdtDfltSwpIndx", required = true)
    protected CreditDefaultSwapIndex3 undrlygCdtDfltSwpIndx;

    /**
     * Gets the value of the undrlygCdtDfltSwpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndrlygCdtDfltSwpId() {
        return undrlygCdtDfltSwpId;
    }

    /**
     * Sets the value of the undrlygCdtDfltSwpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditDefaultSwapDerivative5 setUndrlygCdtDfltSwpId(String value) {
        this.undrlygCdtDfltSwpId = value;
        return this;
    }

    /**
     * Gets the value of the undrlygCdtDfltSwpIndx property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapIndex3 }
     *     
     */
    public CreditDefaultSwapIndex3 getUndrlygCdtDfltSwpIndx() {
        return undrlygCdtDfltSwpIndx;
    }

    /**
     * Sets the value of the undrlygCdtDfltSwpIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapIndex3 }
     *     
     */
    public CreditDefaultSwapDerivative5 setUndrlygCdtDfltSwpIndx(CreditDefaultSwapIndex3 value) {
        this.undrlygCdtDfltSwpIndx = value;
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
