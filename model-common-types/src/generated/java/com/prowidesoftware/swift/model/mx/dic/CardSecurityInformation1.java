
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
 * Card security code (CSC) associated with the card performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardSecurityInformation1", propOrder = {
    "cscMgmt",
    "cscVal"
})
public class CardSecurityInformation1 {

    @XmlElement(name = "CSCMgmt", required = true)
    @XmlSchemaType(name = "string")
    protected CSCManagement1Code cscMgmt;
    @XmlElement(name = "CSCVal")
    protected String cscVal;

    /**
     * Gets the value of the cscMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link CSCManagement1Code }
     *     
     */
    public CSCManagement1Code getCSCMgmt() {
        return cscMgmt;
    }

    /**
     * Sets the value of the cscMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSCManagement1Code }
     *     
     */
    public CardSecurityInformation1 setCSCMgmt(CSCManagement1Code value) {
        this.cscMgmt = value;
        return this;
    }

    /**
     * Gets the value of the cscVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSCVal() {
        return cscVal;
    }

    /**
     * Sets the value of the cscVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardSecurityInformation1 setCSCVal(String value) {
        this.cscVal = value;
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
