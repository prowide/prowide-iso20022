
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
@XmlType(name = "TerminalManagementDataSet12", propOrder = {
    "id",
    "poiChllng",
    "tmChllng",
    "ssnKey"
})
public class TerminalManagementDataSet12 {

    @XmlElement(name = "Id", required = true)
    protected DataSetIdentification4 id;
    @XmlElement(name = "POIChllng")
    protected byte[] poiChllng;
    @XmlElement(name = "TMChllng")
    protected byte[] tmChllng;
    @XmlElement(name = "SsnKey")
    protected CryptographicKey5 ssnKey;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification4 }
     *     
     */
    public DataSetIdentification4 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification4 }
     *     
     */
    public TerminalManagementDataSet12 setId(DataSetIdentification4 value) {
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
    public TerminalManagementDataSet12 setPOIChllng(byte[] value) {
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
    public TerminalManagementDataSet12 setTMChllng(byte[] value) {
        this.tmChllng = value;
        return this;
    }

    /**
     * Gets the value of the ssnKey property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicKey5 }
     *     
     */
    public CryptographicKey5 getSsnKey() {
        return ssnKey;
    }

    /**
     * Sets the value of the ssnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKey5 }
     *     
     */
    public TerminalManagementDataSet12 setSsnKey(CryptographicKey5 value) {
        this.ssnKey = value;
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
