
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "TransportByAir3", propOrder = {
    "dprtureAirprt",
    "dstnAirprt",
    "airCrrierNm"
})
public class TransportByAir3 {

    @XmlElement(name = "DprtureAirprt")
    protected List<AirportName1Choice> dprtureAirprt;
    @XmlElement(name = "DstnAirprt", required = true)
    protected List<AirportName1Choice> dstnAirprt;
    @XmlElement(name = "AirCrrierNm")
    protected String airCrrierNm;

    /**
     * Gets the value of the dprtureAirprt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dprtureAirprt property.
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
     */
    public List<AirportName1Choice> getDprtureAirprt() {
        if (dprtureAirprt == null) {
            dprtureAirprt = new ArrayList<AirportName1Choice>();
        }
        return this.dprtureAirprt;
    }

    /**
     * Gets the value of the dstnAirprt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dstnAirprt property.
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
     */
    public List<AirportName1Choice> getDstnAirprt() {
        if (dstnAirprt == null) {
            dstnAirprt = new ArrayList<AirportName1Choice>();
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
    public TransportByAir3 setAirCrrierNm(String value) {
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

    /**
     * Adds a new item to the dprtureAirprt list.
     * @see #getDprtureAirprt()
     * 
     */
    public TransportByAir3 addDprtureAirprt(AirportName1Choice dprtureAirprt) {
        getDprtureAirprt().add(dprtureAirprt);
        return this;
    }

    /**
     * Adds a new item to the dstnAirprt list.
     * @see #getDstnAirprt()
     * 
     */
    public TransportByAir3 addDstnAirprt(AirportName1Choice dstnAirprt) {
        getDstnAirprt().add(dstnAirprt);
        return this;
    }

}
