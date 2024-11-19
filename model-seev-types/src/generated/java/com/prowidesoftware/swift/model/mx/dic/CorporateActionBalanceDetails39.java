
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
@XmlType(name = "CorporateActionBalanceDetails39", propOrder = {
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
public class CorporateActionBalanceDetails39 {

    @XmlElement(name = "TtlElgblBal", required = true)
    protected Quantity17Choice ttlElgblBal;
    @XmlElement(name = "UinstdBal", required = true)
    protected BalanceFormat5Choice uinstdBal;
    @XmlElement(name = "TtlInstdBalDtls", required = true)
    protected InstructedBalanceDetails9 ttlInstdBalDtls;
    @XmlElement(name = "BlckdBal")
    protected SignedQuantityFormat6 blckdBal;
    @XmlElement(name = "BrrwdBal")
    protected SignedQuantityFormat6 brrwdBal;
    @XmlElement(name = "CollInBal")
    protected SignedQuantityFormat6 collInBal;
    @XmlElement(name = "CollOutBal")
    protected SignedQuantityFormat6 collOutBal;
    @XmlElement(name = "OnLnBal")
    protected SignedQuantityFormat6 onLnBal;
    @XmlElement(name = "OutForRegnBal")
    protected SignedQuantityFormat6 outForRegnBal;
    @XmlElement(name = "SttlmPosBal")
    protected SignedQuantityFormat6 sttlmPosBal;
    @XmlElement(name = "StrtPosBal")
    protected SignedQuantityFormat6 strtPosBal;
    @XmlElement(name = "TradDtPosBal")
    protected SignedQuantityFormat6 tradDtPosBal;
    @XmlElement(name = "InTrnsShipmntBal")
    protected SignedQuantityFormat6 inTrnsShipmntBal;
    @XmlElement(name = "RegdBal")
    protected SignedQuantityFormat6 regdBal;
    @XmlElement(name = "OblgtdBal")
    protected SignedQuantityFormat6 oblgtdBal;
    @XmlElement(name = "PdgDlvryBal")
    protected List<PendingBalance5> pdgDlvryBal;
    @XmlElement(name = "PdgRctBal")
    protected List<PendingBalance5> pdgRctBal;

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity17Choice }
     *     
     */
    public Quantity17Choice getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity17Choice }
     *     
     */
    public CorporateActionBalanceDetails39 setTtlElgblBal(Quantity17Choice value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public BalanceFormat5Choice getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat5Choice }
     *     
     */
    public CorporateActionBalanceDetails39 setUinstdBal(BalanceFormat5Choice value) {
        this.uinstdBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlInstdBalDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InstructedBalanceDetails9 }
     *     
     */
    public InstructedBalanceDetails9 getTtlInstdBalDtls() {
        return ttlInstdBalDtls;
    }

    /**
     * Sets the value of the ttlInstdBalDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructedBalanceDetails9 }
     *     
     */
    public CorporateActionBalanceDetails39 setTtlInstdBalDtls(InstructedBalanceDetails9 value) {
        this.ttlInstdBalDtls = value;
        return this;
    }

    /**
     * Gets the value of the blckdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getBlckdBal() {
        return blckdBal;
    }

    /**
     * Sets the value of the blckdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public CorporateActionBalanceDetails39 setBlckdBal(SignedQuantityFormat6 value) {
        this.blckdBal = value;
        return this;
    }

    /**
     * Gets the value of the brrwdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getBrrwdBal() {
        return brrwdBal;
    }

    /**
     * Sets the value of the brrwdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public CorporateActionBalanceDetails39 setBrrwdBal(SignedQuantityFormat6 value) {
        this.brrwdBal = value;
        return this;
    }

    /**
     * Gets the value of the collInBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getCollInBal() {
        return collInBal;
    }

    /**
     * Sets the value of the collInBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public CorporateActionBalanceDetails39 setCollInBal(SignedQuantityFormat6 value) {
        this.collInBal = value;
        return this;
    }

    /**
     * Gets the value of the collOutBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getCollOutBal() {
        return collOutBal;
    }

    /**
     * Sets the value of the collOutBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public CorporateActionBalanceDetails39 setCollOutBal(SignedQuantityFormat6 value) {
        this.collOutBal = value;
        return this;
    }

    /**
     * Gets the value of the onLnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getOnLnBal() {
        return onLnBal;
    }

    /**
     * Sets the value of the onLnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public CorporateActionBalanceDetails39 setOnLnBal(SignedQuantityFormat6 value) {
        this.onLnBal = value;
        return this;
    }

    /**
     * Gets the value of the outForRegnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getOutForRegnBal() {
        return outForRegnBal;
    }

    /**
     * Sets the value of the outForRegnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public CorporateActionBalanceDetails39 setOutForRegnBal(SignedQuantityFormat6 value) {
        this.outForRegnBal = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getSttlmPosBal() {
        return sttlmPosBal;
    }

    /**
     * Sets the value of the sttlmPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public CorporateActionBalanceDetails39 setSttlmPosBal(SignedQuantityFormat6 value) {
        this.sttlmPosBal = value;
        return this;
    }

    /**
     * Gets the value of the strtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getStrtPosBal() {
        return strtPosBal;
    }

    /**
     * Sets the value of the strtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public CorporateActionBalanceDetails39 setStrtPosBal(SignedQuantityFormat6 value) {
        this.strtPosBal = value;
        return this;
    }

    /**
     * Gets the value of the tradDtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getTradDtPosBal() {
        return tradDtPosBal;
    }

    /**
     * Sets the value of the tradDtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public CorporateActionBalanceDetails39 setTradDtPosBal(SignedQuantityFormat6 value) {
        this.tradDtPosBal = value;
        return this;
    }

    /**
     * Gets the value of the inTrnsShipmntBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getInTrnsShipmntBal() {
        return inTrnsShipmntBal;
    }

    /**
     * Sets the value of the inTrnsShipmntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public CorporateActionBalanceDetails39 setInTrnsShipmntBal(SignedQuantityFormat6 value) {
        this.inTrnsShipmntBal = value;
        return this;
    }

    /**
     * Gets the value of the regdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getRegdBal() {
        return regdBal;
    }

    /**
     * Sets the value of the regdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public CorporateActionBalanceDetails39 setRegdBal(SignedQuantityFormat6 value) {
        this.regdBal = value;
        return this;
    }

    /**
     * Gets the value of the oblgtdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public SignedQuantityFormat6 getOblgtdBal() {
        return oblgtdBal;
    }

    /**
     * Sets the value of the oblgtdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat6 }
     *     
     */
    public CorporateActionBalanceDetails39 setOblgtdBal(SignedQuantityFormat6 value) {
        this.oblgtdBal = value;
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
     * {@link PendingBalance5 }
     * 
     * 
     * @return
     *     The value of the pdgDlvryBal property.
     */
    public List<PendingBalance5> getPdgDlvryBal() {
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
     * {@link PendingBalance5 }
     * 
     * 
     * @return
     *     The value of the pdgRctBal property.
     */
    public List<PendingBalance5> getPdgRctBal() {
        if (pdgRctBal == null) {
            pdgRctBal = new ArrayList<>();
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
    public CorporateActionBalanceDetails39 addPdgDlvryBal(PendingBalance5 pdgDlvryBal) {
        getPdgDlvryBal().add(pdgDlvryBal);
        return this;
    }

    /**
     * Adds a new item to the pdgRctBal list.
     * @see #getPdgRctBal()
     * 
     */
    public CorporateActionBalanceDetails39 addPdgRctBal(PendingBalance5 pdgRctBal) {
        getPdgRctBal().add(pdgRctBal);
        return this;
    }

}
