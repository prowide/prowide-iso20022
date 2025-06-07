
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
 * Identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification233Choice", propOrder = {
    "lglPrsn",
    "ntrlPrsn"
})
public class PartyIdentification233Choice {

    @XmlElement(name = "LglPrsn")
    protected PartyIdentification224 lglPrsn;
    @XmlElement(name = "NtrlPrsn")
    protected List<PartyIdentification240> ntrlPrsn;

    /**
     * Gets the value of the lglPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification224 }
     *     
     */
    public PartyIdentification224 getLglPrsn() {
        return lglPrsn;
    }

    /**
     * Sets the value of the lglPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification224 }
     *     
     */
    public PartyIdentification233Choice setLglPrsn(PartyIdentification224 value) {
        this.lglPrsn = value;
        return this;
    }

    /**
     * Gets the value of the ntrlPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntrlPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtrlPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification240 }
     * 
     * 
     */
    public List<PartyIdentification240> getNtrlPrsn() {
        if (ntrlPrsn == null) {
            ntrlPrsn = new ArrayList<PartyIdentification240>();
        }
        return this.ntrlPrsn;
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
     * Adds a new item to the ntrlPrsn list.
     * @see #getNtrlPrsn()
     * 
     */
    public PartyIdentification233Choice addNtrlPrsn(PartyIdentification240 ntrlPrsn) {
        getNtrlPrsn().add(ntrlPrsn);
        return this;
    }

}
