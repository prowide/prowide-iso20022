
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
 * Strong Customer Authentication exemption details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exemption1", propOrder = {
    "tp",
    "val",
    "rsnNotHnrd"
})
public class Exemption1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected Exemption2Code tp;
    @XmlElement(name = "Val", required = true)
    @XmlSchemaType(name = "string")
    protected AttestationValue1Code val;
    @XmlElement(name = "RsnNotHnrd")
    protected String rsnNotHnrd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link Exemption2Code }
     *     
     */
    public Exemption2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exemption2Code }
     *     
     */
    public Exemption1 setTp(Exemption2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link AttestationValue1Code }
     *     
     */
    public AttestationValue1Code getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttestationValue1Code }
     *     
     */
    public Exemption1 setVal(AttestationValue1Code value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the rsnNotHnrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsnNotHnrd() {
        return rsnNotHnrd;
    }

    /**
     * Sets the value of the rsnNotHnrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Exemption1 setRsnNotHnrd(String value) {
        this.rsnNotHnrd = value;
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
