
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
 * Provides the transactions in the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementTransactions4__1", propOrder = {
    "acctOwnr",
    "sfkpgAcct",
    "stsAndRsn",
    "tx"
})
public class SecuritiesSettlementTransactions41 {

    @XmlElement(name = "AcctOwnr")
    protected SystemPartyIdentification81 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount191 sfkpgAcct;
    @XmlElement(name = "StsAndRsn")
    protected StatusAndReason381 stsAndRsn;
    @XmlElement(name = "Tx", required = true)
    protected List<Transaction731> tx;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification81 }
     *     
     */
    public SystemPartyIdentification81 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification81 }
     *     
     */
    public SecuritiesSettlementTransactions41 setAcctOwnr(SystemPartyIdentification81 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount191 }
     *     
     */
    public SecuritiesAccount191 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount191 }
     *     
     */
    public SecuritiesSettlementTransactions41 setSfkpgAcct(SecuritiesAccount191 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the stsAndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusAndReason381 }
     *     
     */
    public StatusAndReason381 getStsAndRsn() {
        return stsAndRsn;
    }

    /**
     * Sets the value of the stsAndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAndReason381 }
     *     
     */
    public SecuritiesSettlementTransactions41 setStsAndRsn(StatusAndReason381 value) {
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
     * {@link Transaction731 }
     * 
     * 
     * @return
     *     The value of the tx property.
     */
    public List<Transaction731> getTx() {
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
    public SecuritiesSettlementTransactions41 addTx(Transaction731 tx) {
        getTx().add(tx);
        return this;
    }

}
