
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Includes data elements that can be used for reporting to trade repositories, it is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular trade confirmations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReporting6", propOrder = {
    "tradgSdTxRptg",
    "ctrPtySdTxRptg",
    "cntrlCtrPtyClrHs",
    "clrBrkr",
    "clrXcptnPty",
    "clrBrkrId",
    "clrThrshldInd",
    "clrdPdctId",
    "undrlygPdctIdr",
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
    "addtlRptgInf"
})
public class RegulatoryReporting6 {

    @XmlElement(name = "TradgSdTxRptg")
    protected List<TradingSideTransactionReporting1> tradgSdTxRptg;
    @XmlElement(name = "CtrPtySdTxRptg")
    protected List<CounterpartySideTransactionReporting1> ctrPtySdTxRptg;
    @XmlElement(name = "CntrlCtrPtyClrHs")
    protected PartyIdentification73Choice cntrlCtrPtyClrHs;
    @XmlElement(name = "ClrBrkr")
    protected PartyIdentification73Choice clrBrkr;
    @XmlElement(name = "ClrXcptnPty")
    protected PartyIdentification73Choice clrXcptnPty;
    @XmlElement(name = "ClrBrkrId")
    protected ClearingBrokerIdentification1 clrBrkrId;
    @XmlElement(name = "ClrThrshldInd")
    protected Boolean clrThrshldInd;
    @XmlElement(name = "ClrdPdctId")
    protected String clrdPdctId;
    @XmlElement(name = "UndrlygPdctIdr")
    @XmlSchemaType(name = "string")
    protected UnderlyingProductIdentifier1Code undrlygPdctIdr;
    @XmlElement(name = "AllcnInd")
    @XmlSchemaType(name = "string")
    protected AllocationIndicator1Code allcnInd;
    @XmlElement(name = "CollstnInd")
    @XmlSchemaType(name = "string")
    protected CollateralisationIndicator1Code collstnInd;
    @XmlElement(name = "ExctnVn")
    protected String exctnVn;
    @XmlElement(name = "ExctnTmstmp")
    protected DateAndDateTimeChoice exctnTmstmp;
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
    protected XMLGregorianCalendar confDtAndTmstmp;
    @XmlElement(name = "ClrTmstmp", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar clrTmstmp;
    @XmlElement(name = "AddtlRptgInf")
    protected String addtlRptgInf;

    /**
     * Gets the value of the tradgSdTxRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradgSdTxRptg property.
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
     * {@link TradingSideTransactionReporting1 }
     * 
     * 
     */
    public List<TradingSideTransactionReporting1> getTradgSdTxRptg() {
        if (tradgSdTxRptg == null) {
            tradgSdTxRptg = new ArrayList<TradingSideTransactionReporting1>();
        }
        return this.tradgSdTxRptg;
    }

    /**
     * Gets the value of the ctrPtySdTxRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrPtySdTxRptg property.
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
     * {@link CounterpartySideTransactionReporting1 }
     * 
     * 
     */
    public List<CounterpartySideTransactionReporting1> getCtrPtySdTxRptg() {
        if (ctrPtySdTxRptg == null) {
            ctrPtySdTxRptg = new ArrayList<CounterpartySideTransactionReporting1>();
        }
        return this.ctrPtySdTxRptg;
    }

    /**
     * Gets the value of the cntrlCtrPtyClrHs property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getCntrlCtrPtyClrHs() {
        return cntrlCtrPtyClrHs;
    }

    /**
     * Sets the value of the cntrlCtrPtyClrHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public RegulatoryReporting6 setCntrlCtrPtyClrHs(PartyIdentification73Choice value) {
        this.cntrlCtrPtyClrHs = value;
        return this;
    }

    /**
     * Gets the value of the clrBrkr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getClrBrkr() {
        return clrBrkr;
    }

    /**
     * Sets the value of the clrBrkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public RegulatoryReporting6 setClrBrkr(PartyIdentification73Choice value) {
        this.clrBrkr = value;
        return this;
    }

    /**
     * Gets the value of the clrXcptnPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getClrXcptnPty() {
        return clrXcptnPty;
    }

    /**
     * Sets the value of the clrXcptnPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public RegulatoryReporting6 setClrXcptnPty(PartyIdentification73Choice value) {
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
    public RegulatoryReporting6 setClrBrkrId(ClearingBrokerIdentification1 value) {
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
    public RegulatoryReporting6 setClrThrshldInd(Boolean value) {
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
    public RegulatoryReporting6 setClrdPdctId(String value) {
        this.clrdPdctId = value;
        return this;
    }

    /**
     * Gets the value of the undrlygPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public UnderlyingProductIdentifier1Code getUndrlygPdctIdr() {
        return undrlygPdctIdr;
    }

    /**
     * Sets the value of the undrlygPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public RegulatoryReporting6 setUndrlygPdctIdr(UnderlyingProductIdentifier1Code value) {
        this.undrlygPdctIdr = value;
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
    public RegulatoryReporting6 setAllcnInd(AllocationIndicator1Code value) {
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
    public RegulatoryReporting6 setCollstnInd(CollateralisationIndicator1Code value) {
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
    public RegulatoryReporting6 setExctnVn(String value) {
        this.exctnVn = value;
        return this;
    }

    /**
     * Gets the value of the exctnTmstmp property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getExctnTmstmp() {
        return exctnTmstmp;
    }

    /**
     * Sets the value of the exctnTmstmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public RegulatoryReporting6 setExctnTmstmp(DateAndDateTimeChoice value) {
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
    public RegulatoryReporting6 setNonStdFlg(Boolean value) {
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
    public RegulatoryReporting6 setLkSwpId(String value) {
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
    public RegulatoryReporting6 setFinNtrOfTheCtrPtyInd(Boolean value) {
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
    public RegulatoryReporting6 setCollPrtflInd(Boolean value) {
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
    public RegulatoryReporting6 setCollPrtflCd(String value) {
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
    public RegulatoryReporting6 setPrtflCmprssnInd(Boolean value) {
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
    public RegulatoryReporting6 setCorpSctrInd(CorporateSectorIdentifier1Code value) {
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
    public RegulatoryReporting6 setTradWthNonEEACtrPtyInd(Boolean value) {
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
    public RegulatoryReporting6 setNtrgrpTradInd(Boolean value) {
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
    public RegulatoryReporting6 setComrclOrTrsrFincgInd(Boolean value) {
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
    public RegulatoryReporting6 setFinInstrmId(SecurityIdentification19 value) {
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
    public XMLGregorianCalendar getConfDtAndTmstmp() {
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
    public RegulatoryReporting6 setConfDtAndTmstmp(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getClrTmstmp() {
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
    public RegulatoryReporting6 setClrTmstmp(XMLGregorianCalendar value) {
        this.clrTmstmp = value;
        return this;
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
    public RegulatoryReporting6 setAddtlRptgInf(String value) {
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
    public RegulatoryReporting6 addTradgSdTxRptg(TradingSideTransactionReporting1 tradgSdTxRptg) {
        getTradgSdTxRptg().add(tradgSdTxRptg);
        return this;
    }

    /**
     * Adds a new item to the ctrPtySdTxRptg list.
     * @see #getCtrPtySdTxRptg()
     * 
     */
    public RegulatoryReporting6 addCtrPtySdTxRptg(CounterpartySideTransactionReporting1 ctrPtySdTxRptg) {
        getCtrPtySdTxRptg().add(ctrPtySdTxRptg);
        return this;
    }

}
