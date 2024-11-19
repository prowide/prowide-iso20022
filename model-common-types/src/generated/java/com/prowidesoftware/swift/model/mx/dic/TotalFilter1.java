
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
 * Filter to compute the totals.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalFilter1", propOrder = {
    "poiId",
    "saleId",
    "cshrId",
    "shftNb",
    "ttlsGrpId"
})
public class TotalFilter1 {

    @XmlElement(name = "POIId")
    protected String poiId;
    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "CshrId")
    protected String cshrId;
    @XmlElement(name = "ShftNb")
    protected String shftNb;
    @XmlElement(name = "TtlsGrpId")
    protected String ttlsGrpId;

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TotalFilter1 setPOIId(String value) {
        this.poiId = value;
        return this;
    }

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TotalFilter1 setSaleId(String value) {
        this.saleId = value;
        return this;
    }

    /**
     * Gets the value of the cshrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshrId() {
        return cshrId;
    }

    /**
     * Sets the value of the cshrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TotalFilter1 setCshrId(String value) {
        this.cshrId = value;
        return this;
    }

    /**
     * Gets the value of the shftNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShftNb() {
        return shftNb;
    }

    /**
     * Sets the value of the shftNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TotalFilter1 setShftNb(String value) {
        this.shftNb = value;
        return this;
    }

    /**
     * Gets the value of the ttlsGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlsGrpId() {
        return ttlsGrpId;
    }

    /**
     * Sets the value of the ttlsGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TotalFilter1 setTtlsGrpId(String value) {
        this.ttlsGrpId = value;
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
