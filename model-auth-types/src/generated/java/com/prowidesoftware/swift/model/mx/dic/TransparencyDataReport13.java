
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Provides for reporting quantitative details of equity instruments as part of transparency calculations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransparencyDataReport13", propOrder = {
    "techRcrdId",
    "id",
    "rptgDt",
    "tradgVn",
    "sspnsn",
    "txsExctd",
    "txsExctdExclgPreTradWvr",
    "txsExctdExclgPstTradLrgInScaleWvr"
})
public class TransparencyDataReport13 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "RptgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar rptgDt;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "Sspnsn")
    protected boolean sspnsn;
    @XmlElement(name = "TxsExctd", required = true)
    protected NumberAndVolume2 txsExctd;
    @XmlElement(name = "TxsExctdExclgPreTradWvr", required = true)
    protected NumberAndVolume2 txsExctdExclgPreTradWvr;
    @XmlElement(name = "TxsExctdExclgPstTradLrgInScaleWvr", required = true)
    protected NumberAndVolume2 txsExctdExclgPstTradLrgInScaleWvr;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport13 setTechRcrdId(String value) {
        this.techRcrdId = value;
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
    public TransparencyDataReport13 setId(String value) {
        this.id = value;
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
    public Calendar getRptgDt() {
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
    public TransparencyDataReport13 setRptgDt(Calendar value) {
        this.rptgDt = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport13 setTradgVn(String value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the sspnsn property.
     * 
     */
    public boolean isSspnsn() {
        return sspnsn;
    }

    /**
     * Sets the value of the sspnsn property.
     * 
     */
    public TransparencyDataReport13 setSspnsn(boolean value) {
        this.sspnsn = value;
        return this;
    }

    /**
     * Gets the value of the txsExctd property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndVolume2 }
     *     
     */
    public NumberAndVolume2 getTxsExctd() {
        return txsExctd;
    }

    /**
     * Sets the value of the txsExctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndVolume2 }
     *     
     */
    public TransparencyDataReport13 setTxsExctd(NumberAndVolume2 value) {
        this.txsExctd = value;
        return this;
    }

    /**
     * Gets the value of the txsExctdExclgPreTradWvr property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndVolume2 }
     *     
     */
    public NumberAndVolume2 getTxsExctdExclgPreTradWvr() {
        return txsExctdExclgPreTradWvr;
    }

    /**
     * Sets the value of the txsExctdExclgPreTradWvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndVolume2 }
     *     
     */
    public TransparencyDataReport13 setTxsExctdExclgPreTradWvr(NumberAndVolume2 value) {
        this.txsExctdExclgPreTradWvr = value;
        return this;
    }

    /**
     * Gets the value of the txsExctdExclgPstTradLrgInScaleWvr property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndVolume2 }
     *     
     */
    public NumberAndVolume2 getTxsExctdExclgPstTradLrgInScaleWvr() {
        return txsExctdExclgPstTradLrgInScaleWvr;
    }

    /**
     * Sets the value of the txsExctdExclgPstTradLrgInScaleWvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndVolume2 }
     *     
     */
    public TransparencyDataReport13 setTxsExctdExclgPstTradLrgInScaleWvr(NumberAndVolume2 value) {
        this.txsExctdExclgPstTradLrgInScaleWvr = value;
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
