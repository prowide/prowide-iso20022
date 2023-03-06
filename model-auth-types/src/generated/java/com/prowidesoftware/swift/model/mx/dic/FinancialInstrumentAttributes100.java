
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
 * Elements characterising a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes100", propOrder = {
    "nm",
    "cmptntAuthrty",
    "ctryOfDmcl",
    "mnyMktFndTp",
    "lglFrmwk",
    "psptd"
})
public class FinancialInstrumentAttributes100 {

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "CmptntAuthrty", required = true)
    protected SupervisingAuthorityIdentification1 cmptntAuthrty;
    @XmlElement(name = "CtryOfDmcl", required = true)
    protected String ctryOfDmcl;
    @XmlElement(name = "MnyMktFndTp", required = true)
    protected MoneyMarketFundType1Choice mnyMktFndTp;
    @XmlElement(name = "LglFrmwk", required = true)
    protected LegalFramework5Choice lglFrmwk;
    @XmlElement(name = "Psptd")
    protected Boolean psptd;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes100 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the cmptntAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisingAuthorityIdentification1 }
     *     
     */
    public SupervisingAuthorityIdentification1 getCmptntAuthrty() {
        return cmptntAuthrty;
    }

    /**
     * Sets the value of the cmptntAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisingAuthorityIdentification1 }
     *     
     */
    public FinancialInstrumentAttributes100 setCmptntAuthrty(SupervisingAuthorityIdentification1 value) {
        this.cmptntAuthrty = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfDmcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfDmcl() {
        return ctryOfDmcl;
    }

    /**
     * Sets the value of the ctryOfDmcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes100 setCtryOfDmcl(String value) {
        this.ctryOfDmcl = value;
        return this;
    }

    /**
     * Gets the value of the mnyMktFndTp property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketFundType1Choice }
     *     
     */
    public MoneyMarketFundType1Choice getMnyMktFndTp() {
        return mnyMktFndTp;
    }

    /**
     * Sets the value of the mnyMktFndTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketFundType1Choice }
     *     
     */
    public FinancialInstrumentAttributes100 setMnyMktFndTp(MoneyMarketFundType1Choice value) {
        this.mnyMktFndTp = value;
        return this;
    }

    /**
     * Gets the value of the lglFrmwk property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFramework5Choice }
     *     
     */
    public LegalFramework5Choice getLglFrmwk() {
        return lglFrmwk;
    }

    /**
     * Sets the value of the lglFrmwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFramework5Choice }
     *     
     */
    public FinancialInstrumentAttributes100 setLglFrmwk(LegalFramework5Choice value) {
        this.lglFrmwk = value;
        return this;
    }

    /**
     * Gets the value of the psptd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPsptd() {
        return psptd;
    }

    /**
     * Sets the value of the psptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributes100 setPsptd(Boolean value) {
        this.psptd = value;
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
