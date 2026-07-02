
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
 * Agreement between two parties to sell a financial instrument or set of financial instruments and repurchase such instruments at an agreed future date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepurchaseAgreement3", propOrder = {
    "pdctClssfctn",
    "rpAgrmtTp",
    "trptyAgt"
})
public class RepurchaseAgreement3 {

    @XmlElement(name = "PdctClssfctn", required = true)
    protected ProductClassification1 pdctClssfctn;
    @XmlElement(name = "RpAgrmtTp", required = true)
    protected RepurchaseAgreementType1Choice rpAgrmtTp;
    @XmlElement(name = "TrptyAgt")
    protected String trptyAgt;

    /**
     * Gets the value of the pdctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ProductClassification1 }
     *     
     */
    public ProductClassification1 getPdctClssfctn() {
        return pdctClssfctn;
    }

    /**
     * Sets the value of the pdctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductClassification1 }
     *     
     */
    public RepurchaseAgreement3 setPdctClssfctn(ProductClassification1 value) {
        this.pdctClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the rpAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseAgreementType1Choice }
     *     
     */
    public RepurchaseAgreementType1Choice getRpAgrmtTp() {
        return rpAgrmtTp;
    }

    /**
     * Sets the value of the rpAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseAgreementType1Choice }
     *     
     */
    public RepurchaseAgreement3 setRpAgrmtTp(RepurchaseAgreementType1Choice value) {
        this.rpAgrmtTp = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RepurchaseAgreement3 setTrptyAgt(String value) {
        this.trptyAgt = value;
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
