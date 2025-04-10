
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
 * Status and reason of an instructed order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAndReason32", propOrder = {
    "stsAndRsn",
    "tx"
})
public class StatusAndReason32 {

    @XmlElement(name = "StsAndRsn", required = true)
    protected Status18Choice stsAndRsn;
    @XmlElement(name = "Tx")
    protected List<Transaction54> tx;

    /**
     * Gets the value of the stsAndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link Status18Choice }
     *     
     */
    public Status18Choice getStsAndRsn() {
        return stsAndRsn;
    }

    /**
     * Sets the value of the stsAndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status18Choice }
     *     
     */
    public StatusAndReason32 setStsAndRsn(Status18Choice value) {
        this.stsAndRsn = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction54 }
     * 
     * 
     * @return
     *     The value of the tx property.
     */
    public List<Transaction54> getTx() {
        if (tx == null) {
            tx = new ArrayList<>();
        }
        return this.tx;
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
     * Adds a new item to the tx list.
     * @see #getTx()
     * 
     */
    public StatusAndReason32 addTx(Transaction54 tx) {
        getTx().add(tx);
        return this;
    }

}
