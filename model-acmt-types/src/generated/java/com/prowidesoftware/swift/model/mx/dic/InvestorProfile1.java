
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
 * Information about actions that may be taken on an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorProfile1", propOrder = {
    "tp",
    "sts",
    "trsr",
    "hghFrqcyTradg",
    "mktMakr"
})
public class InvestorProfile1 {

    @XmlElement(name = "Tp")
    protected ProfileType1Choice tp;
    @XmlElement(name = "Sts")
    protected InvestorProfileStatus1Choice sts;
    @XmlElement(name = "Trsr")
    protected TreasuryProfile1 trsr;
    @XmlElement(name = "HghFrqcyTradg")
    protected HighFrequencyTradingProfile1 hghFrqcyTradg;
    @XmlElement(name = "MktMakr")
    protected MarketMakerProfile1 mktMakr;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileType1Choice }
     *     
     */
    public ProfileType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileType1Choice }
     *     
     */
    public InvestorProfile1 setTp(ProfileType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorProfileStatus1Choice }
     *     
     */
    public InvestorProfileStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorProfileStatus1Choice }
     *     
     */
    public InvestorProfile1 setSts(InvestorProfileStatus1Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the trsr property.
     * 
     * @return
     *     possible object is
     *     {@link TreasuryProfile1 }
     *     
     */
    public TreasuryProfile1 getTrsr() {
        return trsr;
    }

    /**
     * Sets the value of the trsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TreasuryProfile1 }
     *     
     */
    public InvestorProfile1 setTrsr(TreasuryProfile1 value) {
        this.trsr = value;
        return this;
    }

    /**
     * Gets the value of the hghFrqcyTradg property.
     * 
     * @return
     *     possible object is
     *     {@link HighFrequencyTradingProfile1 }
     *     
     */
    public HighFrequencyTradingProfile1 getHghFrqcyTradg() {
        return hghFrqcyTradg;
    }

    /**
     * Sets the value of the hghFrqcyTradg property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighFrequencyTradingProfile1 }
     *     
     */
    public InvestorProfile1 setHghFrqcyTradg(HighFrequencyTradingProfile1 value) {
        this.hghFrqcyTradg = value;
        return this;
    }

    /**
     * Gets the value of the mktMakr property.
     * 
     * @return
     *     possible object is
     *     {@link MarketMakerProfile1 }
     *     
     */
    public MarketMakerProfile1 getMktMakr() {
        return mktMakr;
    }

    /**
     * Sets the value of the mktMakr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketMakerProfile1 }
     *     
     */
    public InvestorProfile1 setMktMakr(MarketMakerProfile1 value) {
        this.mktMakr = value;
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
