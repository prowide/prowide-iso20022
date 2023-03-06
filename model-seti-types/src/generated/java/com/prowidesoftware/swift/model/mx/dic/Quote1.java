
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Proposition of price for a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quote1", propOrder = {
    "tp",
    "qlfr",
    "vldUntilDtTm",
    "qtOrgtr",
    "qtOrgtrRole",
    "rqstrElgblty",
    "ccy",
    "sprdAndBchmkCrvDtls",
    "offerYld",
    "midYld",
    "bidYld",
    "srcOfQt",
    "finInstrmDtls",
    "undrlygFinInstrmDtls",
    "finInstrmAttrbts",
    "stiptns",
    "undrlygFinAttrbts",
    "undrlygStiptns"
})
public class Quote1 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected QuoteType1Code tp;
    @XmlElement(name = "Qlfr")
    @XmlSchemaType(name = "string")
    protected List<Qualifier1Code> qlfr;
    @XmlElement(name = "VldUntilDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldUntilDtTm;
    @XmlElement(name = "QtOrgtr")
    protected PartyIdentification24Choice qtOrgtr;
    @XmlElement(name = "QtOrgtrRole")
    @XmlSchemaType(name = "string")
    protected OriginatorRole1Code qtOrgtrRole;
    @XmlElement(name = "RqstrElgblty")
    @XmlSchemaType(name = "string")
    protected Eligibility1Code rqstrElgblty;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "SprdAndBchmkCrvDtls")
    protected BenchmarkCurve1 sprdAndBchmkCrvDtls;
    @XmlElement(name = "OfferYld")
    protected YieldCalculation1 offerYld;
    @XmlElement(name = "MidYld")
    protected YieldCalculation1 midYld;
    @XmlElement(name = "BidYld")
    protected YieldCalculation1 bidYld;
    @XmlElement(name = "SrcOfQt")
    protected PartyIdentification25Choice srcOfQt;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected SecurityIdentification7 finInstrmDtls;
    @XmlElement(name = "UndrlygFinInstrmDtls")
    protected List<SecurityIdentification7> undrlygFinInstrmDtls;
    @XmlElement(name = "FinInstrmAttrbts", required = true)
    protected FinancialInstrumentAttributes1 finInstrmAttrbts;
    @XmlElement(name = "Stiptns")
    protected FinancialInstrumentStipulations stiptns;
    @XmlElement(name = "UndrlygFinAttrbts")
    protected List<FinancialInstrumentAttributes1> undrlygFinAttrbts;
    @XmlElement(name = "UndrlygStiptns")
    protected List<FinancialInstrumentStipulations> undrlygStiptns;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteType1Code }
     *     
     */
    public QuoteType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteType1Code }
     *     
     */
    public Quote1 setTp(QuoteType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the qlfr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qlfr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQlfr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Qualifier1Code }
     * 
     * 
     */
    public List<Qualifier1Code> getQlfr() {
        if (qlfr == null) {
            qlfr = new ArrayList<Qualifier1Code>();
        }
        return this.qlfr;
    }

    /**
     * Gets the value of the vldUntilDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVldUntilDtTm() {
        return vldUntilDtTm;
    }

    /**
     * Sets the value of the vldUntilDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Quote1 setVldUntilDtTm(XMLGregorianCalendar value) {
        this.vldUntilDtTm = value;
        return this;
    }

    /**
     * Gets the value of the qtOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification24Choice }
     *     
     */
    public PartyIdentification24Choice getQtOrgtr() {
        return qtOrgtr;
    }

    /**
     * Sets the value of the qtOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification24Choice }
     *     
     */
    public Quote1 setQtOrgtr(PartyIdentification24Choice value) {
        this.qtOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the qtOrgtrRole property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorRole1Code }
     *     
     */
    public OriginatorRole1Code getQtOrgtrRole() {
        return qtOrgtrRole;
    }

    /**
     * Sets the value of the qtOrgtrRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorRole1Code }
     *     
     */
    public Quote1 setQtOrgtrRole(OriginatorRole1Code value) {
        this.qtOrgtrRole = value;
        return this;
    }

    /**
     * Gets the value of the rqstrElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link Eligibility1Code }
     *     
     */
    public Eligibility1Code getRqstrElgblty() {
        return rqstrElgblty;
    }

    /**
     * Sets the value of the rqstrElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligibility1Code }
     *     
     */
    public Quote1 setRqstrElgblty(Eligibility1Code value) {
        this.rqstrElgblty = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Quote1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the sprdAndBchmkCrvDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurve1 }
     *     
     */
    public BenchmarkCurve1 getSprdAndBchmkCrvDtls() {
        return sprdAndBchmkCrvDtls;
    }

    /**
     * Sets the value of the sprdAndBchmkCrvDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurve1 }
     *     
     */
    public Quote1 setSprdAndBchmkCrvDtls(BenchmarkCurve1 value) {
        this.sprdAndBchmkCrvDtls = value;
        return this;
    }

    /**
     * Gets the value of the offerYld property.
     * 
     * @return
     *     possible object is
     *     {@link YieldCalculation1 }
     *     
     */
    public YieldCalculation1 getOfferYld() {
        return offerYld;
    }

    /**
     * Sets the value of the offerYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldCalculation1 }
     *     
     */
    public Quote1 setOfferYld(YieldCalculation1 value) {
        this.offerYld = value;
        return this;
    }

    /**
     * Gets the value of the midYld property.
     * 
     * @return
     *     possible object is
     *     {@link YieldCalculation1 }
     *     
     */
    public YieldCalculation1 getMidYld() {
        return midYld;
    }

    /**
     * Sets the value of the midYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldCalculation1 }
     *     
     */
    public Quote1 setMidYld(YieldCalculation1 value) {
        this.midYld = value;
        return this;
    }

    /**
     * Gets the value of the bidYld property.
     * 
     * @return
     *     possible object is
     *     {@link YieldCalculation1 }
     *     
     */
    public YieldCalculation1 getBidYld() {
        return bidYld;
    }

    /**
     * Sets the value of the bidYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldCalculation1 }
     *     
     */
    public Quote1 setBidYld(YieldCalculation1 value) {
        this.bidYld = value;
        return this;
    }

    /**
     * Gets the value of the srcOfQt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification25Choice }
     *     
     */
    public PartyIdentification25Choice getSrcOfQt() {
        return srcOfQt;
    }

    /**
     * Sets the value of the srcOfQt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification25Choice }
     *     
     */
    public Quote1 setSrcOfQt(PartyIdentification25Choice value) {
        this.srcOfQt = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public Quote1 setFinInstrmDtls(SecurityIdentification7 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinInstrmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygFinInstrmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification7 }
     * 
     * 
     */
    public List<SecurityIdentification7> getUndrlygFinInstrmDtls() {
        if (undrlygFinInstrmDtls == null) {
            undrlygFinInstrmDtls = new ArrayList<SecurityIdentification7>();
        }
        return this.undrlygFinInstrmDtls;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public FinancialInstrumentAttributes1 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes1 }
     *     
     */
    public Quote1 setFinInstrmAttrbts(FinancialInstrumentAttributes1 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the stiptns property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentStipulations }
     *     
     */
    public FinancialInstrumentStipulations getStiptns() {
        return stiptns;
    }

    /**
     * Sets the value of the stiptns property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentStipulations }
     *     
     */
    public Quote1 setStiptns(FinancialInstrumentStipulations value) {
        this.stiptns = value;
        return this;
    }

    /**
     * Gets the value of the undrlygFinAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygFinAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributes1 }
     * 
     * 
     */
    public List<FinancialInstrumentAttributes1> getUndrlygFinAttrbts() {
        if (undrlygFinAttrbts == null) {
            undrlygFinAttrbts = new ArrayList<FinancialInstrumentAttributes1>();
        }
        return this.undrlygFinAttrbts;
    }

    /**
     * Gets the value of the undrlygStiptns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygStiptns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygStiptns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentStipulations }
     * 
     * 
     */
    public List<FinancialInstrumentStipulations> getUndrlygStiptns() {
        if (undrlygStiptns == null) {
            undrlygStiptns = new ArrayList<FinancialInstrumentStipulations>();
        }
        return this.undrlygStiptns;
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
     * Adds a new item to the qlfr list.
     * @see #getQlfr()
     * 
     */
    public Quote1 addQlfr(Qualifier1Code qlfr) {
        getQlfr().add(qlfr);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmDtls list.
     * @see #getUndrlygFinInstrmDtls()
     * 
     */
    public Quote1 addUndrlygFinInstrmDtls(SecurityIdentification7 undrlygFinInstrmDtls) {
        getUndrlygFinInstrmDtls().add(undrlygFinInstrmDtls);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinAttrbts list.
     * @see #getUndrlygFinAttrbts()
     * 
     */
    public Quote1 addUndrlygFinAttrbts(FinancialInstrumentAttributes1 undrlygFinAttrbts) {
        getUndrlygFinAttrbts().add(undrlygFinAttrbts);
        return this;
    }

    /**
     * Adds a new item to the undrlygStiptns list.
     * @see #getUndrlygStiptns()
     * 
     */
    public Quote1 addUndrlygStiptns(FinancialInstrumentStipulations undrlygStiptns) {
        getUndrlygStiptns().add(undrlygStiptns);
        return this;
    }

}
