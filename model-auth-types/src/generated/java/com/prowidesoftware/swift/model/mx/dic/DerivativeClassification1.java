
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Hierarchy of classification of a derivative.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeClassification1", propOrder = {
    "asstClss",
    "basePdct",
    "subPdct",
    "subCmmdty",
    "txTp"
})
public class DerivativeClassification1 {

    @XmlElement(name = "AsstClss", required = true)
    protected String asstClss;
    @XmlElement(name = "BasePdct")
    protected String basePdct;
    @XmlElement(name = "SubPdct")
    protected String subPdct;
    @XmlElement(name = "SubCmmdty")
    protected String subCmmdty;
    @XmlElement(name = "TxTp")
    protected String txTp;

    /**
     * Gets the value of the asstClss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsstClss() {
        return asstClss;
    }

    /**
     * Sets the value of the asstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DerivativeClassification1 setAsstClss(String value) {
        this.asstClss = value;
        return this;
    }

    /**
     * Gets the value of the basePdct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePdct() {
        return basePdct;
    }

    /**
     * Sets the value of the basePdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DerivativeClassification1 setBasePdct(String value) {
        this.basePdct = value;
        return this;
    }

    /**
     * Gets the value of the subPdct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPdct() {
        return subPdct;
    }

    /**
     * Sets the value of the subPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DerivativeClassification1 setSubPdct(String value) {
        this.subPdct = value;
        return this;
    }

    /**
     * Gets the value of the subCmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCmmdty() {
        return subCmmdty;
    }

    /**
     * Sets the value of the subCmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DerivativeClassification1 setSubCmmdty(String value) {
        this.subCmmdty = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DerivativeClassification1 setTxTp(String value) {
        this.txTp = value;
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
