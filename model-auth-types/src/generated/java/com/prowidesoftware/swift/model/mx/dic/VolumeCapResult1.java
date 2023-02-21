
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the details of result of a volume capping.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeCapResult1", propOrder = {
    "id",
    "rptgPrd",
    "lastUpdDt",
    "ttlTradgVol",
    "tradgUdrWvrPctg",
    "tradgUdrWvrBrkdwn",
    "dsclmr"
})
public class VolumeCapResult1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "RptgPrd", required = true)
    protected Period4Choice rptgPrd;
    @XmlElement(name = "LastUpdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastUpdDt;
    @XmlElement(name = "TtlTradgVol", required = true)
    protected ActiveCurrencyAndAmount ttlTradgVol;
    @XmlElement(name = "TradgUdrWvrPctg", required = true)
    protected BigDecimal tradgUdrWvrPctg;
    @XmlElement(name = "TradgUdrWvrBrkdwn")
    protected List<TradingUnderWaiversPercentage1> tradgUdrWvrBrkdwn;
    @XmlElement(name = "Dsclmr")
    protected String dsclmr;

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
    public VolumeCapResult1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public VolumeCapResult1 setRptgPrd(Period4Choice value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the lastUpdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getLastUpdDt() {
        return lastUpdDt;
    }

    /**
     * Sets the value of the lastUpdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VolumeCapResult1 setLastUpdDt(XMLGregorianCalendar value) {
        this.lastUpdDt = value;
        return this;
    }

    /**
     * Gets the value of the ttlTradgVol property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlTradgVol() {
        return ttlTradgVol;
    }

    /**
     * Sets the value of the ttlTradgVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public VolumeCapResult1 setTtlTradgVol(ActiveCurrencyAndAmount value) {
        this.ttlTradgVol = value;
        return this;
    }

    /**
     * Gets the value of the tradgUdrWvrPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradgUdrWvrPctg() {
        return tradgUdrWvrPctg;
    }

    /**
     * Sets the value of the tradgUdrWvrPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public VolumeCapResult1 setTradgUdrWvrPctg(BigDecimal value) {
        this.tradgUdrWvrPctg = value;
        return this;
    }

    /**
     * Gets the value of the tradgUdrWvrBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradgUdrWvrBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgUdrWvrBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingUnderWaiversPercentage1 }
     * 
     * 
     */
    public List<TradingUnderWaiversPercentage1> getTradgUdrWvrBrkdwn() {
        if (tradgUdrWvrBrkdwn == null) {
            tradgUdrWvrBrkdwn = new ArrayList<TradingUnderWaiversPercentage1>();
        }
        return this.tradgUdrWvrBrkdwn;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VolumeCapResult1 setDsclmr(String value) {
        this.dsclmr = value;
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

    /**
     * Adds a new item to the tradgUdrWvrBrkdwn list.
     * @see #getTradgUdrWvrBrkdwn()
     * 
     */
    public VolumeCapResult1 addTradgUdrWvrBrkdwn(TradingUnderWaiversPercentage1 tradgUdrWvrBrkdwn) {
        getTradgUdrWvrBrkdwn().add(tradgUdrWvrBrkdwn);
        return this;
    }

}
