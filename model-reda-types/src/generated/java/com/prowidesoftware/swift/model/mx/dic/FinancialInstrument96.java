
package com.prowidesoftware.swift.model.mx.dic;

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
 * Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument96", propOrder = {
    "physBrScties",
    "dmtrlsdBrScties",
    "physRegdScties",
    "dmtrlsdRegdScties",
    "dstrbtnPlcy",
    "dvddPlcy",
    "dvddFrqcy",
    "rinvstmtFrqcy",
    "frntEndLd",
    "bckEndLd",
    "swtchFee",
    "euSvgsDrctv",
    "lnchDt",
    "fndEndDt",
    "termntnDt",
    "initlOfferEndDt",
    "sspnsnStartDt",
    "sspnsnEndDt",
    "mtrtyDt",
    "mayBeTermntdEarly",
    "clsdEndFnd",
    "equlstn",
    "taxEffcntPdctElgbl",
    "authrsd",
    "rdrCmplnt",
    "mgmtFeeSrc",
    "prfrmncFee",
    "addtlInf"
})
public class FinancialInstrument96 {

    @XmlElement(name = "PhysBrScties")
    protected Boolean physBrScties;
    @XmlElement(name = "DmtrlsdBrScties")
    protected Boolean dmtrlsdBrScties;
    @XmlElement(name = "PhysRegdScties")
    protected Boolean physRegdScties;
    @XmlElement(name = "DmtrlsdRegdScties")
    protected Boolean dmtrlsdRegdScties;
    @XmlElement(name = "DstrbtnPlcy")
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code dstrbtnPlcy;
    @XmlElement(name = "DvddPlcy")
    @XmlSchemaType(name = "string")
    protected DividendPolicy1Code dvddPlcy;
    @XmlElement(name = "DvddFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency5Code dvddFrqcy;
    @XmlElement(name = "RinvstmtFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency5Code rinvstmtFrqcy;
    @XmlElement(name = "FrntEndLd")
    protected Boolean frntEndLd;
    @XmlElement(name = "BckEndLd")
    protected Boolean bckEndLd;
    @XmlElement(name = "SwtchFee")
    protected Boolean swtchFee;
    @XmlElement(name = "EUSvgsDrctv")
    @XmlSchemaType(name = "string")
    protected EUSavingsDirective1Code euSvgsDrctv;
    @XmlElement(name = "LnchDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar lnchDt;
    @XmlElement(name = "FndEndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar fndEndDt;
    @XmlElement(name = "TermntnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar termntnDt;
    @XmlElement(name = "InitlOfferEndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar initlOfferEndDt;
    @XmlElement(name = "SspnsnStartDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar sspnsnStartDt;
    @XmlElement(name = "SspnsnEndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar sspnsnEndDt;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar mtrtyDt;
    @XmlElement(name = "MayBeTermntdEarly")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code mayBeTermntdEarly;
    @XmlElement(name = "ClsdEndFnd")
    protected Boolean clsdEndFnd;
    @XmlElement(name = "Equlstn")
    protected Boolean equlstn;
    @XmlElement(name = "TaxEffcntPdctElgbl")
    protected Boolean taxEffcntPdctElgbl;
    @XmlElement(name = "Authrsd")
    protected Boolean authrsd;
    @XmlElement(name = "RDRCmplnt")
    protected Boolean rdrCmplnt;
    @XmlElement(name = "MgmtFeeSrc")
    @XmlSchemaType(name = "string")
    protected AnnualChargePaymentType1Code mgmtFeeSrc;
    @XmlElement(name = "PrfrmncFee")
    protected Boolean prfrmncFee;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the physBrScties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhysBrScties() {
        return physBrScties;
    }

    /**
     * Sets the value of the physBrScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setPhysBrScties(Boolean value) {
        this.physBrScties = value;
        return this;
    }

    /**
     * Gets the value of the dmtrlsdBrScties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDmtrlsdBrScties() {
        return dmtrlsdBrScties;
    }

    /**
     * Sets the value of the dmtrlsdBrScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setDmtrlsdBrScties(Boolean value) {
        this.dmtrlsdBrScties = value;
        return this;
    }

    /**
     * Gets the value of the physRegdScties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhysRegdScties() {
        return physRegdScties;
    }

    /**
     * Sets the value of the physRegdScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setPhysRegdScties(Boolean value) {
        this.physRegdScties = value;
        return this;
    }

    /**
     * Gets the value of the dmtrlsdRegdScties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDmtrlsdRegdScties() {
        return dmtrlsdRegdScties;
    }

    /**
     * Sets the value of the dmtrlsdRegdScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setDmtrlsdRegdScties(Boolean value) {
        this.dmtrlsdRegdScties = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtnPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public DistributionPolicy1Code getDstrbtnPlcy() {
        return dstrbtnPlcy;
    }

    /**
     * Sets the value of the dstrbtnPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public FinancialInstrument96 setDstrbtnPlcy(DistributionPolicy1Code value) {
        this.dstrbtnPlcy = value;
        return this;
    }

    /**
     * Gets the value of the dvddPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DividendPolicy1Code }
     *     
     */
    public DividendPolicy1Code getDvddPlcy() {
        return dvddPlcy;
    }

    /**
     * Sets the value of the dvddPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendPolicy1Code }
     *     
     */
    public FinancialInstrument96 setDvddPlcy(DividendPolicy1Code value) {
        this.dvddPlcy = value;
        return this;
    }

    /**
     * Gets the value of the dvddFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency5Code }
     *     
     */
    public EventFrequency5Code getDvddFrqcy() {
        return dvddFrqcy;
    }

    /**
     * Sets the value of the dvddFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency5Code }
     *     
     */
    public FinancialInstrument96 setDvddFrqcy(EventFrequency5Code value) {
        this.dvddFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency5Code }
     *     
     */
    public EventFrequency5Code getRinvstmtFrqcy() {
        return rinvstmtFrqcy;
    }

    /**
     * Sets the value of the rinvstmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency5Code }
     *     
     */
    public FinancialInstrument96 setRinvstmtFrqcy(EventFrequency5Code value) {
        this.rinvstmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the frntEndLd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrntEndLd() {
        return frntEndLd;
    }

    /**
     * Sets the value of the frntEndLd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setFrntEndLd(Boolean value) {
        this.frntEndLd = value;
        return this;
    }

    /**
     * Gets the value of the bckEndLd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBckEndLd() {
        return bckEndLd;
    }

    /**
     * Sets the value of the bckEndLd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setBckEndLd(Boolean value) {
        this.bckEndLd = value;
        return this;
    }

    /**
     * Gets the value of the swtchFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSwtchFee() {
        return swtchFee;
    }

    /**
     * Sets the value of the swtchFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setSwtchFee(Boolean value) {
        this.swtchFee = value;
        return this;
    }

    /**
     * Gets the value of the euSvgsDrctv property.
     * 
     * @return
     *     possible object is
     *     {@link EUSavingsDirective1Code }
     *     
     */
    public EUSavingsDirective1Code getEUSvgsDrctv() {
        return euSvgsDrctv;
    }

    /**
     * Sets the value of the euSvgsDrctv property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUSavingsDirective1Code }
     *     
     */
    public FinancialInstrument96 setEUSvgsDrctv(EUSavingsDirective1Code value) {
        this.euSvgsDrctv = value;
        return this;
    }

    /**
     * Gets the value of the lnchDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLnchDt() {
        return lnchDt;
    }

    /**
     * Sets the value of the lnchDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument96 setLnchDt(Calendar value) {
        this.lnchDt = value;
        return this;
    }

    /**
     * Gets the value of the fndEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFndEndDt() {
        return fndEndDt;
    }

    /**
     * Sets the value of the fndEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument96 setFndEndDt(Calendar value) {
        this.fndEndDt = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument96 setTermntnDt(Calendar value) {
        this.termntnDt = value;
        return this;
    }

    /**
     * Gets the value of the initlOfferEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getInitlOfferEndDt() {
        return initlOfferEndDt;
    }

    /**
     * Sets the value of the initlOfferEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument96 setInitlOfferEndDt(Calendar value) {
        this.initlOfferEndDt = value;
        return this;
    }

    /**
     * Gets the value of the sspnsnStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSspnsnStartDt() {
        return sspnsnStartDt;
    }

    /**
     * Sets the value of the sspnsnStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument96 setSspnsnStartDt(Calendar value) {
        this.sspnsnStartDt = value;
        return this;
    }

    /**
     * Gets the value of the sspnsnEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSspnsnEndDt() {
        return sspnsnEndDt;
    }

    /**
     * Sets the value of the sspnsnEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument96 setSspnsnEndDt(Calendar value) {
        this.sspnsnEndDt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument96 setMtrtyDt(Calendar value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the mayBeTermntdEarly property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getMayBeTermntdEarly() {
        return mayBeTermntdEarly;
    }

    /**
     * Sets the value of the mayBeTermntdEarly property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public FinancialInstrument96 setMayBeTermntdEarly(TargetMarket1Code value) {
        this.mayBeTermntdEarly = value;
        return this;
    }

    /**
     * Gets the value of the clsdEndFnd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClsdEndFnd() {
        return clsdEndFnd;
    }

    /**
     * Sets the value of the clsdEndFnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setClsdEndFnd(Boolean value) {
        this.clsdEndFnd = value;
        return this;
    }

    /**
     * Gets the value of the equlstn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEqulstn() {
        return equlstn;
    }

    /**
     * Sets the value of the equlstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setEqulstn(Boolean value) {
        this.equlstn = value;
        return this;
    }

    /**
     * Gets the value of the taxEffcntPdctElgbl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxEffcntPdctElgbl() {
        return taxEffcntPdctElgbl;
    }

    /**
     * Sets the value of the taxEffcntPdctElgbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setTaxEffcntPdctElgbl(Boolean value) {
        this.taxEffcntPdctElgbl = value;
        return this;
    }

    /**
     * Gets the value of the authrsd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthrsd() {
        return authrsd;
    }

    /**
     * Sets the value of the authrsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setAuthrsd(Boolean value) {
        this.authrsd = value;
        return this;
    }

    /**
     * Gets the value of the rdrCmplnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRDRCmplnt() {
        return rdrCmplnt;
    }

    /**
     * Sets the value of the rdrCmplnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setRDRCmplnt(Boolean value) {
        this.rdrCmplnt = value;
        return this;
    }

    /**
     * Gets the value of the mgmtFeeSrc property.
     * 
     * @return
     *     possible object is
     *     {@link AnnualChargePaymentType1Code }
     *     
     */
    public AnnualChargePaymentType1Code getMgmtFeeSrc() {
        return mgmtFeeSrc;
    }

    /**
     * Sets the value of the mgmtFeeSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualChargePaymentType1Code }
     *     
     */
    public FinancialInstrument96 setMgmtFeeSrc(AnnualChargePaymentType1Code value) {
        this.mgmtFeeSrc = value;
        return this;
    }

    /**
     * Gets the value of the prfrmncFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrfrmncFee() {
        return prfrmncFee;
    }

    /**
     * Sets the value of the prfrmncFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument96 setPrfrmncFee(Boolean value) {
        this.prfrmncFee = value;
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
    public FinancialInstrument96 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
