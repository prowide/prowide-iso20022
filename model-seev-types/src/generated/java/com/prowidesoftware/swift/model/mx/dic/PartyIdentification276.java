
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
@XmlType(name = "PartyIdentification276", propOrder = {
    "lglPrsn",
    "ntrlPrsn"
})
public class PartyIdentification276 {

    @XmlElement(name = "LglPrsn")
    protected List<PartyIdentification275> lglPrsn;
    @XmlElement(name = "NtrlPrsn")
    protected List<PartyIdentification217> ntrlPrsn;

    /**
     * Gets the value of the lglPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lglPrsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLglPrsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification275 }
     * 
     * 
     */
    public List<PartyIdentification275> getLglPrsn() {
        if (lglPrsn == null) {
            lglPrsn = new ArrayList<PartyIdentification275>();
        }
        return this.lglPrsn;
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
     * {@link PartyIdentification217 }
     * 
     * 
     */
    public List<PartyIdentification217> getNtrlPrsn() {
        if (ntrlPrsn == null) {
            ntrlPrsn = new ArrayList<PartyIdentification217>();
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
     * Adds a new item to the lglPrsn list.
     * @see #getLglPrsn()
     * 
     */
    public PartyIdentification276 addLglPrsn(PartyIdentification275 lglPrsn) {
        getLglPrsn().add(lglPrsn);
        return this;
    }

    /**
     * Adds a new item to the ntrlPrsn list.
     * @see #getNtrlPrsn()
     * 
     */
    public PartyIdentification276 addNtrlPrsn(PartyIdentification217 ntrlPrsn) {
        getNtrlPrsn().add(ntrlPrsn);
        return this;
    }

}
