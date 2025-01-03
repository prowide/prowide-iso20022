
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
 * Encrypted personal identification number (PIN) and related information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnLinePIN5", propOrder = {
    "ncrptdPINBlck",
    "pinFrmt",
    "addtlInpt"
})
public class OnLinePIN5 {

    @XmlElement(name = "NcrptdPINBlck", required = true)
    protected ContentInformationType10 ncrptdPINBlck;
    @XmlElement(name = "PINFrmt", required = true)
    @XmlSchemaType(name = "string")
    protected PINFormat4Code pinFrmt;
    @XmlElement(name = "AddtlInpt")
    protected String addtlInpt;

    /**
     * Gets the value of the ncrptdPINBlck property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getNcrptdPINBlck() {
        return ncrptdPINBlck;
    }

    /**
     * Sets the value of the ncrptdPINBlck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public OnLinePIN5 setNcrptdPINBlck(ContentInformationType10 value) {
        this.ncrptdPINBlck = value;
        return this;
    }

    /**
     * Gets the value of the pinFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link PINFormat4Code }
     *     
     */
    public PINFormat4Code getPINFrmt() {
        return pinFrmt;
    }

    /**
     * Sets the value of the pinFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINFormat4Code }
     *     
     */
    public OnLinePIN5 setPINFrmt(PINFormat4Code value) {
        this.pinFrmt = value;
        return this;
    }

    /**
     * Gets the value of the addtlInpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInpt() {
        return addtlInpt;
    }

    /**
     * Sets the value of the addtlInpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OnLinePIN5 setAddtlInpt(String value) {
        this.addtlInpt = value;
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
