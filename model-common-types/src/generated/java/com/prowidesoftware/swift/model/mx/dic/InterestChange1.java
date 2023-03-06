
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Variable interest payment of a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestChange1", propOrder = {
    "fxgDt",
    "rptgDt",
    "rstDt",
    "sprdRate",
    "varblRateChngFrqcy",
    "rateRstSrc",
    "arrs",
    "indxRateBsis",
    "indxRateCcy",
    "indxRateFrqcy",
    "indxRateMltplr"
})
public class InterestChange1 {

    @XmlElement(name = "FxgDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fxgDt;
    @XmlElement(name = "RptgDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rptgDt;
    @XmlElement(name = "RstDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rstDt;
    @XmlElement(name = "SprdRate", required = true)
    protected BigDecimal sprdRate;
    @XmlElement(name = "VarblRateChngFrqcy", required = true)
    @XmlSchemaType(name = "string")
    protected Frequency1Code varblRateChngFrqcy;
    @XmlElement(name = "RateRstSrc", required = true)
    protected String rateRstSrc;
    @XmlElement(name = "Arrs", required = true)
    protected String arrs;
    @XmlElement(name = "IndxRateBsis", required = true)
    protected BigDecimal indxRateBsis;
    @XmlElement(name = "IndxRateCcy", required = true)
    protected String indxRateCcy;
    @XmlElement(name = "IndxRateFrqcy", required = true)
    @XmlSchemaType(name = "string")
    protected Frequency1Code indxRateFrqcy;
    @XmlElement(name = "IndxRateMltplr", required = true)
    protected BigDecimal indxRateMltplr;

    /**
     * Gets the value of the fxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getFxgDt() {
        return fxgDt;
    }

    /**
     * Sets the value of the fxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestChange1 setFxgDt(XMLGregorianCalendar value) {
        this.fxgDt = value;
        return this;
    }

    /**
     * Gets the value of the rptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRptgDt() {
        return rptgDt;
    }

    /**
     * Sets the value of the rptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestChange1 setRptgDt(XMLGregorianCalendar value) {
        this.rptgDt = value;
        return this;
    }

    /**
     * Gets the value of the rstDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRstDt() {
        return rstDt;
    }

    /**
     * Sets the value of the rstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestChange1 setRstDt(XMLGregorianCalendar value) {
        this.rstDt = value;
        return this;
    }

    /**
     * Gets the value of the sprdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSprdRate() {
        return sprdRate;
    }

    /**
     * Sets the value of the sprdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InterestChange1 setSprdRate(BigDecimal value) {
        this.sprdRate = value;
        return this;
    }

    /**
     * Gets the value of the varblRateChngFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getVarblRateChngFrqcy() {
        return varblRateChngFrqcy;
    }

    /**
     * Sets the value of the varblRateChngFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public InterestChange1 setVarblRateChngFrqcy(Frequency1Code value) {
        this.varblRateChngFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the rateRstSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateRstSrc() {
        return rateRstSrc;
    }

    /**
     * Sets the value of the rateRstSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestChange1 setRateRstSrc(String value) {
        this.rateRstSrc = value;
        return this;
    }

    /**
     * Gets the value of the arrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrs() {
        return arrs;
    }

    /**
     * Sets the value of the arrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestChange1 setArrs(String value) {
        this.arrs = value;
        return this;
    }

    /**
     * Gets the value of the indxRateBsis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndxRateBsis() {
        return indxRateBsis;
    }

    /**
     * Sets the value of the indxRateBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InterestChange1 setIndxRateBsis(BigDecimal value) {
        this.indxRateBsis = value;
        return this;
    }

    /**
     * Gets the value of the indxRateCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndxRateCcy() {
        return indxRateCcy;
    }

    /**
     * Sets the value of the indxRateCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestChange1 setIndxRateCcy(String value) {
        this.indxRateCcy = value;
        return this;
    }

    /**
     * Gets the value of the indxRateFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency1Code }
     *     
     */
    public Frequency1Code getIndxRateFrqcy() {
        return indxRateFrqcy;
    }

    /**
     * Sets the value of the indxRateFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency1Code }
     *     
     */
    public InterestChange1 setIndxRateFrqcy(Frequency1Code value) {
        this.indxRateFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the indxRateMltplr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndxRateMltplr() {
        return indxRateMltplr;
    }

    /**
     * Sets the value of the indxRateMltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InterestChange1 setIndxRateMltplr(BigDecimal value) {
        this.indxRateMltplr = value;
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
