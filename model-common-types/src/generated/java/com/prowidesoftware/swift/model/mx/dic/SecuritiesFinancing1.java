
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * An agreement between two parties, a seller and a buyer, by which the seller agrees at the time of the agreement to re-purchase the sold securities at an agreed price. The two parts of the agreement are called the two "legs".
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancing1", propOrder = {
    "rateTp",
    "intrstCmptnMtd",
    "rvaltnInd",
    "scndLegId",
    "id",
    "varblRateSpprt",
    "txCallDely",
    "ttlNbOfCollInstrs",
    "scndLegNrrtv",
    "rateChngDtTm",
    "termntnDtTm",
    "sctiesHrcut",
    "stockLnMrgn",
    "rp",
    "pricg",
    "sprd",
    "frftAmt",
    "dealAmt",
    "acrdIntrstAmt",
    "termntnAmtPerPcsOfColl",
    "prmAmt",
    "fincgAgrmt",
    "lglFrmwk",
    "termntnTxAmt"
})
public class SecuritiesFinancing1 {

    @XmlElement(name = "RateTp")
    protected RateType3Choice rateTp;
    @XmlElement(name = "IntrstCmptnMtd")
    protected InterestComputationMethod1Choice intrstCmptnMtd;
    @XmlElement(name = "RvaltnInd")
    protected Revaluation1Choice rvaltnInd;
    @XmlElement(name = "ScndLegId")
    protected String scndLegId;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "VarblRateSpprt")
    protected RateName1 varblRateSpprt;
    @XmlElement(name = "TxCallDely")
    protected String txCallDely;
    @XmlElement(name = "TtlNbOfCollInstrs")
    protected String ttlNbOfCollInstrs;
    @XmlElement(name = "ScndLegNrrtv")
    protected String scndLegNrrtv;
    @XmlElement(name = "RateChngDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rateChngDtTm;
    @XmlElement(name = "TermntnDtTm")
    protected TerminationDate1Choice termntnDtTm;
    @XmlElement(name = "SctiesHrcut")
    protected Rate2 sctiesHrcut;
    @XmlElement(name = "StockLnMrgn")
    protected Rate2 stockLnMrgn;
    @XmlElement(name = "Rp")
    protected Rate2 rp;
    @XmlElement(name = "Pricg")
    protected RateOrName1Choice pricg;
    @XmlElement(name = "Sprd")
    protected SpreadRate1 sprd;
    @XmlElement(name = "FrftAmt")
    protected AmountAndDirection5 frftAmt;
    @XmlElement(name = "DealAmt")
    protected AmountAndDirection5 dealAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection5 acrdIntrstAmt;
    @XmlElement(name = "TermntnAmtPerPcsOfColl")
    protected AmountAndDirection5 termntnAmtPerPcsOfColl;
    @XmlElement(name = "PrmAmt")
    protected AmountAndDirection5 prmAmt;
    @XmlElement(name = "FincgAgrmt")
    protected Agreement1 fincgAgrmt;
    @XmlElement(name = "LglFrmwk")
    @XmlSchemaType(name = "string")
    protected LegalFramework1Code lglFrmwk;
    @XmlElement(name = "TermntnTxAmt")
    protected AmountAndDirection5 termntnTxAmt;

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType3Choice }
     *     
     */
    public RateType3Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType3Choice }
     *     
     */
    public SecuritiesFinancing1 setRateTp(RateType3Choice value) {
        this.rateTp = value;
        return this;
    }

    /**
     * Gets the value of the intrstCmptnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod1Choice }
     *     
     */
    public InterestComputationMethod1Choice getIntrstCmptnMtd() {
        return intrstCmptnMtd;
    }

    /**
     * Sets the value of the intrstCmptnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod1Choice }
     *     
     */
    public SecuritiesFinancing1 setIntrstCmptnMtd(InterestComputationMethod1Choice value) {
        this.intrstCmptnMtd = value;
        return this;
    }

    /**
     * Gets the value of the rvaltnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Revaluation1Choice }
     *     
     */
    public Revaluation1Choice getRvaltnInd() {
        return rvaltnInd;
    }

    /**
     * Sets the value of the rvaltnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revaluation1Choice }
     *     
     */
    public SecuritiesFinancing1 setRvaltnInd(Revaluation1Choice value) {
        this.rvaltnInd = value;
        return this;
    }

    /**
     * Gets the value of the scndLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndLegId() {
        return scndLegId;
    }

    /**
     * Sets the value of the scndLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancing1 setScndLegId(String value) {
        this.scndLegId = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancing1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the varblRateSpprt property.
     * 
     * @return
     *     possible object is
     *     {@link RateName1 }
     *     
     */
    public RateName1 getVarblRateSpprt() {
        return varblRateSpprt;
    }

    /**
     * Sets the value of the varblRateSpprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateName1 }
     *     
     */
    public SecuritiesFinancing1 setVarblRateSpprt(RateName1 value) {
        this.varblRateSpprt = value;
        return this;
    }

    /**
     * Gets the value of the txCallDely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCallDely() {
        return txCallDely;
    }

    /**
     * Sets the value of the txCallDely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancing1 setTxCallDely(String value) {
        this.txCallDely = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfCollInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfCollInstrs() {
        return ttlNbOfCollInstrs;
    }

    /**
     * Sets the value of the ttlNbOfCollInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancing1 setTtlNbOfCollInstrs(String value) {
        this.ttlNbOfCollInstrs = value;
        return this;
    }

    /**
     * Gets the value of the scndLegNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndLegNrrtv() {
        return scndLegNrrtv;
    }

    /**
     * Sets the value of the scndLegNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancing1 setScndLegNrrtv(String value) {
        this.scndLegNrrtv = value;
        return this;
    }

    /**
     * Gets the value of the rateChngDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRateChngDtTm() {
        return rateChngDtTm;
    }

    /**
     * Sets the value of the rateChngDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancing1 setRateChngDtTm(XMLGregorianCalendar value) {
        this.rateChngDtTm = value;
        return this;
    }

    /**
     * Gets the value of the termntnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationDate1Choice }
     *     
     */
    public TerminationDate1Choice getTermntnDtTm() {
        return termntnDtTm;
    }

    /**
     * Sets the value of the termntnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationDate1Choice }
     *     
     */
    public SecuritiesFinancing1 setTermntnDtTm(TerminationDate1Choice value) {
        this.termntnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the sctiesHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getSctiesHrcut() {
        return sctiesHrcut;
    }

    /**
     * Sets the value of the sctiesHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancing1 setSctiesHrcut(Rate2 value) {
        this.sctiesHrcut = value;
        return this;
    }

    /**
     * Gets the value of the stockLnMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getStockLnMrgn() {
        return stockLnMrgn;
    }

    /**
     * Sets the value of the stockLnMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancing1 setStockLnMrgn(Rate2 value) {
        this.stockLnMrgn = value;
        return this;
    }

    /**
     * Gets the value of the rp property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getRp() {
        return rp;
    }

    /**
     * Sets the value of the rp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancing1 setRp(Rate2 value) {
        this.rp = value;
        return this;
    }

    /**
     * Gets the value of the pricg property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName1Choice }
     *     
     */
    public RateOrName1Choice getPricg() {
        return pricg;
    }

    /**
     * Sets the value of the pricg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName1Choice }
     *     
     */
    public SecuritiesFinancing1 setPricg(RateOrName1Choice value) {
        this.pricg = value;
        return this;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadRate1 }
     *     
     */
    public SpreadRate1 getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadRate1 }
     *     
     */
    public SecuritiesFinancing1 setSprd(SpreadRate1 value) {
        this.sprd = value;
        return this;
    }

    /**
     * Gets the value of the frftAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getFrftAmt() {
        return frftAmt;
    }

    /**
     * Sets the value of the frftAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public SecuritiesFinancing1 setFrftAmt(AmountAndDirection5 value) {
        this.frftAmt = value;
        return this;
    }

    /**
     * Gets the value of the dealAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getDealAmt() {
        return dealAmt;
    }

    /**
     * Sets the value of the dealAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public SecuritiesFinancing1 setDealAmt(AmountAndDirection5 value) {
        this.dealAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public SecuritiesFinancing1 setAcrdIntrstAmt(AmountAndDirection5 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the termntnAmtPerPcsOfColl property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getTermntnAmtPerPcsOfColl() {
        return termntnAmtPerPcsOfColl;
    }

    /**
     * Sets the value of the termntnAmtPerPcsOfColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public SecuritiesFinancing1 setTermntnAmtPerPcsOfColl(AmountAndDirection5 value) {
        this.termntnAmtPerPcsOfColl = value;
        return this;
    }

    /**
     * Gets the value of the prmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getPrmAmt() {
        return prmAmt;
    }

    /**
     * Sets the value of the prmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public SecuritiesFinancing1 setPrmAmt(AmountAndDirection5 value) {
        this.prmAmt = value;
        return this;
    }

    /**
     * Gets the value of the fincgAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement1 }
     *     
     */
    public Agreement1 getFincgAgrmt() {
        return fincgAgrmt;
    }

    /**
     * Sets the value of the fincgAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement1 }
     *     
     */
    public SecuritiesFinancing1 setFincgAgrmt(Agreement1 value) {
        this.fincgAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the lglFrmwk property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFramework1Code }
     *     
     */
    public LegalFramework1Code getLglFrmwk() {
        return lglFrmwk;
    }

    /**
     * Sets the value of the lglFrmwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFramework1Code }
     *     
     */
    public SecuritiesFinancing1 setLglFrmwk(LegalFramework1Code value) {
        this.lglFrmwk = value;
        return this;
    }

    /**
     * Gets the value of the termntnTxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getTermntnTxAmt() {
        return termntnTxAmt;
    }

    /**
     * Sets the value of the termntnTxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public SecuritiesFinancing1 setTermntnTxAmt(AmountAndDirection5 value) {
        this.termntnTxAmt = value;
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
