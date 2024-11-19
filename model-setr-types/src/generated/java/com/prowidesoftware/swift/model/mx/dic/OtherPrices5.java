
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the type of price and information about the price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherPrices5", propOrder = {
    "max",
    "tx",
    "mktBrkrComssn",
    "mrkdUp",
    "mrkdDwn",
    "netDscld",
    "netUdscld",
    "ntnlGrss",
    "bchmkWghtdAvrg",
    "allMktsWghtdAvrg",
    "bchmk",
    "othrPric",
    "indxPric",
    "rptdPric",
    "refPric"
})
public class OtherPrices5 {

    @XmlElement(name = "Max")
    protected Price14 max;
    @XmlElement(name = "Tx")
    protected Price14 tx;
    @XmlElement(name = "MktBrkrComssn")
    protected Price14 mktBrkrComssn;
    @XmlElement(name = "MrkdUp")
    protected Price14 mrkdUp;
    @XmlElement(name = "MrkdDwn")
    protected Price14 mrkdDwn;
    @XmlElement(name = "NetDscld")
    protected Price14 netDscld;
    @XmlElement(name = "NetUdscld")
    protected Price14 netUdscld;
    @XmlElement(name = "NtnlGrss")
    protected Price14 ntnlGrss;
    @XmlElement(name = "BchmkWghtdAvrg")
    protected Price14 bchmkWghtdAvrg;
    @XmlElement(name = "AllMktsWghtdAvrg")
    protected Price14 allMktsWghtdAvrg;
    @XmlElement(name = "Bchmk")
    protected Price14 bchmk;
    @XmlElement(name = "OthrPric")
    protected Price14 othrPric;
    @XmlElement(name = "IndxPric")
    protected Price14 indxPric;
    @XmlElement(name = "RptdPric")
    protected Price14 rptdPric;
    @XmlElement(name = "RefPric")
    protected PriceInformation28 refPric;

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setMax(Price14 value) {
        this.max = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setTx(Price14 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the mktBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getMktBrkrComssn() {
        return mktBrkrComssn;
    }

    /**
     * Sets the value of the mktBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setMktBrkrComssn(Price14 value) {
        this.mktBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the mrkdUp property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getMrkdUp() {
        return mrkdUp;
    }

    /**
     * Sets the value of the mrkdUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setMrkdUp(Price14 value) {
        this.mrkdUp = value;
        return this;
    }

    /**
     * Gets the value of the mrkdDwn property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getMrkdDwn() {
        return mrkdDwn;
    }

    /**
     * Sets the value of the mrkdDwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setMrkdDwn(Price14 value) {
        this.mrkdDwn = value;
        return this;
    }

    /**
     * Gets the value of the netDscld property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getNetDscld() {
        return netDscld;
    }

    /**
     * Sets the value of the netDscld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setNetDscld(Price14 value) {
        this.netDscld = value;
        return this;
    }

    /**
     * Gets the value of the netUdscld property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getNetUdscld() {
        return netUdscld;
    }

    /**
     * Sets the value of the netUdscld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setNetUdscld(Price14 value) {
        this.netUdscld = value;
        return this;
    }

    /**
     * Gets the value of the ntnlGrss property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getNtnlGrss() {
        return ntnlGrss;
    }

    /**
     * Sets the value of the ntnlGrss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setNtnlGrss(Price14 value) {
        this.ntnlGrss = value;
        return this;
    }

    /**
     * Gets the value of the bchmkWghtdAvrg property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getBchmkWghtdAvrg() {
        return bchmkWghtdAvrg;
    }

    /**
     * Sets the value of the bchmkWghtdAvrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setBchmkWghtdAvrg(Price14 value) {
        this.bchmkWghtdAvrg = value;
        return this;
    }

    /**
     * Gets the value of the allMktsWghtdAvrg property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getAllMktsWghtdAvrg() {
        return allMktsWghtdAvrg;
    }

    /**
     * Sets the value of the allMktsWghtdAvrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setAllMktsWghtdAvrg(Price14 value) {
        this.allMktsWghtdAvrg = value;
        return this;
    }

    /**
     * Gets the value of the bchmk property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getBchmk() {
        return bchmk;
    }

    /**
     * Sets the value of the bchmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setBchmk(Price14 value) {
        this.bchmk = value;
        return this;
    }

    /**
     * Gets the value of the othrPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getOthrPric() {
        return othrPric;
    }

    /**
     * Sets the value of the othrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setOthrPric(Price14 value) {
        this.othrPric = value;
        return this;
    }

    /**
     * Gets the value of the indxPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getIndxPric() {
        return indxPric;
    }

    /**
     * Sets the value of the indxPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setIndxPric(Price14 value) {
        this.indxPric = value;
        return this;
    }

    /**
     * Gets the value of the rptdPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getRptdPric() {
        return rptdPric;
    }

    /**
     * Sets the value of the rptdPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public OtherPrices5 setRptdPric(Price14 value) {
        this.rptdPric = value;
        return this;
    }

    /**
     * Gets the value of the refPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformation28 }
     *     
     */
    public PriceInformation28 getRefPric() {
        return refPric;
    }

    /**
     * Sets the value of the refPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformation28 }
     *     
     */
    public OtherPrices5 setRefPric(PriceInformation28 value) {
        this.refPric = value;
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
