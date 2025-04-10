
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
 * Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Future1", propOrder = {
    "ctrctSz",
    "exrcPric",
    "xpryDt",
    "futrDt",
    "minSz",
    "unitOfMeasr",
    "tmUnit"
})
public class Future1 {

    @XmlElement(name = "CtrctSz")
    protected BigDecimal ctrctSz;
    @XmlElement(name = "ExrcPric")
    protected Price1 exrcPric;
    @XmlElement(name = "XpryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime xpryDt;
    @XmlElement(name = "FutrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime futrDt;
    @XmlElement(name = "MinSz")
    protected ActiveCurrencyAndAmount minSz;
    @XmlElement(name = "UnitOfMeasr")
    protected String unitOfMeasr;
    @XmlElement(name = "TmUnit")
    @XmlSchemaType(name = "string")
    protected TimeUnit1Code tmUnit;

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Future1 setCtrctSz(BigDecimal value) {
        this.ctrctSz = value;
        return this;
    }

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public Future1 setExrcPric(Price1 value) {
        this.exrcPric = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Future1 setXpryDt(OffsetDateTime value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the futrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getFutrDt() {
        return futrDt;
    }

    /**
     * Sets the value of the futrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Future1 setFutrDt(OffsetDateTime value) {
        this.futrDt = value;
        return this;
    }

    /**
     * Gets the value of the minSz property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinSz() {
        return minSz;
    }

    /**
     * Sets the value of the minSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Future1 setMinSz(ActiveCurrencyAndAmount value) {
        this.minSz = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Future1 setUnitOfMeasr(String value) {
        this.unitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the tmUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnit1Code }
     *     
     */
    public TimeUnit1Code getTmUnit() {
        return tmUnit;
    }

    /**
     * Sets the value of the tmUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnit1Code }
     *     
     */
    public Future1 setTmUnit(TimeUnit1Code value) {
        this.tmUnit = value;
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
