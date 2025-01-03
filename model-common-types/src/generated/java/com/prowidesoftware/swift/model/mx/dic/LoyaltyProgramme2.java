
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
 * Loyalty programme information
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramme2", propOrder = {
    "prgrmmTp",
    "prgmId",
    "ptcptId"
})
public class LoyaltyProgramme2 {

    @XmlElement(name = "PrgrmmTp")
    protected String prgrmmTp;
    @XmlElement(name = "PrgmId")
    protected String prgmId;
    @XmlElement(name = "PtcptId")
    protected String ptcptId;

    /**
     * Gets the value of the prgrmmTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgrmmTp() {
        return prgrmmTp;
    }

    /**
     * Sets the value of the prgrmmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme2 setPrgrmmTp(String value) {
        this.prgrmmTp = value;
        return this;
    }

    /**
     * Gets the value of the prgmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgmId() {
        return prgmId;
    }

    /**
     * Sets the value of the prgmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme2 setPrgmId(String value) {
        this.prgmId = value;
        return this;
    }

    /**
     * Gets the value of the ptcptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtcptId() {
        return ptcptId;
    }

    /**
     * Sets the value of the ptcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme2 setPtcptId(String value) {
        this.ptcptId = value;
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
