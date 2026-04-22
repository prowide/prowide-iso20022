
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Contain information related promotion program applied to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionData1", propOrder = {
    "prvdr",
    "tp",
    "desc",
    "cd",
    "start",
    "end",
    "amt",
    "redMtd",
    "chanl",
    "ctgy",
    "stckbl",
    "termsURL"
})
public class PromotionData1 {

    @XmlElement(name = "Prvdr")
    @XmlSchemaType(name = "string")
    protected ATICAPartyType1Code prvdr;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "Start", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime start;
    @XmlElement(name = "End", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime end;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "RedMtd")
    protected String redMtd;
    @XmlElement(name = "Chanl")
    protected String chanl;
    @XmlElement(name = "Ctgy")
    protected String ctgy;
    @XmlElement(name = "Stckbl")
    protected Boolean stckbl;
    @XmlElement(name = "TermsURL")
    protected String termsURL;

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public ATICAPartyType1Code getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATICAPartyType1Code }
     *     
     */
    public PromotionData1 setPrvdr(ATICAPartyType1Code value) {
        this.prvdr = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PromotionData1 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PromotionData1 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PromotionData1 setCd(String value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PromotionData1 setStart(OffsetDateTime value) {
        this.start = value;
        return this;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PromotionData1 setEnd(OffsetDateTime value) {
        this.end = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PromotionData1 setAmt(BigDecimal value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the redMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedMtd() {
        return redMtd;
    }

    /**
     * Sets the value of the redMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PromotionData1 setRedMtd(String value) {
        this.redMtd = value;
        return this;
    }

    /**
     * Gets the value of the chanl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChanl() {
        return chanl;
    }

    /**
     * Sets the value of the chanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PromotionData1 setChanl(String value) {
        this.chanl = value;
        return this;
    }

    /**
     * Gets the value of the ctgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgy() {
        return ctgy;
    }

    /**
     * Sets the value of the ctgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PromotionData1 setCtgy(String value) {
        this.ctgy = value;
        return this;
    }

    /**
     * Gets the value of the stckbl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStckbl() {
        return stckbl;
    }

    /**
     * Sets the value of the stckbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PromotionData1 setStckbl(Boolean value) {
        this.stckbl = value;
        return this;
    }

    /**
     * Gets the value of the termsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsURL() {
        return termsURL;
    }

    /**
     * Sets the value of the termsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PromotionData1 setTermsURL(String value) {
        this.termsURL = value;
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
