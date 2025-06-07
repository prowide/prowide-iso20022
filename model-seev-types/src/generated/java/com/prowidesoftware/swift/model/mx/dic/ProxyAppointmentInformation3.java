
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
 * Indicates how a proxy is registered.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProxyAppointmentInformation3", propOrder = {
    "regnMtd",
    "ddln",
    "stpDdln",
    "mktDdln",
    "authrsdPrxy"
})
public class ProxyAppointmentInformation3 {

    @XmlElement(name = "RegnMtd")
    protected String regnMtd;
    @XmlElement(name = "Ddln")
    protected DateFormat29Choice ddln;
    @XmlElement(name = "STPDdln")
    protected DateFormat29Choice stpDdln;
    @XmlElement(name = "MktDdln")
    protected DateFormat29Choice mktDdln;
    @XmlElement(name = "AuthrsdPrxy")
    protected List<Proxy5> authrsdPrxy;

    /**
     * Gets the value of the regnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnMtd() {
        return regnMtd;
    }

    /**
     * Sets the value of the regnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProxyAppointmentInformation3 setRegnMtd(String value) {
        this.regnMtd = value;
        return this;
    }

    /**
     * Gets the value of the ddln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getDdln() {
        return ddln;
    }

    /**
     * Sets the value of the ddln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public ProxyAppointmentInformation3 setDdln(DateFormat29Choice value) {
        this.ddln = value;
        return this;
    }

    /**
     * Gets the value of the stpDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getSTPDdln() {
        return stpDdln;
    }

    /**
     * Sets the value of the stpDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public ProxyAppointmentInformation3 setSTPDdln(DateFormat29Choice value) {
        this.stpDdln = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat29Choice }
     *     
     */
    public DateFormat29Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat29Choice }
     *     
     */
    public ProxyAppointmentInformation3 setMktDdln(DateFormat29Choice value) {
        this.mktDdln = value;
        return this;
    }

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
     * {@link Proxy5 }
     * 
     * 
     */
    public List<Proxy5> getAuthrsdPrxy() {
        if (authrsdPrxy == null) {
            authrsdPrxy = new ArrayList<Proxy5>();
        }
        return this.authrsdPrxy;
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
    public ProxyAppointmentInformation3 addAuthrsdPrxy(Proxy5 authrsdPrxy) {
        getAuthrsdPrxy().add(authrsdPrxy);
        return this;
    }

}
