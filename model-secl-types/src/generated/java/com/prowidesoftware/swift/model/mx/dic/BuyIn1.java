
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
 * Specifies elements related to the notification (or warn) sent by the central counterparty to the clearing member in the context of the buy in process.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyIn1", propOrder = {
    "wrngInd",
    "xpctdBuyInDt"
})
public class BuyIn1 {

    @XmlElement(name = "WrngInd")
    protected Boolean wrngInd;
    @XmlElement(name = "XpctdBuyInDt", required = true)
    protected DateFormat15Choice xpctdBuyInDt;

    /**
     * Gets the value of the wrngInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWrngInd() {
        return wrngInd;
    }

    /**
     * Sets the value of the wrngInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BuyIn1 setWrngInd(Boolean value) {
        this.wrngInd = value;
        return this;
    }

    /**
     * Gets the value of the xpctdBuyInDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat15Choice }
     *     
     */
    public DateFormat15Choice getXpctdBuyInDt() {
        return xpctdBuyInDt;
    }

    /**
     * Sets the value of the xpctdBuyInDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat15Choice }
     *     
     */
    public BuyIn1 setXpctdBuyInDt(DateFormat15Choice value) {
        this.xpctdBuyInDt = value;
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
