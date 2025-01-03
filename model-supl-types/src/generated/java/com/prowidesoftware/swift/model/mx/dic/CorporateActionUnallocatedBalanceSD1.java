
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
 * Balance types related to an unallocated redemption payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionUnallocatedBalanceSD1", propOrder = {
    "ttlElgblBal",
    "afctdBal",
    "uafctdBal",
    "oblgtdBal",
    "orgnlBal",
    "pldgdBal",
    "upldgdBal",
    "invstmtPldgdBal",
    "invstmtUpldgdBal"
})
public class CorporateActionUnallocatedBalanceSD1 {

    @XmlElement(name = "TtlElgblBal")
    protected SignedQuantityFormat4 ttlElgblBal;
    @XmlElement(name = "AfctdBal")
    protected SignedQuantityFormat4 afctdBal;
    @XmlElement(name = "UafctdBal")
    protected SignedQuantityFormat4 uafctdBal;
    @XmlElement(name = "OblgtdBal")
    protected SignedQuantityFormat4 oblgtdBal;
    @XmlElement(name = "OrgnlBal")
    protected SignedQuantityFormat4 orgnlBal;
    @XmlElement(name = "PldgdBal")
    protected SignedQuantityFormat4 pldgdBal;
    @XmlElement(name = "UpldgdBal")
    protected SignedQuantityFormat4 upldgdBal;
    @XmlElement(name = "InvstmtPldgdBal")
    protected SignedQuantityFormat4 invstmtPldgdBal;
    @XmlElement(name = "InvstmtUpldgdBal")
    protected SignedQuantityFormat4 invstmtUpldgdBal;

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
    public CorporateActionUnallocatedBalanceSD1 setTtlElgblBal(SignedQuantityFormat4 value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the afctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getAfctdBal() {
        return afctdBal;
    }

    /**
     * Sets the value of the afctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1 setAfctdBal(SignedQuantityFormat4 value) {
        this.afctdBal = value;
        return this;
    }

    /**
     * Gets the value of the uafctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getUafctdBal() {
        return uafctdBal;
    }

    /**
     * Sets the value of the uafctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1 setUafctdBal(SignedQuantityFormat4 value) {
        this.uafctdBal = value;
        return this;
    }

    /**
     * Gets the value of the oblgtdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getOblgtdBal() {
        return oblgtdBal;
    }

    /**
     * Sets the value of the oblgtdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1 setOblgtdBal(SignedQuantityFormat4 value) {
        this.oblgtdBal = value;
        return this;
    }

    /**
     * Gets the value of the orgnlBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getOrgnlBal() {
        return orgnlBal;
    }

    /**
     * Sets the value of the orgnlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1 setOrgnlBal(SignedQuantityFormat4 value) {
        this.orgnlBal = value;
        return this;
    }

    /**
     * Gets the value of the pldgdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getPldgdBal() {
        return pldgdBal;
    }

    /**
     * Sets the value of the pldgdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1 setPldgdBal(SignedQuantityFormat4 value) {
        this.pldgdBal = value;
        return this;
    }

    /**
     * Gets the value of the upldgdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getUpldgdBal() {
        return upldgdBal;
    }

    /**
     * Sets the value of the upldgdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1 setUpldgdBal(SignedQuantityFormat4 value) {
        this.upldgdBal = value;
        return this;
    }

    /**
     * Gets the value of the invstmtPldgdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getInvstmtPldgdBal() {
        return invstmtPldgdBal;
    }

    /**
     * Sets the value of the invstmtPldgdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1 setInvstmtPldgdBal(SignedQuantityFormat4 value) {
        this.invstmtPldgdBal = value;
        return this;
    }

    /**
     * Gets the value of the invstmtUpldgdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getInvstmtUpldgdBal() {
        return invstmtUpldgdBal;
    }

    /**
     * Sets the value of the invstmtUpldgdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD1 setInvstmtUpldgdBal(SignedQuantityFormat4 value) {
        this.invstmtUpldgdBal = value;
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
