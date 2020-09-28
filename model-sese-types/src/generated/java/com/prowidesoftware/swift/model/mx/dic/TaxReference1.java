
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
 * Pension scheme tax reference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReference1", propOrder = {
    "taxTp",
    "ref",
    "hldrTp"
})
public class TaxReference1 {

    @XmlElement(name = "TaxTp")
    protected TaxReferenceType1Choice taxTp;
    @XmlElement(name = "Ref", required = true)
    protected String ref;
    @XmlElement(name = "HldrTp")
    protected TaxReferenceParty1Choice hldrTp;

    /**
     * Gets the value of the taxTp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReferenceType1Choice }
     *     
     */
    public TaxReferenceType1Choice getTaxTp() {
        return taxTp;
    }

    /**
     * Sets the value of the taxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReferenceType1Choice }
     *     
     */
    public TaxReference1 setTaxTp(TaxReferenceType1Choice value) {
        this.taxTp = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxReference1 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the hldrTp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReferenceParty1Choice }
     *     
     */
    public TaxReferenceParty1Choice getHldrTp() {
        return hldrTp;
    }

    /**
     * Sets the value of the hldrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReferenceParty1Choice }
     *     
     */
    public TaxReference1 setHldrTp(TaxReferenceParty1Choice value) {
        this.hldrTp = value;
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
