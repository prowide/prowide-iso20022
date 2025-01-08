
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
 * Sensitive data associated with a payment card.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlainCardData20", propOrder = {
    "drvrOrVhclId",
    "addtlCardData"
})
public class PlainCardData20 {

    @XmlElement(name = "DrvrOrVhclId")
    protected String drvrOrVhclId;
    @XmlElement(name = "AddtlCardData")
    protected String addtlCardData;

    /**
     * Gets the value of the drvrOrVhclId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrOrVhclId() {
        return drvrOrVhclId;
    }

    /**
     * Sets the value of the drvrOrVhclId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData20 setDrvrOrVhclId(String value) {
        this.drvrOrVhclId = value;
        return this;
    }

    /**
     * Gets the value of the addtlCardData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlCardData() {
        return addtlCardData;
    }

    /**
     * Sets the value of the addtlCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData20 setAddtlCardData(String value) {
        this.addtlCardData = value;
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
