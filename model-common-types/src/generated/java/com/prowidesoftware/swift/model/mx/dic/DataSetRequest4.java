
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
 * Identification of requested data set.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetRequest4", propOrder = {
    "id",
    "poiChllng",
    "tmChllng",
    "ssnKey",
    "dlgtnProof",
    "prtctdDlgtnProof"
})
public class DataSetRequest4 {

    @XmlElement(name = "Id", required = true)
    protected DataSetIdentification10 id;
    @XmlElement(name = "POIChllng")
    protected byte[] poiChllng;
    @XmlElement(name = "TMChllng")
    protected byte[] tmChllng;
    @XmlElement(name = "SsnKey")
    protected CryptographicKey17 ssnKey;
    @XmlElement(name = "DlgtnProof")
    protected byte[] dlgtnProof;
    @XmlElement(name = "PrtctdDlgtnProof")
    protected ContentInformationType34 prtctdDlgtnProof;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification10 }
     *     
     */
    public DataSetIdentification10 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification10 }
     *     
     */
    public DataSetRequest4 setId(DataSetIdentification10 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the poiChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPOIChllng() {
        return poiChllng;
    }

    /**
     * Sets the value of the poiChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DataSetRequest4 setPOIChllng(byte[] value) {
        this.poiChllng = value;
        return this;
    }

    /**
     * Gets the value of the tmChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTMChllng() {
        return tmChllng;
    }

    /**
     * Sets the value of the tmChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DataSetRequest4 setTMChllng(byte[] value) {
        this.tmChllng = value;
        return this;
    }

    /**
     * Gets the value of the ssnKey property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicKey17 }
     *     
     */
    public CryptographicKey17 getSsnKey() {
        return ssnKey;
    }

    /**
     * Sets the value of the ssnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKey17 }
     *     
     */
    public DataSetRequest4 setSsnKey(CryptographicKey17 value) {
        this.ssnKey = value;
        return this;
    }

    /**
     * Gets the value of the dlgtnProof property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDlgtnProof() {
        return dlgtnProof;
    }

    /**
     * Sets the value of the dlgtnProof property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DataSetRequest4 setDlgtnProof(byte[] value) {
        this.dlgtnProof = value;
        return this;
    }

    /**
     * Gets the value of the prtctdDlgtnProof property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType34 }
     *     
     */
    public ContentInformationType34 getPrtctdDlgtnProof() {
        return prtctdDlgtnProof;
    }

    /**
     * Sets the value of the prtctdDlgtnProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType34 }
     *     
     */
    public DataSetRequest4 setPrtctdDlgtnProof(ContentInformationType34 value) {
        this.prtctdDlgtnProof = value;
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
