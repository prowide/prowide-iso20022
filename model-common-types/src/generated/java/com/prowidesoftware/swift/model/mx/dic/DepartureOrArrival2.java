
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
    protected Calendar dt;
    @XmlElement(name = "Tm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected Calendar tm;

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
    public Calendar getDt() {
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
    public DepartureOrArrival2 setDt(Calendar value) {
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
    public Calendar getTm() {
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
    public DepartureOrArrival2 setTm(Calendar value) {
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
