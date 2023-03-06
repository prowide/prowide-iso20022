
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
 * Information about the confirmation of a transfer out transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferOut1", propOrder = {
    "trfDtls",
    "finInstrmDtls",
    "acctDtls",
    "sttlmDtls",
    "xtnsn"
})
public class TransferOut1 {

    @XmlElement(name = "TrfDtls", required = true)
    protected Transfer2 trfDtls;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument3 finInstrmDtls;
    @XmlElement(name = "AcctDtls", required = true)
    protected InvestmentAccount10 acctDtls;
    @XmlElement(name = "SttlmDtls", required = true)
    protected ReceiveInformation2 sttlmDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the trfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Transfer2 }
     *     
     */
    public Transfer2 getTrfDtls() {
        return trfDtls;
    }

    /**
     * Sets the value of the trfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transfer2 }
     *     
     */
    public TransferOut1 setTrfDtls(Transfer2 value) {
        this.trfDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument3 }
     *     
     */
    public FinancialInstrument3 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument3 }
     *     
     */
    public TransferOut1 setFinInstrmDtls(FinancialInstrument3 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount10 }
     *     
     */
    public InvestmentAccount10 getAcctDtls() {
        return acctDtls;
    }

    /**
     * Sets the value of the acctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount10 }
     *     
     */
    public TransferOut1 setAcctDtls(InvestmentAccount10 value) {
        this.acctDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveInformation2 }
     *     
     */
    public ReceiveInformation2 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveInformation2 }
     *     
     */
    public TransferOut1 setSttlmDtls(ReceiveInformation2 value) {
        this.sttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
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
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
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
    public TransferOut1 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
