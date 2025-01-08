
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
@XmlType(name = "CorporateActionBalanceDetails33", propOrder = {
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
public class CorporateActionBalanceDetails33 {

    @XmlElement(name = "TtlElgblBal", required = true)
    protected Quantity22Choice ttlElgblBal;
    @XmlElement(name = "UinstdBal", required = true)
    protected BalanceFormat7Choice uinstdBal;
    @XmlElement(name = "TtlInstdBalDtls", required = true)
    protected InstructedBalanceDetails6 ttlInstdBalDtls;
    @XmlElement(name = "BlckdBal")
    protected SignedQuantityFormat9 blckdBal;
    @XmlElement(name = "BrrwdBal")
    protected SignedQuantityFormat9 brrwdBal;
    @XmlElement(name = "CollInBal")
    protected SignedQuantityFormat9 collInBal;
    @XmlElement(name = "CollOutBal")
    protected SignedQuantityFormat9 collOutBal;
    @XmlElement(name = "OnLnBal")
    protected SignedQuantityFormat9 onLnBal;
    @XmlElement(name = "OutForRegnBal")
    protected SignedQuantityFormat9 outForRegnBal;
    @XmlElement(name = "SttlmPosBal")
    protected SignedQuantityFormat9 sttlmPosBal;
    @XmlElement(name = "StrtPosBal")
    protected SignedQuantityFormat9 strtPosBal;
    @XmlElement(name = "TradDtPosBal")
    protected SignedQuantityFormat9 tradDtPosBal;
    @XmlElement(name = "InTrnsShipmntBal")
    protected SignedQuantityFormat9 inTrnsShipmntBal;
    @XmlElement(name = "RegdBal")
    protected SignedQuantityFormat9 regdBal;
    @XmlElement(name = "OblgtdBal")
    protected SignedQuantityFormat9 oblgtdBal;
    @XmlElement(name = "PdgDlvryBal")
    protected List<PendingBalance4> pdgDlvryBal;
    @XmlElement(name = "PdgRctBal")
    protected List<PendingBalance4> pdgRctBal;

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity22Choice }
     *     
     */
    public Quantity22Choice getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity22Choice }
     *     
     */
    public CorporateActionBalanceDetails33 setTtlElgblBal(Quantity22Choice value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the uinstdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public BalanceFormat7Choice getUinstdBal() {
        return uinstdBal;
    }

    /**
     * Sets the value of the uinstdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat7Choice }
     *     
     */
    public CorporateActionBalanceDetails33 setUinstdBal(BalanceFormat7Choice value) {
        this.uinstdBal = value;
        return this;
    }

    /**
     * Gets the value of the ttlInstdBalDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InstructedBalanceDetails6 }
     *     
     */
    public InstructedBalanceDetails6 getTtlInstdBalDtls() {
        return ttlInstdBalDtls;
    }

    /**
     * Sets the value of the ttlInstdBalDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructedBalanceDetails6 }
     *     
     */
    public CorporateActionBalanceDetails33 setTtlInstdBalDtls(InstructedBalanceDetails6 value) {
        this.ttlInstdBalDtls = value;
        return this;
    }

    /**
     * Gets the value of the blckdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getBlckdBal() {
        return blckdBal;
    }

    /**
     * Sets the value of the blckdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceDetails33 setBlckdBal(SignedQuantityFormat9 value) {
        this.blckdBal = value;
        return this;
    }

    /**
     * Gets the value of the brrwdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getBrrwdBal() {
        return brrwdBal;
    }

    /**
     * Sets the value of the brrwdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceDetails33 setBrrwdBal(SignedQuantityFormat9 value) {
        this.brrwdBal = value;
        return this;
    }

    /**
     * Gets the value of the collInBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getCollInBal() {
        return collInBal;
    }

    /**
     * Sets the value of the collInBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceDetails33 setCollInBal(SignedQuantityFormat9 value) {
        this.collInBal = value;
        return this;
    }

    /**
     * Gets the value of the collOutBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getCollOutBal() {
        return collOutBal;
    }

    /**
     * Sets the value of the collOutBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceDetails33 setCollOutBal(SignedQuantityFormat9 value) {
        this.collOutBal = value;
        return this;
    }

    /**
     * Gets the value of the onLnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOnLnBal() {
        return onLnBal;
    }

    /**
     * Sets the value of the onLnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceDetails33 setOnLnBal(SignedQuantityFormat9 value) {
        this.onLnBal = value;
        return this;
    }

    /**
     * Gets the value of the outForRegnBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOutForRegnBal() {
        return outForRegnBal;
    }

    /**
     * Sets the value of the outForRegnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceDetails33 setOutForRegnBal(SignedQuantityFormat9 value) {
        this.outForRegnBal = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getSttlmPosBal() {
        return sttlmPosBal;
    }

    /**
     * Sets the value of the sttlmPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceDetails33 setSttlmPosBal(SignedQuantityFormat9 value) {
        this.sttlmPosBal = value;
        return this;
    }

    /**
     * Gets the value of the strtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getStrtPosBal() {
        return strtPosBal;
    }

    /**
     * Sets the value of the strtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceDetails33 setStrtPosBal(SignedQuantityFormat9 value) {
        this.strtPosBal = value;
        return this;
    }

    /**
     * Gets the value of the tradDtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getTradDtPosBal() {
        return tradDtPosBal;
    }

    /**
     * Sets the value of the tradDtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceDetails33 setTradDtPosBal(SignedQuantityFormat9 value) {
        this.tradDtPosBal = value;
        return this;
    }

    /**
     * Gets the value of the inTrnsShipmntBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getInTrnsShipmntBal() {
        return inTrnsShipmntBal;
    }

    /**
     * Sets the value of the inTrnsShipmntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceDetails33 setInTrnsShipmntBal(SignedQuantityFormat9 value) {
        this.inTrnsShipmntBal = value;
        return this;
    }

    /**
     * Gets the value of the regdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getRegdBal() {
        return regdBal;
    }

    /**
     * Sets the value of the regdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceDetails33 setRegdBal(SignedQuantityFormat9 value) {
        this.regdBal = value;
        return this;
    }

    /**
     * Gets the value of the oblgtdBal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public SignedQuantityFormat9 getOblgtdBal() {
        return oblgtdBal;
    }

    /**
     * Sets the value of the oblgtdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat9 }
     *     
     */
    public CorporateActionBalanceDetails33 setOblgtdBal(SignedQuantityFormat9 value) {
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
     * {@link PendingBalance4 }
     * 
     * 
     * @return
     *     The value of the pdgDlvryBal property.
     */
    public List<PendingBalance4> getPdgDlvryBal() {
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
     * {@link PendingBalance4 }
     * 
     * 
     * @return
     *     The value of the pdgRctBal property.
     */
    public List<PendingBalance4> getPdgRctBal() {
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
    public CorporateActionBalanceDetails33 addPdgDlvryBal(PendingBalance4 pdgDlvryBal) {
        getPdgDlvryBal().add(pdgDlvryBal);
        return this;
    }

    /**
     * Adds a new item to the pdgRctBal list.
     * @see #getPdgRctBal()
     * 
     */
    public CorporateActionBalanceDetails33 addPdgRctBal(PendingBalance4 pdgRctBal) {
        getPdgRctBal().add(pdgRctBal);
        return this;
    }

}
