
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
 * Eligible and not eligible balance of securities for a corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionBalanceDetails31", propOrder = {
    "confdBal",
    "ttlElgblBal",
    "blckdBal",
    "brrwdBal",
    "collInBal",
    "collOutBal",
    "onLnBal",
    "pdgDlvryBal",
    "pdgRctBal",
    "outForRegnBal",
    "sttlmPosBal",
    "strtPosBal",
    "tradDtPosBal",
    "inTrnsShipmntBal",
    "regdBal",
    "afctdBal",
    "uafctdBal"
})
public class CorporateActionBalanceDetails31 {

    @XmlElement(name = "ConfdBal", required = true)
    protected BalanceFormat5Choice confdBal;
    @XmlElement(name = "TtlElgblBal")
    protected TotalEligibleBalanceFormat8 ttlElgblBal;
    @XmlElement(name = "BlckdBal")
    protected BalanceFormat5Choice blckdBal;
    @XmlElement(name = "BrrwdBal")
    protected BalanceFormat5Choice brrwdBal;
    @XmlElement(name = "CollInBal")
    protected BalanceFormat5Choice collInBal;
    @XmlElement(name = "CollOutBal")
    protected BalanceFormat5Choice collOutBal;
    @XmlElement(name = "OnLnBal")
    protected BalanceFormat5Choice onLnBal;
    @XmlElement(name = "PdgDlvryBal")
    protected List<BalanceFormat6Choice> pdgDlvryBal;
    @XmlElement(name = "PdgRctBal")
    protected List<BalanceFormat6Choice> pdgRctBal;
    @XmlElement(name = "OutForRegnBal")
    protected BalanceFormat5Choice outForRegnBal;
    @XmlElement(name = "SttlmPosBal")
    protected List<BalanceFormat6Choice> sttlmPosBal;
    @XmlElement(name = "StrtPosBal")
    protected BalanceFormat5Choice strtPosBal;
    @XmlElement(name = "TradDtPosBal")
    protected BalanceFormat5Choice tradDtPosBal;
    @XmlElement(name = "InTrnsShipmntBal")
    protected BalanceFormat5Choice inTrnsShipmntBal;
    @XmlElement(name = "RegdBal")
    protected BalanceFormat5Choice regdBal;
    @XmlElement(name = "AfctdBal")
    protected BalanceFormat5Choice afctdBal;
    @XmlElement(name = "UafctdBal")
    protected BalanceFormat5Choice uafctdBal;

    /**
     * Gets the value of the confdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getConfdBal() {
        return confdBal;
    }

    /**
     * Sets the value of the confdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setConfdBal(BalanceFormat5Choice value) {
        this.confdBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link TotalEligibleBalanceFormat8 }
     *     
     */
    public TotalEligibleBalanceFormat8 getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalEligibleBalanceFormat8 }
     *     
     */
    public CorporateActionBalanceDetails31 setTtlElgblBal(TotalEligibleBalanceFormat8 value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the blckdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getBlckdBal() {
        return blckdBal;
    }

    /**
     * Sets the value of the blckdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setBlckdBal(BalanceFormat5Choice value) {
        this.blckdBal = value;
        return this;
    }

    /**
     * Gets the value of the brrwdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getBrrwdBal() {
        return brrwdBal;
    }

    /**
     * Sets the value of the brrwdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setBrrwdBal(BalanceFormat5Choice value) {
        this.brrwdBal = value;
        return this;
    }

    /**
     * Gets the value of the collInBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getCollInBal() {
        return collInBal;
    }

    /**
     * Sets the value of the collInBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setCollInBal(BalanceFormat5Choice value) {
        this.collInBal = value;
        return this;
    }

    /**
     * Gets the value of the collOutBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getCollOutBal() {
        return collOutBal;
    }

    /**
     * Sets the value of the collOutBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setCollOutBal(BalanceFormat5Choice value) {
        this.collOutBal = value;
        return this;
    }

    /**
     * Gets the value of the onLnBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getOnLnBal() {
        return onLnBal;
    }

    /**
     * Sets the value of the onLnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setOnLnBal(BalanceFormat5Choice value) {
        this.onLnBal = value;
        return this;
    }

    /**
     * Gets the value of the pdgDlvryBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdgDlvryBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdgDlvryBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceFormat6Choice }
     * 
     * 
     * @return
     *     The value of the pdgDlvryBal property.
     */
    public List<BalanceFormat6Choice> getPdgDlvryBal() {
        if (pdgDlvryBal == null) {
            pdgDlvryBal = new ArrayList<>();
        }
        return this.pdgDlvryBal;
    }

    /**
     * Gets the value of the pdgRctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdgRctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdgRctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceFormat6Choice }
     * 
     * 
     * @return
     *     The value of the pdgRctBal property.
     */
    public List<BalanceFormat6Choice> getPdgRctBal() {
        if (pdgRctBal == null) {
            pdgRctBal = new ArrayList<>();
        }
        return this.pdgRctBal;
    }

    /**
     * Gets the value of the outForRegnBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getOutForRegnBal() {
        return outForRegnBal;
    }

    /**
     * Sets the value of the outForRegnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setOutForRegnBal(BalanceFormat5Choice value) {
        this.outForRegnBal = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPosBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmPosBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmPosBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceFormat6Choice }
     * 
     * 
     * @return
     *     The value of the sttlmPosBal property.
     */
    public List<BalanceFormat6Choice> getSttlmPosBal() {
        if (sttlmPosBal == null) {
            sttlmPosBal = new ArrayList<>();
        }
        return this.sttlmPosBal;
    }

    /**
     * Gets the value of the strtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getStrtPosBal() {
        return strtPosBal;
    }

    /**
     * Sets the value of the strtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setStrtPosBal(BalanceFormat5Choice value) {
        this.strtPosBal = value;
        return this;
    }

    /**
     * Gets the value of the tradDtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getTradDtPosBal() {
        return tradDtPosBal;
    }

    /**
     * Sets the value of the tradDtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setTradDtPosBal(BalanceFormat5Choice value) {
        this.tradDtPosBal = value;
        return this;
    }

    /**
     * Gets the value of the inTrnsShipmntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getInTrnsShipmntBal() {
        return inTrnsShipmntBal;
    }

    /**
     * Sets the value of the inTrnsShipmntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setInTrnsShipmntBal(BalanceFormat5Choice value) {
        this.inTrnsShipmntBal = value;
        return this;
    }

    /**
     * Gets the value of the regdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getRegdBal() {
        return regdBal;
    }

    /**
     * Sets the value of the regdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setRegdBal(BalanceFormat5Choice value) {
        this.regdBal = value;
        return this;
    }

    /**
     * Gets the value of the afctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getAfctdBal() {
        return afctdBal;
    }

    /**
     * Sets the value of the afctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setAfctdBal(BalanceFormat5Choice value) {
        this.afctdBal = value;
        return this;
    }

    /**
     * Gets the value of the uafctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getUafctdBal() {
        return uafctdBal;
    }

    /**
     * Sets the value of the uafctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails31 setUafctdBal(BalanceFormat5Choice value) {
        this.uafctdBal = value;
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
     * Adds a new item to the pdgDlvryBal list.
     * @see #getPdgDlvryBal()
     * 
     */
    public CorporateActionBalanceDetails31 addPdgDlvryBal(BalanceFormat6Choice pdgDlvryBal) {
        getPdgDlvryBal().add(pdgDlvryBal);
        return this;
    }

    /**
     * Adds a new item to the pdgRctBal list.
     * @see #getPdgRctBal()
     * 
     */
    public CorporateActionBalanceDetails31 addPdgRctBal(BalanceFormat6Choice pdgRctBal) {
        getPdgRctBal().add(pdgRctBal);
        return this;
    }

    /**
     * Adds a new item to the sttlmPosBal list.
     * @see #getSttlmPosBal()
     * 
     */
    public CorporateActionBalanceDetails31 addSttlmPosBal(BalanceFormat6Choice sttlmPosBal) {
        getSttlmPosBal().add(sttlmPosBal);
        return this;
    }

}
