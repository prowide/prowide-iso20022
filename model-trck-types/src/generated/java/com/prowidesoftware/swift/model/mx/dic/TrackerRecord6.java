
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Specifies the agent specific tracking system information of a payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerRecord6", propOrder = {
    "ptyOrAgt",
    "chrgBr",
    "chrgsAmt",
    "xchgRateData",
    "prcgDtTm"
})
public class TrackerRecord6 {

    @XmlElement(name = "PtyOrAgt")
    protected TrackerPartyIdentification2 ptyOrAgt;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "ChrgsAmt")
    protected ActiveCurrencyAndAmount chrgsAmt;
    @XmlElement(name = "XchgRateData")
    protected CurrencyExchange13 xchgRateData;
    @XmlElement(name = "PrcgDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime prcgDtTm;

    /**
     * Gets the value of the ptyOrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerPartyIdentification2 getPtyOrAgt() {
        return ptyOrAgt;
    }

    /**
     * Sets the value of the ptyOrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerPartyIdentification2 }
     *     
     */
    public TrackerRecord6 setPtyOrAgt(TrackerPartyIdentification2 value) {
        this.ptyOrAgt = value;
        return this;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public TrackerRecord6 setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getChrgsAmt() {
        return chrgsAmt;
    }

    /**
     * Sets the value of the chrgsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TrackerRecord6 setChrgsAmt(ActiveCurrencyAndAmount value) {
        this.chrgsAmt = value;
        return this;
    }

    /**
     * Gets the value of the xchgRateData property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange13 }
     *     
     */
    public CurrencyExchange13 getXchgRateData() {
        return xchgRateData;
    }

    /**
     * Sets the value of the xchgRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange13 }
     *     
     */
    public TrackerRecord6 setXchgRateData(CurrencyExchange13 value) {
        this.xchgRateData = value;
        return this;
    }

    /**
     * Gets the value of the prcgDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getPrcgDtTm() {
        return prcgDtTm;
    }

    /**
     * Sets the value of the prcgDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TrackerRecord6 setPrcgDtTm(OffsetDateTime value) {
        this.prcgDtTm = value;
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
