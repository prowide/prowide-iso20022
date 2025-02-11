
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
 * Attributes of a cardholder PIN.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PINData1", propOrder = {
    "ctrl",
    "keySetIdr",
    "drvdInf",
    "algo",
    "keyLngth",
    "keyPrtcn",
    "keyIndx",
    "pinBlckFrmt",
    "ncrptdPINBlck"
})
public class PINData1 {

    @XmlElement(name = "Ctrl")
    protected String ctrl;
    @XmlElement(name = "KeySetIdr")
    protected String keySetIdr;
    @XmlElement(name = "DrvdInf")
    protected String drvdInf;
    @XmlElement(name = "Algo")
    protected String algo;
    @XmlElement(name = "KeyLngth")
    protected String keyLngth;
    @XmlElement(name = "KeyPrtcn")
    protected String keyPrtcn;
    @XmlElement(name = "KeyIndx")
    protected String keyIndx;
    @XmlElement(name = "PINBlckFrmt", required = true)
    protected String pinBlckFrmt;
    @XmlElement(name = "NcrptdPINBlck", required = true)
    protected String ncrptdPINBlck;

    /**
     * Gets the value of the ctrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrl() {
        return ctrl;
    }

    /**
     * Sets the value of the ctrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PINData1 setCtrl(String value) {
        this.ctrl = value;
        return this;
    }

    /**
     * Gets the value of the keySetIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySetIdr() {
        return keySetIdr;
    }

    /**
     * Sets the value of the keySetIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PINData1 setKeySetIdr(String value) {
        this.keySetIdr = value;
        return this;
    }

    /**
     * Gets the value of the drvdInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvdInf() {
        return drvdInf;
    }

    /**
     * Sets the value of the drvdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PINData1 setDrvdInf(String value) {
        this.drvdInf = value;
        return this;
    }

    /**
     * Gets the value of the algo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgo() {
        return algo;
    }

    /**
     * Sets the value of the algo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PINData1 setAlgo(String value) {
        this.algo = value;
        return this;
    }

    /**
     * Gets the value of the keyLngth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyLngth() {
        return keyLngth;
    }

    /**
     * Sets the value of the keyLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PINData1 setKeyLngth(String value) {
        this.keyLngth = value;
        return this;
    }

    /**
     * Gets the value of the keyPrtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyPrtcn() {
        return keyPrtcn;
    }

    /**
     * Sets the value of the keyPrtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PINData1 setKeyPrtcn(String value) {
        this.keyPrtcn = value;
        return this;
    }

    /**
     * Gets the value of the keyIndx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyIndx() {
        return keyIndx;
    }

    /**
     * Sets the value of the keyIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PINData1 setKeyIndx(String value) {
        this.keyIndx = value;
        return this;
    }

    /**
     * Gets the value of the pinBlckFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINBlckFrmt() {
        return pinBlckFrmt;
    }

    /**
     * Sets the value of the pinBlckFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PINData1 setPINBlckFrmt(String value) {
        this.pinBlckFrmt = value;
        return this;
    }

    /**
     * Gets the value of the ncrptdPINBlck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcrptdPINBlck() {
        return ncrptdPINBlck;
    }

    /**
     * Sets the value of the ncrptdPINBlck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PINData1 setNcrptdPINBlck(String value) {
        this.ncrptdPINBlck = value;
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
