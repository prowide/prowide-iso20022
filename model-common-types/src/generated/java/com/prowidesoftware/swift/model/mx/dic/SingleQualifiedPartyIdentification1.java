
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
 * Defines an identifier for a party relative to another party using an identifier of another party followed by a local identifier issued by the other party.
 * It is assumed that customers of an identifiable party can be referenced by an identifier relative to that party. The identification of the party together with the relative identifier identifies the customer.
 * Such references can occur in sequence. The last occurrence of RelativeIdentifier is the local identifier at the party recursively defined by the PrefixParty and all preceding occurrences of RelativeIdentifier.
 * Technical note: The sequence of relative identifiers is used to avoid a recursive definition in the catalogue.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleQualifiedPartyIdentification1", propOrder = {
    "basePty",
    "rltvIdr"
})
public class SingleQualifiedPartyIdentification1 {

    @XmlElement(name = "BasePty", required = true)
    protected TradeParty1 basePty;
    @XmlElement(name = "RltvIdr")
    protected List<String> rltvIdr;

    /**
     * Gets the value of the basePty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeParty1 getBasePty() {
        return basePty;
    }

    /**
     * Sets the value of the basePty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty1 }
     *     
     */
    public SingleQualifiedPartyIdentification1 setBasePty(TradeParty1 value) {
        this.basePty = value;
        return this;
    }

    /**
     * Gets the value of the rltvIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltvIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltvIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRltvIdr() {
        if (rltvIdr == null) {
            rltvIdr = new ArrayList<String>();
        }
        return this.rltvIdr;
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
     * Adds a new item to the rltvIdr list.
     * @see #getRltvIdr()
     * 
     */
    public SingleQualifiedPartyIdentification1 addRltvIdr(String rltvIdr) {
        getRltvIdr().add(rltvIdr);
        return this;
    }

}
