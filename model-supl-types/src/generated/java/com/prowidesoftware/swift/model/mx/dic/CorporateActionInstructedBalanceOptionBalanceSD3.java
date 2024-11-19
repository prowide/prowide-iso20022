
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
@XmlType(name = "CorporateActionInstructedBalanceOptionBalanceSD3", propOrder = {
    "plcAndNm",
    "optnNb",
    "optnUcvrdPrtctBal",
    "optnOvrsbcptQty",
    "optnUaccptdBal"
})
public class CorporateActionInstructedBalanceOptionBalanceSD3 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnUcvrdPrtctBal")
    protected SignedQuantityFormat9 optnUcvrdPrtctBal;
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
    public CorporateActionInstructedBalanceOptionBalanceSD3 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public OptionNumber1Choice getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public CorporateActionInstructedBalanceOptionBalanceSD3 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
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
    public CorporateActionInstructedBalanceOptionBalanceSD3 setOptnUcvrdPrtctBal(SignedQuantityFormat9 value) {
        this.optnUcvrdPrtctBal = value;
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
    public CorporateActionInstructedBalanceOptionBalanceSD3 setOptnOvrsbcptQty(SignedQuantityFormat9 value) {
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
    public CorporateActionInstructedBalanceOptionBalanceSD3 setOptnUaccptdBal(SignedQuantityFormat9 value) {
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
