
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
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
 * Details of a drawdown tranche.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Drawdown2", propOrder = {
    "id",
    "trchTp",
    "aplblRules",
    "invstrTaxRef",
    "pctgOfTtlTrfVal",
    "ttlAmtNetDrwdwn",
    "addtlFndsDsgntd",
    "pnsnCmcmntLumpSumRmng",
    "pnsnCmcmntLumpSumDt",
    "mltplPnsnCmcmntLumpSums",
    "lftmAllwnc",
    "rcptOfDrwdwnInd",
    "bnfcryDtls",
    "capdLmts",
    "flxblDrwdwnTrggrdDt",
    "addtlInf"
})
public class Drawdown2 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "TrchTp", required = true)
    protected DrawdownType2Choice trchTp;
    @XmlElement(name = "AplblRules")
    protected ApplicableRules1Choice aplblRules;
    @XmlElement(name = "InvstrTaxRef")
    protected TaxReference2 invstrTaxRef;
    @XmlElement(name = "PctgOfTtlTrfVal")
    protected BigDecimal pctgOfTtlTrfVal;
    @XmlElement(name = "TtlAmtNetDrwdwn")
    protected ActiveCurrencyAnd13DecimalAmount ttlAmtNetDrwdwn;
    @XmlElement(name = "AddtlFndsDsgntd")
    protected Boolean addtlFndsDsgntd;
    @XmlElement(name = "PnsnCmcmntLumpSumRmng")
    protected ActiveCurrencyAnd13DecimalAmount pnsnCmcmntLumpSumRmng;
    @XmlElement(name = "PnsnCmcmntLumpSumDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate pnsnCmcmntLumpSumDt;
    @XmlElement(name = "MltplPnsnCmcmntLumpSums")
    protected Boolean mltplPnsnCmcmntLumpSums;
    @XmlElement(name = "LftmAllwnc")
    protected BigDecimal lftmAllwnc;
    @XmlElement(name = "RcptOfDrwdwnInd")
    protected Boolean rcptOfDrwdwnInd;
    @XmlElement(name = "BnfcryDtls")
    protected BeneficiaryDrawdown1 bnfcryDtls;
    @XmlElement(name = "CapdLmts")
    protected Capped1 capdLmts;
    @XmlElement(name = "FlxblDrwdwnTrggrdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate flxblDrwdwnTrggrdDt;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

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
    public Drawdown2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the trchTp property.
     * 
     * @return
     *     possible object is
     *     {@link DrawdownType2Choice }
     *     
     */
    public DrawdownType2Choice getTrchTp() {
        return trchTp;
    }

    /**
     * Sets the value of the trchTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawdownType2Choice }
     *     
     */
    public Drawdown2 setTrchTp(DrawdownType2Choice value) {
        this.trchTp = value;
        return this;
    }

    /**
     * Gets the value of the aplblRules property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicableRules1Choice }
     *     
     */
    public ApplicableRules1Choice getAplblRules() {
        return aplblRules;
    }

    /**
     * Sets the value of the aplblRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicableRules1Choice }
     *     
     */
    public Drawdown2 setAplblRules(ApplicableRules1Choice value) {
        this.aplblRules = value;
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
    public Drawdown2 setInvstrTaxRef(TaxReference2 value) {
        this.invstrTaxRef = value;
        return this;
    }

    /**
     * Gets the value of the pctgOfTtlTrfVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfTtlTrfVal() {
        return pctgOfTtlTrfVal;
    }

    /**
     * Sets the value of the pctgOfTtlTrfVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Drawdown2 setPctgOfTtlTrfVal(BigDecimal value) {
        this.pctgOfTtlTrfVal = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmtNetDrwdwn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTtlAmtNetDrwdwn() {
        return ttlAmtNetDrwdwn;
    }

    /**
     * Sets the value of the ttlAmtNetDrwdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public Drawdown2 setTtlAmtNetDrwdwn(ActiveCurrencyAnd13DecimalAmount value) {
        this.ttlAmtNetDrwdwn = value;
        return this;
    }

    /**
     * Gets the value of the addtlFndsDsgntd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddtlFndsDsgntd() {
        return addtlFndsDsgntd;
    }

    /**
     * Sets the value of the addtlFndsDsgntd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Drawdown2 setAddtlFndsDsgntd(Boolean value) {
        this.addtlFndsDsgntd = value;
        return this;
    }

    /**
     * Gets the value of the pnsnCmcmntLumpSumRmng property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getPnsnCmcmntLumpSumRmng() {
        return pnsnCmcmntLumpSumRmng;
    }

    /**
     * Sets the value of the pnsnCmcmntLumpSumRmng property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public Drawdown2 setPnsnCmcmntLumpSumRmng(ActiveCurrencyAnd13DecimalAmount value) {
        this.pnsnCmcmntLumpSumRmng = value;
        return this;
    }

    /**
     * Gets the value of the pnsnCmcmntLumpSumDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPnsnCmcmntLumpSumDt() {
        return pnsnCmcmntLumpSumDt;
    }

    /**
     * Sets the value of the pnsnCmcmntLumpSumDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Drawdown2 setPnsnCmcmntLumpSumDt(LocalDate value) {
        this.pnsnCmcmntLumpSumDt = value;
        return this;
    }

    /**
     * Gets the value of the mltplPnsnCmcmntLumpSums property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMltplPnsnCmcmntLumpSums() {
        return mltplPnsnCmcmntLumpSums;
    }

    /**
     * Sets the value of the mltplPnsnCmcmntLumpSums property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Drawdown2 setMltplPnsnCmcmntLumpSums(Boolean value) {
        this.mltplPnsnCmcmntLumpSums = value;
        return this;
    }

    /**
     * Gets the value of the lftmAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLftmAllwnc() {
        return lftmAllwnc;
    }

    /**
     * Sets the value of the lftmAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Drawdown2 setLftmAllwnc(BigDecimal value) {
        this.lftmAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the rcptOfDrwdwnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRcptOfDrwdwnInd() {
        return rcptOfDrwdwnInd;
    }

    /**
     * Sets the value of the rcptOfDrwdwnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Drawdown2 setRcptOfDrwdwnInd(Boolean value) {
        this.rcptOfDrwdwnInd = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryDrawdown1 }
     *     
     */
    public BeneficiaryDrawdown1 getBnfcryDtls() {
        return bnfcryDtls;
    }

    /**
     * Sets the value of the bnfcryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryDrawdown1 }
     *     
     */
    public Drawdown2 setBnfcryDtls(BeneficiaryDrawdown1 value) {
        this.bnfcryDtls = value;
        return this;
    }

    /**
     * Gets the value of the capdLmts property.
     * 
     * @return
     *     possible object is
     *     {@link Capped1 }
     *     
     */
    public Capped1 getCapdLmts() {
        return capdLmts;
    }

    /**
     * Sets the value of the capdLmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capped1 }
     *     
     */
    public Drawdown2 setCapdLmts(Capped1 value) {
        this.capdLmts = value;
        return this;
    }

    /**
     * Gets the value of the flxblDrwdwnTrggrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFlxblDrwdwnTrggrdDt() {
        return flxblDrwdwnTrggrdDt;
    }

    /**
     * Sets the value of the flxblDrwdwnTrggrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Drawdown2 setFlxblDrwdwnTrggrdDt(LocalDate value) {
        this.flxblDrwdwnTrggrdDt = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
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
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Drawdown2 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
