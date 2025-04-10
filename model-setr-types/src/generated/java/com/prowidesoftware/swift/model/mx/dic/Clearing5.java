
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
 * Provides the clearing details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clearing5", propOrder = {
    "clrMmb",
    "clrSgmt"
})
public class Clearing5 {

    @XmlElement(name = "ClrMmb", required = true)
    protected List<PartyIdentificationAndAccount149> clrMmb;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification127Choice clrSgmt;

    /**
     * Gets the value of the clrMmb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clrMmb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClrMmb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount149 }
     * 
     * 
     * @return
     *     The value of the clrMmb property.
     */
    public List<PartyIdentificationAndAccount149> getClrMmb() {
        if (clrMmb == null) {
            clrMmb = new ArrayList<>();
        }
        return this.clrMmb;
    }

    /**
     * Gets the value of the clrSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification127Choice }
     *     
     */
    public PartyIdentification127Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Sets the value of the clrSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification127Choice }
     *     
     */
    public Clearing5 setClrSgmt(PartyIdentification127Choice value) {
        this.clrSgmt = value;
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
     * Adds a new item to the clrMmb list.
     * @see #getClrMmb()
     * 
     */
    public Clearing5 addClrMmb(PartyIdentificationAndAccount149 clrMmb) {
        getClrMmb().add(clrMmb);
        return this;
    }

}
