
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
@XmlType(name = "OnLinePIN2", propOrder = {
    "ncrptdPINBlck",
    "pinFrmt",
    "addtlInpt"
})
public class OnLinePIN2 {

    @XmlElement(name = "NcrptdPINBlck", required = true)
    protected ContentInformationType5 ncrptdPINBlck;
    @XmlElement(name = "PINFrmt", required = true)
    @XmlSchemaType(name = "string")
    protected PINFormat2Code pinFrmt;
    @XmlElement(name = "AddtlInpt")
    protected String addtlInpt;

    /**
     * Gets the value of the ncrptdPINBlck property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType5 }
     *     
     */
    public ContentInformationType5 getNcrptdPINBlck() {
        return ncrptdPINBlck;
    }

    /**
     * Sets the value of the ncrptdPINBlck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType5 }
     *     
     */
    public OnLinePIN2 setNcrptdPINBlck(ContentInformationType5 value) {
        this.ncrptdPINBlck = value;
        return this;
    }

    /**
     * Gets the value of the pinFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link PINFormat2Code }
     *     
     */
    public PINFormat2Code getPINFrmt() {
        return pinFrmt;
    }

    /**
     * Sets the value of the pinFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINFormat2Code }
     *     
     */
    public OnLinePIN2 setPINFrmt(PINFormat2Code value) {
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
    public OnLinePIN2 setAddtlInpt(String value) {
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
