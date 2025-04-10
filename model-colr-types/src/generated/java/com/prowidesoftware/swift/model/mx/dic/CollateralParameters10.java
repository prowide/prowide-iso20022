
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
 * Parameters which explicitly state the conditions that must be fulfilled before a particular triparty collateral instruction/transaction  can be confirmed. These parameters are defined by the instructing party in compliance with triparty collateral rules in the market the instruction/transaction will take place.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParameters10", propOrder = {
    "collInstrTp",
    "xpsrTp",
    "collSd",
    "valSghtMrgnRate",
    "trfTitl",
    "sttlmPrc",
    "prty",
    "automtcAllcn",
    "faildSttlmSlvtn",
    "mainTradgAcctCollstn",
    "bsktIdAndElgbltySetPrfl",
    "rspnSts",
    "addtlInf"
})
public class CollateralParameters10 {

    @XmlElement(name = "CollInstrTp", required = true)
    protected CollateralTransactionType1Choice collInstrTp;
    @XmlElement(name = "XpsrTp", required = true)
    protected ExposureType23Choice xpsrTp;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "ValSghtMrgnRate")
    protected RateOrType1Choice valSghtMrgnRate;
    @XmlElement(name = "TrfTitl")
    protected Boolean trfTitl;
    @XmlElement(name = "SttlmPrc")
    protected GenericIdentification30 sttlmPrc;
    @XmlElement(name = "Prty")
    protected GenericIdentification30 prty;
    @XmlElement(name = "AutomtcAllcn")
    protected Boolean automtcAllcn;
    @XmlElement(name = "FaildSttlmSlvtn")
    protected Boolean faildSttlmSlvtn;
    @XmlElement(name = "MainTradgAcctCollstn")
    protected Boolean mainTradgAcctCollstn;
    @XmlElement(name = "BsktIdAndElgbltySetPrfl")
    protected BasketIdentificationAndEligibilitySetProfile1 bsktIdAndElgbltySetPrfl;
    @XmlElement(name = "RspnSts")
    protected ResponseStatus9Choice rspnSts;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation24 addtlInf;

    /**
     * Gets the value of the collInstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public CollateralTransactionType1Choice getCollInstrTp() {
        return collInstrTp;
    }

    /**
     * Sets the value of the collInstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public CollateralParameters10 setCollInstrTp(CollateralTransactionType1Choice value) {
        this.collInstrTp = value;
        return this;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType23Choice }
     *     
     */
    public ExposureType23Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType23Choice }
     *     
     */
    public CollateralParameters10 setXpsrTp(ExposureType23Choice value) {
        this.xpsrTp = value;
        return this;
    }

    /**
     * Gets the value of the collSd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Sets the value of the collSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralParameters10 setCollSd(CollateralRole1Code value) {
        this.collSd = value;
        return this;
    }

    /**
     * Gets the value of the valSghtMrgnRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrType1Choice }
     *     
     */
    public RateOrType1Choice getValSghtMrgnRate() {
        return valSghtMrgnRate;
    }

    /**
     * Sets the value of the valSghtMrgnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrType1Choice }
     *     
     */
    public CollateralParameters10 setValSghtMrgnRate(RateOrType1Choice value) {
        this.valSghtMrgnRate = value;
        return this;
    }

    /**
     * Gets the value of the trfTitl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrfTitl() {
        return trfTitl;
    }

    /**
     * Sets the value of the trfTitl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralParameters10 setTrfTitl(Boolean value) {
        this.trfTitl = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPrc property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getSttlmPrc() {
        return sttlmPrc;
    }

    /**
     * Sets the value of the sttlmPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public CollateralParameters10 setSttlmPrc(GenericIdentification30 value) {
        this.sttlmPrc = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public CollateralParameters10 setPrty(GenericIdentification30 value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the automtcAllcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomtcAllcn() {
        return automtcAllcn;
    }

    /**
     * Sets the value of the automtcAllcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralParameters10 setAutomtcAllcn(Boolean value) {
        this.automtcAllcn = value;
        return this;
    }

    /**
     * Gets the value of the faildSttlmSlvtn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaildSttlmSlvtn() {
        return faildSttlmSlvtn;
    }

    /**
     * Sets the value of the faildSttlmSlvtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralParameters10 setFaildSttlmSlvtn(Boolean value) {
        this.faildSttlmSlvtn = value;
        return this;
    }

    /**
     * Gets the value of the mainTradgAcctCollstn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMainTradgAcctCollstn() {
        return mainTradgAcctCollstn;
    }

    /**
     * Sets the value of the mainTradgAcctCollstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralParameters10 setMainTradgAcctCollstn(Boolean value) {
        this.mainTradgAcctCollstn = value;
        return this;
    }

    /**
     * Gets the value of the bsktIdAndElgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link BasketIdentificationAndEligibilitySetProfile1 }
     *     
     */
    public BasketIdentificationAndEligibilitySetProfile1 getBsktIdAndElgbltySetPrfl() {
        return bsktIdAndElgbltySetPrfl;
    }

    /**
     * Sets the value of the bsktIdAndElgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketIdentificationAndEligibilitySetProfile1 }
     *     
     */
    public CollateralParameters10 setBsktIdAndElgbltySetPrfl(BasketIdentificationAndEligibilitySetProfile1 value) {
        this.bsktIdAndElgbltySetPrfl = value;
        return this;
    }

    /**
     * Gets the value of the rspnSts property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus9Choice }
     *     
     */
    public ResponseStatus9Choice getRspnSts() {
        return rspnSts;
    }

    /**
     * Sets the value of the rspnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus9Choice }
     *     
     */
    public CollateralParameters10 setRspnSts(ResponseStatus9Choice value) {
        this.rspnSts = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation24 }
     *     
     */
    public AdditionalInformation24 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation24 }
     *     
     */
    public CollateralParameters10 setAddtlInf(AdditionalInformation24 value) {
        this.addtlInf = value;
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
