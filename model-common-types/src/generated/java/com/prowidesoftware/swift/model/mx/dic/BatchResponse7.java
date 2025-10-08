
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
 * Content of the batch response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchResponse7", propOrder = {
    "saleBtchId",
    "poiBtchId",
    "prfrmdTx"
})
public class BatchResponse7 {

    @XmlElement(name = "SaleBtchId")
    protected TransactionIdentifier1 saleBtchId;
    @XmlElement(name = "POIBtchId")
    protected TransactionIdentifier1 poiBtchId;
    @XmlElement(name = "PrfrmdTx")
    protected List<PerformedTransaction7> prfrmdTx;

    /**
     * Gets the value of the saleBtchId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getSaleBtchId() {
        return saleBtchId;
    }

    /**
     * Sets the value of the saleBtchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public BatchResponse7 setSaleBtchId(TransactionIdentifier1 value) {
        this.saleBtchId = value;
        return this;
    }

    /**
     * Gets the value of the poiBtchId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getPOIBtchId() {
        return poiBtchId;
    }

    /**
     * Sets the value of the poiBtchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public BatchResponse7 setPOIBtchId(TransactionIdentifier1 value) {
        this.poiBtchId = value;
        return this;
    }

    /**
     * Gets the value of the prfrmdTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prfrmdTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrfrmdTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformedTransaction7 }
     * 
     * 
     * @return
     *     The value of the prfrmdTx property.
     */
    public List<PerformedTransaction7> getPrfrmdTx() {
        if (prfrmdTx == null) {
            prfrmdTx = new ArrayList<>();
        }
        return this.prfrmdTx;
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
     * Adds a new item to the prfrmdTx list.
     * @see #getPrfrmdTx()
     * 
     */
    public BatchResponse7 addPrfrmdTx(PerformedTransaction7 prfrmdTx) {
        getPrfrmdTx().add(prfrmdTx);
        return this;
    }

}
