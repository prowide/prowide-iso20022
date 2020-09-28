
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Characteristics of a tax efficient product.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxEfficientProduct5", propOrder = {
    "taxEffcntPdctTp",
    "curYr",
    "cshCmpntInd",
    "prvsYrs",
    "prvsYrSbcptAmt",
    "prvsYrsSbcptAmt",
    "dtOfFrstSbcpt",
    "curYrSbcptDtls",
    "bnsOrWdrwl",
    "trfrAltrnId",
    "ttlSbcptAmt",
    "othrAmt",
    "dtFrstQlfygAddtn",
    "invstrTaxRef",
    "invstmtsToFllwVal",
    "innvtvFinc",
    "lwstInvstdAmtCurYr",
    "taxClctnBase",
    "uusdTaxDdctn",
    "curInvstmtAmt",
    "estmtdVal",
    "addtlInf"
})
public class TaxEfficientProduct5 {

    @XmlElement(name = "TaxEffcntPdctTp", required = true)
    protected TaxEfficientProductType2Choice taxEffcntPdctTp;
    @XmlElement(name = "CurYr")
    protected Boolean curYr;
    @XmlElement(name = "CshCmpntInd")
    protected Boolean cshCmpntInd;
    @XmlElement(name = "PrvsYrs")
    protected PreviousYear4 prvsYrs;
    @XmlElement(name = "PrvsYrSbcptAmt")
    protected ActiveCurrencyAnd13DecimalAmount prvsYrSbcptAmt;
    @XmlElement(name = "PrvsYrsSbcptAmt")
    protected ActiveCurrencyAnd13DecimalAmount prvsYrsSbcptAmt;
    @XmlElement(name = "DtOfFrstSbcpt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfFrstSbcpt;
    @XmlElement(name = "CurYrSbcptDtls")
    protected SubscriptionInformation2 curYrSbcptDtls;
    @XmlElement(name = "BnsOrWdrwl")
    protected List<BonusWithdrawal2> bnsOrWdrwl;
    @XmlElement(name = "TrfrAltrnId")
    protected String trfrAltrnId;
    @XmlElement(name = "TtlSbcptAmt")
    protected ActiveCurrencyAndAmount ttlSbcptAmt;
    @XmlElement(name = "OthrAmt")
    protected List<OtherAmount3> othrAmt;
    @XmlElement(name = "DtFrstQlfygAddtn")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtFrstQlfygAddtn;
    @XmlElement(name = "InvstrTaxRef")
    protected TaxReference2 invstrTaxRef;
    @XmlElement(name = "InvstmtsToFllwVal")
    protected List<DateAndAmount2> invstmtsToFllwVal;
    @XmlElement(name = "InnvtvFinc")
    protected List<InnovativeFinance1> innvtvFinc;
    @XmlElement(name = "LwstInvstdAmtCurYr")
    protected ActiveCurrencyAnd13DecimalAmount lwstInvstdAmtCurYr;
    @XmlElement(name = "TaxClctnBase")
    protected ActiveCurrencyAnd13DecimalAmount taxClctnBase;
    @XmlElement(name = "UusdTaxDdctn")
    protected ActiveCurrencyAnd13DecimalAmount uusdTaxDdctn;
    @XmlElement(name = "CurInvstmtAmt")
    protected ActiveCurrencyAnd13DecimalAmount curInvstmtAmt;
    @XmlElement(name = "EstmtdVal")
    protected DateAndAmount2 estmtdVal;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the taxEffcntPdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEfficientProductType2Choice }
     *     
     */
    public TaxEfficientProductType2Choice getTaxEffcntPdctTp() {
        return taxEffcntPdctTp;
    }

    /**
     * Sets the value of the taxEffcntPdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEfficientProductType2Choice }
     *     
     */
    public TaxEfficientProduct5 setTaxEffcntPdctTp(TaxEfficientProductType2Choice value) {
        this.taxEffcntPdctTp = value;
        return this;
    }

    /**
     * Gets the value of the curYr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurYr() {
        return curYr;
    }

    /**
     * Sets the value of the curYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TaxEfficientProduct5 setCurYr(Boolean value) {
        this.curYr = value;
        return this;
    }

    /**
     * Gets the value of the cshCmpntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshCmpntInd() {
        return cshCmpntInd;
    }

    /**
     * Sets the value of the cshCmpntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TaxEfficientProduct5 setCshCmpntInd(Boolean value) {
        this.cshCmpntInd = value;
        return this;
    }

    /**
     * Gets the value of the prvsYrs property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousYear4 }
     *     
     */
    public PreviousYear4 getPrvsYrs() {
        return prvsYrs;
    }

    /**
     * Sets the value of the prvsYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousYear4 }
     *     
     */
    public TaxEfficientProduct5 setPrvsYrs(PreviousYear4 value) {
        this.prvsYrs = value;
        return this;
    }

    /**
     * Gets the value of the prvsYrSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getPrvsYrSbcptAmt() {
        return prvsYrSbcptAmt;
    }

    /**
     * Sets the value of the prvsYrSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TaxEfficientProduct5 setPrvsYrSbcptAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.prvsYrSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the prvsYrsSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getPrvsYrsSbcptAmt() {
        return prvsYrsSbcptAmt;
    }

    /**
     * Sets the value of the prvsYrsSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TaxEfficientProduct5 setPrvsYrsSbcptAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.prvsYrsSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the dtOfFrstSbcpt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfFrstSbcpt() {
        return dtOfFrstSbcpt;
    }

    /**
     * Sets the value of the dtOfFrstSbcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TaxEfficientProduct5 setDtOfFrstSbcpt(XMLGregorianCalendar value) {
        this.dtOfFrstSbcpt = value;
        return this;
    }

    /**
     * Gets the value of the curYrSbcptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionInformation2 }
     *     
     */
    public SubscriptionInformation2 getCurYrSbcptDtls() {
        return curYrSbcptDtls;
    }

    /**
     * Sets the value of the curYrSbcptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionInformation2 }
     *     
     */
    public TaxEfficientProduct5 setCurYrSbcptDtls(SubscriptionInformation2 value) {
        this.curYrSbcptDtls = value;
        return this;
    }

    /**
     * Gets the value of the bnsOrWdrwl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bnsOrWdrwl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnsOrWdrwl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BonusWithdrawal2 }
     * 
     * 
     */
    public List<BonusWithdrawal2> getBnsOrWdrwl() {
        if (bnsOrWdrwl == null) {
            bnsOrWdrwl = new ArrayList<BonusWithdrawal2>();
        }
        return this.bnsOrWdrwl;
    }

    /**
     * Gets the value of the trfrAltrnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfrAltrnId() {
        return trfrAltrnId;
    }

    /**
     * Sets the value of the trfrAltrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxEfficientProduct5 setTrfrAltrnId(String value) {
        this.trfrAltrnId = value;
        return this;
    }

    /**
     * Gets the value of the ttlSbcptAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlSbcptAmt() {
        return ttlSbcptAmt;
    }

    /**
     * Sets the value of the ttlSbcptAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TaxEfficientProduct5 setTtlSbcptAmt(ActiveCurrencyAndAmount value) {
        this.ttlSbcptAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmount3 }
     * 
     * 
     */
    public List<OtherAmount3> getOthrAmt() {
        if (othrAmt == null) {
            othrAmt = new ArrayList<OtherAmount3>();
        }
        return this.othrAmt;
    }

    /**
     * Gets the value of the dtFrstQlfygAddtn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFrstQlfygAddtn() {
        return dtFrstQlfygAddtn;
    }

    /**
     * Sets the value of the dtFrstQlfygAddtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TaxEfficientProduct5 setDtFrstQlfygAddtn(XMLGregorianCalendar value) {
        this.dtFrstQlfygAddtn = value;
        return this;
    }

    /**
     * Gets the value of the invstrTaxRef property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReference2 }
     *     
     */
    public TaxReference2 getInvstrTaxRef() {
        return invstrTaxRef;
    }

    /**
     * Sets the value of the invstrTaxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReference2 }
     *     
     */
    public TaxEfficientProduct5 setInvstrTaxRef(TaxReference2 value) {
        this.invstrTaxRef = value;
        return this;
    }

    /**
     * Gets the value of the invstmtsToFllwVal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invstmtsToFllwVal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstmtsToFllwVal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndAmount2 }
     * 
     * 
     */
    public List<DateAndAmount2> getInvstmtsToFllwVal() {
        if (invstmtsToFllwVal == null) {
            invstmtsToFllwVal = new ArrayList<DateAndAmount2>();
        }
        return this.invstmtsToFllwVal;
    }

    /**
     * Gets the value of the innvtvFinc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the innvtvFinc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnvtvFinc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InnovativeFinance1 }
     * 
     * 
     */
    public List<InnovativeFinance1> getInnvtvFinc() {
        if (innvtvFinc == null) {
            innvtvFinc = new ArrayList<InnovativeFinance1>();
        }
        return this.innvtvFinc;
    }

    /**
     * Gets the value of the lwstInvstdAmtCurYr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getLwstInvstdAmtCurYr() {
        return lwstInvstdAmtCurYr;
    }

    /**
     * Sets the value of the lwstInvstdAmtCurYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TaxEfficientProduct5 setLwstInvstdAmtCurYr(ActiveCurrencyAnd13DecimalAmount value) {
        this.lwstInvstdAmtCurYr = value;
        return this;
    }

    /**
     * Gets the value of the taxClctnBase property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTaxClctnBase() {
        return taxClctnBase;
    }

    /**
     * Sets the value of the taxClctnBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TaxEfficientProduct5 setTaxClctnBase(ActiveCurrencyAnd13DecimalAmount value) {
        this.taxClctnBase = value;
        return this;
    }

    /**
     * Gets the value of the uusdTaxDdctn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getUusdTaxDdctn() {
        return uusdTaxDdctn;
    }

    /**
     * Sets the value of the uusdTaxDdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TaxEfficientProduct5 setUusdTaxDdctn(ActiveCurrencyAnd13DecimalAmount value) {
        this.uusdTaxDdctn = value;
        return this;
    }

    /**
     * Gets the value of the curInvstmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getCurInvstmtAmt() {
        return curInvstmtAmt;
    }

    /**
     * Sets the value of the curInvstmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TaxEfficientProduct5 setCurInvstmtAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.curInvstmtAmt = value;
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
    public TaxEfficientProduct5 setEstmtdVal(DateAndAmount2 value) {
        this.estmtdVal = value;
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
     * Adds a new item to the bnsOrWdrwl list.
     * @see #getBnsOrWdrwl()
     * 
     */
    public TaxEfficientProduct5 addBnsOrWdrwl(BonusWithdrawal2 bnsOrWdrwl) {
        getBnsOrWdrwl().add(bnsOrWdrwl);
        return this;
    }

    /**
     * Adds a new item to the othrAmt list.
     * @see #getOthrAmt()
     * 
     */
    public TaxEfficientProduct5 addOthrAmt(OtherAmount3 othrAmt) {
        getOthrAmt().add(othrAmt);
        return this;
    }

    /**
     * Adds a new item to the invstmtsToFllwVal list.
     * @see #getInvstmtsToFllwVal()
     * 
     */
    public TaxEfficientProduct5 addInvstmtsToFllwVal(DateAndAmount2 invstmtsToFllwVal) {
        getInvstmtsToFllwVal().add(invstmtsToFllwVal);
        return this;
    }

    /**
     * Adds a new item to the innvtvFinc list.
     * @see #getInnvtvFinc()
     * 
     */
    public TaxEfficientProduct5 addInnvtvFinc(InnovativeFinance1 innvtvFinc) {
        getInnvtvFinc().add(innvtvFinc);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public TaxEfficientProduct5 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
