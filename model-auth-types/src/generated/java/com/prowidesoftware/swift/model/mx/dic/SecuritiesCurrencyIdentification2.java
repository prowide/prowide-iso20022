
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details an individual currency including details on which country trades the currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesCurrencyIdentification2", propOrder = {
    "ccy",
    "frctnlDgt",
    "ctryDtls",
    "preEuro",
    "mod",
    "vldtyPrd",
    "lastUpdtd"
})
public class SecuritiesCurrencyIdentification2 {

    @XmlElement(name = "Ccy", required = true)
    protected CurrencyCodeAndName1 ccy;
    @XmlElement(name = "FrctnlDgt")
    protected BigDecimal frctnlDgt;
    @XmlElement(name = "CtryDtls", required = true)
    protected CountryCodeAndName3 ctryDtls;
    @XmlElement(name = "PreEuro")
    protected boolean preEuro;
    @XmlElement(name = "Mod")
    @XmlSchemaType(name = "string")
    protected Modification1Code mod;
    @XmlElement(name = "VldtyPrd", required = true)
    protected Period4Choice vldtyPrd;
    @XmlElement(name = "LastUpdtd", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate lastUpdtd;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeAndName1 }
     *     
     */
    public CurrencyCodeAndName1 getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeAndName1 }
     *     
     */
    public SecuritiesCurrencyIdentification2 setCcy(CurrencyCodeAndName1 value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the frctnlDgt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrctnlDgt() {
        return frctnlDgt;
    }

    /**
     * Sets the value of the frctnlDgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesCurrencyIdentification2 setFrctnlDgt(BigDecimal value) {
        this.frctnlDgt = value;
        return this;
    }

    /**
     * Gets the value of the ctryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeAndName3 }
     *     
     */
    public CountryCodeAndName3 getCtryDtls() {
        return ctryDtls;
    }

    /**
     * Sets the value of the ctryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeAndName3 }
     *     
     */
    public SecuritiesCurrencyIdentification2 setCtryDtls(CountryCodeAndName3 value) {
        this.ctryDtls = value;
        return this;
    }

    /**
     * Gets the value of the preEuro property.
     * 
     */
    public boolean isPreEuro() {
        return preEuro;
    }

    /**
     * Sets the value of the preEuro property.
     * 
     */
    public SecuritiesCurrencyIdentification2 setPreEuro(boolean value) {
        this.preEuro = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link Modification1Code }
     *     
     */
    public Modification1Code getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification1Code }
     *     
     */
    public SecuritiesCurrencyIdentification2 setMod(Modification1Code value) {
        this.mod = value;
        return this;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public SecuritiesCurrencyIdentification2 setVldtyPrd(Period4Choice value) {
        this.vldtyPrd = value;
        return this;
    }

    /**
     * Gets the value of the lastUpdtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getLastUpdtd() {
        return lastUpdtd;
    }

    /**
     * Sets the value of the lastUpdtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesCurrencyIdentification2 setLastUpdtd(LocalDate value) {
        this.lastUpdtd = value;
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
