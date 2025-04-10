
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the triparty collateral transaction deal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealTransactionDetails5", propOrder = {
    "plcOfTrad",
    "cncntrtnLmt",
    "minNtcePrd",
    "clsgDt",
    "dealDtlsAmt",
    "pricgRateAndIndx",
    "ovrnghtFrqcyRateFxg",
    "sprd",
    "dayCntBsis",
    "pmt",
    "optnTp",
    "termntnOptn"
})
public class DealTransactionDetails5 {

    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1 plcOfTrad;
    @XmlElement(name = "CncntrtnLmt")
    protected Boolean cncntrtnLmt;
    @XmlElement(name = "MinNtcePrd")
    protected String minNtcePrd;
    @XmlElement(name = "ClsgDt", required = true)
    protected ClosingDate4Choice clsgDt;
    @XmlElement(name = "DealDtlsAmt")
    protected CollateralAmount18 dealDtlsAmt;
    @XmlElement(name = "PricgRateAndIndx")
    protected RateOrName4Choice pricgRateAndIndx;
    @XmlElement(name = "OvrnghtFrqcyRateFxg")
    protected FrequencyRateFixing1Choice ovrnghtFrqcyRateFxg;
    @XmlElement(name = "Sprd")
    protected BigDecimal sprd;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethodFormat4Choice dayCntBsis;
    @XmlElement(name = "Pmt")
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "OptnTp")
    protected OptionType6Choice optnTp;
    @XmlElement(name = "TermntnOptn")
    @XmlSchemaType(name = "string")
    protected RepoTerminationOption1Code termntnOptn;

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification1 }
     *     
     */
    public PlaceOfTradeIdentification1 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification1 }
     *     
     */
    public DealTransactionDetails5 setPlcOfTrad(PlaceOfTradeIdentification1 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the cncntrtnLmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCncntrtnLmt() {
        return cncntrtnLmt;
    }

    /**
     * Sets the value of the cncntrtnLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DealTransactionDetails5 setCncntrtnLmt(Boolean value) {
        this.cncntrtnLmt = value;
        return this;
    }

    /**
     * Gets the value of the minNtcePrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinNtcePrd() {
        return minNtcePrd;
    }

    /**
     * Sets the value of the minNtcePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DealTransactionDetails5 setMinNtcePrd(String value) {
        this.minNtcePrd = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public ClosingDate4Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public DealTransactionDetails5 setClsgDt(ClosingDate4Choice value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the dealDtlsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount18 }
     *     
     */
    public CollateralAmount18 getDealDtlsAmt() {
        return dealDtlsAmt;
    }

    /**
     * Sets the value of the dealDtlsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount18 }
     *     
     */
    public DealTransactionDetails5 setDealDtlsAmt(CollateralAmount18 value) {
        this.dealDtlsAmt = value;
        return this;
    }

    /**
     * Gets the value of the pricgRateAndIndx property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName4Choice }
     *     
     */
    public RateOrName4Choice getPricgRateAndIndx() {
        return pricgRateAndIndx;
    }

    /**
     * Sets the value of the pricgRateAndIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName4Choice }
     *     
     */
    public DealTransactionDetails5 setPricgRateAndIndx(RateOrName4Choice value) {
        this.pricgRateAndIndx = value;
        return this;
    }

    /**
     * Gets the value of the ovrnghtFrqcyRateFxg property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyRateFixing1Choice }
     *     
     */
    public FrequencyRateFixing1Choice getOvrnghtFrqcyRateFxg() {
        return ovrnghtFrqcyRateFxg;
    }

    /**
     * Sets the value of the ovrnghtFrqcyRateFxg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyRateFixing1Choice }
     *     
     */
    public DealTransactionDetails5 setOvrnghtFrqcyRateFxg(FrequencyRateFixing1Choice value) {
        this.ovrnghtFrqcyRateFxg = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DealTransactionDetails5 setSprd(BigDecimal value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public InterestComputationMethodFormat4Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public DealTransactionDetails5 setDayCntBsis(InterestComputationMethodFormat4Choice value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the pmt property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getPmt() {
        return pmt;
    }

    /**
     * Sets the value of the pmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DealTransactionDetails5 setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType6Choice }
     *     
     */
    public OptionType6Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType6Choice }
     *     
     */
    public DealTransactionDetails5 setOptnTp(OptionType6Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the termntnOptn property.
     * 
     * @return
     *     possible object is
     *     {@link RepoTerminationOption1Code }
     *     
     */
    public RepoTerminationOption1Code getTermntnOptn() {
        return termntnOptn;
    }

    /**
     * Sets the value of the termntnOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoTerminationOption1Code }
     *     
     */
    public DealTransactionDetails5 setTermntnOptn(RepoTerminationOption1Code value) {
        this.termntnOptn = value;
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
