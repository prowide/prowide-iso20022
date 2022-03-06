
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the events where the fund is not compliant with the weekly liquidity thresholds applicable to public debt constant net asset value money market funds or the low volatility net asset value money market funds.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaturingAssetThresholdEvent1", propOrder = {
    "evtDt",
    "measrDt",
    "measrInf"
})
public class MaturingAssetThresholdEvent1 {

    @XmlElement(name = "EvtDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDt;
    @XmlElement(name = "MeasrDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar measrDt;
    @XmlElement(name = "MeasrInf", required = true)
    protected Measure1Choice measrInf;

    /**
     * Gets the value of the evtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getEvtDt() {
        return evtDt;
    }

    /**
     * Sets the value of the evtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MaturingAssetThresholdEvent1 setEvtDt(XMLGregorianCalendar value) {
        this.evtDt = value;
        return this;
    }

    /**
     * Gets the value of the measrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getMeasrDt() {
        return measrDt;
    }

    /**
     * Sets the value of the measrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MaturingAssetThresholdEvent1 setMeasrDt(XMLGregorianCalendar value) {
        this.measrDt = value;
        return this;
    }

    /**
     * Gets the value of the measrInf property.
     * 
     * @return
     *     possible object is
     *     {@link Measure1Choice }
     *     
     */
    public Measure1Choice getMeasrInf() {
        return measrInf;
    }

    /**
     * Sets the value of the measrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measure1Choice }
     *     
     */
    public MaturingAssetThresholdEvent1 setMeasrInf(Measure1Choice value) {
        this.measrInf = value;
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
