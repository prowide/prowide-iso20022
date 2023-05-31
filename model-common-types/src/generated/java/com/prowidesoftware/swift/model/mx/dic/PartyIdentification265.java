
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
 * Unique and unambiguous way to identify an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification265", propOrder = {
    "anyBIC",
    "altrntvIdr"
})
public class PartyIdentification265 {

    @XmlElement(name = "AnyBIC", required = true)
    protected String anyBIC;
    @XmlElement(name = "AltrntvIdr")
    protected List<String> altrntvIdr;

    /**
     * Gets the value of the anyBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyBIC() {
        return anyBIC;
    }

    /**
     * Sets the value of the anyBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification265 setAnyBIC(String value) {
        this.anyBIC = value;
        return this;
    }

    /**
     * Gets the value of the altrntvIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altrntvIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrntvIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAltrntvIdr() {
        if (altrntvIdr == null) {
            altrntvIdr = new ArrayList<String>();
        }
        return this.altrntvIdr;
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
     * Adds a new item to the altrntvIdr list.
     * @see #getAltrntvIdr()
     * 
     */
    public PartyIdentification265 addAltrntvIdr(String altrntvIdr) {
        getAltrntvIdr().add(altrntvIdr);
        return this;
    }

}
