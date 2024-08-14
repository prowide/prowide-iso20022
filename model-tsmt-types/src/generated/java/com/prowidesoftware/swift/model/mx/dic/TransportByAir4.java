
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
 * Information related to the transportation of goods by air.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportByAir4", propOrder = {
    "dprtureAirprt",
    "dstnAirprt",
    "flghtNb",
    "airCrrierNm",
    "airCrrierCtry",
    "crrierAgtNm",
    "crrierAgtCtry"
})
public class TransportByAir4 {

    @XmlElement(name = "DprtureAirprt", required = true)
    protected AirportName1Choice dprtureAirprt;
    @XmlElement(name = "DstnAirprt", required = true)
    protected AirportName1Choice dstnAirprt;
    @XmlElement(name = "FlghtNb")
    protected String flghtNb;
    @XmlElement(name = "AirCrrierNm")
    protected String airCrrierNm;
    @XmlElement(name = "AirCrrierCtry")
    protected String airCrrierCtry;
    @XmlElement(name = "CrrierAgtNm")
    protected String crrierAgtNm;
    @XmlElement(name = "CrrierAgtCtry")
    protected String crrierAgtCtry;

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
    public TransportByAir4 setDprtureAirprt(AirportName1Choice value) {
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
    public TransportByAir4 setDstnAirprt(AirportName1Choice value) {
        this.dstnAirprt = value;
        return this;
    }

    /**
     * Gets the value of the flghtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlghtNb() {
        return flghtNb;
    }

    /**
     * Sets the value of the flghtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportByAir4 setFlghtNb(String value) {
        this.flghtNb = value;
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
    public TransportByAir4 setAirCrrierNm(String value) {
        this.airCrrierNm = value;
        return this;
    }

    /**
     * Gets the value of the airCrrierCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirCrrierCtry() {
        return airCrrierCtry;
    }

    /**
     * Sets the value of the airCrrierCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportByAir4 setAirCrrierCtry(String value) {
        this.airCrrierCtry = value;
        return this;
    }

    /**
     * Gets the value of the crrierAgtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierAgtNm() {
        return crrierAgtNm;
    }

    /**
     * Sets the value of the crrierAgtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportByAir4 setCrrierAgtNm(String value) {
        this.crrierAgtNm = value;
        return this;
    }

    /**
     * Gets the value of the crrierAgtCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierAgtCtry() {
        return crrierAgtCtry;
    }

    /**
     * Sets the value of the crrierAgtCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportByAir4 setCrrierAgtCtry(String value) {
        this.crrierAgtCtry = value;
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
