
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
 * Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties35", propOrder = {
    "stgSttlmPties",
    "lclMktId",
    "regnDtls"
})
public class SettlementParties35 {

    @XmlElement(name = "StgSttlmPties", required = true)
    protected SettlementParties32 stgSttlmPties;
    @XmlElement(name = "LclMktId")
    protected List<GenericIdentification49> lclMktId;
    @XmlElement(name = "RegnDtls")
    protected PartyIdentification99Choice regnDtls;

    /**
     * Gets the value of the stgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties32 }
     *     
     */
    public SettlementParties32 getStgSttlmPties() {
        return stgSttlmPties;
    }

    /**
     * Sets the value of the stgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties32 }
     *     
     */
    public SettlementParties35 setStgSttlmPties(SettlementParties32 value) {
        this.stgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the lclMktId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lclMktId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclMktId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification49 }
     * 
     * 
     * @return
     *     The value of the lclMktId property.
     */
    public List<GenericIdentification49> getLclMktId() {
        if (lclMktId == null) {
            lclMktId = new ArrayList<>();
        }
        return this.lclMktId;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification99Choice }
     *     
     */
    public PartyIdentification99Choice getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification99Choice }
     *     
     */
    public SettlementParties35 setRegnDtls(PartyIdentification99Choice value) {
        this.regnDtls = value;
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
     * Adds a new item to the lclMktId list.
     * @see #getLclMktId()
     * 
     */
    public SettlementParties35 addLclMktId(GenericIdentification49 lclMktId) {
        getLclMktId().add(lclMktId);
        return this;
    }

}
