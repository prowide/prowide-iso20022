
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of collateral agreement between counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeCollateralReport5", propOrder = {
    "prtflCd",
    "collstn",
    "initlMrgnPstd",
    "initlMrgnRcvd",
    "vartnMrgnPstd",
    "vartnMrgnRcvd",
    "xcssCollPstd",
    "xcssCollRcvd",
    "ctrPtyRatgTrggrInd",
    "ctrPtyRatgThrshldInd"
})
public class TradeCollateralReport5 {

    @XmlElement(name = "PrtflCd", required = true)
    protected PortfolioCode1Choice prtflCd;
    @XmlElement(name = "Collstn")
    @XmlSchemaType(name = "string")
    protected CollateralisationType2Code collstn;
    @XmlElement(name = "InitlMrgnPstd")
    protected PrePostHaircut1 initlMrgnPstd;
    @XmlElement(name = "InitlMrgnRcvd")
    protected PrePostHaircut1 initlMrgnRcvd;
    @XmlElement(name = "VartnMrgnPstd")
    protected PrePostHaircut1 vartnMrgnPstd;
    @XmlElement(name = "VartnMrgnRcvd")
    protected PrePostHaircut1 vartnMrgnRcvd;
    @XmlElement(name = "XcssCollPstd")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount xcssCollPstd;
    @XmlElement(name = "XcssCollRcvd")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount xcssCollRcvd;
    @XmlElement(name = "CtrPtyRatgTrggrInd")
    protected Boolean ctrPtyRatgTrggrInd;
    @XmlElement(name = "CtrPtyRatgThrshldInd")
    protected Boolean ctrPtyRatgThrshldInd;

    /**
     * Gets the value of the prtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioCode1Choice }
     *     
     */
    public PortfolioCode1Choice getPrtflCd() {
        return prtflCd;
    }

    /**
     * Sets the value of the prtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioCode1Choice }
     *     
     */
    public TradeCollateralReport5 setPrtflCd(PortfolioCode1Choice value) {
        this.prtflCd = value;
        return this;
    }

    /**
     * Gets the value of the collstn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralisationType2Code }
     *     
     */
    public CollateralisationType2Code getCollstn() {
        return collstn;
    }

    /**
     * Sets the value of the collstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralisationType2Code }
     *     
     */
    public TradeCollateralReport5 setCollstn(CollateralisationType2Code value) {
        this.collstn = value;
        return this;
    }

    /**
     * Gets the value of the initlMrgnPstd property.
     * 
     * @return
     *     possible object is
     *     {@link PrePostHaircut1 }
     *     
     */
    public PrePostHaircut1 getInitlMrgnPstd() {
        return initlMrgnPstd;
    }

    /**
     * Sets the value of the initlMrgnPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePostHaircut1 }
     *     
     */
    public TradeCollateralReport5 setInitlMrgnPstd(PrePostHaircut1 value) {
        this.initlMrgnPstd = value;
        return this;
    }

    /**
     * Gets the value of the initlMrgnRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link PrePostHaircut1 }
     *     
     */
    public PrePostHaircut1 getInitlMrgnRcvd() {
        return initlMrgnRcvd;
    }

    /**
     * Sets the value of the initlMrgnRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePostHaircut1 }
     *     
     */
    public TradeCollateralReport5 setInitlMrgnRcvd(PrePostHaircut1 value) {
        this.initlMrgnRcvd = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnPstd property.
     * 
     * @return
     *     possible object is
     *     {@link PrePostHaircut1 }
     *     
     */
    public PrePostHaircut1 getVartnMrgnPstd() {
        return vartnMrgnPstd;
    }

    /**
     * Sets the value of the vartnMrgnPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePostHaircut1 }
     *     
     */
    public TradeCollateralReport5 setVartnMrgnPstd(PrePostHaircut1 value) {
        this.vartnMrgnPstd = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgnRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link PrePostHaircut1 }
     *     
     */
    public PrePostHaircut1 getVartnMrgnRcvd() {
        return vartnMrgnRcvd;
    }

    /**
     * Sets the value of the vartnMrgnRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePostHaircut1 }
     *     
     */
    public TradeCollateralReport5 setVartnMrgnRcvd(PrePostHaircut1 value) {
        this.vartnMrgnRcvd = value;
        return this;
    }

    /**
     * Gets the value of the xcssCollPstd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getXcssCollPstd() {
        return xcssCollPstd;
    }

    /**
     * Sets the value of the xcssCollPstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public TradeCollateralReport5 setXcssCollPstd(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.xcssCollPstd = value;
        return this;
    }

    /**
     * Gets the value of the xcssCollRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getXcssCollRcvd() {
        return xcssCollRcvd;
    }

    /**
     * Sets the value of the xcssCollRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public TradeCollateralReport5 setXcssCollRcvd(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.xcssCollRcvd = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRatgTrggrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtrPtyRatgTrggrInd() {
        return ctrPtyRatgTrggrInd;
    }

    /**
     * Sets the value of the ctrPtyRatgTrggrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeCollateralReport5 setCtrPtyRatgTrggrInd(Boolean value) {
        this.ctrPtyRatgTrggrInd = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRatgThrshldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtrPtyRatgThrshldInd() {
        return ctrPtyRatgThrshldInd;
    }

    /**
     * Sets the value of the ctrPtyRatgThrshldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradeCollateralReport5 setCtrPtyRatgThrshldInd(Boolean value) {
        this.ctrPtyRatgThrshldInd = value;
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
