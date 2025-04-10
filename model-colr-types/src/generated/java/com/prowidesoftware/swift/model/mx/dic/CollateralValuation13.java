
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
 * Valuation details of each piece of collateral posted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValuation13", propOrder = {
    "collId",
    "collTp",
    "collDrctn",
    "sttlmSts",
    "apldXcssInd",
    "nbOfDaysAcrd",
    "valtnAmts",
    "dayCntBsis",
    "xchgRate",
    "ccyHrcut",
    "adjstdRate",
    "sctiesColl",
    "cshColl",
    "othrColl"
})
public class CollateralValuation13 {

    @XmlElement(name = "CollId")
    protected String collId;
    @XmlElement(name = "CollTp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralType8Code collTp;
    @XmlElement(name = "CollDrctn")
    @XmlSchemaType(name = "string")
    protected CollateralDirection1Code collDrctn;
    @XmlElement(name = "SttlmSts", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementStatus3Code sttlmSts;
    @XmlElement(name = "ApldXcssInd")
    @XmlSchemaType(name = "string")
    protected CollateralAppliedExcess1Code apldXcssInd;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "ValtnAmts", required = true)
    protected CollateralAmount1 valtnAmts;
    @XmlElement(name = "DayCntBsis")
    @XmlSchemaType(name = "string")
    protected InterestComputationMethod2Code dayCntBsis;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "CcyHrcut")
    protected BigDecimal ccyHrcut;
    @XmlElement(name = "AdjstdRate")
    protected BigDecimal adjstdRate;
    @XmlElement(name = "SctiesColl")
    protected SecuritiesCollateral13 sctiesColl;
    @XmlElement(name = "CshColl")
    protected CashCollateral4 cshColl;
    @XmlElement(name = "OthrColl")
    protected OtherCollateral10 othrColl;

    /**
     * Gets the value of the collId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollId() {
        return collId;
    }

    /**
     * Sets the value of the collId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralValuation13 setCollId(String value) {
        this.collId = value;
        return this;
    }

    /**
     * Gets the value of the collTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType8Code }
     *     
     */
    public CollateralType8Code getCollTp() {
        return collTp;
    }

    /**
     * Sets the value of the collTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType8Code }
     *     
     */
    public CollateralValuation13 setCollTp(CollateralType8Code value) {
        this.collTp = value;
        return this;
    }

    /**
     * Gets the value of the collDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralDirection1Code }
     *     
     */
    public CollateralDirection1Code getCollDrctn() {
        return collDrctn;
    }

    /**
     * Sets the value of the collDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralDirection1Code }
     *     
     */
    public CollateralValuation13 setCollDrctn(CollateralDirection1Code value) {
        this.collDrctn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus3Code }
     *     
     */
    public SettlementStatus3Code getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus3Code }
     *     
     */
    public CollateralValuation13 setSttlmSts(SettlementStatus3Code value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the apldXcssInd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAppliedExcess1Code }
     *     
     */
    public CollateralAppliedExcess1Code getApldXcssInd() {
        return apldXcssInd;
    }

    /**
     * Sets the value of the apldXcssInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAppliedExcess1Code }
     *     
     */
    public CollateralValuation13 setApldXcssInd(CollateralAppliedExcess1Code value) {
        this.apldXcssInd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CollateralValuation13 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the valtnAmts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount1 }
     *     
     */
    public CollateralAmount1 getValtnAmts() {
        return valtnAmts;
    }

    /**
     * Sets the value of the valtnAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount1 }
     *     
     */
    public CollateralValuation13 setValtnAmts(CollateralAmount1 value) {
        this.valtnAmts = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public InterestComputationMethod2Code getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public CollateralValuation13 setDayCntBsis(InterestComputationMethod2Code value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CollateralValuation13 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the ccyHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCcyHrcut() {
        return ccyHrcut;
    }

    /**
     * Sets the value of the ccyHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CollateralValuation13 setCcyHrcut(BigDecimal value) {
        this.ccyHrcut = value;
        return this;
    }

    /**
     * Gets the value of the adjstdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjstdRate() {
        return adjstdRate;
    }

    /**
     * Sets the value of the adjstdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CollateralValuation13 setAdjstdRate(BigDecimal value) {
        this.adjstdRate = value;
        return this;
    }

    /**
     * Gets the value of the sctiesColl property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesCollateral13 }
     *     
     */
    public SecuritiesCollateral13 getSctiesColl() {
        return sctiesColl;
    }

    /**
     * Sets the value of the sctiesColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesCollateral13 }
     *     
     */
    public CollateralValuation13 setSctiesColl(SecuritiesCollateral13 value) {
        this.sctiesColl = value;
        return this;
    }

    /**
     * Gets the value of the cshColl property.
     * 
     * @return
     *     possible object is
     *     {@link CashCollateral4 }
     *     
     */
    public CashCollateral4 getCshColl() {
        return cshColl;
    }

    /**
     * Sets the value of the cshColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashCollateral4 }
     *     
     */
    public CollateralValuation13 setCshColl(CashCollateral4 value) {
        this.cshColl = value;
        return this;
    }

    /**
     * Gets the value of the othrColl property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCollateral10 }
     *     
     */
    public OtherCollateral10 getOthrColl() {
        return othrColl;
    }

    /**
     * Sets the value of the othrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCollateral10 }
     *     
     */
    public CollateralValuation13 setOthrColl(OtherCollateral10 value) {
        this.othrColl = value;
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
