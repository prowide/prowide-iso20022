
package com.prowidesoftware.swift.model.mx.dic;

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
 * Variables related to derivatives that are used to group derivatives together into positions for position sets and currency position sets reports. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetDimensions3", propOrder = {
    "ctrPtyId",
    "valCcy",
    "collstn",
    "prtfl",
    "ctrctTp",
    "asstClss",
    "undrlygInstrm",
    "frstLegNtnlCcy",
    "scndLegNtnlCcy",
    "dlvrblCcy",
    "dlvrblCrossCcy",
    "mstrAgrmt",
    "clrSts",
    "intraGrp",
    "xchgRateBsis",
    "optnTp",
    "tmToMtrty",
    "irsTp",
    "snrty",
    "trch",
    "cmmdty"
})
public class PositionSetDimensions3 {

    @XmlElement(name = "CtrPtyId")
    protected TradeCounterpartyReport9 ctrPtyId;
    @XmlElement(name = "ValCcy")
    protected String valCcy;
    @XmlElement(name = "Collstn")
    @XmlSchemaType(name = "string")
    protected CollateralisationType1Code collstn;
    @XmlElement(name = "Prtfl")
    protected String prtfl;
    @XmlElement(name = "CtrctTp")
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentContractType2Code ctrctTp;
    @XmlElement(name = "AsstClss")
    @XmlSchemaType(name = "string")
    protected ProductType4Code asstClss;
    @XmlElement(name = "UndrlygInstrm")
    protected SecurityIdentification34Choice undrlygInstrm;
    @XmlElement(name = "FrstLegNtnlCcy")
    protected String frstLegNtnlCcy;
    @XmlElement(name = "ScndLegNtnlCcy")
    protected String scndLegNtnlCcy;
    @XmlElement(name = "DlvrblCcy")
    protected String dlvrblCcy;
    @XmlElement(name = "DlvrblCrossCcy")
    protected String dlvrblCrossCcy;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement2 mstrAgrmt;
    @XmlElement(name = "ClrSts")
    protected Boolean clrSts;
    @XmlElement(name = "IntraGrp")
    protected Boolean intraGrp;
    @XmlElement(name = "XchgRateBsis")
    protected ExchangeRateBasis1Choice xchgRateBsis;
    @XmlElement(name = "OptnTp")
    @XmlSchemaType(name = "string")
    protected OptionType2Code optnTp;
    @XmlElement(name = "TmToMtrty")
    protected TimeToMaturity1Choice tmToMtrty;
    @XmlElement(name = "IRSTp")
    protected String irsTp;
    @XmlElement(name = "Snrty")
    @XmlSchemaType(name = "string")
    protected DebtInstrumentSeniorityType2Code snrty;
    @XmlElement(name = "Trch")
    protected Boolean trch;
    @XmlElement(name = "Cmmdty")
    protected String cmmdty;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyReport9 }
     *     
     */
    public TradeCounterpartyReport9 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyReport9 }
     *     
     */
    public PositionSetDimensions3 setCtrPtyId(TradeCounterpartyReport9 value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the valCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValCcy() {
        return valCcy;
    }

    /**
     * Sets the value of the valCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetDimensions3 setValCcy(String value) {
        this.valCcy = value;
        return this;
    }

    /**
     * Gets the value of the collstn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralisationType1Code }
     *     
     */
    public CollateralisationType1Code getCollstn() {
        return collstn;
    }

    /**
     * Sets the value of the collstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralisationType1Code }
     *     
     */
    public PositionSetDimensions3 setCollstn(CollateralisationType1Code value) {
        this.collstn = value;
        return this;
    }

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetDimensions3 setPrtfl(String value) {
        this.prtfl = value;
        return this;
    }

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentContractType2Code }
     *     
     */
    public FinancialInstrumentContractType2Code getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentContractType2Code }
     *     
     */
    public PositionSetDimensions3 setCtrctTp(FinancialInstrumentContractType2Code value) {
        this.ctrctTp = value;
        return this;
    }

    /**
     * Gets the value of the asstClss property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType4Code }
     *     
     */
    public ProductType4Code getAsstClss() {
        return asstClss;
    }

    /**
     * Sets the value of the asstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType4Code }
     *     
     */
    public PositionSetDimensions3 setAsstClss(ProductType4Code value) {
        this.asstClss = value;
        return this;
    }

    /**
     * Gets the value of the undrlygInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification34Choice }
     *     
     */
    public SecurityIdentification34Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification34Choice }
     *     
     */
    public PositionSetDimensions3 setUndrlygInstrm(SecurityIdentification34Choice value) {
        this.undrlygInstrm = value;
        return this;
    }

    /**
     * Gets the value of the frstLegNtnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstLegNtnlCcy() {
        return frstLegNtnlCcy;
    }

    /**
     * Sets the value of the frstLegNtnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetDimensions3 setFrstLegNtnlCcy(String value) {
        this.frstLegNtnlCcy = value;
        return this;
    }

    /**
     * Gets the value of the scndLegNtnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndLegNtnlCcy() {
        return scndLegNtnlCcy;
    }

    /**
     * Sets the value of the scndLegNtnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetDimensions3 setScndLegNtnlCcy(String value) {
        this.scndLegNtnlCcy = value;
        return this;
    }

    /**
     * Gets the value of the dlvrblCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvrblCcy() {
        return dlvrblCcy;
    }

    /**
     * Sets the value of the dlvrblCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetDimensions3 setDlvrblCcy(String value) {
        this.dlvrblCcy = value;
        return this;
    }

    /**
     * Gets the value of the dlvrblCrossCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvrblCrossCcy() {
        return dlvrblCrossCcy;
    }

    /**
     * Sets the value of the dlvrblCrossCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetDimensions3 setDlvrblCrossCcy(String value) {
        this.dlvrblCrossCcy = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement2 }
     *     
     */
    public MasterAgreement2 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement2 }
     *     
     */
    public PositionSetDimensions3 setMstrAgrmt(MasterAgreement2 value) {
        this.mstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the clrSts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClrSts() {
        return clrSts;
    }

    /**
     * Sets the value of the clrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PositionSetDimensions3 setClrSts(Boolean value) {
        this.clrSts = value;
        return this;
    }

    /**
     * Gets the value of the intraGrp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntraGrp() {
        return intraGrp;
    }

    /**
     * Sets the value of the intraGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PositionSetDimensions3 setIntraGrp(Boolean value) {
        this.intraGrp = value;
        return this;
    }

    /**
     * Gets the value of the xchgRateBsis property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateBasis1Choice }
     *     
     */
    public ExchangeRateBasis1Choice getXchgRateBsis() {
        return xchgRateBsis;
    }

    /**
     * Sets the value of the xchgRateBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateBasis1Choice }
     *     
     */
    public PositionSetDimensions3 setXchgRateBsis(ExchangeRateBasis1Choice value) {
        this.xchgRateBsis = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType2Code }
     *     
     */
    public OptionType2Code getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType2Code }
     *     
     */
    public PositionSetDimensions3 setOptnTp(OptionType2Code value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the tmToMtrty property.
     * 
     * @return
     *     possible object is
     *     {@link TimeToMaturity1Choice }
     *     
     */
    public TimeToMaturity1Choice getTmToMtrty() {
        return tmToMtrty;
    }

    /**
     * Sets the value of the tmToMtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeToMaturity1Choice }
     *     
     */
    public PositionSetDimensions3 setTmToMtrty(TimeToMaturity1Choice value) {
        this.tmToMtrty = value;
        return this;
    }

    /**
     * Gets the value of the irsTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIRSTp() {
        return irsTp;
    }

    /**
     * Sets the value of the irsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetDimensions3 setIRSTp(String value) {
        this.irsTp = value;
        return this;
    }

    /**
     * Gets the value of the snrty property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrumentSeniorityType2Code }
     *     
     */
    public DebtInstrumentSeniorityType2Code getSnrty() {
        return snrty;
    }

    /**
     * Sets the value of the snrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrumentSeniorityType2Code }
     *     
     */
    public PositionSetDimensions3 setSnrty(DebtInstrumentSeniorityType2Code value) {
        this.snrty = value;
        return this;
    }

    /**
     * Gets the value of the trch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrch() {
        return trch;
    }

    /**
     * Sets the value of the trch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PositionSetDimensions3 setTrch(Boolean value) {
        this.trch = value;
        return this;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetDimensions3 setCmmdty(String value) {
        this.cmmdty = value;
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

}
