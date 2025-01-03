
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "TransportByAir5", propOrder = {
    "dprtureAirprt",
    "dstnAirprt",
    "airCrrierNm",
    "airCrrierCtry",
    "crrierAgtNm",
    "crrierAgtCtry"
})
public class TransportByAir5 {

    @XmlElement(name = "DprtureAirprt")
    protected List<AirportName1Choice> dprtureAirprt;
    @XmlElement(name = "DstnAirprt", required = true)
    protected List<AirportName1Choice> dstnAirprt;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dprtureAirprt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDprtureAirprt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportName1Choice }
     * 
     * 
     * @return
     *     The value of the dprtureAirprt property.
     */
    public List<AirportName1Choice> getDprtureAirprt() {
        if (dprtureAirprt == null) {
            dprtureAirprt = new ArrayList<>();
        }
        return this.dprtureAirprt;
    }

    /**
     * Gets the value of the dstnAirprt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dstnAirprt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDstnAirprt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportName1Choice }
     * 
     * 
     * @return
     *     The value of the dstnAirprt property.
     */
    public List<AirportName1Choice> getDstnAirprt() {
        if (dstnAirprt == null) {
            dstnAirprt = new ArrayList<>();
        }
        return this.dstnAirprt;
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
    public TransportByAir5 setAirCrrierNm(String value) {
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
    public TransportByAir5 setAirCrrierCtry(String value) {
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
    public TransportByAir5 setCrrierAgtNm(String value) {
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
    public TransportByAir5 setCrrierAgtCtry(String value) {
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

    /**
     * Adds a new item to the dprtureAirprt list.
     * @see #getDprtureAirprt()
     * 
     */
    public TransportByAir5 addDprtureAirprt(AirportName1Choice dprtureAirprt) {
        getDprtureAirprt().add(dprtureAirprt);
        return this;
    }

    /**
     * Adds a new item to the dstnAirprt list.
     * @see #getDstnAirprt()
     * 
     */
    public TransportByAir5 addDstnAirprt(AirportName1Choice dstnAirprt) {
        getDstnAirprt().add(dstnAirprt);
        return this;
    }

}
