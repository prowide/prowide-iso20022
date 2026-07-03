
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contains departure or arrival information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartureOrArrival2", propOrder = {
    "crrierCd",
    "routeNb",
    "dt",
    "tm"
})
public class DepartureOrArrival2 {

    @XmlElement(name = "CrrierCd")
    protected String crrierCd;
    @XmlElement(name = "RouteNb")
    protected String routeNb;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Tm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tm;

    /**
     * Gets the value of the crrierCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierCd() {
        return crrierCd;
    }

    /**
     * Sets the value of the crrierCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DepartureOrArrival2 setCrrierCd(String value) {
        this.crrierCd = value;
        return this;
    }

    /**
     * Gets the value of the routeNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteNb() {
        return routeNb;
    }

    /**
     * Sets the value of the routeNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DepartureOrArrival2 setRouteNb(String value) {
        this.routeNb = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DepartureOrArrival2 setDt(XMLGregorianCalendar value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DepartureOrArrival2 setTm(XMLGregorianCalendar value) {
        this.tm = value;
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
