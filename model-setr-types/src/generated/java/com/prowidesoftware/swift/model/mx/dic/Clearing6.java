
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
 * Provides the clearing details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clearing6", propOrder = {
    "clrMmb",
    "clrSgmt"
})
public class Clearing6 {

    @XmlElement(name = "ClrMmb", required = true)
    protected List<PartyIdentificationAndAccount219> clrMmb;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification243Choice clrSgmt;

    /**
     * Gets the value of the clrMmb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clrMmb property.
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
     * {@link PartyIdentificationAndAccount219 }
     * 
     * 
     */
    public List<PartyIdentificationAndAccount219> getClrMmb() {
        if (clrMmb == null) {
            clrMmb = new ArrayList<PartyIdentificationAndAccount219>();
        }
        return this.clrMmb;
    }

    /**
     * Gets the value of the clrSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification243Choice }
     *     
     */
    public PartyIdentification243Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Sets the value of the clrSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification243Choice }
     *     
     */
    public Clearing6 setClrSgmt(PartyIdentification243Choice value) {
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
    public Clearing6 addClrMmb(PartyIdentificationAndAccount219 clrMmb) {
        getClrMmb().add(clrMmb);
        return this;
    }

}
