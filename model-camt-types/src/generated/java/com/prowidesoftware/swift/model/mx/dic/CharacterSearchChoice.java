
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
 * Set of characters to be matched to be considered as valid.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacterSearchChoice", propOrder = {
    "eq",
    "neq",
    "ct",
    "nct"
})
public class CharacterSearchChoice {

    @XmlElement(name = "EQ")
    protected String eq;
    @XmlElement(name = "NEQ")
    protected String neq;
    @XmlElement(name = "CT")
    protected String ct;
    @XmlElement(name = "NCT")
    protected String nct;

    /**
     * Gets the value of the eq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQ() {
        return eq;
    }

    /**
     * Sets the value of the eq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CharacterSearchChoice setEQ(String value) {
        this.eq = value;
        return this;
    }

    /**
     * Gets the value of the neq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEQ() {
        return neq;
    }

    /**
     * Sets the value of the neq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CharacterSearchChoice setNEQ(String value) {
        this.neq = value;
        return this;
    }

    /**
     * Gets the value of the ct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCT() {
        return ct;
    }

    /**
     * Sets the value of the ct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CharacterSearchChoice setCT(String value) {
        this.ct = value;
        return this;
    }

    /**
     * Gets the value of the nct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCT() {
        return nct;
    }

    /**
     * Sets the value of the nct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CharacterSearchChoice setNCT(String value) {
        this.nct = value;
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
