
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
 * Choice amongst various balance types related to unallocated payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionUnallocatedBalanceSD1Choice", propOrder = {
    "ttlElgblBal",
    "brrwdBal",
    "collInBal",
    "collOutBal",
    "onLnBal",
    "pdgDlvryBal",
    "pdgRctBal"
})
public class CorporateActionUnallocatedBalanceSD1Choice {

    @XmlElement(name = "TtlElgblBal")
    protected SignedQuantityFormat4 ttlElgblBal;
    @XmlElement(name = "BrrwdBal")
    protected SignedQuantityFormat4 brrwdBal;
    @XmlElement(name = "CollInBal")
    protected SignedQuantityFormat4 collInBal;
    @XmlElement(name = "CollOutBal")
    protected SignedQuantityFormat4 collOutBal;
    @XmlElement(name = "OnLnBal")
    protected SignedQuantityFormat4 onLnBal;
    @XmlElement(name = "PdgDlvryBal")
    protected SignedQuantityFormat4 pdgDlvryBal;
    @XmlElement(name = "PdgRctBal")
    protected SignedQuantityFormat4 pdgRctBal;

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1Choice setTtlElgblBal(SignedQuantityFormat4 value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the brrwdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getBrrwdBal() {
        return brrwdBal;
    }

    /**
     * Sets the value of the brrwdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1Choice setBrrwdBal(SignedQuantityFormat4 value) {
        this.brrwdBal = value;
        return this;
    }

    /**
     * Gets the value of the collInBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getCollInBal() {
        return collInBal;
    }

    /**
     * Sets the value of the collInBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1Choice setCollInBal(SignedQuantityFormat4 value) {
        this.collInBal = value;
        return this;
    }

    /**
     * Gets the value of the collOutBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getCollOutBal() {
        return collOutBal;
    }

    /**
     * Sets the value of the collOutBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1Choice setCollOutBal(SignedQuantityFormat4 value) {
        this.collOutBal = value;
        return this;
    }

    /**
     * Gets the value of the onLnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getOnLnBal() {
        return onLnBal;
    }

    /**
     * Sets the value of the onLnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1Choice setOnLnBal(SignedQuantityFormat4 value) {
        this.onLnBal = value;
        return this;
    }

    /**
     * Gets the value of the pdgDlvryBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getPdgDlvryBal() {
        return pdgDlvryBal;
    }

    /**
     * Sets the value of the pdgDlvryBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1Choice setPdgDlvryBal(SignedQuantityFormat4 value) {
        this.pdgDlvryBal = value;
        return this;
    }

    /**
     * Gets the value of the pdgRctBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getPdgRctBal() {
        return pdgRctBal;
    }

    /**
     * Sets the value of the pdgRctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1Choice setPdgRctBal(SignedQuantityFormat4 value) {
        this.pdgRctBal = value;
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
