
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
 * Choice between different instrument identification schemes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentIdentification6Choice", propOrder = {
    "isin",
    "altrntvInstrmId",
    "unqPdctIdr",
    "othrId"
})
public class InstrumentIdentification6Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "AltrntvInstrmId")
    protected String altrntvInstrmId;
    @XmlElement(name = "UnqPdctIdr")
    protected UniqueProductIdentifier1Choice unqPdctIdr;
    @XmlElement(name = "OthrId")
    protected GenericIdentification184 othrId;

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
    public InstrumentIdentification6Choice setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the altrntvInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrntvInstrmId() {
        return altrntvInstrmId;
    }

    /**
     * Sets the value of the altrntvInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstrumentIdentification6Choice setAltrntvInstrmId(String value) {
        this.altrntvInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueProductIdentifier1Choice }
     *     
     */
    public UniqueProductIdentifier1Choice getUnqPdctIdr() {
        return unqPdctIdr;
    }

    /**
     * Sets the value of the unqPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueProductIdentifier1Choice }
     *     
     */
    public InstrumentIdentification6Choice setUnqPdctIdr(UniqueProductIdentifier1Choice value) {
        this.unqPdctIdr = value;
        return this;
    }

    /**
     * Gets the value of the othrId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification184 }
     *     
     */
    public GenericIdentification184 getOthrId() {
        return othrId;
    }

    /**
     * Sets the value of the othrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification184 }
     *     
     */
    public InstrumentIdentification6Choice setOthrId(GenericIdentification184 value) {
        this.othrId = value;
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
