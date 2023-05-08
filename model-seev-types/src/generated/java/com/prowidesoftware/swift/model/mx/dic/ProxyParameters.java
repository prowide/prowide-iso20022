
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Information on the conditions to fulfill to appoint a proxy.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProxyParameters", propOrder = {
    "authrsdPrxy",
    "prxyAppntmntInf",
    "prxyAppntmntDdln",
    "prxyAppntmntElctrncDdln",
    "prxyAppntmntMktDdln"
})
public class ProxyParameters {

    @XmlElement(name = "AuthrsdPrxy")
    protected List<Proxy> authrsdPrxy;
    @XmlElement(name = "PrxyAppntmntInf")
    protected String prxyAppntmntInf;
    @XmlElement(name = "PrxyAppntmntDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar prxyAppntmntDdln;
    @XmlElement(name = "PrxyAppntmntElctrncDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar prxyAppntmntElctrncDdln;
    @XmlElement(name = "PrxyAppntmntMktDdln", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar prxyAppntmntMktDdln;

    /**
     * Gets the value of the authrsdPrxy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authrsdPrxy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthrsdPrxy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Proxy }
     * 
     * 
     * @return
     *     The value of the authrsdPrxy property.
     */
    public List<Proxy> getAuthrsdPrxy() {
        if (authrsdPrxy == null) {
            authrsdPrxy = new ArrayList<>();
        }
        return this.authrsdPrxy;
    }

    /**
     * Gets the value of the prxyAppntmntInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrxyAppntmntInf() {
        return prxyAppntmntInf;
    }

    /**
     * Sets the value of the prxyAppntmntInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProxyParameters setPrxyAppntmntInf(String value) {
        this.prxyAppntmntInf = value;
        return this;
    }

    /**
     * Gets the value of the prxyAppntmntDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPrxyAppntmntDdln() {
        return prxyAppntmntDdln;
    }

    /**
     * Sets the value of the prxyAppntmntDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProxyParameters setPrxyAppntmntDdln(Calendar value) {
        this.prxyAppntmntDdln = value;
        return this;
    }

    /**
     * Gets the value of the prxyAppntmntElctrncDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPrxyAppntmntElctrncDdln() {
        return prxyAppntmntElctrncDdln;
    }

    /**
     * Sets the value of the prxyAppntmntElctrncDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProxyParameters setPrxyAppntmntElctrncDdln(Calendar value) {
        this.prxyAppntmntElctrncDdln = value;
        return this;
    }

    /**
     * Gets the value of the prxyAppntmntMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPrxyAppntmntMktDdln() {
        return prxyAppntmntMktDdln;
    }

    /**
     * Sets the value of the prxyAppntmntMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProxyParameters setPrxyAppntmntMktDdln(Calendar value) {
        this.prxyAppntmntMktDdln = value;
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
     * Adds a new item to the authrsdPrxy list.
     * @see #getAuthrsdPrxy()
     * 
     */
    public ProxyParameters addAuthrsdPrxy(Proxy authrsdPrxy) {
        getAuthrsdPrxy().add(authrsdPrxy);
        return this;
    }

}
