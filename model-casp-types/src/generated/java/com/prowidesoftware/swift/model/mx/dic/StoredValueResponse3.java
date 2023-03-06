
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
 * Response data to a Stored Value request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueResponse3", propOrder = {
    "poiTxId",
    "rslt",
    "rct"
})
public class StoredValueResponse3 {

    @XmlElement(name = "POITxId", required = true)
    protected TransactionIdentifier1 poiTxId;
    @XmlElement(name = "Rslt")
    protected List<StoredValueData3> rslt;
    @XmlElement(name = "Rct")
    protected List<PaymentReceipt2> rct;

    /**
     * Gets the value of the poiTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getPOITxId() {
        return poiTxId;
    }

    /**
     * Sets the value of the poiTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public StoredValueResponse3 setPOITxId(TransactionIdentifier1 value) {
        this.poiTxId = value;
        return this;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValueData3 }
     * 
     * 
     */
    public List<StoredValueData3> getRslt() {
        if (rslt == null) {
            rslt = new ArrayList<StoredValueData3>();
        }
        return this.rslt;
    }

    /**
     * Gets the value of the rct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceipt2 }
     * 
     * 
     */
    public List<PaymentReceipt2> getRct() {
        if (rct == null) {
            rct = new ArrayList<PaymentReceipt2>();
        }
        return this.rct;
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
     * Adds a new item to the rslt list.
     * @see #getRslt()
     * 
     */
    public StoredValueResponse3 addRslt(StoredValueData3 rslt) {
        getRslt().add(rslt);
        return this;
    }

    /**
     * Adds a new item to the rct list.
     * @see #getRct()
     * 
     */
    public StoredValueResponse3 addRct(PaymentReceipt2 rct) {
        getRct().add(rct);
        return this;
    }

}
