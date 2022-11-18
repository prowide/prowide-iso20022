
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to the liquid resources.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidResourceInformation1", propOrder = {
    "cntrPtyId",
    "lqdRsrcVal",
    "mktVal",
    "scrd",
    "asstNcmbrd",
    "qlfygRsrc",
    "agcyArrgmnts"
})
public class LiquidResourceInformation1 {

    @XmlElement(name = "CntrPtyId")
    protected String cntrPtyId;
    @XmlElement(name = "LqdRsrcVal", required = true)
    protected AmountAndDirection102 lqdRsrcVal;
    @XmlElement(name = "MktVal")
    protected AmountAndDirection102 mktVal;
    @XmlElement(name = "Scrd")
    protected boolean scrd;
    @XmlElement(name = "AsstNcmbrd")
    protected boolean asstNcmbrd;
    @XmlElement(name = "QlfygRsrc")
    protected boolean qlfygRsrc;
    @XmlElement(name = "AgcyArrgmnts")
    protected boolean agcyArrgmnts;

    /**
     * Gets the value of the cntrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntrPtyId() {
        return cntrPtyId;
    }

    /**
     * Sets the value of the cntrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LiquidResourceInformation1 setCntrPtyId(String value) {
        this.cntrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the lqdRsrcVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getLqdRsrcVal() {
        return lqdRsrcVal;
    }

    /**
     * Sets the value of the lqdRsrcVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public LiquidResourceInformation1 setLqdRsrcVal(AmountAndDirection102 value) {
        this.lqdRsrcVal = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public LiquidResourceInformation1 setMktVal(AmountAndDirection102 value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the scrd property.
     * 
     */
    public boolean isScrd() {
        return scrd;
    }

    /**
     * Sets the value of the scrd property.
     * 
     */
    public LiquidResourceInformation1 setScrd(boolean value) {
        this.scrd = value;
        return this;
    }

    /**
     * Gets the value of the asstNcmbrd property.
     * 
     */
    public boolean isAsstNcmbrd() {
        return asstNcmbrd;
    }

    /**
     * Sets the value of the asstNcmbrd property.
     * 
     */
    public LiquidResourceInformation1 setAsstNcmbrd(boolean value) {
        this.asstNcmbrd = value;
        return this;
    }

    /**
     * Gets the value of the qlfygRsrc property.
     * 
     */
    public boolean isQlfygRsrc() {
        return qlfygRsrc;
    }

    /**
     * Sets the value of the qlfygRsrc property.
     * 
     */
    public LiquidResourceInformation1 setQlfygRsrc(boolean value) {
        this.qlfygRsrc = value;
        return this;
    }

    /**
     * Gets the value of the agcyArrgmnts property.
     * 
     */
    public boolean isAgcyArrgmnts() {
        return agcyArrgmnts;
    }

    /**
     * Sets the value of the agcyArrgmnts property.
     * 
     */
    public LiquidResourceInformation1 setAgcyArrgmnts(boolean value) {
        this.agcyArrgmnts = value;
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
