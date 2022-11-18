
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
 * Data container to exchange data elements defined by another standard.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternallyDefinedData2", propOrder = {
    "id",
    "val",
    "prtctdVal",
    "tp"
})
public class ExternallyDefinedData2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Val")
    protected byte[] val;
    @XmlElement(name = "PrtctdVal")
    protected ContentInformationType26 prtctdVal;
    @XmlElement(name = "Tp")
    protected String tp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExternallyDefinedData2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public ExternallyDefinedData2 setVal(byte[] value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the prtctdVal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType26 }
     *     
     */
    public ContentInformationType26 getPrtctdVal() {
        return prtctdVal;
    }

    /**
     * Sets the value of the prtctdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType26 }
     *     
     */
    public ExternallyDefinedData2 setPrtctdVal(ContentInformationType26 value) {
        this.prtctdVal = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExternallyDefinedData2 setTp(String value) {
        this.tp = value;
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
