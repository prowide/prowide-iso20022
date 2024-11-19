
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
 * References linked to the trade leg notification cancellation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference18", propOrder = {
    "tradLegId",
    "prvsMsgId"
})
public class Reference18 {

    @XmlElement(name = "TradLegId", required = true)
    protected String tradLegId;
    @XmlElement(name = "PrvsMsgId")
    protected String prvsMsgId;

    /**
     * Gets the value of the tradLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradLegId() {
        return tradLegId;
    }

    /**
     * Sets the value of the tradLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference18 setTradLegId(String value) {
        this.tradLegId = value;
        return this;
    }

    /**
     * Gets the value of the prvsMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvsMsgId() {
        return prvsMsgId;
    }

    /**
     * Sets the value of the prvsMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference18 setPrvsMsgId(String value) {
        this.prvsMsgId = value;
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
