
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
 * Further detailed information on the exchange rate that has been used in or is related to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateInformation5", propOrder = {
    "prvdr",
    "id",
    "dt",
    "tm",
    "endPt",
    "othrEndPt",
    "cntrCcyCd",
    "baseCcyCd",
    "rate",
    "rateTp",
    "othrRateTp",
    "agrmtTp",
    "othrAgrmtTp",
    "rateLckReqd",
    "rateLckElgbl",
    "rateLckApld"
})
public class ExchangeRateInformation5 {

    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dt;
    @XmlElement(name = "Tm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime tm;
    @XmlElement(name = "EndPt")
    @XmlSchemaType(name = "string")
    protected Endpoint1Code endPt;
    @XmlElement(name = "OthrEndPt")
    protected String othrEndPt;
    @XmlElement(name = "CntrCcyCd")
    protected String cntrCcyCd;
    @XmlElement(name = "BaseCcyCd")
    protected String baseCcyCd;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "RateTp")
    @XmlSchemaType(name = "string")
    protected ExchangeRateType2Code rateTp;
    @XmlElement(name = "OthrRateTp")
    protected String othrRateTp;
    @XmlElement(name = "AgrmtTp")
    @XmlSchemaType(name = "string")
    protected ExchangeRateAgreementType1Code agrmtTp;
    @XmlElement(name = "OthrAgrmtTp")
    protected String othrAgrmtTp;
    @XmlElement(name = "RateLckReqd")
    protected Boolean rateLckReqd;
    @XmlElement(name = "RateLckElgbl")
    protected Boolean rateLckElgbl;
    @XmlElement(name = "RateLckApld")
    protected Boolean rateLckApld;

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation5 setPrvdr(String value) {
        this.prvdr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation5 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation5 setDt(LocalDate value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation5 setTm(OffsetTime value) {
        this.tm = value;
        return this;
    }

    /**
     * Gets the value of the endPt property.
     * 
     * @return
     *     possible object is
     *     {@link Endpoint1Code }
     *     
     */
    public Endpoint1Code getEndPt() {
        return endPt;
    }

    /**
     * Sets the value of the endPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Endpoint1Code }
     *     
     */
    public ExchangeRateInformation5 setEndPt(Endpoint1Code value) {
        this.endPt = value;
        return this;
    }

    /**
     * Gets the value of the othrEndPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrEndPt() {
        return othrEndPt;
    }

    /**
     * Sets the value of the othrEndPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation5 setOthrEndPt(String value) {
        this.othrEndPt = value;
        return this;
    }

    /**
     * Gets the value of the cntrCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrCcyCd() {
        return cntrCcyCd;
    }

    /**
     * Sets the value of the cntrCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation5 setCntrCcyCd(String value) {
        this.cntrCcyCd = value;
        return this;
    }

    /**
     * Gets the value of the baseCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCcyCd() {
        return baseCcyCd;
    }

    /**
     * Sets the value of the baseCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation5 setBaseCcyCd(String value) {
        this.baseCcyCd = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ExchangeRateInformation5 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType2Code }
     *     
     */
    public ExchangeRateType2Code getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType2Code }
     *     
     */
    public ExchangeRateInformation5 setRateTp(ExchangeRateType2Code value) {
        this.rateTp = value;
        return this;
    }

    /**
     * Gets the value of the othrRateTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRateTp() {
        return othrRateTp;
    }

    /**
     * Sets the value of the othrRateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation5 setOthrRateTp(String value) {
        this.othrRateTp = value;
        return this;
    }

    /**
     * Gets the value of the agrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateAgreementType1Code }
     *     
     */
    public ExchangeRateAgreementType1Code getAgrmtTp() {
        return agrmtTp;
    }

    /**
     * Sets the value of the agrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateAgreementType1Code }
     *     
     */
    public ExchangeRateInformation5 setAgrmtTp(ExchangeRateAgreementType1Code value) {
        this.agrmtTp = value;
        return this;
    }

    /**
     * Gets the value of the othrAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAgrmtTp() {
        return othrAgrmtTp;
    }

    /**
     * Sets the value of the othrAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation5 setOthrAgrmtTp(String value) {
        this.othrAgrmtTp = value;
        return this;
    }

    /**
     * Gets the value of the rateLckReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateLckReqd() {
        return rateLckReqd;
    }

    /**
     * Sets the value of the rateLckReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ExchangeRateInformation5 setRateLckReqd(Boolean value) {
        this.rateLckReqd = value;
        return this;
    }

    /**
     * Gets the value of the rateLckElgbl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateLckElgbl() {
        return rateLckElgbl;
    }

    /**
     * Sets the value of the rateLckElgbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ExchangeRateInformation5 setRateLckElgbl(Boolean value) {
        this.rateLckElgbl = value;
        return this;
    }

    /**
     * Gets the value of the rateLckApld property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateLckApld() {
        return rateLckApld;
    }

    /**
     * Sets the value of the rateLckApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ExchangeRateInformation5 setRateLckApld(Boolean value) {
        this.rateLckApld = value;
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
