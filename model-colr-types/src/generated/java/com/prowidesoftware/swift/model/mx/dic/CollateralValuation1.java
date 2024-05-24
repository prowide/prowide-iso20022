
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
 * Provides details about the valuation of each piece of collateral that is posted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValuation1", propOrder = {
    "collRef",
    "collTp",
    "sttlmSts",
    "nbOfDaysAcrd",
    "amtDtls",
    "dayCntBsis",
    "xchgRate",
    "ccyHrcut",
    "adjstdRate",
    "sctiesCollDtls",
    "cshCollDtls",
    "othrCollDtls"
})
public class CollateralValuation1 {

    @XmlElement(name = "CollRef", required = true)
    protected String collRef;
    @XmlElement(name = "CollTp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralType1Code collTp;
    @XmlElement(name = "SttlmSts", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementStatus2Code sttlmSts;
    @XmlElement(name = "NbOfDaysAcrd", required = true)
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "AmtDtls", required = true)
    protected CollateralAmount1 amtDtls;
    @XmlElement(name = "DayCntBsis", required = true)
    @XmlSchemaType(name = "string")
    protected InterestComputationMethod2Code dayCntBsis;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "CcyHrcut")
    protected BigDecimal ccyHrcut;
    @XmlElement(name = "AdjstdRate")
    protected BigDecimal adjstdRate;
    @XmlElement(name = "SctiesCollDtls")
    protected SecuritiesCollateral1 sctiesCollDtls;
    @XmlElement(name = "CshCollDtls")
    protected CashCollateral1 cshCollDtls;
    @XmlElement(name = "OthrCollDtls")
    protected OtherCollateral1 othrCollDtls;

    /**
     * Gets the value of the collRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollRef() {
        return collRef;
    }

    /**
     * Sets the value of the collRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralValuation1 setCollRef(String value) {
        this.collRef = value;
        return this;
    }

    /**
     * Gets the value of the collTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType1Code }
     *     
     */
    public CollateralType1Code getCollTp() {
        return collTp;
    }

    /**
     * Sets the value of the collTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType1Code }
     *     
     */
    public CollateralValuation1 setCollTp(CollateralType1Code value) {
        this.collTp = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus2Code }
     *     
     */
    public SettlementStatus2Code getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus2Code }
     *     
     */
    public CollateralValuation1 setSttlmSts(SettlementStatus2Code value) {
        this.sttlmSts = value;
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
    public CollateralValuation1 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount1 }
     *     
     */
    public CollateralAmount1 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount1 }
     *     
     */
    public CollateralValuation1 setAmtDtls(CollateralAmount1 value) {
        this.amtDtls = value;
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
    public CollateralValuation1 setDayCntBsis(InterestComputationMethod2Code value) {
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
    public CollateralValuation1 setXchgRate(BigDecimal value) {
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
    public CollateralValuation1 setCcyHrcut(BigDecimal value) {
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
    public CollateralValuation1 setAdjstdRate(BigDecimal value) {
        this.adjstdRate = value;
        return this;
    }

    /**
     * Gets the value of the sctiesCollDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesCollateral1 }
     *     
     */
    public SecuritiesCollateral1 getSctiesCollDtls() {
        return sctiesCollDtls;
    }

    /**
     * Sets the value of the sctiesCollDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesCollateral1 }
     *     
     */
    public CollateralValuation1 setSctiesCollDtls(SecuritiesCollateral1 value) {
        this.sctiesCollDtls = value;
        return this;
    }

    /**
     * Gets the value of the cshCollDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CashCollateral1 }
     *     
     */
    public CashCollateral1 getCshCollDtls() {
        return cshCollDtls;
    }

    /**
     * Sets the value of the cshCollDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashCollateral1 }
     *     
     */
    public CollateralValuation1 setCshCollDtls(CashCollateral1 value) {
        this.cshCollDtls = value;
        return this;
    }

    /**
     * Gets the value of the othrCollDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCollateral1 }
     *     
     */
    public OtherCollateral1 getOthrCollDtls() {
        return othrCollDtls;
    }

    /**
     * Sets the value of the othrCollDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCollateral1 }
     *     
     */
    public CollateralValuation1 setOthrCollDtls(OtherCollateral1 value) {
        this.othrCollDtls = value;
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
