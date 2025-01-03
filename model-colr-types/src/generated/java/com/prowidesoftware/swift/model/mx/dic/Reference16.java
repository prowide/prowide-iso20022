
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
 * Provides the identification of the collateral message cancellation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference16", propOrder = {
    "collMsgCxlReqId"
})
public class Reference16 {

    @XmlElement(name = "CollMsgCxlReqId", required = true)
    protected String collMsgCxlReqId;

    /**
     * Gets the value of the collMsgCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollMsgCxlReqId() {
        return collMsgCxlReqId;
    }

    /**
     * Sets the value of the collMsgCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference16 setCollMsgCxlReqId(String value) {
        this.collMsgCxlReqId = value;
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
