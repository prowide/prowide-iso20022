
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
 * SCOPE
 * The SecuritiesAccountPositionResponse message is sent by a market infrastructure to an instructing party to report the securities positions for the given date period as requested in the query, for all securities across all accounts satisfying the query criteria.
 * 
 * USAGE
 * The message SecuritiesAccountPositionResponse will provide CSDs and T2S participants with a report corresponding to the SecuritiesAccountPositionQuery returning balances held in the list of specified securities accounts within the specified period satisfying the defined selection criteria. The Securities Account Position Response will provide the following business attributes:
 * -	CSD 
 * -	Account owner
 * -	Securities Account Number
 * -	Securities Identifier (e.g. ISIN)
 * -	Date
 * -	The total position
 * -	The blocked position
 * -	The free position 
 * 
 * Unless otherwise specified by the sender in the Securities Balance Query, T2S will only return non-zero securities positions in the accounts.
 * 
 * The message may also be used to: 
 * - re-send a message previously sent (the sub-function of the message is Duplicate) 
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy) 
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountPositionResponseV01", propOrder = {
    "pgntn",
    "rptGnlDtls",
    "acctOwnr",
    "acctSvcr",
    "intrmyInf",
    "bals",
    "ptyBaseCcyTtlAmts"
})
public class SecuritiesAccountPositionResponseV01 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "RptGnlDtls", required = true)
    protected Statement58 rptGnlDtls;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification100 acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification100 acctSvcr;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary32> intrmyInf;
    @XmlElement(name = "Bals")
    protected List<Balance14> bals;
    @XmlElement(name = "PtyBaseCcyTtlAmts")
    protected TotalValueInPageAndStatement1 ptyBaseCcyTtlAmts;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public SecuritiesAccountPositionResponseV01 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the rptGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement58 }
     *     
     */
    public Statement58 getRptGnlDtls() {
        return rptGnlDtls;
    }

    /**
     * Sets the value of the rptGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement58 }
     *     
     */
    public SecuritiesAccountPositionResponseV01 setRptGnlDtls(Statement58 value) {
        this.rptGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public SecuritiesAccountPositionResponseV01 setAcctOwnr(PartyIdentification100 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public SecuritiesAccountPositionResponseV01 setAcctSvcr(PartyIdentification100 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary32 }
     * 
     * 
     * @return
     *     The value of the intrmyInf property.
     */
    public List<Intermediary32> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the bals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Balance14 }
     * 
     * 
     * @return
     *     The value of the bals property.
     */
    public List<Balance14> getBals() {
        if (bals == null) {
            bals = new ArrayList<>();
        }
        return this.bals;
    }

    /**
     * Gets the value of the ptyBaseCcyTtlAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TotalValueInPageAndStatement1 }
     *     
     */
    public TotalValueInPageAndStatement1 getPtyBaseCcyTtlAmts() {
        return ptyBaseCcyTtlAmts;
    }

    /**
     * Sets the value of the ptyBaseCcyTtlAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalValueInPageAndStatement1 }
     *     
     */
    public SecuritiesAccountPositionResponseV01 setPtyBaseCcyTtlAmts(TotalValueInPageAndStatement1 value) {
        this.ptyBaseCcyTtlAmts = value;
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
     * Adds a new item to the intrmyInf list.
     * @see #getIntrmyInf()
     * 
     */
    public SecuritiesAccountPositionResponseV01 addIntrmyInf(Intermediary32 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

    /**
     * Adds a new item to the bals list.
     * @see #getBals()
     * 
     */
    public SecuritiesAccountPositionResponseV01 addBals(Balance14 bals) {
        getBals().add(bals);
        return this;
    }

}
