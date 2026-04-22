
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
 * Specifies the details of the cash settlement initiation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashSettlementInitiation2", propOrder = {
    "endToEndId",
    "sttlmAmt",
    "cshAcct",
    "cshAcctOwnr",
    "cshCtrPtyAcct",
    "intrmyAgt",
    "undrlygSctiesTx"
})
public class CashSettlementInitiation2 {

    @XmlElement(name = "EndToEndId")
    protected String endToEndId;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection52 sttlmAmt;
    @XmlElement(name = "CshAcct")
    protected CashAccount38 cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected PartyIdentification135 cshAcctOwnr;
    @XmlElement(name = "CshCtrPtyAcct")
    protected CashAccount39 cshCtrPtyAcct;
    @XmlElement(name = "IntrmyAgt")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt;
    @XmlElement(name = "UndrlygSctiesTx")
    protected List<SecuritiesTransaction2> undrlygSctiesTx;

    /**
     * Gets the value of the endToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Sets the value of the endToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashSettlementInitiation2 setEndToEndId(String value) {
        this.endToEndId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public AmountAndDirection52 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection52 }
     *     
     */
    public CashSettlementInitiation2 setSttlmAmt(AmountAndDirection52 value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public CashSettlementInitiation2 setCshAcct(CashAccount38 value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getCshAcctOwnr() {
        return cshAcctOwnr;
    }

    /**
     * Sets the value of the cshAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public CashSettlementInitiation2 setCshAcctOwnr(PartyIdentification135 value) {
        this.cshAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the cshCtrPtyAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount39 }
     *     
     */
    public CashAccount39 getCshCtrPtyAcct() {
        return cshCtrPtyAcct;
    }

    /**
     * Sets the value of the cshCtrPtyAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount39 }
     *     
     */
    public CashSettlementInitiation2 setCshCtrPtyAcct(CashAccount39 value) {
        this.cshCtrPtyAcct = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt() {
        return intrmyAgt;
    }

    /**
     * Sets the value of the intrmyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public CashSettlementInitiation2 setIntrmyAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt = value;
        return this;
    }

    /**
     * Gets the value of the undrlygSctiesTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygSctiesTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygSctiesTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesTransaction2 }
     * 
     * 
     * @return
     *     The value of the undrlygSctiesTx property.
     */
    public List<SecuritiesTransaction2> getUndrlygSctiesTx() {
        if (undrlygSctiesTx == null) {
            undrlygSctiesTx = new ArrayList<>();
        }
        return this.undrlygSctiesTx;
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
     * Adds a new item to the undrlygSctiesTx list.
     * @see #getUndrlygSctiesTx()
     * 
     */
    public CashSettlementInitiation2 addUndrlygSctiesTx(SecuritiesTransaction2 undrlygSctiesTx) {
        getUndrlygSctiesTx().add(undrlygSctiesTx);
        return this;
    }

}
