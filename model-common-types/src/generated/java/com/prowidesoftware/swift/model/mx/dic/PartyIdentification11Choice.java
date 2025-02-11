
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
 * Choice of identification of a party. The party can be identified by providing a BIC or a MIC or a proprietary code.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification11Choice", propOrder = {
    "bicOrBEI",
    "cntrlCtrPty",
    "prtryId"
})
public class PartyIdentification11Choice {

    @XmlElement(name = "BICOrBEI")
    protected String bicOrBEI;
    @XmlElement(name = "CntrlCtrPty")
    protected String cntrlCtrPty;
    @XmlElement(name = "PrtryId")
    protected GenericIdentification1 prtryId;

    /**
     * Gets the value of the bicOrBEI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICOrBEI() {
        return bicOrBEI;
    }

    /**
     * Sets the value of the bicOrBEI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification11Choice setBICOrBEI(String value) {
        this.bicOrBEI = value;
        return this;
    }

    /**
     * Gets the value of the cntrlCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrlCtrPty() {
        return cntrlCtrPty;
    }

    /**
     * Sets the value of the cntrlCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification11Choice setCntrlCtrPty(String value) {
        this.cntrlCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the prtryId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getPrtryId() {
        return prtryId;
    }

    /**
     * Sets the value of the prtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public PartyIdentification11Choice setPrtryId(GenericIdentification1 value) {
        this.prtryId = value;
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
