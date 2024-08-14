
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
@XmlType(name = "AccountBalanceSD13", propOrder = {
    "plcAndNm",
    "orgnlBal",
    "upldgdBal",
    "invstmtUpldgdBal",
    "invstmtPldgdBal",
    "accptdBal",
    "uaccptdBal",
    "ovrsbcptBal"
})
public class AccountBalanceSD13 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "OrgnlBal")
    protected SignedQuantityFormat9 orgnlBal;
    @XmlElement(name = "UpldgdBal")
    protected SignedQuantityFormat9 upldgdBal;
    @XmlElement(name = "InvstmtUpldgdBal")
    protected SignedQuantityFormat9 invstmtUpldgdBal;
    @XmlElement(name = "InvstmtPldgdBal")
    protected SignedQuantityFormat9 invstmtPldgdBal;
    @XmlElement(name = "AccptdBal")
    protected SignedQuantityFormat9 accptdBal;
    @XmlElement(name = "UaccptdBal")
    protected SignedQuantityFormat9 uaccptdBal;
    @XmlElement(name = "OvrsbcptBal")
    protected SignedQuantityFormat9 ovrsbcptBal;

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
    public AccountBalanceSD13 setPlcAndNm(String value) {
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
    public AccountBalanceSD13 setOrgnlBal(SignedQuantityFormat9 value) {
        this.orgnlBal = value;
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
    public AccountBalanceSD13 setUpldgdBal(SignedQuantityFormat9 value) {
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
    public AccountBalanceSD13 setInvstmtUpldgdBal(SignedQuantityFormat9 value) {
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
    public AccountBalanceSD13 setInvstmtPldgdBal(SignedQuantityFormat9 value) {
        this.invstmtPldgdBal = value;
        return this;
    }

    /**
     * Gets the value of the accptdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getAccptdBal() {
        return accptdBal;
    }

    /**
     * Sets the value of the accptdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public AccountBalanceSD13 setAccptdBal(SignedQuantityFormat9 value) {
        this.accptdBal = value;
        return this;
    }

    /**
     * Gets the value of the uaccptdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getUaccptdBal() {
        return uaccptdBal;
    }

    /**
     * Sets the value of the uaccptdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public AccountBalanceSD13 setUaccptdBal(SignedQuantityFormat9 value) {
        this.uaccptdBal = value;
        return this;
    }

    /**
     * Gets the value of the ovrsbcptBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOvrsbcptBal() {
        return ovrsbcptBal;
    }

    /**
     * Sets the value of the ovrsbcptBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public AccountBalanceSD13 setOvrsbcptBal(SignedQuantityFormat9 value) {
        this.ovrsbcptBal = value;
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
