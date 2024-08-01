
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
 * Information related specifically to credit derivatives attributes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDerivative7", propOrder = {
    "snrty",
    "refPty",
    "pmtFrqcy",
    "clctnBsis",
    "srs",
    "vrsn",
    "indxFctr",
    "trchInd"
})
public class CreditDerivative7 {

    @XmlElement(name = "Snrty")
    @XmlSchemaType(name = "string")
    protected DebtInstrumentSeniorityType2Code snrty;
    @XmlElement(name = "RefPty")
    protected DerivativePartyIdentification1Choice refPty;
    @XmlElement(name = "PmtFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency13Code pmtFrqcy;
    @XmlElement(name = "ClctnBsis")
    protected String clctnBsis;
    @XmlElement(name = "Srs")
    protected BigDecimal srs;
    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "IndxFctr")
    protected BigDecimal indxFctr;
    @XmlElement(name = "TrchInd")
    protected Boolean trchInd;

    /**
     * Gets the value of the snrty property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrumentSeniorityType2Code }
     *     
     */
    public DebtInstrumentSeniorityType2Code getSnrty() {
        return snrty;
    }

    /**
     * Sets the value of the snrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrumentSeniorityType2Code }
     *     
     */
    public CreditDerivative7 setSnrty(DebtInstrumentSeniorityType2Code value) {
        this.snrty = value;
        return this;
    }

    /**
     * Gets the value of the refPty property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativePartyIdentification1Choice }
     *     
     */
    public DerivativePartyIdentification1Choice getRefPty() {
        return refPty;
    }

    /**
     * Sets the value of the refPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativePartyIdentification1Choice }
     *     
     */
    public CreditDerivative7 setRefPty(DerivativePartyIdentification1Choice value) {
        this.refPty = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency13Code }
     *     
     */
    public Frequency13Code getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency13Code }
     *     
     */
    public CreditDerivative7 setPmtFrqcy(Frequency13Code value) {
        this.pmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the clctnBsis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClctnBsis() {
        return clctnBsis;
    }

    /**
     * Sets the value of the clctnBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditDerivative7 setClctnBsis(String value) {
        this.clctnBsis = value;
        return this;
    }

    /**
     * Gets the value of the srs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSrs() {
        return srs;
    }

    /**
     * Sets the value of the srs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CreditDerivative7 setSrs(BigDecimal value) {
        this.srs = value;
        return this;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CreditDerivative7 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the indxFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndxFctr() {
        return indxFctr;
    }

    /**
     * Sets the value of the indxFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CreditDerivative7 setIndxFctr(BigDecimal value) {
        this.indxFctr = value;
        return this;
    }

    /**
     * Gets the value of the trchInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrchInd() {
        return trchInd;
    }

    /**
     * Sets the value of the trchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CreditDerivative7 setTrchInd(Boolean value) {
        this.trchInd = value;
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
