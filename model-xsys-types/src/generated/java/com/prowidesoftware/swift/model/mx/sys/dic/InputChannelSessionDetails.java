
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime ;
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
 * Java class for InputChannelSessionDetails complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputChannelSessionDetails", propOrder = {
    "authstnDN",
    "wndwSz",
    "ssnOpnTm",
    "ssnClsTm",
    "nbOfSntMsgs",
    "frstSnFInptSeq",
    "lstSnFInptSeq"
})
public class InputChannelSessionDetails {

    @XmlElement(name = "AuthstnDN", required = true)
    protected String authstnDN;
    @XmlElement(name = "WndwSz", required = true)
    protected BigDecimal wndwSz;
    @XmlElement(name = "SsnOpnTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime ssnOpnTm;
    @XmlElement(name = "SsnClsTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime ssnClsTm;
    @XmlElement(name = "NbOfSntMsgs", required = true)
    protected BigDecimal nbOfSntMsgs;
    @XmlElement(name = "FrstSnFInptSeq")
    protected BigDecimal frstSnFInptSeq;
    @XmlElement(name = "LstSnFInptSeq")
    protected BigDecimal lstSnFInptSeq;

    /**
     * Gets the value of the authstnDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnDN() {
        return authstnDN;
    }

    /**
     * Sets the value of the authstnDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InputChannelSessionDetails setAuthstnDN(String value) {
        this.authstnDN = value;
        return this;
    }

    /**
     * Gets the value of the wndwSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWndwSz() {
        return wndwSz;
    }

    /**
     * Sets the value of the wndwSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InputChannelSessionDetails setWndwSz(BigDecimal value) {
        this.wndwSz = value;
        return this;
    }

    /**
     * Gets the value of the ssnOpnTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getSsnOpnTm() {
        return ssnOpnTm;
    }

    /**
     * Sets the value of the ssnOpnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InputChannelSessionDetails setSsnOpnTm(OffsetDateTime value) {
        this.ssnOpnTm = value;
        return this;
    }

    /**
     * Gets the value of the ssnClsTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getSsnClsTm() {
        return ssnClsTm;
    }

    /**
     * Sets the value of the ssnClsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InputChannelSessionDetails setSsnClsTm(OffsetDateTime value) {
        this.ssnClsTm = value;
        return this;
    }

    /**
     * Gets the value of the nbOfSntMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfSntMsgs() {
        return nbOfSntMsgs;
    }

    /**
     * Sets the value of the nbOfSntMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InputChannelSessionDetails setNbOfSntMsgs(BigDecimal value) {
        this.nbOfSntMsgs = value;
        return this;
    }

    /**
     * Gets the value of the frstSnFInptSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrstSnFInptSeq() {
        return frstSnFInptSeq;
    }

    /**
     * Sets the value of the frstSnFInptSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InputChannelSessionDetails setFrstSnFInptSeq(BigDecimal value) {
        this.frstSnFInptSeq = value;
        return this;
    }

    /**
     * Gets the value of the lstSnFInptSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLstSnFInptSeq() {
        return lstSnFInptSeq;
    }

    /**
     * Sets the value of the lstSnFInptSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InputChannelSessionDetails setLstSnFInptSeq(BigDecimal value) {
        this.lstSnFInptSeq = value;
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
