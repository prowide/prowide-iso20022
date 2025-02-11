
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
@XmlType(name = "CorporateActionBalanceDetails35", propOrder = {
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
public class CorporateActionBalanceDetails35 {

    @XmlElement(name = "ConfdBal", required = true)
    protected BalanceFormat7Choice confdBal;
    @XmlElement(name = "TtlElgblBal")
    protected TotalEligibleBalanceFormat9 ttlElgblBal;
    @XmlElement(name = "BlckdBal")
    protected BalanceFormat7Choice blckdBal;
    @XmlElement(name = "BrrwdBal")
    protected BalanceFormat7Choice brrwdBal;
    @XmlElement(name = "CollInBal")
    protected BalanceFormat7Choice collInBal;
    @XmlElement(name = "CollOutBal")
    protected BalanceFormat7Choice collOutBal;
    @XmlElement(name = "OnLnBal")
    protected BalanceFormat7Choice onLnBal;
    @XmlElement(name = "PdgDlvryBal")
    protected List<BalanceFormat10Choice> pdgDlvryBal;
    @XmlElement(name = "PdgRctBal")
    protected List<BalanceFormat10Choice> pdgRctBal;
    @XmlElement(name = "OutForRegnBal")
    protected BalanceFormat7Choice outForRegnBal;
    @XmlElement(name = "SttlmPosBal")
    protected List<BalanceFormat10Choice> sttlmPosBal;
    @XmlElement(name = "StrtPosBal")
    protected BalanceFormat7Choice strtPosBal;
    @XmlElement(name = "TradDtPosBal")
    protected BalanceFormat7Choice tradDtPosBal;
    @XmlElement(name = "InTrnsShipmntBal")
    protected BalanceFormat7Choice inTrnsShipmntBal;
    @XmlElement(name = "RegdBal")
    protected BalanceFormat7Choice regdBal;
    @XmlElement(name = "AfctdBal")
    protected BalanceFormat7Choice afctdBal;
    @XmlElement(name = "UafctdBal")
    protected BalanceFormat7Choice uafctdBal;

    /**
     * Gets the value of the confdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getConfdBal() {
        return confdBal;
    }

    /**
     * Sets the value of the confdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setConfdBal(BalanceFormat7Choice value) {
        this.confdBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link TotalEligibleBalanceFormat9 }
     *     
     */
    public TotalEligibleBalanceFormat9 getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalEligibleBalanceFormat9 }
     *     
     */
    public CorporateActionBalanceDetails35 setTtlElgblBal(TotalEligibleBalanceFormat9 value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the blckdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getBlckdBal() {
        return blckdBal;
    }

    /**
     * Sets the value of the blckdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setBlckdBal(BalanceFormat7Choice value) {
        this.blckdBal = value;
        return this;
    }

    /**
     * Gets the value of the brrwdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getBrrwdBal() {
        return brrwdBal;
    }

    /**
     * Sets the value of the brrwdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setBrrwdBal(BalanceFormat7Choice value) {
        this.brrwdBal = value;
        return this;
    }

    /**
     * Gets the value of the collInBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getCollInBal() {
        return collInBal;
    }

    /**
     * Sets the value of the collInBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setCollInBal(BalanceFormat7Choice value) {
        this.collInBal = value;
        return this;
    }

    /**
     * Gets the value of the collOutBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getCollOutBal() {
        return collOutBal;
    }

    /**
     * Sets the value of the collOutBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setCollOutBal(BalanceFormat7Choice value) {
        this.collOutBal = value;
        return this;
    }

    /**
     * Gets the value of the onLnBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getOnLnBal() {
        return onLnBal;
    }

    /**
     * Sets the value of the onLnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setOnLnBal(BalanceFormat7Choice value) {
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
     * {@link BalanceFormat10Choice }
     * 
     * 
     * @return
     *     The value of the pdgDlvryBal property.
     */
    public List<BalanceFormat10Choice> getPdgDlvryBal() {
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
     * {@link BalanceFormat10Choice }
     * 
     * 
     * @return
     *     The value of the pdgRctBal property.
     */
    public List<BalanceFormat10Choice> getPdgRctBal() {
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
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getOutForRegnBal() {
        return outForRegnBal;
    }

    /**
     * Sets the value of the outForRegnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setOutForRegnBal(BalanceFormat7Choice value) {
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
     * {@link BalanceFormat10Choice }
     * 
     * 
     * @return
     *     The value of the sttlmPosBal property.
     */
    public List<BalanceFormat10Choice> getSttlmPosBal() {
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
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getStrtPosBal() {
        return strtPosBal;
    }

    /**
     * Sets the value of the strtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setStrtPosBal(BalanceFormat7Choice value) {
        this.strtPosBal = value;
        return this;
    }

    /**
     * Gets the value of the tradDtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getTradDtPosBal() {
        return tradDtPosBal;
    }

    /**
     * Sets the value of the tradDtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setTradDtPosBal(BalanceFormat7Choice value) {
        this.tradDtPosBal = value;
        return this;
    }

    /**
     * Gets the value of the inTrnsShipmntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getInTrnsShipmntBal() {
        return inTrnsShipmntBal;
    }

    /**
     * Sets the value of the inTrnsShipmntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setInTrnsShipmntBal(BalanceFormat7Choice value) {
        this.inTrnsShipmntBal = value;
        return this;
    }

    /**
     * Gets the value of the regdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getRegdBal() {
        return regdBal;
    }

    /**
     * Sets the value of the regdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setRegdBal(BalanceFormat7Choice value) {
        this.regdBal = value;
        return this;
    }

    /**
     * Gets the value of the afctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getAfctdBal() {
        return afctdBal;
    }

    /**
     * Sets the value of the afctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setAfctdBal(BalanceFormat7Choice value) {
        this.afctdBal = value;
        return this;
    }

    /**
     * Gets the value of the uafctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getUafctdBal() {
        return uafctdBal;
    }

    /**
     * Sets the value of the uafctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails35 setUafctdBal(BalanceFormat7Choice value) {
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
    public CorporateActionBalanceDetails35 addPdgDlvryBal(BalanceFormat10Choice pdgDlvryBal) {
        getPdgDlvryBal().add(pdgDlvryBal);
        return this;
    }

    /**
     * Adds a new item to the pdgRctBal list.
     * @see #getPdgRctBal()
     * 
     */
    public CorporateActionBalanceDetails35 addPdgRctBal(BalanceFormat10Choice pdgRctBal) {
        getPdgRctBal().add(pdgRctBal);
        return this;
    }

    /**
     * Adds a new item to the sttlmPosBal list.
     * @see #getSttlmPosBal()
     * 
     */
    public CorporateActionBalanceDetails35 addSttlmPosBal(BalanceFormat10Choice sttlmPosBal) {
        getSttlmPosBal().add(sttlmPosBal);
        return this;
    }

}
