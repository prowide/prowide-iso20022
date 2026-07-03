
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
 * Name of the security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentName2", propOrder = {
    "isoShrtNm",
    "isoLngNm",
    "vldFr"
})
public class FinancialInstrumentName2 {

    @XmlElement(name = "ISOShrtNm")
    protected String isoShrtNm;
    @XmlElement(name = "ISOLngNm")
    protected String isoLngNm;
    @XmlElement(name = "VldFr")
    protected DateAndDateTime2Choice vldFr;

    /**
     * Gets the value of the isoShrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOShrtNm() {
        return isoShrtNm;
    }

    /**
     * Sets the value of the isoShrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentName2 setISOShrtNm(String value) {
        this.isoShrtNm = value;
        return this;
    }

    /**
     * Gets the value of the isoLngNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOLngNm() {
        return isoLngNm;
    }

    /**
     * Sets the value of the isoLngNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentName2 setISOLngNm(String value) {
        this.isoLngNm = value;
        return this;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public FinancialInstrumentName2 setVldFr(DateAndDateTime2Choice value) {
        this.vldFr = value;
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
