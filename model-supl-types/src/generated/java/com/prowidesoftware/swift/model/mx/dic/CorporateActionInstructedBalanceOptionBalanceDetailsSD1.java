
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
 * Provides additional information regarding corporate action instructed balance details at option level.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionInstructedBalanceOptionBalanceDetailsSD1", propOrder = {
    "plcAndNm",
    "optnUcvrdPrtctBal",
    "optnDalyInstdBal",
    "optnOvrsbcptQty",
    "optnUaccptdBal"
})
public class CorporateActionInstructedBalanceOptionBalanceDetailsSD1 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "OptnUcvrdPrtctBal")
    protected SignedQuantityFormat9 optnUcvrdPrtctBal;
    @XmlElement(name = "OptnDalyInstdBal")
    protected SignedQuantityFormat9 optnDalyInstdBal;
    @XmlElement(name = "OptnOvrsbcptQty")
    protected SignedQuantityFormat9 optnOvrsbcptQty;
    @XmlElement(name = "OptnUaccptdBal")
    protected SignedQuantityFormat9 optnUaccptdBal;

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
    public CorporateActionInstructedBalanceOptionBalanceDetailsSD1 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the optnUcvrdPrtctBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOptnUcvrdPrtctBal() {
        return optnUcvrdPrtctBal;
    }

    /**
     * Sets the value of the optnUcvrdPrtctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionInstructedBalanceOptionBalanceDetailsSD1 setOptnUcvrdPrtctBal(SignedQuantityFormat9 value) {
        this.optnUcvrdPrtctBal = value;
        return this;
    }

    /**
     * Gets the value of the optnDalyInstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOptnDalyInstdBal() {
        return optnDalyInstdBal;
    }

    /**
     * Sets the value of the optnDalyInstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionInstructedBalanceOptionBalanceDetailsSD1 setOptnDalyInstdBal(SignedQuantityFormat9 value) {
        this.optnDalyInstdBal = value;
        return this;
    }

    /**
     * Gets the value of the optnOvrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOptnOvrsbcptQty() {
        return optnOvrsbcptQty;
    }

    /**
     * Sets the value of the optnOvrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionInstructedBalanceOptionBalanceDetailsSD1 setOptnOvrsbcptQty(SignedQuantityFormat9 value) {
        this.optnOvrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the optnUaccptdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOptnUaccptdBal() {
        return optnUaccptdBal;
    }

    /**
     * Sets the value of the optnUaccptdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionInstructedBalanceOptionBalanceDetailsSD1 setOptnUaccptdBal(SignedQuantityFormat9 value) {
        this.optnUaccptdBal = value;
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
