
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
 * Balance types related to an unallocated redemption payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionUnallocatedBalanceSD4", propOrder = {
    "plcAndNm",
    "ttlElgblBal",
    "pldgdBal",
    "invstmtPldgdBal",
    "invstmtUpldgdBal",
    "memoSgrtnBal"
})
public class CorporateActionUnallocatedBalanceSD4 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "TtlElgblBal")
    protected SignedQuantityFormat9 ttlElgblBal;
    @XmlElement(name = "PldgdBal")
    protected SignedQuantityFormat9 pldgdBal;
    @XmlElement(name = "InvstmtPldgdBal")
    protected SignedQuantityFormat9 invstmtPldgdBal;
    @XmlElement(name = "InvstmtUpldgdBal")
    protected SignedQuantityFormat9 invstmtUpldgdBal;
    @XmlElement(name = "MemoSgrtnBal")
    protected SignedQuantityFormat9 memoSgrtnBal;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionUnallocatedBalanceSD4 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

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
    public CorporateActionUnallocatedBalanceSD4 setTtlElgblBal(SignedQuantityFormat9 value) {
        this.ttlElgblBal = value;
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
    public CorporateActionUnallocatedBalanceSD4 setPldgdBal(SignedQuantityFormat9 value) {
        this.pldgdBal = value;
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
    public CorporateActionUnallocatedBalanceSD4 setInvstmtPldgdBal(SignedQuantityFormat9 value) {
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
    public CorporateActionUnallocatedBalanceSD4 setInvstmtUpldgdBal(SignedQuantityFormat9 value) {
        this.invstmtUpldgdBal = value;
        return this;
    }

    /**
     * Gets the value of the memoSgrtnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getMemoSgrtnBal() {
        return memoSgrtnBal;
    }

    /**
     * Sets the value of the memoSgrtnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionUnallocatedBalanceSD4 setMemoSgrtnBal(SignedQuantityFormat9 value) {
        this.memoSgrtnBal = value;
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
