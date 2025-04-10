
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
 * Information about the confirmation of a transfer in transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferIn4", propOrder = {
    "trfDtls",
    "finInstrmDtls",
    "acctDtls",
    "sttlmDtls",
    "xtnsn"
})
public class TransferIn4 {

    @XmlElement(name = "TrfDtls", required = true)
    protected Transfer7 trfDtls;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument13 finInstrmDtls;
    @XmlElement(name = "AcctDtls", required = true)
    protected InvestmentAccount22 acctDtls;
    @XmlElement(name = "SttlmDtls", required = true)
    protected DeliverInformation4 sttlmDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the trfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Transfer7 }
     *     
     */
    public Transfer7 getTrfDtls() {
        return trfDtls;
    }

    /**
     * Sets the value of the trfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transfer7 }
     *     
     */
    public TransferIn4 setTrfDtls(Transfer7 value) {
        this.trfDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument13 }
     *     
     */
    public FinancialInstrument13 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument13 }
     *     
     */
    public TransferIn4 setFinInstrmDtls(FinancialInstrument13 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount22 }
     *     
     */
    public InvestmentAccount22 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount22 }
     *     
     */
    public TransferIn4 setAcctDtls(InvestmentAccount22 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliverInformation4 }
     *     
     */
    public DeliverInformation4 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverInformation4 }
     *     
     */
    public TransferIn4 setSttlmDtls(DeliverInformation4 value) {
        this.sttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
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
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public TransferIn4 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
