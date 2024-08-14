
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
 * Identification of requested data set.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalManagementDataSet7", propOrder = {
    "id",
    "poiChllng",
    "tmChllng",
    "ncrptdKey"
})
public class TerminalManagementDataSet7 {

    @XmlElement(name = "Id", required = true)
    protected DataSetIdentification3 id;
    @XmlElement(name = "POIChllng")
    protected byte[] poiChllng;
    @XmlElement(name = "TMChllng")
    protected byte[] tmChllng;
    @XmlElement(name = "NcrptdKey")
    protected ContentInformationType5 ncrptdKey;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification3 }
     *     
     */
    public DataSetIdentification3 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification3 }
     *     
     */
    public TerminalManagementDataSet7 setId(DataSetIdentification3 value) {
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
    public TerminalManagementDataSet7 setPOIChllng(byte[] value) {
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
    public TerminalManagementDataSet7 setTMChllng(byte[] value) {
        this.tmChllng = value;
        return this;
    }

    /**
     * Gets the value of the ncrptdKey property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType5 }
     *     
     */
    public ContentInformationType5 getNcrptdKey() {
        return ncrptdKey;
    }

    /**
     * Sets the value of the ncrptdKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType5 }
     *     
     */
    public TerminalManagementDataSet7 setNcrptdKey(ContentInformationType5 value) {
        this.ncrptdKey = value;
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
