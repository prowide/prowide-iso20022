
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
 * Additional data to be considered for risk assessment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskInputData3", propOrder = {
    "nttyTp",
    "tp",
    "val"
})
public class RiskInputData3 {

    @XmlElement(name = "NttyTp")
    @XmlSchemaType(name = "string")
    protected ATICAPartyType1Code nttyTp;
    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Val", required = true)
    protected String val;

    /**
     * Gets the value of the nttyTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public ATICAPartyType1Code getNttyTp() {
        return nttyTp;
    }

    /**
     * Sets the value of the nttyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public RiskInputData3 setNttyTp(ATICAPartyType1Code value) {
        this.nttyTp = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskInputData3 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RiskInputData3 setVal(String value) {
        this.val = value;
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
