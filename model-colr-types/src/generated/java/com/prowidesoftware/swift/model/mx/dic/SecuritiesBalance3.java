
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Quantity of securities assigned as collateral position.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesBalance3", propOrder = {
    "finInstrmId",
    "qty",
    "collInd",
    "sfkpgPlc",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "sttlmSts",
    "dnmtnCcy",
    "ratgDtls",
    "fxDtls",
    "valtnDtls",
    "txLotNb"
})
public class SecuritiesBalance3 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Qty", required = true)
    protected BalanceQuantity13Choice qty;
    @XmlElement(name = "CollInd")
    protected Boolean collInd;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace3 sfkpgPlc;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification232 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "SttlmSts")
    @XmlSchemaType(name = "string")
    protected SecuritiesSettlementStatus3Code sttlmSts;
    @XmlElement(name = "DnmtnCcy")
    protected String dnmtnCcy;
    @XmlElement(name = "RatgDtls")
    protected List<Rating2> ratgDtls;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms19 fxDtls;
    @XmlElement(name = "ValtnDtls")
    protected ValuationsDetails1 valtnDtls;
    @XmlElement(name = "TxLotNb")
    protected List<GenericIdentification178> txLotNb;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecuritiesBalance3 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity13Choice }
     *     
     */
    public BalanceQuantity13Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity13Choice }
     *     
     */
    public SecuritiesBalance3 setQty(BalanceQuantity13Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the collInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollInd() {
        return collInd;
    }

    /**
     * Sets the value of the collInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesBalance3 setCollInd(Boolean value) {
        this.collInd = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public SafeKeepingPlace3 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public SecuritiesBalance3 setSfkpgPlc(SafeKeepingPlace3 value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public SecuritiesBalance3 setAcctOwnr(PartyIdentification232 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesBalance3 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public SecuritiesBalance3 setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementStatus3Code }
     *     
     */
    public SecuritiesSettlementStatus3Code getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementStatus3Code }
     *     
     */
    public SecuritiesBalance3 setSttlmSts(SecuritiesSettlementStatus3Code value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the dnmtnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnmtnCcy() {
        return dnmtnCcy;
    }

    /**
     * Sets the value of the dnmtnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesBalance3 setDnmtnCcy(String value) {
        this.dnmtnCcy = value;
        return this;
    }

    /**
     * Gets the value of the ratgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rating2 }
     * 
     * 
     */
    public List<Rating2> getRatgDtls() {
        if (ratgDtls == null) {
            ratgDtls = new ArrayList<Rating2>();
        }
        return this.ratgDtls;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public ForeignExchangeTerms19 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public SecuritiesBalance3 setFXDtls(ForeignExchangeTerms19 value) {
        this.fxDtls = value;
        return this;
    }

    /**
     * Gets the value of the valtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationsDetails1 }
     *     
     */
    public ValuationsDetails1 getValtnDtls() {
        return valtnDtls;
    }

    /**
     * Sets the value of the valtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationsDetails1 }
     *     
     */
    public SecuritiesBalance3 setValtnDtls(ValuationsDetails1 value) {
        this.valtnDtls = value;
        return this;
    }

    /**
     * Gets the value of the txLotNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txLotNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxLotNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification178 }
     * 
     * 
     */
    public List<GenericIdentification178> getTxLotNb() {
        if (txLotNb == null) {
            txLotNb = new ArrayList<GenericIdentification178>();
        }
        return this.txLotNb;
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
     * Adds a new item to the ratgDtls list.
     * @see #getRatgDtls()
     * 
     */
    public SecuritiesBalance3 addRatgDtls(Rating2 ratgDtls) {
        getRatgDtls().add(ratgDtls);
        return this;
    }

    /**
     * Adds a new item to the txLotNb list.
     * @see #getTxLotNb()
     * 
     */
    public SecuritiesBalance3 addTxLotNb(GenericIdentification178 txLotNb) {
        getTxLotNb().add(txLotNb);
        return this;
    }

}
