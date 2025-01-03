
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
@XmlType(name = "CorporateActionUnallocatedBalanceSD3Choice", propOrder = {
    "ttlElgblBal",
    "brrwdBal",
    "collInBal",
    "collOutBal",
    "onLnBal",
    "pdgDlvryBal",
    "pdgRctBal"
})
public class CorporateActionUnallocatedBalanceSD3Choice {

    @XmlElement(name = "TtlElgblBal")
    protected SignedQuantityFormat9 ttlElgblBal;
    @XmlElement(name = "BrrwdBal")
    protected SignedQuantityFormat9 brrwdBal;
    @XmlElement(name = "CollInBal")
    protected SignedQuantityFormat9 collInBal;
    @XmlElement(name = "CollOutBal")
    protected SignedQuantityFormat9 collOutBal;
    @XmlElement(name = "OnLnBal")
    protected SignedQuantityFormat9 onLnBal;
    @XmlElement(name = "PdgDlvryBal")
    protected SignedQuantityFormat9 pdgDlvryBal;
    @XmlElement(name = "PdgRctBal")
    protected SignedQuantityFormat9 pdgRctBal;

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3Choice setTtlElgblBal(SignedQuantityFormat9 value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the brrwdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getBrrwdBal() {
        return brrwdBal;
    }

    /**
     * Sets the value of the brrwdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3Choice setBrrwdBal(SignedQuantityFormat9 value) {
        this.brrwdBal = value;
        return this;
    }

    /**
     * Gets the value of the collInBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getCollInBal() {
        return collInBal;
    }

    /**
     * Sets the value of the collInBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3Choice setCollInBal(SignedQuantityFormat9 value) {
        this.collInBal = value;
        return this;
    }

    /**
     * Gets the value of the collOutBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getCollOutBal() {
        return collOutBal;
    }

    /**
     * Sets the value of the collOutBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3Choice setCollOutBal(SignedQuantityFormat9 value) {
        this.collOutBal = value;
        return this;
    }

    /**
     * Gets the value of the onLnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOnLnBal() {
        return onLnBal;
    }

    /**
     * Sets the value of the onLnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3Choice setOnLnBal(SignedQuantityFormat9 value) {
        this.onLnBal = value;
        return this;
    }

    /**
     * Gets the value of the pdgDlvryBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getPdgDlvryBal() {
        return pdgDlvryBal;
    }

    /**
     * Sets the value of the pdgDlvryBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3Choice setPdgDlvryBal(SignedQuantityFormat9 value) {
        this.pdgDlvryBal = value;
        return this;
    }

    /**
     * Gets the value of the pdgRctBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getPdgRctBal() {
        return pdgRctBal;
    }

    /**
     * Sets the value of the pdgRctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3Choice setPdgRctBal(SignedQuantityFormat9 value) {
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
