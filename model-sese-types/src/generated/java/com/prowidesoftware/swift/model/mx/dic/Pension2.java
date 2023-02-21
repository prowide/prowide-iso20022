
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Attributes of a pension.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pension2", propOrder = {
    "id",
    "tp",
    "trfScp",
    "taxRef",
    "drwdwnTrchId",
    "drwdwnSts",
    "estmtdVal",
    "blckTrf",
    "taxFreeCshPrtcn",
    "taxFreeCshAmt",
    "valOfPnsnPlcyOrPlanOrSchme",
    "rtrmntAgePrtcn",
    "rtrmntAge",
    "shrg",
    "lumpSumTp",
    "pnsnOrdr",
    "ringFncdDrwdwnAssts",
    "mnyPurchsAnlAllwnc",
    "sfgrdBnft",
    "lftmAllwncPrtcn",
    "addtlInf"
})
public class Pension2 {

    @XmlElement(name = "Id")
    protected PensionPolicy1 id;
    @XmlElement(name = "Tp", required = true)
    protected PensionSchemeType1Choice tp;
    @XmlElement(name = "TrfScp")
    protected PensionTransferScope1Choice trfScp;
    @XmlElement(name = "TaxRef")
    protected List<TaxReference1> taxRef;
    @XmlElement(name = "DrwdwnTrchId")
    protected String drwdwnTrchId;
    @XmlElement(name = "DrwdwnSts")
    protected DrawdownStatus1Choice drwdwnSts;
    @XmlElement(name = "EstmtdVal")
    protected DateAndAmount2 estmtdVal;
    @XmlElement(name = "BlckTrf")
    protected Boolean blckTrf;
    @XmlElement(name = "TaxFreeCshPrtcn")
    protected Boolean taxFreeCshPrtcn;
    @XmlElement(name = "TaxFreeCshAmt")
    protected DateAndAmount2 taxFreeCshAmt;
    @XmlElement(name = "ValOfPnsnPlcyOrPlanOrSchme")
    protected DateAndAmount2 valOfPnsnPlcyOrPlanOrSchme;
    @XmlElement(name = "RtrmntAgePrtcn")
    protected Boolean rtrmntAgePrtcn;
    @XmlElement(name = "RtrmntAge")
    protected BigDecimal rtrmntAge;
    @XmlElement(name = "Shrg")
    protected Boolean shrg;
    @XmlElement(name = "LumpSumTp")
    protected List<LumpSumType1Choice> lumpSumTp;
    @XmlElement(name = "PnsnOrdr")
    protected List<PensionOrder1> pnsnOrdr;
    @XmlElement(name = "RingFncdDrwdwnAssts")
    protected Boolean ringFncdDrwdwnAssts;
    @XmlElement(name = "MnyPurchsAnlAllwnc")
    protected MoneyPurchaseAnnualAllowance1 mnyPurchsAnlAllwnc;
    @XmlElement(name = "SfgrdBnft")
    protected Boolean sfgrdBnft;
    @XmlElement(name = "LftmAllwncPrtcn")
    protected Boolean lftmAllwncPrtcn;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PensionPolicy1 }
     *     
     */
    public PensionPolicy1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionPolicy1 }
     *     
     */
    public Pension2 setId(PensionPolicy1 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PensionSchemeType1Choice }
     *     
     */
    public PensionSchemeType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionSchemeType1Choice }
     *     
     */
    public Pension2 setTp(PensionSchemeType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the trfScp property.
     * 
     * @return
     *     possible object is
     *     {@link PensionTransferScope1Choice }
     *     
     */
    public PensionTransferScope1Choice getTrfScp() {
        return trfScp;
    }

    /**
     * Sets the value of the trfScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PensionTransferScope1Choice }
     *     
     */
    public Pension2 setTrfScp(PensionTransferScope1Choice value) {
        this.trfScp = value;
        return this;
    }

    /**
     * Gets the value of the taxRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReference1 }
     * 
     * 
     */
    public List<TaxReference1> getTaxRef() {
        if (taxRef == null) {
            taxRef = new ArrayList<TaxReference1>();
        }
        return this.taxRef;
    }

    /**
     * Gets the value of the drwdwnTrchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrwdwnTrchId() {
        return drwdwnTrchId;
    }

    /**
     * Sets the value of the drwdwnTrchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Pension2 setDrwdwnTrchId(String value) {
        this.drwdwnTrchId = value;
        return this;
    }

    /**
     * Gets the value of the drwdwnSts property.
     * 
     * @return
     *     possible object is
     *     {@link DrawdownStatus1Choice }
     *     
     */
    public DrawdownStatus1Choice getDrwdwnSts() {
        return drwdwnSts;
    }

    /**
     * Sets the value of the drwdwnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawdownStatus1Choice }
     *     
     */
    public Pension2 setDrwdwnSts(DrawdownStatus1Choice value) {
        this.drwdwnSts = value;
        return this;
    }

    /**
     * Gets the value of the estmtdVal property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getEstmtdVal() {
        return estmtdVal;
    }

    /**
     * Sets the value of the estmtdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public Pension2 setEstmtdVal(DateAndAmount2 value) {
        this.estmtdVal = value;
        return this;
    }

    /**
     * Gets the value of the blckTrf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlckTrf() {
        return blckTrf;
    }

    /**
     * Sets the value of the blckTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Pension2 setBlckTrf(Boolean value) {
        this.blckTrf = value;
        return this;
    }

    /**
     * Gets the value of the taxFreeCshPrtcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxFreeCshPrtcn() {
        return taxFreeCshPrtcn;
    }

    /**
     * Sets the value of the taxFreeCshPrtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Pension2 setTaxFreeCshPrtcn(Boolean value) {
        this.taxFreeCshPrtcn = value;
        return this;
    }

    /**
     * Gets the value of the taxFreeCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getTaxFreeCshAmt() {
        return taxFreeCshAmt;
    }

    /**
     * Sets the value of the taxFreeCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public Pension2 setTaxFreeCshAmt(DateAndAmount2 value) {
        this.taxFreeCshAmt = value;
        return this;
    }

    /**
     * Gets the value of the valOfPnsnPlcyOrPlanOrSchme property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getValOfPnsnPlcyOrPlanOrSchme() {
        return valOfPnsnPlcyOrPlanOrSchme;
    }

    /**
     * Sets the value of the valOfPnsnPlcyOrPlanOrSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public Pension2 setValOfPnsnPlcyOrPlanOrSchme(DateAndAmount2 value) {
        this.valOfPnsnPlcyOrPlanOrSchme = value;
        return this;
    }

    /**
     * Gets the value of the rtrmntAgePrtcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtrmntAgePrtcn() {
        return rtrmntAgePrtcn;
    }

    /**
     * Sets the value of the rtrmntAgePrtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Pension2 setRtrmntAgePrtcn(Boolean value) {
        this.rtrmntAgePrtcn = value;
        return this;
    }

    /**
     * Gets the value of the rtrmntAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtrmntAge() {
        return rtrmntAge;
    }

    /**
     * Sets the value of the rtrmntAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Pension2 setRtrmntAge(BigDecimal value) {
        this.rtrmntAge = value;
        return this;
    }

    /**
     * Gets the value of the shrg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShrg() {
        return shrg;
    }

    /**
     * Sets the value of the shrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Pension2 setShrg(Boolean value) {
        this.shrg = value;
        return this;
    }

    /**
     * Gets the value of the lumpSumTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lumpSumTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLumpSumTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LumpSumType1Choice }
     * 
     * 
     */
    public List<LumpSumType1Choice> getLumpSumTp() {
        if (lumpSumTp == null) {
            lumpSumTp = new ArrayList<LumpSumType1Choice>();
        }
        return this.lumpSumTp;
    }

    /**
     * Gets the value of the pnsnOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnsnOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnsnOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PensionOrder1 }
     * 
     * 
     */
    public List<PensionOrder1> getPnsnOrdr() {
        if (pnsnOrdr == null) {
            pnsnOrdr = new ArrayList<PensionOrder1>();
        }
        return this.pnsnOrdr;
    }

    /**
     * Gets the value of the ringFncdDrwdwnAssts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRingFncdDrwdwnAssts() {
        return ringFncdDrwdwnAssts;
    }

    /**
     * Sets the value of the ringFncdDrwdwnAssts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Pension2 setRingFncdDrwdwnAssts(Boolean value) {
        this.ringFncdDrwdwnAssts = value;
        return this;
    }

    /**
     * Gets the value of the mnyPurchsAnlAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyPurchaseAnnualAllowance1 }
     *     
     */
    public MoneyPurchaseAnnualAllowance1 getMnyPurchsAnlAllwnc() {
        return mnyPurchsAnlAllwnc;
    }

    /**
     * Sets the value of the mnyPurchsAnlAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyPurchaseAnnualAllowance1 }
     *     
     */
    public Pension2 setMnyPurchsAnlAllwnc(MoneyPurchaseAnnualAllowance1 value) {
        this.mnyPurchsAnlAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the sfgrdBnft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSfgrdBnft() {
        return sfgrdBnft;
    }

    /**
     * Sets the value of the sfgrdBnft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Pension2 setSfgrdBnft(Boolean value) {
        this.sfgrdBnft = value;
        return this;
    }

    /**
     * Gets the value of the lftmAllwncPrtcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLftmAllwncPrtcn() {
        return lftmAllwncPrtcn;
    }

    /**
     * Sets the value of the lftmAllwncPrtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Pension2 setLftmAllwncPrtcn(Boolean value) {
        this.lftmAllwncPrtcn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation15>();
        }
        return this.addtlInf;
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
     * Adds a new item to the taxRef list.
     * @see #getTaxRef()
     * 
     */
    public Pension2 addTaxRef(TaxReference1 taxRef) {
        getTaxRef().add(taxRef);
        return this;
    }

    /**
     * Adds a new item to the lumpSumTp list.
     * @see #getLumpSumTp()
     * 
     */
    public Pension2 addLumpSumTp(LumpSumType1Choice lumpSumTp) {
        getLumpSumTp().add(lumpSumTp);
        return this;
    }

    /**
     * Adds a new item to the pnsnOrdr list.
     * @see #getPnsnOrdr()
     * 
     */
    public Pension2 addPnsnOrdr(PensionOrder1 pnsnOrdr) {
        getPnsnOrdr().add(pnsnOrdr);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Pension2 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
