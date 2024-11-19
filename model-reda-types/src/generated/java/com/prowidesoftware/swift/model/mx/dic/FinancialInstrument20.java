
package com.prowidesoftware.swift.model.mx.dic;

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
 * Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument20", propOrder = {
    "physBrScties",
    "dmtrlsdBrScties",
    "physRegdScties",
    "dmtrlsdRegdScties",
    "dstrbtnPlcy",
    "dvddPlcy",
    "dvddFrqcy",
    "rinvstmtFrqcy",
    "frntEndLd",
    "bckEndLd",
    "swtchFee",
    "euSvgsDrctv"
})
public class FinancialInstrument20 {

    @XmlElement(name = "PhysBrScties")
    protected boolean physBrScties;
    @XmlElement(name = "DmtrlsdBrScties")
    protected boolean dmtrlsdBrScties;
    @XmlElement(name = "PhysRegdScties")
    protected boolean physRegdScties;
    @XmlElement(name = "DmtrlsdRegdScties")
    protected boolean dmtrlsdRegdScties;
    @XmlElement(name = "DstrbtnPlcy", required = true)
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code dstrbtnPlcy;
    @XmlElement(name = "DvddPlcy")
    @XmlSchemaType(name = "string")
    protected DividendPolicy1Code dvddPlcy;
    @XmlElement(name = "DvddFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency5Code dvddFrqcy;
    @XmlElement(name = "RinvstmtFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency5Code rinvstmtFrqcy;
    @XmlElement(name = "FrntEndLd")
    protected boolean frntEndLd;
    @XmlElement(name = "BckEndLd")
    protected boolean bckEndLd;
    @XmlElement(name = "SwtchFee")
    protected boolean swtchFee;
    @XmlElement(name = "EUSvgsDrctv", required = true)
    @XmlSchemaType(name = "string")
    protected EUSavingsDirective1Code euSvgsDrctv;

    /**
     * Gets the value of the physBrScties property.
     * 
     */
    public boolean isPhysBrScties() {
        return physBrScties;
    }

    /**
     * Sets the value of the physBrScties property.
     * 
     */
    public FinancialInstrument20 setPhysBrScties(boolean value) {
        this.physBrScties = value;
        return this;
    }

    /**
     * Gets the value of the dmtrlsdBrScties property.
     * 
     */
    public boolean isDmtrlsdBrScties() {
        return dmtrlsdBrScties;
    }

    /**
     * Sets the value of the dmtrlsdBrScties property.
     * 
     */
    public FinancialInstrument20 setDmtrlsdBrScties(boolean value) {
        this.dmtrlsdBrScties = value;
        return this;
    }

    /**
     * Gets the value of the physRegdScties property.
     * 
     */
    public boolean isPhysRegdScties() {
        return physRegdScties;
    }

    /**
     * Sets the value of the physRegdScties property.
     * 
     */
    public FinancialInstrument20 setPhysRegdScties(boolean value) {
        this.physRegdScties = value;
        return this;
    }

    /**
     * Gets the value of the dmtrlsdRegdScties property.
     * 
     */
    public boolean isDmtrlsdRegdScties() {
        return dmtrlsdRegdScties;
    }

    /**
     * Sets the value of the dmtrlsdRegdScties property.
     * 
     */
    public FinancialInstrument20 setDmtrlsdRegdScties(boolean value) {
        this.dmtrlsdRegdScties = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtnPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public DistributionPolicy1Code getDstrbtnPlcy() {
        return dstrbtnPlcy;
    }

    /**
     * Sets the value of the dstrbtnPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public FinancialInstrument20 setDstrbtnPlcy(DistributionPolicy1Code value) {
        this.dstrbtnPlcy = value;
        return this;
    }

    /**
     * Gets the value of the dvddPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DividendPolicy1Code }
     *     
     */
    public DividendPolicy1Code getDvddPlcy() {
        return dvddPlcy;
    }

    /**
     * Sets the value of the dvddPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendPolicy1Code }
     *     
     */
    public FinancialInstrument20 setDvddPlcy(DividendPolicy1Code value) {
        this.dvddPlcy = value;
        return this;
    }

    /**
     * Gets the value of the dvddFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency5Code }
     *     
     */
    public EventFrequency5Code getDvddFrqcy() {
        return dvddFrqcy;
    }

    /**
     * Sets the value of the dvddFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency5Code }
     *     
     */
    public FinancialInstrument20 setDvddFrqcy(EventFrequency5Code value) {
        this.dvddFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency5Code }
     *     
     */
    public EventFrequency5Code getRinvstmtFrqcy() {
        return rinvstmtFrqcy;
    }

    /**
     * Sets the value of the rinvstmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency5Code }
     *     
     */
    public FinancialInstrument20 setRinvstmtFrqcy(EventFrequency5Code value) {
        this.rinvstmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the frntEndLd property.
     * 
     */
    public boolean isFrntEndLd() {
        return frntEndLd;
    }

    /**
     * Sets the value of the frntEndLd property.
     * 
     */
    public FinancialInstrument20 setFrntEndLd(boolean value) {
        this.frntEndLd = value;
        return this;
    }

    /**
     * Gets the value of the bckEndLd property.
     * 
     */
    public boolean isBckEndLd() {
        return bckEndLd;
    }

    /**
     * Sets the value of the bckEndLd property.
     * 
     */
    public FinancialInstrument20 setBckEndLd(boolean value) {
        this.bckEndLd = value;
        return this;
    }

    /**
     * Gets the value of the swtchFee property.
     * 
     */
    public boolean isSwtchFee() {
        return swtchFee;
    }

    /**
     * Sets the value of the swtchFee property.
     * 
     */
    public FinancialInstrument20 setSwtchFee(boolean value) {
        this.swtchFee = value;
        return this;
    }

    /**
     * Gets the value of the euSvgsDrctv property.
     * 
     * @return
     *     possible object is
     *     {@link EUSavingsDirective1Code }
     *     
     */
    public EUSavingsDirective1Code getEUSvgsDrctv() {
        return euSvgsDrctv;
    }

    /**
     * Sets the value of the euSvgsDrctv property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUSavingsDirective1Code }
     *     
     */
    public FinancialInstrument20 setEUSvgsDrctv(EUSavingsDirective1Code value) {
        this.euSvgsDrctv = value;
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
