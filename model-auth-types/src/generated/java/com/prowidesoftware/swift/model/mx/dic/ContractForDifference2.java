
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
 * Transparency calculation specific details on a contract for difference, spread betting derivatives.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractForDifference2", propOrder = {
    "undrlygTp",
    "ntnlCcy1",
    "ntnlCcy2"
})
public class ContractForDifference2 {

    @XmlElement(name = "UndrlygTp", required = true)
    @XmlSchemaType(name = "string")
    protected UnderlyingContractForDifferenceType3Code undrlygTp;
    @XmlElement(name = "NtnlCcy1")
    protected String ntnlCcy1;
    @XmlElement(name = "NtnlCcy2")
    protected String ntnlCcy2;

    /**
     * Gets the value of the undrlygTp property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingContractForDifferenceType3Code }
     *     
     */
    public UnderlyingContractForDifferenceType3Code getUndrlygTp() {
        return undrlygTp;
    }

    /**
     * Sets the value of the undrlygTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingContractForDifferenceType3Code }
     *     
     */
    public ContractForDifference2 setUndrlygTp(UnderlyingContractForDifferenceType3Code value) {
        this.undrlygTp = value;
        return this;
    }

    /**
     * Gets the value of the ntnlCcy1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy1() {
        return ntnlCcy1;
    }

    /**
     * Sets the value of the ntnlCcy1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractForDifference2 setNtnlCcy1(String value) {
        this.ntnlCcy1 = value;
        return this;
    }

    /**
     * Gets the value of the ntnlCcy2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy2() {
        return ntnlCcy2;
    }

    /**
     * Sets the value of the ntnlCcy2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractForDifference2 setNtnlCcy2(String value) {
        this.ntnlCcy2 = value;
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
