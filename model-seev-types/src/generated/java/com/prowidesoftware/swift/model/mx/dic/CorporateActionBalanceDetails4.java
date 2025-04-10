
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
 * Eligible and not eligible balance of securities for a corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionBalanceDetails4", propOrder = {
    "ttlElgblBal",
    "uinstdBal",
    "ttlInstdBalDtls",
    "blckdBal",
    "brrwdBal",
    "collInBal",
    "collOutBal",
    "onLnBal",
    "outForRegnBal",
    "sttlmPosBal",
    "strtPosBal",
    "tradDtPosBal",
    "inTrnsShipmntBal",
    "regdBal",
    "oblgtdBal",
    "pdgDlvryBal",
    "pdgRctBal"
})
public class CorporateActionBalanceDetails4 {

    @XmlElement(name = "TtlElgblBal", required = true)
    protected Quantity3Choice ttlElgblBal;
    @XmlElement(name = "UinstdBal", required = true)
    protected BalanceFormat1Choice uinstdBal;
    @XmlElement(name = "TtlInstdBalDtls", required = true)
    protected InstructedBalanceDetails1 ttlInstdBalDtls;
    @XmlElement(name = "BlckdBal")
    protected SignedQuantityFormat2 blckdBal;
    @XmlElement(name = "BrrwdBal")
    protected SignedQuantityFormat2 brrwdBal;
    @XmlElement(name = "CollInBal")
    protected SignedQuantityFormat2 collInBal;
    @XmlElement(name = "CollOutBal")
    protected SignedQuantityFormat2 collOutBal;
    @XmlElement(name = "OnLnBal")
    protected SignedQuantityFormat2 onLnBal;
    @XmlElement(name = "OutForRegnBal")
    protected SignedQuantityFormat2 outForRegnBal;
    @XmlElement(name = "SttlmPosBal")
    protected SignedQuantityFormat2 sttlmPosBal;
    @XmlElement(name = "StrtPosBal")
    protected SignedQuantityFormat2 strtPosBal;
    @XmlElement(name = "TradDtPosBal")
    protected SignedQuantityFormat2 tradDtPosBal;
    @XmlElement(name = "InTrnsShipmntBal")
    protected SignedQuantityFormat2 inTrnsShipmntBal;
    @XmlElement(name = "RegdBal")
    protected SignedQuantityFormat2 regdBal;
    @XmlElement(name = "OblgtdBal")
    protected SignedQuantityFormat2 oblgtdBal;
    @XmlElement(name = "PdgDlvryBal")
    protected List<PendingBalance1> pdgDlvryBal;
    @XmlElement(name = "PdgRctBal")
    protected List<PendingBalance1> pdgRctBal;

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity3Choice }
     *     
     */
    public Quantity3Choice getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity3Choice }
     *     
     */
    public CorporateActionBalanceDetails4 setTtlElgblBal(Quantity3Choice value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails4 setUinstdBal(BalanceFormat1Choice value) {
        this.uinstdBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlInstdBalDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InstructedBalanceDetails1 }
     *     
     */
    public InstructedBalanceDetails1 getTtlInstdBalDtls() {
        return ttlInstdBalDtls;
    }

    /**
     * Sets the value of the ttlInstdBalDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructedBalanceDetails1 }
     *     
     */
    public CorporateActionBalanceDetails4 setTtlInstdBalDtls(InstructedBalanceDetails1 value) {
        this.ttlInstdBalDtls = value;
        return this;
    }

    /**
     * Gets the value of the blckdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getBlckdBal() {
        return blckdBal;
    }

    /**
     * Sets the value of the blckdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public CorporateActionBalanceDetails4 setBlckdBal(SignedQuantityFormat2 value) {
        this.blckdBal = value;
        return this;
    }

    /**
     * Gets the value of the brrwdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getBrrwdBal() {
        return brrwdBal;
    }

    /**
     * Sets the value of the brrwdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public CorporateActionBalanceDetails4 setBrrwdBal(SignedQuantityFormat2 value) {
        this.brrwdBal = value;
        return this;
    }

    /**
     * Gets the value of the collInBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getCollInBal() {
        return collInBal;
    }

    /**
     * Sets the value of the collInBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public CorporateActionBalanceDetails4 setCollInBal(SignedQuantityFormat2 value) {
        this.collInBal = value;
        return this;
    }

    /**
     * Gets the value of the collOutBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getCollOutBal() {
        return collOutBal;
    }

    /**
     * Sets the value of the collOutBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public CorporateActionBalanceDetails4 setCollOutBal(SignedQuantityFormat2 value) {
        this.collOutBal = value;
        return this;
    }

    /**
     * Gets the value of the onLnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getOnLnBal() {
        return onLnBal;
    }

    /**
     * Sets the value of the onLnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public CorporateActionBalanceDetails4 setOnLnBal(SignedQuantityFormat2 value) {
        this.onLnBal = value;
        return this;
    }

    /**
     * Gets the value of the outForRegnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getOutForRegnBal() {
        return outForRegnBal;
    }

    /**
     * Sets the value of the outForRegnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public CorporateActionBalanceDetails4 setOutForRegnBal(SignedQuantityFormat2 value) {
        this.outForRegnBal = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getSttlmPosBal() {
        return sttlmPosBal;
    }

    /**
     * Sets the value of the sttlmPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public CorporateActionBalanceDetails4 setSttlmPosBal(SignedQuantityFormat2 value) {
        this.sttlmPosBal = value;
        return this;
    }

    /**
     * Gets the value of the strtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getStrtPosBal() {
        return strtPosBal;
    }

    /**
     * Sets the value of the strtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public CorporateActionBalanceDetails4 setStrtPosBal(SignedQuantityFormat2 value) {
        this.strtPosBal = value;
        return this;
    }

    /**
     * Gets the value of the tradDtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getTradDtPosBal() {
        return tradDtPosBal;
    }

    /**
     * Sets the value of the tradDtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public CorporateActionBalanceDetails4 setTradDtPosBal(SignedQuantityFormat2 value) {
        this.tradDtPosBal = value;
        return this;
    }

    /**
     * Gets the value of the inTrnsShipmntBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getInTrnsShipmntBal() {
        return inTrnsShipmntBal;
    }

    /**
     * Sets the value of the inTrnsShipmntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public CorporateActionBalanceDetails4 setInTrnsShipmntBal(SignedQuantityFormat2 value) {
        this.inTrnsShipmntBal = value;
        return this;
    }

    /**
     * Gets the value of the regdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getRegdBal() {
        return regdBal;
    }

    /**
     * Sets the value of the regdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public CorporateActionBalanceDetails4 setRegdBal(SignedQuantityFormat2 value) {
        this.regdBal = value;
        return this;
    }

    /**
     * Gets the value of the oblgtdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public SignedQuantityFormat2 getOblgtdBal() {
        return oblgtdBal;
    }

    /**
     * Sets the value of the oblgtdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat2 }
     *     
     */
    public CorporateActionBalanceDetails4 setOblgtdBal(SignedQuantityFormat2 value) {
        this.oblgtdBal = value;
        return this;
    }

    /**
     * Gets the value of the pdgDlvryBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdgDlvryBal property.
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
     * {@link PendingBalance1 }
     * 
     * 
     */
    public List<PendingBalance1> getPdgDlvryBal() {
        if (pdgDlvryBal == null) {
            pdgDlvryBal = new ArrayList<PendingBalance1>();
        }
        return this.pdgDlvryBal;
    }

    /**
     * Gets the value of the pdgRctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdgRctBal property.
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
     * {@link PendingBalance1 }
     * 
     * 
     */
    public List<PendingBalance1> getPdgRctBal() {
        if (pdgRctBal == null) {
            pdgRctBal = new ArrayList<PendingBalance1>();
        }
        return this.pdgRctBal;
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
    public CorporateActionBalanceDetails4 addPdgDlvryBal(PendingBalance1 pdgDlvryBal) {
        getPdgDlvryBal().add(pdgDlvryBal);
        return this;
    }

    /**
     * Adds a new item to the pdgRctBal list.
     * @see #getPdgRctBal()
     * 
     */
    public CorporateActionBalanceDetails4 addPdgRctBal(PendingBalance1 pdgRctBal) {
        getPdgRctBal().add(pdgRctBal);
        return this;
    }

}
