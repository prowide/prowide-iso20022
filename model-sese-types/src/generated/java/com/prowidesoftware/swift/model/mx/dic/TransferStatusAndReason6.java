
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Information about the status of a transfer instruction and its reason.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferStatusAndReason6", propOrder = {
    "mstrRef",
    "trfRef",
    "clntRef",
    "cxlRef",
    "trfEvtTp",
    "trfSts",
    "tradDt",
    "sttlmDt",
    "sndOutDt",
    "ttlUnitsNb",
    "avrgPric",
    "unitsDtls",
    "ttlTrfVal",
    "pmtDtls",
    "bnftCrstllstnEvt",
    "drwdwnTrch",
    "stsInitr",
    "stsIssr",
    "stsRcpt"
})
public class TransferStatusAndReason6 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "TrfEvtTp")
    protected List<TransferStatusType1Choice> trfEvtTp;
    @XmlElement(name = "TrfSts", required = true)
    protected TransferStatus3Choice trfSts;
    @XmlElement(name = "TradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar tradDt;
    @XmlElement(name = "SttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar sttlmDt;
    @XmlElement(name = "SndOutDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar sndOutDt;
    @XmlElement(name = "TtlUnitsNb")
    protected BigDecimal ttlUnitsNb;
    @XmlElement(name = "AvrgPric")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount avrgPric;
    @XmlElement(name = "UnitsDtls")
    protected List<Unit11> unitsDtls;
    @XmlElement(name = "TtlTrfVal")
    protected ActiveCurrencyAnd13DecimalAmount ttlTrfVal;
    @XmlElement(name = "PmtDtls")
    protected List<PaymentInstrument15> pmtDtls;
    @XmlElement(name = "BnftCrstllstnEvt")
    protected List<BenefitCrystallisationEvent1> bnftCrstllstnEvt;
    @XmlElement(name = "DrwdwnTrch")
    protected List<Drawdown1> drwdwnTrch;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification139 stsInitr;
    @XmlElement(name = "StsIssr")
    protected PartyIdentification139 stsIssr;
    @XmlElement(name = "StsRcpt")
    protected PartyIdentification139 stsRcpt;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason6 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason6 setTrfRef(String value) {
        this.trfRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public TransferStatusAndReason6 setClntRef(AdditionalReference10 value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason6 setCxlRef(String value) {
        this.cxlRef = value;
        return this;
    }

    /**
     * Gets the value of the trfEvtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trfEvtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrfEvtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferStatusType1Choice }
     * 
     * 
     * @return
     *     The value of the trfEvtTp property.
     */
    public List<TransferStatusType1Choice> getTrfEvtTp() {
        if (trfEvtTp == null) {
            trfEvtTp = new ArrayList<>();
        }
        return this.trfEvtTp;
    }

    /**
     * Gets the value of the trfSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferStatus3Choice }
     *     
     */
    public TransferStatus3Choice getTrfSts() {
        return trfSts;
    }

    /**
     * Sets the value of the trfSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferStatus3Choice }
     *     
     */
    public TransferStatusAndReason6 setTrfSts(TransferStatus3Choice value) {
        this.trfSts = value;
        return this;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason6 setTradDt(Calendar value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason6 setSttlmDt(Calendar value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sndOutDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSndOutDt() {
        return sndOutDt;
    }

    /**
     * Sets the value of the sndOutDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferStatusAndReason6 setSndOutDt(Calendar value) {
        this.sndOutDt = value;
        return this;
    }

    /**
     * Gets the value of the ttlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlUnitsNb() {
        return ttlUnitsNb;
    }

    /**
     * Sets the value of the ttlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransferStatusAndReason6 setTtlUnitsNb(BigDecimal value) {
        this.ttlUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the avrgPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getAvrgPric() {
        return avrgPric;
    }

    /**
     * Sets the value of the avrgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public TransferStatusAndReason6 setAvrgPric(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.avrgPric = value;
        return this;
    }

    /**
     * Gets the value of the unitsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the unitsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unit11 }
     * 
     * 
     * @return
     *     The value of the unitsDtls property.
     */
    public List<Unit11> getUnitsDtls() {
        if (unitsDtls == null) {
            unitsDtls = new ArrayList<>();
        }
        return this.unitsDtls;
    }

    /**
     * Gets the value of the ttlTrfVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTtlTrfVal() {
        return ttlTrfVal;
    }

    /**
     * Sets the value of the ttlTrfVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TransferStatusAndReason6 setTtlTrfVal(ActiveCurrencyAnd13DecimalAmount value) {
        this.ttlTrfVal = value;
        return this;
    }

    /**
     * Gets the value of the pmtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstrument15 }
     * 
     * 
     * @return
     *     The value of the pmtDtls property.
     */
    public List<PaymentInstrument15> getPmtDtls() {
        if (pmtDtls == null) {
            pmtDtls = new ArrayList<>();
        }
        return this.pmtDtls;
    }

    /**
     * Gets the value of the bnftCrstllstnEvt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bnftCrstllstnEvt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnftCrstllstnEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BenefitCrystallisationEvent1 }
     * 
     * 
     * @return
     *     The value of the bnftCrstllstnEvt property.
     */
    public List<BenefitCrystallisationEvent1> getBnftCrstllstnEvt() {
        if (bnftCrstllstnEvt == null) {
            bnftCrstllstnEvt = new ArrayList<>();
        }
        return this.bnftCrstllstnEvt;
    }

    /**
     * Gets the value of the drwdwnTrch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the drwdwnTrch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrwdwnTrch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Drawdown1 }
     * 
     * 
     * @return
     *     The value of the drwdwnTrch property.
     */
    public List<Drawdown1> getDrwdwnTrch() {
        if (drwdwnTrch == null) {
            drwdwnTrch = new ArrayList<>();
        }
        return this.drwdwnTrch;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public TransferStatusAndReason6 setStsInitr(PartyIdentification139 value) {
        this.stsInitr = value;
        return this;
    }

    /**
     * Gets the value of the stsIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getStsIssr() {
        return stsIssr;
    }

    /**
     * Sets the value of the stsIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public TransferStatusAndReason6 setStsIssr(PartyIdentification139 value) {
        this.stsIssr = value;
        return this;
    }

    /**
     * Gets the value of the stsRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getStsRcpt() {
        return stsRcpt;
    }

    /**
     * Sets the value of the stsRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public TransferStatusAndReason6 setStsRcpt(PartyIdentification139 value) {
        this.stsRcpt = value;
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
     * Adds a new item to the trfEvtTp list.
     * @see #getTrfEvtTp()
     * 
     */
    public TransferStatusAndReason6 addTrfEvtTp(TransferStatusType1Choice trfEvtTp) {
        getTrfEvtTp().add(trfEvtTp);
        return this;
    }

    /**
     * Adds a new item to the unitsDtls list.
     * @see #getUnitsDtls()
     * 
     */
    public TransferStatusAndReason6 addUnitsDtls(Unit11 unitsDtls) {
        getUnitsDtls().add(unitsDtls);
        return this;
    }

    /**
     * Adds a new item to the pmtDtls list.
     * @see #getPmtDtls()
     * 
     */
    public TransferStatusAndReason6 addPmtDtls(PaymentInstrument15 pmtDtls) {
        getPmtDtls().add(pmtDtls);
        return this;
    }

    /**
     * Adds a new item to the bnftCrstllstnEvt list.
     * @see #getBnftCrstllstnEvt()
     * 
     */
    public TransferStatusAndReason6 addBnftCrstllstnEvt(BenefitCrystallisationEvent1 bnftCrstllstnEvt) {
        getBnftCrstllstnEvt().add(bnftCrstllstnEvt);
        return this;
    }

    /**
     * Adds a new item to the drwdwnTrch list.
     * @see #getDrwdwnTrch()
     * 
     */
    public TransferStatusAndReason6 addDrwdwnTrch(Drawdown1 drwdwnTrch) {
        getDrwdwnTrch().add(drwdwnTrch);
        return this;
    }

}
