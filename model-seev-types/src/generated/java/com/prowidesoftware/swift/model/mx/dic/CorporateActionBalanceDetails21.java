
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
@XmlType(name = "CorporateActionBalanceDetails21", propOrder = {
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
    "oblgtdBal",
    "uinstdBal",
    "instdBal",
    "afctdBal",
    "uafctdBal"
})
public class CorporateActionBalanceDetails21 {

    @XmlElement(name = "TtlElgblBal")
    protected TotalEligibleBalanceFormat1 ttlElgblBal;
    @XmlElement(name = "BlckdBal")
    protected BalanceFormat1Choice blckdBal;
    @XmlElement(name = "BrrwdBal")
    protected BalanceFormat1Choice brrwdBal;
    @XmlElement(name = "CollInBal")
    protected BalanceFormat1Choice collInBal;
    @XmlElement(name = "CollOutBal")
    protected BalanceFormat1Choice collOutBal;
    @XmlElement(name = "OnLnBal")
    protected BalanceFormat1Choice onLnBal;
    @XmlElement(name = "PdgDlvryBal")
    protected List<BalanceFormat3Choice> pdgDlvryBal;
    @XmlElement(name = "PdgRctBal")
    protected List<BalanceFormat3Choice> pdgRctBal;
    @XmlElement(name = "OutForRegnBal")
    protected BalanceFormat1Choice outForRegnBal;
    @XmlElement(name = "SttlmPosBal")
    protected List<BalanceFormat3Choice> sttlmPosBal;
    @XmlElement(name = "StrtPosBal")
    protected BalanceFormat1Choice strtPosBal;
    @XmlElement(name = "TradDtPosBal")
    protected BalanceFormat1Choice tradDtPosBal;
    @XmlElement(name = "InTrnsShipmntBal")
    protected BalanceFormat1Choice inTrnsShipmntBal;
    @XmlElement(name = "RegdBal")
    protected BalanceFormat1Choice regdBal;
    @XmlElement(name = "OblgtdBal")
    protected BalanceFormat1Choice oblgtdBal;
    @XmlElement(name = "UinstdBal")
    protected BalanceFormat1Choice uinstdBal;
    @XmlElement(name = "InstdBal")
    protected BalanceFormat1Choice instdBal;
    @XmlElement(name = "AfctdBal")
    protected BalanceFormat1Choice afctdBal;
    @XmlElement(name = "UafctdBal")
    protected BalanceFormat1Choice uafctdBal;

    /**
     * Gets the value of the ttlElgblBal property.
     * 
     * @return
     *     possible object is
     *     {@link TotalEligibleBalanceFormat1 }
     *     
     */
    public TotalEligibleBalanceFormat1 getTtlElgblBal() {
        return ttlElgblBal;
    }

    /**
     * Sets the value of the ttlElgblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalEligibleBalanceFormat1 }
     *     
     */
    public CorporateActionBalanceDetails21 setTtlElgblBal(TotalEligibleBalanceFormat1 value) {
        this.ttlElgblBal = value;
        return this;
    }

    /**
     * Gets the value of the blckdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getBlckdBal() {
        return blckdBal;
    }

    /**
     * Sets the value of the blckdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setBlckdBal(BalanceFormat1Choice value) {
        this.blckdBal = value;
        return this;
    }

    /**
     * Gets the value of the brrwdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getBrrwdBal() {
        return brrwdBal;
    }

    /**
     * Sets the value of the brrwdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setBrrwdBal(BalanceFormat1Choice value) {
        this.brrwdBal = value;
        return this;
    }

    /**
     * Gets the value of the collInBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getCollInBal() {
        return collInBal;
    }

    /**
     * Sets the value of the collInBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setCollInBal(BalanceFormat1Choice value) {
        this.collInBal = value;
        return this;
    }

    /**
     * Gets the value of the collOutBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getCollOutBal() {
        return collOutBal;
    }

    /**
     * Sets the value of the collOutBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setCollOutBal(BalanceFormat1Choice value) {
        this.collOutBal = value;
        return this;
    }

    /**
     * Gets the value of the onLnBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getOnLnBal() {
        return onLnBal;
    }

    /**
     * Sets the value of the onLnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setOnLnBal(BalanceFormat1Choice value) {
        this.onLnBal = value;
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
     * {@link BalanceFormat3Choice }
     * 
     * 
     */
    public List<BalanceFormat3Choice> getPdgDlvryBal() {
        if (pdgDlvryBal == null) {
            pdgDlvryBal = new ArrayList<BalanceFormat3Choice>();
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
     * {@link BalanceFormat3Choice }
     * 
     * 
     */
    public List<BalanceFormat3Choice> getPdgRctBal() {
        if (pdgRctBal == null) {
            pdgRctBal = new ArrayList<BalanceFormat3Choice>();
        }
        return this.pdgRctBal;
    }

    /**
     * Gets the value of the outForRegnBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getOutForRegnBal() {
        return outForRegnBal;
    }

    /**
     * Sets the value of the outForRegnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setOutForRegnBal(BalanceFormat1Choice value) {
        this.outForRegnBal = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPosBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmPosBal property.
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
     * {@link BalanceFormat3Choice }
     * 
     * 
     */
    public List<BalanceFormat3Choice> getSttlmPosBal() {
        if (sttlmPosBal == null) {
            sttlmPosBal = new ArrayList<BalanceFormat3Choice>();
        }
        return this.sttlmPosBal;
    }

    /**
     * Gets the value of the strtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getStrtPosBal() {
        return strtPosBal;
    }

    /**
     * Sets the value of the strtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setStrtPosBal(BalanceFormat1Choice value) {
        this.strtPosBal = value;
        return this;
    }

    /**
     * Gets the value of the tradDtPosBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getTradDtPosBal() {
        return tradDtPosBal;
    }

    /**
     * Sets the value of the tradDtPosBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setTradDtPosBal(BalanceFormat1Choice value) {
        this.tradDtPosBal = value;
        return this;
    }

    /**
     * Gets the value of the inTrnsShipmntBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getInTrnsShipmntBal() {
        return inTrnsShipmntBal;
    }

    /**
     * Sets the value of the inTrnsShipmntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setInTrnsShipmntBal(BalanceFormat1Choice value) {
        this.inTrnsShipmntBal = value;
        return this;
    }

    /**
     * Gets the value of the regdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getRegdBal() {
        return regdBal;
    }

    /**
     * Sets the value of the regdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setRegdBal(BalanceFormat1Choice value) {
        this.regdBal = value;
        return this;
    }

    /**
     * Gets the value of the oblgtdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getOblgtdBal() {
        return oblgtdBal;
    }

    /**
     * Sets the value of the oblgtdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setOblgtdBal(BalanceFormat1Choice value) {
        this.oblgtdBal = value;
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
    public CorporateActionBalanceDetails21 setUinstdBal(BalanceFormat1Choice value) {
        this.uinstdBal = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setInstdBal(BalanceFormat1Choice value) {
        this.instdBal = value;
        return this;
    }

    /**
     * Gets the value of the afctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getAfctdBal() {
        return afctdBal;
    }

    /**
     * Sets the value of the afctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setAfctdBal(BalanceFormat1Choice value) {
        this.afctdBal = value;
        return this;
    }

    /**
     * Gets the value of the uafctdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getUafctdBal() {
        return uafctdBal;
    }

    /**
     * Sets the value of the uafctdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public CorporateActionBalanceDetails21 setUafctdBal(BalanceFormat1Choice value) {
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
    public CorporateActionBalanceDetails21 addPdgDlvryBal(BalanceFormat3Choice pdgDlvryBal) {
        getPdgDlvryBal().add(pdgDlvryBal);
        return this;
    }

    /**
     * Adds a new item to the pdgRctBal list.
     * @see #getPdgRctBal()
     * 
     */
    public CorporateActionBalanceDetails21 addPdgRctBal(BalanceFormat3Choice pdgRctBal) {
        getPdgRctBal().add(pdgRctBal);
        return this;
    }

    /**
     * Adds a new item to the sttlmPosBal list.
     * @see #getSttlmPosBal()
     * 
     */
    public CorporateActionBalanceDetails21 addSttlmPosBal(BalanceFormat3Choice sttlmPosBal) {
        getSttlmPosBal().add(sttlmPosBal);
        return this;
    }

}
