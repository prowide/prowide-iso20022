
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
 * Information related specifically to credit derivatives attributes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDerivative2", propOrder = {
    "snrty",
    "refPty",
    "pmtFrqcy",
    "clctnBsis",
    "srs",
    "vrsn",
    "indxFctr",
    "trch"
})
public class CreditDerivative2 {

    @XmlElement(name = "Snrty")
    @XmlSchemaType(name = "string")
    protected DebtInstrumentSeniorityType2Code snrty;
    @XmlElement(name = "RefPty")
    protected DerivativePartyIdentification1Choice refPty;
    @XmlElement(name = "PmtFrqcy")
    @XmlSchemaType(name = "string")
    protected Frequency8Code pmtFrqcy;
    @XmlElement(name = "ClctnBsis")
    protected String clctnBsis;
    @XmlElement(name = "Srs")
    protected BigDecimal srs;
    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "IndxFctr")
    protected BigDecimal indxFctr;
    @XmlElement(name = "Trch")
    protected TrancheIndicator2Choice trch;

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
    public CreditDerivative2 setSnrty(DebtInstrumentSeniorityType2Code value) {
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
    public CreditDerivative2 setRefPty(DerivativePartyIdentification1Choice value) {
        this.refPty = value;
        return this;
    }

    /**
     * Gets the value of the pmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency8Code }
     *     
     */
    public Frequency8Code getPmtFrqcy() {
        return pmtFrqcy;
    }

    /**
     * Sets the value of the pmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency8Code }
     *     
     */
    public CreditDerivative2 setPmtFrqcy(Frequency8Code value) {
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
    public CreditDerivative2 setClctnBsis(String value) {
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
    public CreditDerivative2 setSrs(BigDecimal value) {
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
    public CreditDerivative2 setVrsn(BigDecimal value) {
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
    public CreditDerivative2 setIndxFctr(BigDecimal value) {
        this.indxFctr = value;
        return this;
    }

    /**
     * Gets the value of the trch property.
     * 
     * @return
     *     possible object is
     *     {@link TrancheIndicator2Choice }
     *     
     */
    public TrancheIndicator2Choice getTrch() {
        return trch;
    }

    /**
     * Sets the value of the trch property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrancheIndicator2Choice }
     *     
     */
    public CreditDerivative2 setTrch(TrancheIndicator2Choice value) {
        this.trch = value;
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
