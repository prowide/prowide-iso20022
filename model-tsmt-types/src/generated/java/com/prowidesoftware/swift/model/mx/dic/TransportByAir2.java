
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
 * Information related to the transportation of goods by air.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportByAir2", propOrder = {
    "dprtureAirprt",
    "dstnAirprt",
    "airCrrierNm"
})
public class TransportByAir2 {

    @XmlElement(name = "DprtureAirprt", required = true)
    protected AirportName1Choice dprtureAirprt;
    @XmlElement(name = "DstnAirprt", required = true)
    protected AirportName1Choice dstnAirprt;
    @XmlElement(name = "AirCrrierNm")
    protected String airCrrierNm;

    /**
     * Gets the value of the dprtureAirprt property.
     * 
     * @return
     *     possible object is
     *     {@link AirportName1Choice }
     *     
     */
    public AirportName1Choice getDprtureAirprt() {
        return dprtureAirprt;
    }

    /**
     * Sets the value of the dprtureAirprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportName1Choice }
     *     
     */
    public TransportByAir2 setDprtureAirprt(AirportName1Choice value) {
        this.dprtureAirprt = value;
        return this;
    }

    /**
     * Gets the value of the dstnAirprt property.
     * 
     * @return
     *     possible object is
     *     {@link AirportName1Choice }
     *     
     */
    public AirportName1Choice getDstnAirprt() {
        return dstnAirprt;
    }

    /**
     * Sets the value of the dstnAirprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportName1Choice }
     *     
     */
    public TransportByAir2 setDstnAirprt(AirportName1Choice value) {
        this.dstnAirprt = value;
        return this;
    }

    /**
     * Gets the value of the airCrrierNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirCrrierNm() {
        return airCrrierNm;
    }

    /**
     * Sets the value of the airCrrierNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportByAir2 setAirCrrierNm(String value) {
        this.airCrrierNm = value;
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
