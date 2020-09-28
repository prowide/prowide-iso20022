
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
    @XmlElement(name = "PrxyAppntmntDdln")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prxyAppntmntDdln;
    @XmlElement(name = "PrxyAppntmntElctrncDdln")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prxyAppntmntElctrncDdln;
    @XmlElement(name = "PrxyAppntmntMktDdln")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prxyAppntmntMktDdln;

    /**
     * Gets the value of the authrsdPrxy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authrsdPrxy property.
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
     */
    public List<Proxy> getAuthrsdPrxy() {
        if (authrsdPrxy == null) {
            authrsdPrxy = new ArrayList<Proxy>();
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrxyAppntmntDdln() {
        return prxyAppntmntDdln;
    }

    /**
     * Sets the value of the prxyAppntmntDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ProxyParameters setPrxyAppntmntDdln(XMLGregorianCalendar value) {
        this.prxyAppntmntDdln = value;
        return this;
    }

    /**
     * Gets the value of the prxyAppntmntElctrncDdln property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrxyAppntmntElctrncDdln() {
        return prxyAppntmntElctrncDdln;
    }

    /**
     * Sets the value of the prxyAppntmntElctrncDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ProxyParameters setPrxyAppntmntElctrncDdln(XMLGregorianCalendar value) {
        this.prxyAppntmntElctrncDdln = value;
        return this;
    }

    /**
     * Gets the value of the prxyAppntmntMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrxyAppntmntMktDdln() {
        return prxyAppntmntMktDdln;
    }

    /**
     * Sets the value of the prxyAppntmntMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ProxyParameters setPrxyAppntmntMktDdln(XMLGregorianCalendar value) {
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
