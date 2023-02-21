
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
 * Data related to the mobile of stakeholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileData2", propOrder = {
    "mobCtryCd",
    "mobNtwkCd",
    "mobMskdMSISDN",
    "glctn",
    "snstvMobData",
    "prtctdMobData"
})
public class MobileData2 {

    @XmlElement(name = "MobCtryCd")
    protected String mobCtryCd;
    @XmlElement(name = "MobNtwkCd")
    protected String mobNtwkCd;
    @XmlElement(name = "MobMskdMSISDN")
    protected String mobMskdMSISDN;
    @XmlElement(name = "Glctn")
    protected Geolocation1 glctn;
    @XmlElement(name = "SnstvMobData")
    protected SensitiveMobileData1 snstvMobData;
    @XmlElement(name = "PrtctdMobData")
    protected ContentInformationType22 prtctdMobData;

    /**
     * Gets the value of the mobCtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobCtryCd() {
        return mobCtryCd;
    }

    /**
     * Sets the value of the mobCtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MobileData2 setMobCtryCd(String value) {
        this.mobCtryCd = value;
        return this;
    }

    /**
     * Gets the value of the mobNtwkCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobNtwkCd() {
        return mobNtwkCd;
    }

    /**
     * Sets the value of the mobNtwkCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MobileData2 setMobNtwkCd(String value) {
        this.mobNtwkCd = value;
        return this;
    }

    /**
     * Gets the value of the mobMskdMSISDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobMskdMSISDN() {
        return mobMskdMSISDN;
    }

    /**
     * Sets the value of the mobMskdMSISDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MobileData2 setMobMskdMSISDN(String value) {
        this.mobMskdMSISDN = value;
        return this;
    }

    /**
     * Gets the value of the glctn property.
     * 
     * @return
     *     possible object is
     *     {@link Geolocation1 }
     *     
     */
    public Geolocation1 getGlctn() {
        return glctn;
    }

    /**
     * Sets the value of the glctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geolocation1 }
     *     
     */
    public MobileData2 setGlctn(Geolocation1 value) {
        this.glctn = value;
        return this;
    }

    /**
     * Gets the value of the snstvMobData property.
     * 
     * @return
     *     possible object is
     *     {@link SensitiveMobileData1 }
     *     
     */
    public SensitiveMobileData1 getSnstvMobData() {
        return snstvMobData;
    }

    /**
     * Sets the value of the snstvMobData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitiveMobileData1 }
     *     
     */
    public MobileData2 setSnstvMobData(SensitiveMobileData1 value) {
        this.snstvMobData = value;
        return this;
    }

    /**
     * Gets the value of the prtctdMobData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType22 }
     *     
     */
    public ContentInformationType22 getPrtctdMobData() {
        return prtctdMobData;
    }

    /**
     * Sets the value of the prtctdMobData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType22 }
     *     
     */
    public MobileData2 setPrtctdMobData(ContentInformationType22 value) {
        this.prtctdMobData = value;
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
