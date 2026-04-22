
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information on the type of investors in relation to a corporate action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorTypeIdentification1", propOrder = {
    "invstrTpId",
    "invstrTpIdNrrtv"
})
public class InvestorTypeIdentification1 {

    @XmlElement(name = "InvstrTpId", required = true)
    @XmlSchemaType(name = "string")
    protected InvestorClassificationType1Code invstrTpId;
    @XmlElement(name = "InvstrTpIdNrrtv")
    protected String invstrTpIdNrrtv;

    /**
     * Gets the value of the invstrTpId property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorClassificationType1Code }
     *     
     */
    public InvestorClassificationType1Code getInvstrTpId() {
        return invstrTpId;
    }

    /**
     * Sets the value of the invstrTpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorClassificationType1Code }
     *     
     */
    public InvestorTypeIdentification1 setInvstrTpId(InvestorClassificationType1Code value) {
        this.invstrTpId = value;
        return this;
    }

    /**
     * Gets the value of the invstrTpIdNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvstrTpIdNrrtv() {
        return invstrTpIdNrrtv;
    }

    /**
     * Sets the value of the invstrTpIdNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestorTypeIdentification1 setInvstrTpIdNrrtv(String value) {
        this.invstrTpIdNrrtv = value;
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
