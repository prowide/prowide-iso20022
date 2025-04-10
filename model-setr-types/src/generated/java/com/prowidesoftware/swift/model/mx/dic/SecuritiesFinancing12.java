
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the closing of the securities financing transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancing12", propOrder = {
    "rateChngDt",
    "rateTp",
    "rvaltn",
    "lglFrmwk",
    "intrstCmptnMtd",
    "varblRateSpprt",
    "rpRate",
    "stockLnMrgn",
    "sctiesHrcut",
    "pricgRate",
    "sprdRate",
    "cllblTradInd",
    "txCallDely",
    "acrdIntrstAmt",
    "acrdIntrstPctg",
    "frftAmt",
    "prmAmt",
    "clsgAmtPerPcsOfColl",
    "ttlNbOfCollInstrs",
    "fincgAgrmt",
    "lndgTxMtd",
    "lndgWthColl",
    "brrwgRsn",
    "collTp",
    "ctrctTermsModChngd",
    "intrstRate",
    "brrwgRate",
    "stdCollRatio",
    "dvddRatio",
    "nbOfDaysLndgBrrwg",
    "stdCollAmt",
    "acrdIntrstTax",
    "endNbOfDaysAcrd",
    "endFctr",
    "sctiesLndgTp",
    "rvsbl",
    "minDtForCallBck",
    "rollOver",
    "prdcPmt",
    "exCpn"
})
public class SecuritiesFinancing12 {

    @XmlElement(name = "RateChngDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rateChngDt;
    @XmlElement(name = "RateTp")
    protected RateType35Choice rateTp;
    @XmlElement(name = "Rvaltn")
    protected Revaluation3Choice rvaltn;
    @XmlElement(name = "LglFrmwk")
    @XmlSchemaType(name = "string")
    protected LegalFramework1Code lglFrmwk;
    @XmlElement(name = "IntrstCmptnMtd")
    protected InterestComputationMethod3Choice intrstCmptnMtd;
    @XmlElement(name = "VarblRateSpprt")
    protected RateName1 varblRateSpprt;
    @XmlElement(name = "RpRate")
    protected Rate2 rpRate;
    @XmlElement(name = "StockLnMrgn")
    protected Rate2 stockLnMrgn;
    @XmlElement(name = "SctiesHrcut")
    protected Rate2 sctiesHrcut;
    @XmlElement(name = "PricgRate")
    protected RateOrName1Choice pricgRate;
    @XmlElement(name = "SprdRate")
    protected SpreadRate1 sprdRate;
    @XmlElement(name = "CllblTradInd")
    protected Boolean cllblTradInd;
    @XmlElement(name = "TxCallDely")
    protected String txCallDely;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection5 acrdIntrstAmt;
    @XmlElement(name = "AcrdIntrstPctg")
    protected BigDecimal acrdIntrstPctg;
    @XmlElement(name = "FrftAmt")
    protected AmountAndDirection5 frftAmt;
    @XmlElement(name = "PrmAmt")
    protected AmountAndDirection5 prmAmt;
    @XmlElement(name = "ClsgAmtPerPcsOfColl")
    protected AmountAndDirection5 clsgAmtPerPcsOfColl;
    @XmlElement(name = "TtlNbOfCollInstrs")
    protected String ttlNbOfCollInstrs;
    @XmlElement(name = "FincgAgrmt")
    protected Agreement5 fincgAgrmt;
    @XmlElement(name = "LndgTxMtd")
    protected LendingTransactionMethod2Choice lndgTxMtd;
    @XmlElement(name = "LndgWthColl")
    protected Boolean lndgWthColl;
    @XmlElement(name = "BrrwgRsn")
    protected BorrowingReason2Choice brrwgRsn;
    @XmlElement(name = "CollTp")
    protected CollateralType4Choice collTp;
    @XmlElement(name = "CtrctTermsModChngd")
    protected Boolean ctrctTermsModChngd;
    @XmlElement(name = "IntrstRate")
    protected Rate2 intrstRate;
    @XmlElement(name = "BrrwgRate")
    protected Rate2 brrwgRate;
    @XmlElement(name = "StdCollRatio")
    protected Rate2 stdCollRatio;
    @XmlElement(name = "DvddRatio")
    protected Rate2 dvddRatio;
    @XmlElement(name = "NbOfDaysLndgBrrwg")
    protected Number24Choice nbOfDaysLndgBrrwg;
    @XmlElement(name = "StdCollAmt")
    protected AmountAndDirection5 stdCollAmt;
    @XmlElement(name = "AcrdIntrstTax")
    protected Boolean acrdIntrstTax;
    @XmlElement(name = "EndNbOfDaysAcrd")
    protected BigDecimal endNbOfDaysAcrd;
    @XmlElement(name = "EndFctr")
    protected BigDecimal endFctr;
    @XmlElement(name = "SctiesLndgTp")
    protected SecuritiesLendingType2Choice sctiesLndgTp;
    @XmlElement(name = "Rvsbl")
    protected Reversible2Choice rvsbl;
    @XmlElement(name = "MinDtForCallBck", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar minDtForCallBck;
    @XmlElement(name = "RollOver")
    protected Boolean rollOver;
    @XmlElement(name = "PrdcPmt")
    protected Boolean prdcPmt;
    @XmlElement(name = "ExCpn")
    protected Boolean exCpn;

    /**
     * Gets the value of the rateChngDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRateChngDt() {
        return rateChngDt;
    }

    /**
     * Sets the value of the rateChngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancing12 setRateChngDt(XMLGregorianCalendar value) {
        this.rateChngDt = value;
        return this;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType35Choice }
     *     
     */
    public RateType35Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType35Choice }
     *     
     */
    public SecuritiesFinancing12 setRateTp(RateType35Choice value) {
        this.rateTp = value;
        return this;
    }

    /**
     * Gets the value of the rvaltn property.
     * 
     * @return
     *     possible object is
     *     {@link Revaluation3Choice }
     *     
     */
    public Revaluation3Choice getRvaltn() {
        return rvaltn;
    }

    /**
     * Sets the value of the rvaltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revaluation3Choice }
     *     
     */
    public SecuritiesFinancing12 setRvaltn(Revaluation3Choice value) {
        this.rvaltn = value;
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
    public SecuritiesFinancing12 setLglFrmwk(LegalFramework1Code value) {
        this.lglFrmwk = value;
        return this;
    }

    /**
     * Gets the value of the intrstCmptnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod3Choice }
     *     
     */
    public InterestComputationMethod3Choice getIntrstCmptnMtd() {
        return intrstCmptnMtd;
    }

    /**
     * Sets the value of the intrstCmptnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod3Choice }
     *     
     */
    public SecuritiesFinancing12 setIntrstCmptnMtd(InterestComputationMethod3Choice value) {
        this.intrstCmptnMtd = value;
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
    public SecuritiesFinancing12 setVarblRateSpprt(RateName1 value) {
        this.varblRateSpprt = value;
        return this;
    }

    /**
     * Gets the value of the rpRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getRpRate() {
        return rpRate;
    }

    /**
     * Sets the value of the rpRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancing12 setRpRate(Rate2 value) {
        this.rpRate = value;
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
    public SecuritiesFinancing12 setStockLnMrgn(Rate2 value) {
        this.stockLnMrgn = value;
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
    public SecuritiesFinancing12 setSctiesHrcut(Rate2 value) {
        this.sctiesHrcut = value;
        return this;
    }

    /**
     * Gets the value of the pricgRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName1Choice }
     *     
     */
    public RateOrName1Choice getPricgRate() {
        return pricgRate;
    }

    /**
     * Sets the value of the pricgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName1Choice }
     *     
     */
    public SecuritiesFinancing12 setPricgRate(RateOrName1Choice value) {
        this.pricgRate = value;
        return this;
    }

    /**
     * Gets the value of the sprdRate property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadRate1 }
     *     
     */
    public SpreadRate1 getSprdRate() {
        return sprdRate;
    }

    /**
     * Sets the value of the sprdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadRate1 }
     *     
     */
    public SecuritiesFinancing12 setSprdRate(SpreadRate1 value) {
        this.sprdRate = value;
        return this;
    }

    /**
     * Gets the value of the cllblTradInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCllblTradInd() {
        return cllblTradInd;
    }

    /**
     * Sets the value of the cllblTradInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesFinancing12 setCllblTradInd(Boolean value) {
        this.cllblTradInd = value;
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
    public SecuritiesFinancing12 setTxCallDely(String value) {
        this.txCallDely = value;
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
    public SecuritiesFinancing12 setAcrdIntrstAmt(AmountAndDirection5 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcrdIntrstPctg() {
        return acrdIntrstPctg;
    }

    /**
     * Sets the value of the acrdIntrstPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesFinancing12 setAcrdIntrstPctg(BigDecimal value) {
        this.acrdIntrstPctg = value;
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
    public SecuritiesFinancing12 setFrftAmt(AmountAndDirection5 value) {
        this.frftAmt = value;
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
    public SecuritiesFinancing12 setPrmAmt(AmountAndDirection5 value) {
        this.prmAmt = value;
        return this;
    }

    /**
     * Gets the value of the clsgAmtPerPcsOfColl property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getClsgAmtPerPcsOfColl() {
        return clsgAmtPerPcsOfColl;
    }

    /**
     * Sets the value of the clsgAmtPerPcsOfColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public SecuritiesFinancing12 setClsgAmtPerPcsOfColl(AmountAndDirection5 value) {
        this.clsgAmtPerPcsOfColl = value;
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
    public SecuritiesFinancing12 setTtlNbOfCollInstrs(String value) {
        this.ttlNbOfCollInstrs = value;
        return this;
    }

    /**
     * Gets the value of the fincgAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement5 }
     *     
     */
    public Agreement5 getFincgAgrmt() {
        return fincgAgrmt;
    }

    /**
     * Sets the value of the fincgAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement5 }
     *     
     */
    public SecuritiesFinancing12 setFincgAgrmt(Agreement5 value) {
        this.fincgAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the lndgTxMtd property.
     * 
     * @return
     *     possible object is
     *     {@link LendingTransactionMethod2Choice }
     *     
     */
    public LendingTransactionMethod2Choice getLndgTxMtd() {
        return lndgTxMtd;
    }

    /**
     * Sets the value of the lndgTxMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link LendingTransactionMethod2Choice }
     *     
     */
    public SecuritiesFinancing12 setLndgTxMtd(LendingTransactionMethod2Choice value) {
        this.lndgTxMtd = value;
        return this;
    }

    /**
     * Gets the value of the lndgWthColl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLndgWthColl() {
        return lndgWthColl;
    }

    /**
     * Sets the value of the lndgWthColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesFinancing12 setLndgWthColl(Boolean value) {
        this.lndgWthColl = value;
        return this;
    }

    /**
     * Gets the value of the brrwgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link BorrowingReason2Choice }
     *     
     */
    public BorrowingReason2Choice getBrrwgRsn() {
        return brrwgRsn;
    }

    /**
     * Sets the value of the brrwgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorrowingReason2Choice }
     *     
     */
    public SecuritiesFinancing12 setBrrwgRsn(BorrowingReason2Choice value) {
        this.brrwgRsn = value;
        return this;
    }

    /**
     * Gets the value of the collTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType4Choice }
     *     
     */
    public CollateralType4Choice getCollTp() {
        return collTp;
    }

    /**
     * Sets the value of the collTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType4Choice }
     *     
     */
    public SecuritiesFinancing12 setCollTp(CollateralType4Choice value) {
        this.collTp = value;
        return this;
    }

    /**
     * Gets the value of the ctrctTermsModChngd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtrctTermsModChngd() {
        return ctrctTermsModChngd;
    }

    /**
     * Sets the value of the ctrctTermsModChngd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesFinancing12 setCtrctTermsModChngd(Boolean value) {
        this.ctrctTermsModChngd = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancing12 setIntrstRate(Rate2 value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the brrwgRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getBrrwgRate() {
        return brrwgRate;
    }

    /**
     * Sets the value of the brrwgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancing12 setBrrwgRate(Rate2 value) {
        this.brrwgRate = value;
        return this;
    }

    /**
     * Gets the value of the stdCollRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getStdCollRatio() {
        return stdCollRatio;
    }

    /**
     * Sets the value of the stdCollRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancing12 setStdCollRatio(Rate2 value) {
        this.stdCollRatio = value;
        return this;
    }

    /**
     * Gets the value of the dvddRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getDvddRatio() {
        return dvddRatio;
    }

    /**
     * Sets the value of the dvddRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public SecuritiesFinancing12 setDvddRatio(Rate2 value) {
        this.dvddRatio = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDaysLndgBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link Number24Choice }
     *     
     */
    public Number24Choice getNbOfDaysLndgBrrwg() {
        return nbOfDaysLndgBrrwg;
    }

    /**
     * Sets the value of the nbOfDaysLndgBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Number24Choice }
     *     
     */
    public SecuritiesFinancing12 setNbOfDaysLndgBrrwg(Number24Choice value) {
        this.nbOfDaysLndgBrrwg = value;
        return this;
    }

    /**
     * Gets the value of the stdCollAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getStdCollAmt() {
        return stdCollAmt;
    }

    /**
     * Sets the value of the stdCollAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public SecuritiesFinancing12 setStdCollAmt(AmountAndDirection5 value) {
        this.stdCollAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcrdIntrstTax() {
        return acrdIntrstTax;
    }

    /**
     * Sets the value of the acrdIntrstTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesFinancing12 setAcrdIntrstTax(Boolean value) {
        this.acrdIntrstTax = value;
        return this;
    }

    /**
     * Gets the value of the endNbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndNbOfDaysAcrd() {
        return endNbOfDaysAcrd;
    }

    /**
     * Sets the value of the endNbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesFinancing12 setEndNbOfDaysAcrd(BigDecimal value) {
        this.endNbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the endFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndFctr() {
        return endFctr;
    }

    /**
     * Sets the value of the endFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SecuritiesFinancing12 setEndFctr(BigDecimal value) {
        this.endFctr = value;
        return this;
    }

    /**
     * Gets the value of the sctiesLndgTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesLendingType2Choice }
     *     
     */
    public SecuritiesLendingType2Choice getSctiesLndgTp() {
        return sctiesLndgTp;
    }

    /**
     * Sets the value of the sctiesLndgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesLendingType2Choice }
     *     
     */
    public SecuritiesFinancing12 setSctiesLndgTp(SecuritiesLendingType2Choice value) {
        this.sctiesLndgTp = value;
        return this;
    }

    /**
     * Gets the value of the rvsbl property.
     * 
     * @return
     *     possible object is
     *     {@link Reversible2Choice }
     *     
     */
    public Reversible2Choice getRvsbl() {
        return rvsbl;
    }

    /**
     * Sets the value of the rvsbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reversible2Choice }
     *     
     */
    public SecuritiesFinancing12 setRvsbl(Reversible2Choice value) {
        this.rvsbl = value;
        return this;
    }

    /**
     * Gets the value of the minDtForCallBck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getMinDtForCallBck() {
        return minDtForCallBck;
    }

    /**
     * Sets the value of the minDtForCallBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesFinancing12 setMinDtForCallBck(XMLGregorianCalendar value) {
        this.minDtForCallBck = value;
        return this;
    }

    /**
     * Gets the value of the rollOver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRollOver() {
        return rollOver;
    }

    /**
     * Sets the value of the rollOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesFinancing12 setRollOver(Boolean value) {
        this.rollOver = value;
        return this;
    }

    /**
     * Gets the value of the prdcPmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrdcPmt() {
        return prdcPmt;
    }

    /**
     * Sets the value of the prdcPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesFinancing12 setPrdcPmt(Boolean value) {
        this.prdcPmt = value;
        return this;
    }

    /**
     * Gets the value of the exCpn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExCpn() {
        return exCpn;
    }

    /**
     * Sets the value of the exCpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesFinancing12 setExCpn(Boolean value) {
        this.exCpn = value;
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
