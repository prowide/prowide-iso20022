
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
 * Information related to the investor concentration.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorConcentration1", propOrder = {
    "rtlInvstrRate",
    "prfssnlInvstrRate"
})
public class InvestorConcentration1 {

    @XmlElement(name = "RtlInvstrRate", required = true)
    protected Liability1 rtlInvstrRate;
    @XmlElement(name = "PrfssnlInvstrRate", required = true)
    protected Liability1 prfssnlInvstrRate;

    /**
     * Gets the value of the rtlInvstrRate property.
     * 
     * @return
     *     possible object is
     *     {@link Liability1 }
     *     
     */
    public Liability1 getRtlInvstrRate() {
        return rtlInvstrRate;
    }

    /**
     * Sets the value of the rtlInvstrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Liability1 }
     *     
     */
    public InvestorConcentration1 setRtlInvstrRate(Liability1 value) {
        this.rtlInvstrRate = value;
        return this;
    }

    /**
     * Gets the value of the prfssnlInvstrRate property.
     * 
     * @return
     *     possible object is
     *     {@link Liability1 }
     *     
     */
    public Liability1 getPrfssnlInvstrRate() {
        return prfssnlInvstrRate;
    }

    /**
     * Sets the value of the prfssnlInvstrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Liability1 }
     *     
     */
    public InvestorConcentration1 setPrfssnlInvstrRate(Liability1 value) {
        this.prfssnlInvstrRate = value;
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
