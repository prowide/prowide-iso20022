
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
 * Information about the registration of a proxy.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProxyAppointmentInformation6", propOrder = {
    "regnMtd",
    "ddln",
    "mktDdln",
    "authrsdPrxy"
})
public class ProxyAppointmentInformation6 {

    @XmlElement(name = "RegnMtd")
    protected String regnMtd;
    @XmlElement(name = "Ddln")
    protected DateFormat58Choice ddln;
    @XmlElement(name = "MktDdln")
    protected DateFormat58Choice mktDdln;
    @XmlElement(name = "AuthrsdPrxy")
    protected List<Proxy11> authrsdPrxy;

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
    public ProxyAppointmentInformation6 setRegnMtd(String value) {
        this.regnMtd = value;
        return this;
    }

    /**
     * Gets the value of the ddln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getDdln() {
        return ddln;
    }

    /**
     * Sets the value of the ddln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public ProxyAppointmentInformation6 setDdln(DateFormat58Choice value) {
        this.ddln = value;
        return this;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public ProxyAppointmentInformation6 setMktDdln(DateFormat58Choice value) {
        this.mktDdln = value;
        return this;
    }

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
     * {@link Proxy11 }
     * 
     * 
     * @return
     *     The value of the authrsdPrxy property.
     */
    public List<Proxy11> getAuthrsdPrxy() {
        if (authrsdPrxy == null) {
            authrsdPrxy = new ArrayList<>();
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
    public ProxyAppointmentInformation6 addAuthrsdPrxy(Proxy11 authrsdPrxy) {
        getAuthrsdPrxy().add(authrsdPrxy);
        return this;
    }

}
