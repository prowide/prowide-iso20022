
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Details of the triparty collateral transaction deal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DealTransactionDetails6", propOrder = {
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
public class DealTransactionDetails6 {

    @XmlElement(name = "MinNtcePrd")
    protected String minNtcePrd;
    @XmlElement(name = "ClsgDt", required = true)
    protected ClosingDate4Choice clsgDt;
    @XmlElement(name = "DealDtlsAmt")
    protected CollateralAmount12 dealDtlsAmt;
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
    public DealTransactionDetails6 setMinNtcePrd(String value) {
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
    public DealTransactionDetails6 setClsgDt(ClosingDate4Choice value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the dealDtlsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount12 }
     *     
     */
    public CollateralAmount12 getDealDtlsAmt() {
        return dealDtlsAmt;
    }

    /**
     * Sets the value of the dealDtlsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount12 }
     *     
     */
    public DealTransactionDetails6 setDealDtlsAmt(CollateralAmount12 value) {
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
    public DealTransactionDetails6 setPricgRateAndIndx(RateOrName4Choice value) {
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
    public DealTransactionDetails6 setOvrnghtFrqcyRateFxg(FrequencyRateFixing1Choice value) {
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
    public DealTransactionDetails6 setSprd(BigDecimal value) {
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
    public DealTransactionDetails6 setDayCntBsis(InterestComputationMethodFormat4Choice value) {
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
    public DealTransactionDetails6 setPmt(DeliveryReceiptType2Code value) {
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
    public DealTransactionDetails6 setOptnTp(OptionType6Choice value) {
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
    public DealTransactionDetails6 setTermntnOptn(RepoTerminationOption1Code value) {
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
