
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
 * Data to request a Batch service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchRequest1", propOrder = {
    "rmvAllFlg",
    "txToPrfrm"
})
public class BatchRequest1 {

    @XmlElement(name = "RmvAllFlg")
    protected Boolean rmvAllFlg;
    @XmlElement(name = "TxToPrfrm")
    protected List<TransactionToPerform1Choice> txToPrfrm;

    /**
     * Gets the value of the rmvAllFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRmvAllFlg() {
        return rmvAllFlg;
    }

    /**
     * Sets the value of the rmvAllFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BatchRequest1 setRmvAllFlg(Boolean value) {
        this.rmvAllFlg = value;
        return this;
    }

    /**
     * Gets the value of the txToPrfrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txToPrfrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxToPrfrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionToPerform1Choice }
     * 
     * 
     * @return
     *     The value of the txToPrfrm property.
     */
    public List<TransactionToPerform1Choice> getTxToPrfrm() {
        if (txToPrfrm == null) {
            txToPrfrm = new ArrayList<>();
        }
        return this.txToPrfrm;
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
     * Adds a new item to the txToPrfrm list.
     * @see #getTxToPrfrm()
     * 
     */
    public BatchRequest1 addTxToPrfrm(TransactionToPerform1Choice txToPrfrm) {
        getTxToPrfrm().add(txToPrfrm);
        return this;
    }

}
