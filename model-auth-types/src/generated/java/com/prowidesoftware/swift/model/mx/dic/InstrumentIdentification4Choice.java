
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
 * Choice between the ISIN, LEI, Unique Product Identifier and the name. ISIN is the preferred format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentIdentification4Choice", propOrder = {
    "isin",
    "unqPdctIdr",
    "nm",
    "unqScrtstnIdr"
})
public class InstrumentIdentification4Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "UnqPdctIdr")
    protected String unqPdctIdr;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "UnqScrtstnIdr")
    protected String unqScrtstnIdr;

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
    public InstrumentIdentification4Choice setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqPdctIdr() {
        return unqPdctIdr;
    }

    /**
     * Sets the value of the unqPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstrumentIdentification4Choice setUnqPdctIdr(String value) {
        this.unqPdctIdr = value;
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
    public InstrumentIdentification4Choice setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the unqScrtstnIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqScrtstnIdr() {
        return unqScrtstnIdr;
    }

    /**
     * Sets the value of the unqScrtstnIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstrumentIdentification4Choice setUnqScrtstnIdr(String value) {
        this.unqScrtstnIdr = value;
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
