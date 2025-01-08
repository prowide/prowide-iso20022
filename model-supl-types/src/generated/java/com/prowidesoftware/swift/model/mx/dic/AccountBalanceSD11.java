
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
 * Provides additional information regarding account balance. Contains transaction details of the stock loans, repurchase agreements (REPOs) and undelivered trades (FAILs).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBalanceSD11", propOrder = {
    "plcAndNm",
    "orgnlBal",
    "adjstdBal",
    "upldgdBal",
    "invstmtUpldgdBal",
    "invstmtPldgdBal"
})
public class AccountBalanceSD11 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "OrgnlBal")
    protected SignedQuantityFormat9 orgnlBal;
    @XmlElement(name = "AdjstdBal")
    protected SignedQuantityFormat9 adjstdBal;
    @XmlElement(name = "UpldgdBal")
    protected SignedQuantityFormat9 upldgdBal;
    @XmlElement(name = "InvstmtUpldgdBal")
    protected SignedQuantityFormat9 invstmtUpldgdBal;
    @XmlElement(name = "InvstmtPldgdBal")
    protected SignedQuantityFormat9 invstmtPldgdBal;

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
    public AccountBalanceSD11 setPlcAndNm(String value) {
        this.plcAndNm = value;
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
    public AccountBalanceSD11 setOrgnlBal(SignedQuantityFormat9 value) {
        this.orgnlBal = value;
        return this;
    }

    /**
     * Gets the value of the adjstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getAdjstdBal() {
        return adjstdBal;
    }

    /**
     * Sets the value of the adjstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public AccountBalanceSD11 setAdjstdBal(SignedQuantityFormat9 value) {
        this.adjstdBal = value;
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
    public AccountBalanceSD11 setUpldgdBal(SignedQuantityFormat9 value) {
        this.upldgdBal = value;
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
    public AccountBalanceSD11 setInvstmtUpldgdBal(SignedQuantityFormat9 value) {
        this.invstmtUpldgdBal = value;
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
    public AccountBalanceSD11 setInvstmtPldgdBal(SignedQuantityFormat9 value) {
        this.invstmtPldgdBal = value;
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
