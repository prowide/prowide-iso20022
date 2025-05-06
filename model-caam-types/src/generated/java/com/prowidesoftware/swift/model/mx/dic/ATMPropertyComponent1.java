
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
 * Set of properties to update on a terminal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMPropertyComponent1", propOrder = {
    "prprtyNm",
    "prprtyTp",
    "prprtyVal"
})
public class ATMPropertyComponent1 {

    @XmlElement(name = "PrprtyNm", required = true)
    protected String prprtyNm;
    @XmlElement(name = "PrprtyTp")
    @XmlSchemaType(name = "string")
    protected ATMPropertyType1Code prprtyTp;
    @XmlElement(name = "PrprtyVal", required = true)
    protected String prprtyVal;

    /**
     * Gets the value of the prprtyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyNm() {
        return prprtyNm;
    }

    /**
     * Sets the value of the prprtyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMPropertyComponent1 setPrprtyNm(String value) {
        this.prprtyNm = value;
        return this;
    }

    /**
     * Gets the value of the prprtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMPropertyType1Code }
     *     
     */
    public ATMPropertyType1Code getPrprtyTp() {
        return prprtyTp;
    }

    /**
     * Sets the value of the prprtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMPropertyType1Code }
     *     
     */
    public ATMPropertyComponent1 setPrprtyTp(ATMPropertyType1Code value) {
        this.prprtyTp = value;
        return this;
    }

    /**
     * Gets the value of the prprtyVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrprtyVal() {
        return prprtyVal;
    }

    /**
     * Sets the value of the prprtyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMPropertyComponent1 setPrprtyVal(String value) {
        this.prprtyVal = value;
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
