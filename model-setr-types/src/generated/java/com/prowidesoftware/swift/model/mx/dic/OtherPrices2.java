
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
@XmlType(name = "OtherPrices2", propOrder = {
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
public class OtherPrices2 {

    @XmlElement(name = "Max")
    protected Price4 max;
    @XmlElement(name = "Tx")
    protected Price4 tx;
    @XmlElement(name = "MktBrkrComssn")
    protected Price4 mktBrkrComssn;
    @XmlElement(name = "MrkdUp")
    protected Price4 mrkdUp;
    @XmlElement(name = "MrkdDwn")
    protected Price4 mrkdDwn;
    @XmlElement(name = "NetDscld")
    protected Price4 netDscld;
    @XmlElement(name = "NetUdscld")
    protected Price4 netUdscld;
    @XmlElement(name = "NtnlGrss")
    protected Price4 ntnlGrss;
    @XmlElement(name = "BchmkWghtdAvrg")
    protected Price4 bchmkWghtdAvrg;
    @XmlElement(name = "AllMktsWghtdAvrg")
    protected Price4 allMktsWghtdAvrg;
    @XmlElement(name = "Bchmk")
    protected Price4 bchmk;
    @XmlElement(name = "OthrPric")
    protected Price4 othrPric;
    @XmlElement(name = "IndxPric")
    protected Price4 indxPric;
    @XmlElement(name = "RptdPric")
    protected Price4 rptdPric;
    @XmlElement(name = "RefPric")
    protected PriceInformation11 refPric;

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setMax(Price4 value) {
        this.max = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setTx(Price4 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the mktBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getMktBrkrComssn() {
        return mktBrkrComssn;
    }

    /**
     * Sets the value of the mktBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setMktBrkrComssn(Price4 value) {
        this.mktBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the mrkdUp property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getMrkdUp() {
        return mrkdUp;
    }

    /**
     * Sets the value of the mrkdUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setMrkdUp(Price4 value) {
        this.mrkdUp = value;
        return this;
    }

    /**
     * Gets the value of the mrkdDwn property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getMrkdDwn() {
        return mrkdDwn;
    }

    /**
     * Sets the value of the mrkdDwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setMrkdDwn(Price4 value) {
        this.mrkdDwn = value;
        return this;
    }

    /**
     * Gets the value of the netDscld property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getNetDscld() {
        return netDscld;
    }

    /**
     * Sets the value of the netDscld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setNetDscld(Price4 value) {
        this.netDscld = value;
        return this;
    }

    /**
     * Gets the value of the netUdscld property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getNetUdscld() {
        return netUdscld;
    }

    /**
     * Sets the value of the netUdscld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setNetUdscld(Price4 value) {
        this.netUdscld = value;
        return this;
    }

    /**
     * Gets the value of the ntnlGrss property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getNtnlGrss() {
        return ntnlGrss;
    }

    /**
     * Sets the value of the ntnlGrss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setNtnlGrss(Price4 value) {
        this.ntnlGrss = value;
        return this;
    }

    /**
     * Gets the value of the bchmkWghtdAvrg property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getBchmkWghtdAvrg() {
        return bchmkWghtdAvrg;
    }

    /**
     * Sets the value of the bchmkWghtdAvrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setBchmkWghtdAvrg(Price4 value) {
        this.bchmkWghtdAvrg = value;
        return this;
    }

    /**
     * Gets the value of the allMktsWghtdAvrg property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getAllMktsWghtdAvrg() {
        return allMktsWghtdAvrg;
    }

    /**
     * Sets the value of the allMktsWghtdAvrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setAllMktsWghtdAvrg(Price4 value) {
        this.allMktsWghtdAvrg = value;
        return this;
    }

    /**
     * Gets the value of the bchmk property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getBchmk() {
        return bchmk;
    }

    /**
     * Sets the value of the bchmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setBchmk(Price4 value) {
        this.bchmk = value;
        return this;
    }

    /**
     * Gets the value of the othrPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getOthrPric() {
        return othrPric;
    }

    /**
     * Sets the value of the othrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setOthrPric(Price4 value) {
        this.othrPric = value;
        return this;
    }

    /**
     * Gets the value of the indxPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getIndxPric() {
        return indxPric;
    }

    /**
     * Sets the value of the indxPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setIndxPric(Price4 value) {
        this.indxPric = value;
        return this;
    }

    /**
     * Gets the value of the rptdPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getRptdPric() {
        return rptdPric;
    }

    /**
     * Sets the value of the rptdPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public OtherPrices2 setRptdPric(Price4 value) {
        this.rptdPric = value;
        return this;
    }

    /**
     * Gets the value of the refPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformation11 }
     *     
     */
    public PriceInformation11 getRefPric() {
        return refPric;
    }

    /**
     * Sets the value of the refPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformation11 }
     *     
     */
    public OtherPrices2 setRefPric(PriceInformation11 value) {
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
