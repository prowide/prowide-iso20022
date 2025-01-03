
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
@XmlType(name = "CorporateActionUnallocatedBalanceSD3", propOrder = {
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
public class CorporateActionUnallocatedBalanceSD3 {

    @XmlElement(name = "TtlElgblBal")
    protected SignedQuantityFormat9 ttlElgblBal;
    @XmlElement(name = "AfctdBal")
    protected SignedQuantityFormat9 afctdBal;
    @XmlElement(name = "UafctdBal")
    protected SignedQuantityFormat9 uafctdBal;
    @XmlElement(name = "OblgtdBal")
    protected SignedQuantityFormat9 oblgtdBal;
    @XmlElement(name = "OrgnlBal")
    protected SignedQuantityFormat9 orgnlBal;
    @XmlElement(name = "PldgdBal")
    protected SignedQuantityFormat9 pldgdBal;
    @XmlElement(name = "UpldgdBal")
    protected SignedQuantityFormat9 upldgdBal;
    @XmlElement(name = "InvstmtPldgdBal")
    protected SignedQuantityFormat9 invstmtPldgdBal;
    @XmlElement(name = "InvstmtUpldgdBal")
    protected SignedQuantityFormat9 invstmtUpldgdBal;

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
    public CorporateActionUnallocatedBalanceSD3 setTtlElgblBal(SignedQuantityFormat9 value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the afctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getAfctdBal() {
        return afctdBal;
    }

    /**
     * Sets the value of the afctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3 setAfctdBal(SignedQuantityFormat9 value) {
        this.afctdBal = value;
        return this;
    }

    /**
     * Gets the value of the uafctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getUafctdBal() {
        return uafctdBal;
    }

    /**
     * Sets the value of the uafctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3 setUafctdBal(SignedQuantityFormat9 value) {
        this.uafctdBal = value;
        return this;
    }

    /**
     * Gets the value of the oblgtdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOblgtdBal() {
        return oblgtdBal;
    }

    /**
     * Sets the value of the oblgtdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3 setOblgtdBal(SignedQuantityFormat9 value) {
        this.oblgtdBal = value;
        return this;
    }

    /**
     * Gets the value of the orgnlBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOrgnlBal() {
        return orgnlBal;
    }

    /**
     * Sets the value of the orgnlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3 setOrgnlBal(SignedQuantityFormat9 value) {
        this.orgnlBal = value;
        return this;
    }

    /**
     * Gets the value of the pldgdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getPldgdBal() {
        return pldgdBal;
    }

    /**
     * Sets the value of the pldgdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3 setPldgdBal(SignedQuantityFormat9 value) {
        this.pldgdBal = value;
        return this;
    }

    /**
     * Gets the value of the upldgdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getUpldgdBal() {
        return upldgdBal;
    }

    /**
     * Sets the value of the upldgdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3 setUpldgdBal(SignedQuantityFormat9 value) {
        this.upldgdBal = value;
        return this;
    }

    /**
     * Gets the value of the invstmtPldgdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getInvstmtPldgdBal() {
        return invstmtPldgdBal;
    }

    /**
     * Sets the value of the invstmtPldgdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3 setInvstmtPldgdBal(SignedQuantityFormat9 value) {
        this.invstmtPldgdBal = value;
        return this;
    }

    /**
     * Gets the value of the invstmtUpldgdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getInvstmtUpldgdBal() {
        return invstmtUpldgdBal;
    }

    /**
     * Sets the value of the invstmtUpldgdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD3 setInvstmtUpldgdBal(SignedQuantityFormat9 value) {
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
