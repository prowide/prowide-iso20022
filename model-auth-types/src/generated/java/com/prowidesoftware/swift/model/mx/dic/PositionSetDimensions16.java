
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
@XmlType(name = "PositionSetDimensions16", propOrder = {
    "ctrPtyId",
    "valCcy",
    "coll",
    "ctrctTp",
    "asstClss",
    "undrlygInstrm",
    "ntnlCcy",
    "ntnlCcyScndLeg",
    "sttlmCcy",
    "sttlmCcyScndLeg",
    "mstrAgrmt",
    "clrd",
    "intraGrp",
    "xchgRateBsis",
    "optnTp",
    "tmToMtrty",
    "irsTp",
    "cdt",
    "cmmdty",
    "othrPmt"
})
public class PositionSetDimensions16 {

    @XmlElement(name = "CtrPtyId")
    protected TradeCounterpartyReport20 ctrPtyId;
    @XmlElement(name = "ValCcy")
    protected String valCcy;
    @XmlElement(name = "Coll")
    protected MarginCollateralReport4 coll;
    @XmlElement(name = "CtrctTp")
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentContractType2Code ctrctTp;
    @XmlElement(name = "AsstClss")
    @XmlSchemaType(name = "string")
    protected ProductType4Code asstClss;
    @XmlElement(name = "UndrlygInstrm")
    protected SecurityIdentification41Choice undrlygInstrm;
    @XmlElement(name = "NtnlCcy")
    protected String ntnlCcy;
    @XmlElement(name = "NtnlCcyScndLeg")
    protected String ntnlCcyScndLeg;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;
    @XmlElement(name = "SttlmCcyScndLeg")
    protected String sttlmCcyScndLeg;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement8 mstrAgrmt;
    @XmlElement(name = "Clrd")
    protected Boolean clrd;
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
    @XmlElement(name = "Cdt")
    protected CreditDerivative7 cdt;
    @XmlElement(name = "Cmmdty")
    protected AssetClassCommodity6Choice cmmdty;
    @XmlElement(name = "OthrPmt")
    protected OtherPayment6 othrPmt;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public TradeCounterpartyReport20 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public PositionSetDimensions16 setCtrPtyId(TradeCounterpartyReport20 value) {
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
    public PositionSetDimensions16 setValCcy(String value) {
        this.valCcy = value;
        return this;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCollateralReport4 }
     *     
     */
    public MarginCollateralReport4 getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCollateralReport4 }
     *     
     */
    public PositionSetDimensions16 setColl(MarginCollateralReport4 value) {
        this.coll = value;
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
    public PositionSetDimensions16 setCtrctTp(FinancialInstrumentContractType2Code value) {
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
    public PositionSetDimensions16 setAsstClss(ProductType4Code value) {
        this.asstClss = value;
        return this;
    }

    /**
     * Gets the value of the undrlygInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification41Choice }
     *     
     */
    public SecurityIdentification41Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification41Choice }
     *     
     */
    public PositionSetDimensions16 setUndrlygInstrm(SecurityIdentification41Choice value) {
        this.undrlygInstrm = value;
        return this;
    }

    /**
     * Gets the value of the ntnlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy() {
        return ntnlCcy;
    }

    /**
     * Sets the value of the ntnlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetDimensions16 setNtnlCcy(String value) {
        this.ntnlCcy = value;
        return this;
    }

    /**
     * Gets the value of the ntnlCcyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcyScndLeg() {
        return ntnlCcyScndLeg;
    }

    /**
     * Sets the value of the ntnlCcyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetDimensions16 setNtnlCcyScndLeg(String value) {
        this.ntnlCcyScndLeg = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetDimensions16 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the sttlmCcyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcyScndLeg() {
        return sttlmCcyScndLeg;
    }

    /**
     * Sets the value of the sttlmCcyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PositionSetDimensions16 setSttlmCcyScndLeg(String value) {
        this.sttlmCcyScndLeg = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement8 }
     *     
     */
    public MasterAgreement8 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement8 }
     *     
     */
    public PositionSetDimensions16 setMstrAgrmt(MasterAgreement8 value) {
        this.mstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the clrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClrd() {
        return clrd;
    }

    /**
     * Sets the value of the clrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PositionSetDimensions16 setClrd(Boolean value) {
        this.clrd = value;
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
    public PositionSetDimensions16 setIntraGrp(Boolean value) {
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
    public PositionSetDimensions16 setXchgRateBsis(ExchangeRateBasis1Choice value) {
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
    public PositionSetDimensions16 setOptnTp(OptionType2Code value) {
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
    public PositionSetDimensions16 setTmToMtrty(TimeToMaturity1Choice value) {
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
    public PositionSetDimensions16 setIRSTp(String value) {
        this.irsTp = value;
        return this;
    }

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDerivative7 }
     *     
     */
    public CreditDerivative7 getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDerivative7 }
     *     
     */
    public PositionSetDimensions16 setCdt(CreditDerivative7 value) {
        this.cdt = value;
        return this;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodity6Choice }
     *     
     */
    public AssetClassCommodity6Choice getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodity6Choice }
     *     
     */
    public PositionSetDimensions16 setCmmdty(AssetClassCommodity6Choice value) {
        this.cmmdty = value;
        return this;
    }

    /**
     * Gets the value of the othrPmt property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPayment6 }
     *     
     */
    public OtherPayment6 getOthrPmt() {
        return othrPmt;
    }

    /**
     * Sets the value of the othrPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPayment6 }
     *     
     */
    public PositionSetDimensions16 setOthrPmt(OtherPayment6 value) {
        this.othrPmt = value;
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
