
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
 * Specifies the current valuation of a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentificationAndAmount1", propOrder = {
    "id",
    "mktVal",
    "finInstrmTp"
})
public class SecurityIdentificationAndAmount1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "MktVal", required = true)
    protected ActiveCurrencyAnd24Amount mktVal;
    @XmlElement(name = "FinInstrmTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProductType7Code finInstrmTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentificationAndAmount1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public ActiveCurrencyAnd24Amount getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public SecurityIdentificationAndAmount1 setMktVal(ActiveCurrencyAnd24Amount value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType7Code }
     *     
     */
    public ProductType7Code getFinInstrmTp() {
        return finInstrmTp;
    }

    /**
     * Sets the value of the finInstrmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType7Code }
     *     
     */
    public SecurityIdentificationAndAmount1 setFinInstrmTp(ProductType7Code value) {
        this.finInstrmTp = value;
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
