
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Includes data elements that can be used for reporting to trade repositories.
 * 
 * Usage: It is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular trade confirmations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReporting8", propOrder = {
    "tradgSdTxRptg",
    "ctrPtySdTxRptg",
    "cntrlCtrPtyClrHs",
    "clrBrkr",
    "clrXcptnPty",
    "clrBrkrId",
    "clrThrshldInd",
    "clrdPdctId",
    "pdctIdr",
    "allcnInd",
    "collstnInd",
    "exctnVn",
    "exctnTmstmp",
    "nonStdFlg",
    "lkSwpId",
    "finNtrOfTheCtrPtyInd",
    "collPrtflInd",
    "collPrtflCd",
    "prtflCmprssnInd",
    "corpSctrInd",
    "tradWthNonEEACtrPtyInd",
    "ntrgrpTradInd",
    "comrclOrTrsrFincgInd",
    "finInstrmId",
    "confDtAndTmstmp",
    "clrTmstmp",
    "comssnsAndFees",
    "addtlRptgInf"
})
public class RegulatoryReporting8 {

    @XmlElement(name = "TradgSdTxRptg")
    protected List<TradingSideTransactionReporting3> tradgSdTxRptg;
    @XmlElement(name = "CtrPtySdTxRptg")
    protected List<CounterpartySideTransactionReporting3> ctrPtySdTxRptg;
    @XmlElement(name = "CntrlCtrPtyClrHs")
    protected PartyIdentification242Choice cntrlCtrPtyClrHs;
    @XmlElement(name = "ClrBrkr")
    protected PartyIdentification242Choice clrBrkr;
    @XmlElement(name = "ClrXcptnPty")
    protected PartyIdentification242Choice clrXcptnPty;
    @XmlElement(name = "ClrBrkrId")
    protected ClearingBrokerIdentification1 clrBrkrId;
    @XmlElement(name = "ClrThrshldInd")
    protected Boolean clrThrshldInd;
    @XmlElement(name = "ClrdPdctId")
    protected String clrdPdctId;
    @XmlElement(name = "PdctIdr")
    protected ProductIdentifier3Choice pdctIdr;
    @XmlElement(name = "AllcnInd")
    @XmlSchemaType(name = "string")
    protected AllocationIndicator1Code allcnInd;
    @XmlElement(name = "CollstnInd")
    @XmlSchemaType(name = "string")
    protected CollateralisationIndicator1Code collstnInd;
    @XmlElement(name = "ExctnVn")
    protected String exctnVn;
    @XmlElement(name = "ExctnTmstmp")
    protected DateAndDateTime2Choice exctnTmstmp;
    @XmlElement(name = "NonStdFlg")
    protected Boolean nonStdFlg;
    @XmlElement(name = "LkSwpId")
    protected String lkSwpId;
    @XmlElement(name = "FinNtrOfTheCtrPtyInd")
    protected Boolean finNtrOfTheCtrPtyInd;
    @XmlElement(name = "CollPrtflInd")
    protected Boolean collPrtflInd;
    @XmlElement(name = "CollPrtflCd")
    protected String collPrtflCd;
    @XmlElement(name = "PrtflCmprssnInd")
    protected Boolean prtflCmprssnInd;
    @XmlElement(name = "CorpSctrInd")
    @XmlSchemaType(name = "string")
    protected CorporateSectorIdentifier1Code corpSctrInd;
    @XmlElement(name = "TradWthNonEEACtrPtyInd")
    protected Boolean tradWthNonEEACtrPtyInd;
    @XmlElement(name = "NtrgrpTradInd")
    protected Boolean ntrgrpTradInd;
    @XmlElement(name = "ComrclOrTrsrFincgInd")
    protected Boolean comrclOrTrsrFincgInd;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "ConfDtAndTmstmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime confDtAndTmstmp;
    @XmlElement(name = "ClrTmstmp", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime clrTmstmp;
    @XmlElement(name = "ComssnsAndFees")
    protected List<FXCommissionOrFee1> comssnsAndFees;
    @XmlElement(name = "AddtlRptgInf")
    protected String addtlRptgInf;

    /**
     * Gets the value of the tradgSdTxRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tradgSdTxRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgSdTxRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingSideTransactionReporting3 }
     * 
     * 
     * @return
     *     The value of the tradgSdTxRptg property.
     */
    public List<TradingSideTransactionReporting3> getTradgSdTxRptg() {
        if (tradgSdTxRptg == null) {
            tradgSdTxRptg = new ArrayList<>();
        }
        return this.tradgSdTxRptg;
    }

    /**
     * Gets the value of the ctrPtySdTxRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrPtySdTxRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtySdTxRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CounterpartySideTransactionReporting3 }
     * 
     * 
     * @return
     *     The value of the ctrPtySdTxRptg property.
     */
    public List<CounterpartySideTransactionReporting3> getCtrPtySdTxRptg() {
        if (ctrPtySdTxRptg == null) {
            ctrPtySdTxRptg = new ArrayList<>();
        }
        return this.ctrPtySdTxRptg;
    }

    /**
     * Gets the value of the cntrlCtrPtyClrHs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getCntrlCtrPtyClrHs() {
        return cntrlCtrPtyClrHs;
    }

    /**
     * Sets the value of the cntrlCtrPtyClrHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public RegulatoryReporting8 setCntrlCtrPtyClrHs(PartyIdentification242Choice value) {
        this.cntrlCtrPtyClrHs = value;
        return this;
    }

    /**
     * Gets the value of the clrBrkr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getClrBrkr() {
        return clrBrkr;
    }

    /**
     * Sets the value of the clrBrkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public RegulatoryReporting8 setClrBrkr(PartyIdentification242Choice value) {
        this.clrBrkr = value;
        return this;
    }

    /**
     * Gets the value of the clrXcptnPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getClrXcptnPty() {
        return clrXcptnPty;
    }

    /**
     * Sets the value of the clrXcptnPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public RegulatoryReporting8 setClrXcptnPty(PartyIdentification242Choice value) {
        this.clrXcptnPty = value;
        return this;
    }

    /**
     * Gets the value of the clrBrkrId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingBrokerIdentification1 }
     *     
     */
    public ClearingBrokerIdentification1 getClrBrkrId() {
        return clrBrkrId;
    }

    /**
     * Sets the value of the clrBrkrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingBrokerIdentification1 }
     *     
     */
    public RegulatoryReporting8 setClrBrkrId(ClearingBrokerIdentification1 value) {
        this.clrBrkrId = value;
        return this;
    }

    /**
     * Gets the value of the clrThrshldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClrThrshldInd() {
        return clrThrshldInd;
    }

    /**
     * Sets the value of the clrThrshldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RegulatoryReporting8 setClrThrshldInd(Boolean value) {
        this.clrThrshldInd = value;
        return this;
    }

    /**
     * Gets the value of the clrdPdctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrdPdctId() {
        return clrdPdctId;
    }

    /**
     * Sets the value of the clrdPdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReporting8 setClrdPdctId(String value) {
        this.clrdPdctId = value;
        return this;
    }

    /**
     * Gets the value of the pdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentifier3Choice }
     *     
     */
    public ProductIdentifier3Choice getPdctIdr() {
        return pdctIdr;
    }

    /**
     * Sets the value of the pdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentifier3Choice }
     *     
     */
    public RegulatoryReporting8 setPdctIdr(ProductIdentifier3Choice value) {
        this.pdctIdr = value;
        return this;
    }

    /**
     * Gets the value of the allcnInd property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationIndicator1Code }
     *     
     */
    public AllocationIndicator1Code getAllcnInd() {
        return allcnInd;
    }

    /**
     * Sets the value of the allcnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationIndicator1Code }
     *     
     */
    public RegulatoryReporting8 setAllcnInd(AllocationIndicator1Code value) {
        this.allcnInd = value;
        return this;
    }

    /**
     * Gets the value of the collstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralisationIndicator1Code }
     *     
     */
    public CollateralisationIndicator1Code getCollstnInd() {
        return collstnInd;
    }

    /**
     * Sets the value of the collstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralisationIndicator1Code }
     *     
     */
    public RegulatoryReporting8 setCollstnInd(CollateralisationIndicator1Code value) {
        this.collstnInd = value;
        return this;
    }

    /**
     * Gets the value of the exctnVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExctnVn() {
        return exctnVn;
    }

    /**
     * Sets the value of the exctnVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReporting8 setExctnVn(String value) {
        this.exctnVn = value;
        return this;
    }

    /**
     * Gets the value of the exctnTmstmp property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getExctnTmstmp() {
        return exctnTmstmp;
    }

    /**
     * Sets the value of the exctnTmstmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public RegulatoryReporting8 setExctnTmstmp(DateAndDateTime2Choice value) {
        this.exctnTmstmp = value;
        return this;
    }

    /**
     * Gets the value of the nonStdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonStdFlg() {
        return nonStdFlg;
    }

    /**
     * Sets the value of the nonStdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RegulatoryReporting8 setNonStdFlg(Boolean value) {
        this.nonStdFlg = value;
        return this;
    }

    /**
     * Gets the value of the lkSwpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkSwpId() {
        return lkSwpId;
    }

    /**
     * Sets the value of the lkSwpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReporting8 setLkSwpId(String value) {
        this.lkSwpId = value;
        return this;
    }

    /**
     * Gets the value of the finNtrOfTheCtrPtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinNtrOfTheCtrPtyInd() {
        return finNtrOfTheCtrPtyInd;
    }

    /**
     * Sets the value of the finNtrOfTheCtrPtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RegulatoryReporting8 setFinNtrOfTheCtrPtyInd(Boolean value) {
        this.finNtrOfTheCtrPtyInd = value;
        return this;
    }

    /**
     * Gets the value of the collPrtflInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollPrtflInd() {
        return collPrtflInd;
    }

    /**
     * Sets the value of the collPrtflInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RegulatoryReporting8 setCollPrtflInd(Boolean value) {
        this.collPrtflInd = value;
        return this;
    }

    /**
     * Gets the value of the collPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollPrtflCd() {
        return collPrtflCd;
    }

    /**
     * Sets the value of the collPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReporting8 setCollPrtflCd(String value) {
        this.collPrtflCd = value;
        return this;
    }

    /**
     * Gets the value of the prtflCmprssnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtflCmprssnInd() {
        return prtflCmprssnInd;
    }

    /**
     * Sets the value of the prtflCmprssnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RegulatoryReporting8 setPrtflCmprssnInd(Boolean value) {
        this.prtflCmprssnInd = value;
        return this;
    }

    /**
     * Gets the value of the corpSctrInd property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateSectorIdentifier1Code }
     *     
     */
    public CorporateSectorIdentifier1Code getCorpSctrInd() {
        return corpSctrInd;
    }

    /**
     * Sets the value of the corpSctrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateSectorIdentifier1Code }
     *     
     */
    public RegulatoryReporting8 setCorpSctrInd(CorporateSectorIdentifier1Code value) {
        this.corpSctrInd = value;
        return this;
    }

    /**
     * Gets the value of the tradWthNonEEACtrPtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTradWthNonEEACtrPtyInd() {
        return tradWthNonEEACtrPtyInd;
    }

    /**
     * Sets the value of the tradWthNonEEACtrPtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RegulatoryReporting8 setTradWthNonEEACtrPtyInd(Boolean value) {
        this.tradWthNonEEACtrPtyInd = value;
        return this;
    }

    /**
     * Gets the value of the ntrgrpTradInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtrgrpTradInd() {
        return ntrgrpTradInd;
    }

    /**
     * Sets the value of the ntrgrpTradInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RegulatoryReporting8 setNtrgrpTradInd(Boolean value) {
        this.ntrgrpTradInd = value;
        return this;
    }

    /**
     * Gets the value of the comrclOrTrsrFincgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComrclOrTrsrFincgInd() {
        return comrclOrTrsrFincgInd;
    }

    /**
     * Sets the value of the comrclOrTrsrFincgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RegulatoryReporting8 setComrclOrTrsrFincgInd(Boolean value) {
        this.comrclOrTrsrFincgInd = value;
        return this;
    }

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
    public RegulatoryReporting8 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the confDtAndTmstmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getConfDtAndTmstmp() {
        return confDtAndTmstmp;
    }

    /**
     * Sets the value of the confDtAndTmstmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReporting8 setConfDtAndTmstmp(OffsetDateTime value) {
        this.confDtAndTmstmp = value;
        return this;
    }

    /**
     * Gets the value of the clrTmstmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getClrTmstmp() {
        return clrTmstmp;
    }

    /**
     * Sets the value of the clrTmstmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReporting8 setClrTmstmp(OffsetTime value) {
        this.clrTmstmp = value;
        return this;
    }

    /**
     * Gets the value of the comssnsAndFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the comssnsAndFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComssnsAndFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FXCommissionOrFee1 }
     * 
     * 
     * @return
     *     The value of the comssnsAndFees property.
     */
    public List<FXCommissionOrFee1> getComssnsAndFees() {
        if (comssnsAndFees == null) {
            comssnsAndFees = new ArrayList<>();
        }
        return this.comssnsAndFees;
    }

    /**
     * Gets the value of the addtlRptgInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRptgInf() {
        return addtlRptgInf;
    }

    /**
     * Sets the value of the addtlRptgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReporting8 setAddtlRptgInf(String value) {
        this.addtlRptgInf = value;
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
     * Adds a new item to the tradgSdTxRptg list.
     * @see #getTradgSdTxRptg()
     * 
     */
    public RegulatoryReporting8 addTradgSdTxRptg(TradingSideTransactionReporting3 tradgSdTxRptg) {
        getTradgSdTxRptg().add(tradgSdTxRptg);
        return this;
    }

    /**
     * Adds a new item to the ctrPtySdTxRptg list.
     * @see #getCtrPtySdTxRptg()
     * 
     */
    public RegulatoryReporting8 addCtrPtySdTxRptg(CounterpartySideTransactionReporting3 ctrPtySdTxRptg) {
        getCtrPtySdTxRptg().add(ctrPtySdTxRptg);
        return this;
    }

    /**
     * Adds a new item to the comssnsAndFees list.
     * @see #getComssnsAndFees()
     * 
     */
    public RegulatoryReporting8 addComssnsAndFees(FXCommissionOrFee1 comssnsAndFees) {
        getComssnsAndFees().add(comssnsAndFees);
        return this;
    }

}
