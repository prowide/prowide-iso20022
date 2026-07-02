
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
 * Reason for a blocked status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockedStatusReason2", propOrder = {
    "txTp",
    "blckd",
    "rsn",
    "addtlInf"
})
public class BlockedStatusReason2 {

    @XmlElement(name = "TxTp", required = true)
    protected TransactionType5Choice txTp;
    @XmlElement(name = "Blckd")
    protected boolean blckd;
    @XmlElement(name = "Rsn")
    protected List<BlockedReason2Choice> rsn;
    @XmlElement(name = "AddtlInf", required = true)
    protected String addtlInf;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType5Choice }
     *     
     */
    public TransactionType5Choice getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType5Choice }
     *     
     */
    public BlockedStatusReason2 setTxTp(TransactionType5Choice value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the blckd property.
     * 
     */
    public boolean isBlckd() {
        return blckd;
    }

    /**
     * Sets the value of the blckd property.
     * 
     */
    public BlockedStatusReason2 setBlckd(boolean value) {
        this.blckd = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlockedReason2Choice }
     * 
     * 
     */
    public List<BlockedReason2Choice> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<BlockedReason2Choice>();
        }
        return this.rsn;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BlockedStatusReason2 setAddtlInf(String value) {
        this.addtlInf = value;
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
     * Adds a new item to the rsn list.
     * @see #getRsn()
     * 
     */
    public BlockedStatusReason2 addRsn(BlockedReason2Choice rsn) {
        getRsn().add(rsn);
        return this;
    }

}
