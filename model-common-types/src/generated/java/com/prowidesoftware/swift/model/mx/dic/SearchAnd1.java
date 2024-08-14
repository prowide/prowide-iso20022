
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
 * List of criteria following the AND logic.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchAnd1", propOrder = {
    "trgt",
    "oprtr",
    "val"
})
public class SearchAnd1 {

    @XmlElement(name = "Trgt", required = true)
    protected String trgt;
    @XmlElement(name = "Oprtr", required = true)
    @XmlSchemaType(name = "string")
    protected Operator1Code oprtr;
    @XmlElement(name = "Val", required = true)
    protected String val;

    /**
     * Gets the value of the trgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrgt() {
        return trgt;
    }

    /**
     * Sets the value of the trgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SearchAnd1 setTrgt(String value) {
        this.trgt = value;
        return this;
    }

    /**
     * Gets the value of the oprtr property.
     * 
     * @return
     *     possible object is
     *     {@link Operator1Code }
     *     
     */
    public Operator1Code getOprtr() {
        return oprtr;
    }

    /**
     * Sets the value of the oprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator1Code }
     *     
     */
    public SearchAnd1 setOprtr(Operator1Code value) {
        this.oprtr = value;
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
    public SearchAnd1 setVal(String value) {
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
