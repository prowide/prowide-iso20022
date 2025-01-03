
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
 * Defines the details of a commodity derivative.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeCommodity2", propOrder = {
    "pdct",
    "txTp",
    "fnlPricTp"
})
public class DerivativeCommodity2 {

    @XmlElement(name = "Pdct", required = true)
    protected AssetClassCommodity3Choice pdct;
    @XmlElement(name = "TxTp")
    @XmlSchemaType(name = "string")
    protected AssetClassTransactionType1Code txTp;
    @XmlElement(name = "FnlPricTp")
    @XmlSchemaType(name = "string")
    protected AssetPriceType1Code fnlPricTp;

    /**
     * Gets the value of the pdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodity3Choice }
     *     
     */
    public AssetClassCommodity3Choice getPdct() {
        return pdct;
    }

    /**
     * Sets the value of the pdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodity3Choice }
     *     
     */
    public DerivativeCommodity2 setPdct(AssetClassCommodity3Choice value) {
        this.pdct = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassTransactionType1Code }
     *     
     */
    public AssetClassTransactionType1Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassTransactionType1Code }
     *     
     */
    public DerivativeCommodity2 setTxTp(AssetClassTransactionType1Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the fnlPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link AssetPriceType1Code }
     *     
     */
    public AssetPriceType1Code getFnlPricTp() {
        return fnlPricTp;
    }

    /**
     * Sets the value of the fnlPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetPriceType1Code }
     *     
     */
    public DerivativeCommodity2 setFnlPricTp(AssetPriceType1Code value) {
        this.fnlPricTp = value;
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
