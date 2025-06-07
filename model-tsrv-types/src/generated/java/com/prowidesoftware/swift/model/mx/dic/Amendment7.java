
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the amendment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amendment7", propOrder = {
    "amdmntId",
    "amdmntSts"
})
public class Amendment7 {

    @XmlElement(name = "AmdmntId", required = true)
    protected Amendment8 amdmntId;
    @XmlElement(name = "AmdmntSts", required = true)
    @XmlSchemaType(name = "string")
    protected UndertakingStatus2Code amdmntSts;

    /**
     * Gets the value of the amdmntId property.
     * 
     * @return
     *     possible object is
     *     {@link Amendment8 }
     *     
     */
    public Amendment8 getAmdmntId() {
        return amdmntId;
    }

    /**
     * Sets the value of the amdmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amendment8 }
     *     
     */
    public Amendment7 setAmdmntId(Amendment8 value) {
        this.amdmntId = value;
        return this;
    }

    /**
     * Gets the value of the amdmntSts property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingStatus2Code }
     *     
     */
    public UndertakingStatus2Code getAmdmntSts() {
        return amdmntSts;
    }

    /**
     * Sets the value of the amdmntSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingStatus2Code }
     *     
     */
    public Amendment7 setAmdmntSts(UndertakingStatus2Code value) {
        this.amdmntSts = value;
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
