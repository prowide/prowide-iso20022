
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the identification of the issuer CSD (central securities depository).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerCSDIdentification1", propOrder = {
    "lei",
    "frstTwoCharsInstrmId",
    "ctry"
})
public class IssuerCSDIdentification1 {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "FrstTwoCharsInstrmId", required = true)
    protected String frstTwoCharsInstrmId;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IssuerCSDIdentification1 setLEI(String value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the frstTwoCharsInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstTwoCharsInstrmId() {
        return frstTwoCharsInstrmId;
    }

    /**
     * Sets the value of the frstTwoCharsInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IssuerCSDIdentification1 setFrstTwoCharsInstrmId(String value) {
        this.frstTwoCharsInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IssuerCSDIdentification1 setCtry(String value) {
        this.ctry = value;
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
