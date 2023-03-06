
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
 * Provides information about pending balance and pending transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingBalance3", propOrder = {
    "bal",
    "pdgTxs"
})
public class PendingBalance3 {

    @XmlElement(name = "Bal", required = true)
    protected SignedQuantityFormat6 bal;
    @XmlElement(name = "PdgTxs")
    protected List<SettlementTypeAndIdentification20> pdgTxs;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public PendingBalance3 setBal(SignedQuantityFormat6 value) {
        this.bal = value;
        return this;
    }

    /**
     * Gets the value of the pdgTxs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdgTxs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdgTxs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementTypeAndIdentification20 }
     * 
     * 
     */
    public List<SettlementTypeAndIdentification20> getPdgTxs() {
        if (pdgTxs == null) {
            pdgTxs = new ArrayList<SettlementTypeAndIdentification20>();
        }
        return this.pdgTxs;
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
     * Adds a new item to the pdgTxs list.
     * @see #getPdgTxs()
     * 
     */
    public PendingBalance3 addPdgTxs(SettlementTypeAndIdentification20 pdgTxs) {
        getPdgTxs().add(pdgTxs);
        return this;
    }

}
