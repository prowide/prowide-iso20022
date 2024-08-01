
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Describes the details of the currency exchange.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyExchange22", propOrder = {
    "dlvrblCrossCcy",
    "xchgRate",
    "fwdXchgRate",
    "xchgRateBsis",
    "fxgDt"
})
public class CurrencyExchange22 {

    @XmlElement(name = "DlvrblCrossCcy")
    protected String dlvrblCrossCcy;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "FwdXchgRate")
    protected BigDecimal fwdXchgRate;
    @XmlElement(name = "XchgRateBsis")
    protected ExchangeRateBasis1Choice xchgRateBsis;
    @XmlElement(name = "FxgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fxgDt;

    /**
     * Gets the value of the dlvrblCrossCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvrblCrossCcy() {
        return dlvrblCrossCcy;
    }

    /**
     * Sets the value of the dlvrblCrossCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CurrencyExchange22 setDlvrblCrossCcy(String value) {
        this.dlvrblCrossCcy = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyExchange22 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the fwdXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFwdXchgRate() {
        return fwdXchgRate;
    }

    /**
     * Sets the value of the fwdXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyExchange22 setFwdXchgRate(BigDecimal value) {
        this.fwdXchgRate = value;
        return this;
    }

    /**
     * Gets the value of the xchgRateBsis property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateBasis1Choice }
     *     
     */
    public ExchangeRateBasis1Choice getXchgRateBsis() {
        return xchgRateBsis;
    }

    /**
     * Sets the value of the xchgRateBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateBasis1Choice }
     *     
     */
    public CurrencyExchange22 setXchgRateBsis(ExchangeRateBasis1Choice value) {
        this.xchgRateBsis = value;
        return this;
    }

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
    public CurrencyExchange22 setFxgDt(XMLGregorianCalendar value) {
        this.fxgDt = value;
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
