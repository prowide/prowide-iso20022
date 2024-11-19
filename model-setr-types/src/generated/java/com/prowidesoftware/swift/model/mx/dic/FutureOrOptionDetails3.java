
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoYearMonthAdapter;
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
 * Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price or contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified at a predetermined price or formula at or within a time in the future.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FutureOrOptionDetails3", propOrder = {
    "futrAndOptnCtrctTp",
    "lastDlvryDt",
    "unitOfMeasr",
    "futrDt",
    "minSz",
    "anncmntDt",
    "apprnc",
    "strpblInd",
    "posLmt",
    "nearTermPosLmt",
    "minTradgPricgIncrmt",
    "purp",
    "ctrctSttlmMnth",
    "frstDealgDt",
    "ratio",
    "ratg",
    "issePric",
    "optnRghts",
    "lastTx",
    "sprdTx"
})
public class FutureOrOptionDetails3 {

    @XmlElement(name = "FutrAndOptnCtrctTp")
    @XmlSchemaType(name = "string")
    protected FutureAndOptionContractType1Code futrAndOptnCtrctTp;
    @XmlElement(name = "LastDlvryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime lastDlvryDt;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "FutrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime futrDt;
    @XmlElement(name = "MinSz")
    protected ActiveCurrencyAndAmount minSz;
    @XmlElement(name = "AnncmntDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime anncmntDt;
    @XmlElement(name = "Apprnc")
    @XmlSchemaType(name = "string")
    protected Appearance1Code apprnc;
    @XmlElement(name = "StrpblInd")
    protected Boolean strpblInd;
    @XmlElement(name = "PosLmt")
    protected BigDecimal posLmt;
    @XmlElement(name = "NearTermPosLmt")
    protected BigDecimal nearTermPosLmt;
    @XmlElement(name = "MinTradgPricgIncrmt")
    protected BigDecimal minTradgPricgIncrmt;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "CtrctSttlmMnth", type = String.class)
    @XmlJavaTypeAdapter(IsoYearMonthAdapter.class)
    @XmlSchemaType(name = "gYearMonth")
    protected YearMonth ctrctSttlmMnth;
    @XmlElement(name = "FrstDealgDt")
    protected DateAndDateTime1Choice frstDealgDt;
    @XmlElement(name = "Ratio")
    protected List<UnderlyingRatio2> ratio;
    @XmlElement(name = "Ratg")
    protected List<Rating1> ratg;
    @XmlElement(name = "IssePric")
    protected Price14 issePric;
    @XmlElement(name = "OptnRghts")
    protected OptionRight2Choice optnRghts;
    @XmlElement(name = "LastTx")
    protected Boolean lastTx;
    @XmlElement(name = "SprdTx")
    protected Boolean sprdTx;

    /**
     * Gets the value of the futrAndOptnCtrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link FutureAndOptionContractType1Code }
     *     
     */
    public FutureAndOptionContractType1Code getFutrAndOptnCtrctTp() {
        return futrAndOptnCtrctTp;
    }

    /**
     * Sets the value of the futrAndOptnCtrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureAndOptionContractType1Code }
     *     
     */
    public FutureOrOptionDetails3 setFutrAndOptnCtrctTp(FutureAndOptionContractType1Code value) {
        this.futrAndOptnCtrctTp = value;
        return this;
    }

    /**
     * Gets the value of the lastDlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getLastDlvryDt() {
        return lastDlvryDt;
    }

    /**
     * Sets the value of the lastDlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FutureOrOptionDetails3 setLastDlvryDt(OffsetDateTime value) {
        this.lastDlvryDt = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public UnitOfMeasure1Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public FutureOrOptionDetails3 setUnitOfMeasr(UnitOfMeasure1Code value) {
        this.unitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the futrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getFutrDt() {
        return futrDt;
    }

    /**
     * Sets the value of the futrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FutureOrOptionDetails3 setFutrDt(OffsetDateTime value) {
        this.futrDt = value;
        return this;
    }

    /**
     * Gets the value of the minSz property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMinSz() {
        return minSz;
    }

    /**
     * Sets the value of the minSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public FutureOrOptionDetails3 setMinSz(ActiveCurrencyAndAmount value) {
        this.minSz = value;
        return this;
    }

    /**
     * Gets the value of the anncmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getAnncmntDt() {
        return anncmntDt;
    }

    /**
     * Sets the value of the anncmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FutureOrOptionDetails3 setAnncmntDt(OffsetDateTime value) {
        this.anncmntDt = value;
        return this;
    }

    /**
     * Gets the value of the apprnc property.
     * 
     * @return
     *     possible object is
     *     {@link Appearance1Code }
     *     
     */
    public Appearance1Code getApprnc() {
        return apprnc;
    }

    /**
     * Sets the value of the apprnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appearance1Code }
     *     
     */
    public FutureOrOptionDetails3 setApprnc(Appearance1Code value) {
        this.apprnc = value;
        return this;
    }

    /**
     * Gets the value of the strpblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrpblInd() {
        return strpblInd;
    }

    /**
     * Sets the value of the strpblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FutureOrOptionDetails3 setStrpblInd(Boolean value) {
        this.strpblInd = value;
        return this;
    }

    /**
     * Gets the value of the posLmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPosLmt() {
        return posLmt;
    }

    /**
     * Sets the value of the posLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FutureOrOptionDetails3 setPosLmt(BigDecimal value) {
        this.posLmt = value;
        return this;
    }

    /**
     * Gets the value of the nearTermPosLmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNearTermPosLmt() {
        return nearTermPosLmt;
    }

    /**
     * Sets the value of the nearTermPosLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FutureOrOptionDetails3 setNearTermPosLmt(BigDecimal value) {
        this.nearTermPosLmt = value;
        return this;
    }

    /**
     * Gets the value of the minTradgPricgIncrmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinTradgPricgIncrmt() {
        return minTradgPricgIncrmt;
    }

    /**
     * Sets the value of the minTradgPricgIncrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FutureOrOptionDetails3 setMinTradgPricgIncrmt(BigDecimal value) {
        this.minTradgPricgIncrmt = value;
        return this;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FutureOrOptionDetails3 setPurp(String value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the ctrctSttlmMnth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public YearMonth getCtrctSttlmMnth() {
        return ctrctSttlmMnth;
    }

    /**
     * Sets the value of the ctrctSttlmMnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FutureOrOptionDetails3 setCtrctSttlmMnth(YearMonth value) {
        this.ctrctSttlmMnth = value;
        return this;
    }

    /**
     * Gets the value of the frstDealgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getFrstDealgDt() {
        return frstDealgDt;
    }

    /**
     * Sets the value of the frstDealgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public FutureOrOptionDetails3 setFrstDealgDt(DateAndDateTime1Choice value) {
        this.frstDealgDt = value;
        return this;
    }

    /**
     * Gets the value of the ratio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ratio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingRatio2 }
     * 
     * 
     * @return
     *     The value of the ratio property.
     */
    public List<UnderlyingRatio2> getRatio() {
        if (ratio == null) {
            ratio = new ArrayList<>();
        }
        return this.ratio;
    }

    /**
     * Gets the value of the ratg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ratg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rating1 }
     * 
     * 
     * @return
     *     The value of the ratg property.
     */
    public List<Rating1> getRatg() {
        if (ratg == null) {
            ratg = new ArrayList<>();
        }
        return this.ratg;
    }

    /**
     * Gets the value of the issePric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getIssePric() {
        return issePric;
    }

    /**
     * Sets the value of the issePric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public FutureOrOptionDetails3 setIssePric(Price14 value) {
        this.issePric = value;
        return this;
    }

    /**
     * Gets the value of the optnRghts property.
     * 
     * @return
     *     possible object is
     *     {@link OptionRight2Choice }
     *     
     */
    public OptionRight2Choice getOptnRghts() {
        return optnRghts;
    }

    /**
     * Sets the value of the optnRghts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionRight2Choice }
     *     
     */
    public FutureOrOptionDetails3 setOptnRghts(OptionRight2Choice value) {
        this.optnRghts = value;
        return this;
    }

    /**
     * Gets the value of the lastTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastTx() {
        return lastTx;
    }

    /**
     * Sets the value of the lastTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FutureOrOptionDetails3 setLastTx(Boolean value) {
        this.lastTx = value;
        return this;
    }

    /**
     * Gets the value of the sprdTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSprdTx() {
        return sprdTx;
    }

    /**
     * Sets the value of the sprdTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FutureOrOptionDetails3 setSprdTx(Boolean value) {
        this.sprdTx = value;
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
     * Adds a new item to the ratio list.
     * @see #getRatio()
     * 
     */
    public FutureOrOptionDetails3 addRatio(UnderlyingRatio2 ratio) {
        getRatio().add(ratio);
        return this;
    }

    /**
     * Adds a new item to the ratg list.
     * @see #getRatg()
     * 
     */
    public FutureOrOptionDetails3 addRatg(Rating1 ratg) {
        getRatg().add(ratg);
        return this;
    }

}
