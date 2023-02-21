
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
 * Specifies an entity involved in a trade activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeParty5", propOrder = {
    "ptyId",
    "lglOrg",
    "taxPty"
})
public class TradeParty5 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification135 ptyId;
    @XmlElement(name = "LglOrg")
    protected LegalOrganisation2 lglOrg;
    @XmlElement(name = "TaxPty")
    protected List<TaxParty4> taxPty;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public TradeParty5 setPtyId(PartyIdentification135 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the lglOrg property.
     * 
     * @return
     *     possible object is
     *     {@link LegalOrganisation2 }
     *     
     */
    public LegalOrganisation2 getLglOrg() {
        return lglOrg;
    }

    /**
     * Sets the value of the lglOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalOrganisation2 }
     *     
     */
    public TradeParty5 setLglOrg(LegalOrganisation2 value) {
        this.lglOrg = value;
        return this;
    }

    /**
     * Gets the value of the taxPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxParty4 }
     * 
     * 
     */
    public List<TaxParty4> getTaxPty() {
        if (taxPty == null) {
            taxPty = new ArrayList<TaxParty4>();
        }
        return this.taxPty;
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
     * Adds a new item to the taxPty list.
     * @see #getTaxPty()
     * 
     */
    public TradeParty5 addTaxPty(TaxParty4 taxPty) {
        getTaxPty().add(taxPty);
        return this;
    }

}
