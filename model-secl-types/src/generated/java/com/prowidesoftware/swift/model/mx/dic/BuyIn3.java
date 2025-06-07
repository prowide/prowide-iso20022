
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies elements related to the response sent by the clearing member to the central counterparty in the context of the buy in process.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyIn3", propOrder = {
    "buyInNtfctnId",
    "reqForDelyInd",
    "nbOfDays",
    "initlQty",
    "cvrdQty",
    "ucvrdQty"
})
public class BuyIn3 {

    @XmlElement(name = "BuyInNtfctnId", required = true)
    protected String buyInNtfctnId;
    @XmlElement(name = "ReqForDelyInd")
    protected boolean reqForDelyInd;
    @XmlElement(name = "NbOfDays", required = true)
    protected BigDecimal nbOfDays;
    @XmlElement(name = "InitlQty", required = true)
    protected FinancialInstrumentQuantity1Choice initlQty;
    @XmlElement(name = "CvrdQty", required = true)
    protected FinancialInstrumentQuantity1Choice cvrdQty;
    @XmlElement(name = "UcvrdQty", required = true)
    protected FinancialInstrumentQuantity1Choice ucvrdQty;

    /**
     * Gets the value of the buyInNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyInNtfctnId() {
        return buyInNtfctnId;
    }

    /**
     * Sets the value of the buyInNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BuyIn3 setBuyInNtfctnId(String value) {
        this.buyInNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the reqForDelyInd property.
     * 
     */
    public boolean isReqForDelyInd() {
        return reqForDelyInd;
    }

    /**
     * Sets the value of the reqForDelyInd property.
     * 
     */
    public BuyIn3 setReqForDelyInd(boolean value) {
        this.reqForDelyInd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDays() {
        return nbOfDays;
    }

    /**
     * Sets the value of the nbOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BuyIn3 setNbOfDays(BigDecimal value) {
        this.nbOfDays = value;
        return this;
    }

    /**
     * Gets the value of the initlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getInitlQty() {
        return initlQty;
    }

    /**
     * Sets the value of the initlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public BuyIn3 setInitlQty(FinancialInstrumentQuantity1Choice value) {
        this.initlQty = value;
        return this;
    }

    /**
     * Gets the value of the cvrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getCvrdQty() {
        return cvrdQty;
    }

    /**
     * Sets the value of the cvrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public BuyIn3 setCvrdQty(FinancialInstrumentQuantity1Choice value) {
        this.cvrdQty = value;
        return this;
    }

    /**
     * Gets the value of the ucvrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getUcvrdQty() {
        return ucvrdQty;
    }

    /**
     * Sets the value of the ucvrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public BuyIn3 setUcvrdQty(FinancialInstrumentQuantity1Choice value) {
        this.ucvrdQty = value;
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
