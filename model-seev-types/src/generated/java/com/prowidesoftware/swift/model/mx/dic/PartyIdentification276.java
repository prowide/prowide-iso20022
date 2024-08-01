
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
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lglPrsn property.
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
     * @return
     *     The value of the lglPrsn property.
     */
    public List<PartyIdentification275> getLglPrsn() {
        if (lglPrsn == null) {
            lglPrsn = new ArrayList<>();
        }
        return this.lglPrsn;
    }

    /**
     * Gets the value of the ntrlPrsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntrlPrsn property.
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
     * @return
     *     The value of the ntrlPrsn property.
     */
    public List<PartyIdentification217> getNtrlPrsn() {
        if (ntrlPrsn == null) {
            ntrlPrsn = new ArrayList<>();
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
