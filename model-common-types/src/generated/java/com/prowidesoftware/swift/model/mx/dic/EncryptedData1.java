
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contains encrypted data and the attributes used to encrypt the data using the ISO 13492 methods for data encryption.  The encryption key is not included in the message with this method.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedData1", propOrder = {
    "ctrl",
    "keySetIdr",
    "drvdInf",
    "algo",
    "keyLngth",
    "keyPrtcn",
    "keyIndx",
    "pddgMtd",
    "ncrptdDataFrmt",
    "ncrptdDataElmt"
})
public class EncryptedData1 {

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
    @XmlElement(name = "PddgMtd")
    protected String pddgMtd;
    @XmlElement(name = "NcrptdDataFrmt")
    protected String ncrptdDataFrmt;
    @XmlElement(name = "NcrptdDataElmt", required = true)
    protected List<EncryptedDataElement1> ncrptdDataElmt;

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
    public EncryptedData1 setCtrl(String value) {
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
    public EncryptedData1 setKeySetIdr(String value) {
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
    public EncryptedData1 setDrvdInf(String value) {
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
    public EncryptedData1 setAlgo(String value) {
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
    public EncryptedData1 setKeyLngth(String value) {
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
    public EncryptedData1 setKeyPrtcn(String value) {
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
    public EncryptedData1 setKeyIndx(String value) {
        this.keyIndx = value;
        return this;
    }

    /**
     * Gets the value of the pddgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPddgMtd() {
        return pddgMtd;
    }

    /**
     * Sets the value of the pddgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EncryptedData1 setPddgMtd(String value) {
        this.pddgMtd = value;
        return this;
    }

    /**
     * Gets the value of the ncrptdDataFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcrptdDataFrmt() {
        return ncrptdDataFrmt;
    }

    /**
     * Sets the value of the ncrptdDataFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EncryptedData1 setNcrptdDataFrmt(String value) {
        this.ncrptdDataFrmt = value;
        return this;
    }

    /**
     * Gets the value of the ncrptdDataElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ncrptdDataElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNcrptdDataElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptedDataElement1 }
     * 
     * 
     */
    public List<EncryptedDataElement1> getNcrptdDataElmt() {
        if (ncrptdDataElmt == null) {
            ncrptdDataElmt = new ArrayList<EncryptedDataElement1>();
        }
        return this.ncrptdDataElmt;
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
     * Adds a new item to the ncrptdDataElmt list.
     * @see #getNcrptdDataElmt()
     * 
     */
    public EncryptedData1 addNcrptdDataElmt(EncryptedDataElement1 ncrptdDataElmt) {
        getNcrptdDataElmt().add(ncrptdDataElmt);
        return this;
    }

}
