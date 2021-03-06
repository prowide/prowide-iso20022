
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
 * Specifies an entity involved in a trade activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeParty1", propOrder = {
    "ptyId",
    "lglOrg",
    "taxPty"
})
public class TradeParty1 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification45 ptyId;
    @XmlElement(name = "LglOrg")
    protected LegalOrganisation1 lglOrg;
    @XmlElement(name = "TaxPty")
    protected List<TaxParty3> taxPty;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification45 }
     *     
     */
    public PartyIdentification45 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification45 }
     *     
     */
    public TradeParty1 setPtyId(PartyIdentification45 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the lglOrg property.
     * 
     * @return
     *     possible object is
     *     {@link LegalOrganisation1 }
     *     
     */
    public LegalOrganisation1 getLglOrg() {
        return lglOrg;
    }

    /**
     * Sets the value of the lglOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalOrganisation1 }
     *     
     */
    public TradeParty1 setLglOrg(LegalOrganisation1 value) {
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
     * {@link TaxParty3 }
     * 
     * 
     */
    public List<TaxParty3> getTaxPty() {
        if (taxPty == null) {
            taxPty = new ArrayList<TaxParty3>();
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
    public TradeParty1 addTaxPty(TaxParty3 taxPty) {
        getTaxPty().add(taxPty);
        return this;
    }

}
