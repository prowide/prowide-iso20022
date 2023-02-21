
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information that describes a netting cut off held at a central system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutOff1", propOrder = {
    "cutOffUpdId",
    "ccy",
    "cutOffTm",
    "valDtOffset"
})
public class CutOff1 {

    @XmlElement(name = "CutOffUpdId", required = true)
    protected String cutOffUpdId;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "CutOffTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar cutOffTm;
    @XmlElement(name = "ValDtOffset", required = true)
    protected String valDtOffset;

    /**
     * Gets the value of the cutOffUpdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutOffUpdId() {
        return cutOffUpdId;
    }

    /**
     * Sets the value of the cutOffUpdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CutOff1 setCutOffUpdId(String value) {
        this.cutOffUpdId = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CutOff1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the cutOffTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCutOffTm() {
        return cutOffTm;
    }

    /**
     * Sets the value of the cutOffTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CutOff1 setCutOffTm(XMLGregorianCalendar value) {
        this.cutOffTm = value;
        return this;
    }

    /**
     * Gets the value of the valDtOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValDtOffset() {
        return valDtOffset;
    }

    /**
     * Sets the value of the valDtOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CutOff1 setValDtOffset(String value) {
        this.valDtOffset = value;
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
