
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
 * Specifies the status and optionally the sub status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAndSubStatus1", propOrder = {
    "stsCd",
    "subStsCd"
})
public class StatusAndSubStatus1 {

    @XmlElement(name = "StsCd", required = true)
    protected Status13Choice stsCd;
    @XmlElement(name = "SubStsCd")
    protected String subStsCd;

    /**
     * Gets the value of the stsCd property.
     * 
     * @return
     *     possible object is
     *     {@link Status13Choice }
     *     
     */
    public Status13Choice getStsCd() {
        return stsCd;
    }

    /**
     * Sets the value of the stsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status13Choice }
     *     
     */
    public StatusAndSubStatus1 setStsCd(Status13Choice value) {
        this.stsCd = value;
        return this;
    }

    /**
     * Gets the value of the subStsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStsCd() {
        return subStsCd;
    }

    /**
     * Sets the value of the subStsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatusAndSubStatus1 setSubStsCd(String value) {
        this.subStsCd = value;
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
