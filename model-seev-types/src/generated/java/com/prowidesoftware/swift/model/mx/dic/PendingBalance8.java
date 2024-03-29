
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
 * Provides information about pending balance and pending transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingBalance8", propOrder = {
    "bal",
    "pdgTxs"
})
public class PendingBalance8 {

    @XmlElement(name = "Bal", required = true)
    protected SignedQuantityFormat13 bal;
    @XmlElement(name = "PdgTxs")
    protected List<SettlementTypeAndIdentification26> pdgTxs;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public PendingBalance8 setBal(SignedQuantityFormat13 value) {
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
     * {@link SettlementTypeAndIdentification26 }
     * 
     * 
     */
    public List<SettlementTypeAndIdentification26> getPdgTxs() {
        if (pdgTxs == null) {
            pdgTxs = new ArrayList<SettlementTypeAndIdentification26>();
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
    public PendingBalance8 addPdgTxs(SettlementTypeAndIdentification26 pdgTxs) {
        getPdgTxs().add(pdgTxs);
        return this;
    }

}
