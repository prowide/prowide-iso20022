
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
 * Specifies the elements for the identification of an index. ISIN is the preferred format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexIdentification1", propOrder = {
    "isin",
    "nm",
    "indx"
})
public class IndexIdentification1 {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Indx")
    protected String indx;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndexIdentification1 setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndexIdentification1 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndexIdentification1 setIndx(String value) {
        this.indx = value;
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
