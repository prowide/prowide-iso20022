
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
 * It is used by financial institutions, with their own offices, or with other financial institutions with which they have established bilateral agreements. It is used as an envelope for a specified message included in it.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesManagementProprietaryMessageV02", propOrder = {
    "prvs",
    "othr",
    "prtryData"
})
public class SecuritiesManagementProprietaryMessageV02 {

    @XmlElement(name = "Prvs")
    protected MessageReference prvs;
    @XmlElement(name = "Othr")
    protected MessageReference othr;
    @XmlElement(name = "PrtryData", required = true)
    protected ProprietaryData5 prtryData;

    /**
     * Gets the value of the prvs property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getPrvs() {
        return prvs;
    }

    /**
     * Sets the value of the prvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public SecuritiesManagementProprietaryMessageV02 setPrvs(MessageReference value) {
        this.prvs = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference }
     *     
     */
    public MessageReference getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference }
     *     
     */
    public SecuritiesManagementProprietaryMessageV02 setOthr(MessageReference value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the prtryData property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryData5 }
     *     
     */
    public ProprietaryData5 getPrtryData() {
        return prtryData;
    }

    /**
     * Sets the value of the prtryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryData5 }
     *     
     */
    public SecuritiesManagementProprietaryMessageV02 setPrtryData(ProprietaryData5 value) {
        this.prtryData = value;
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
