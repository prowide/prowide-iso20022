
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
 * Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument66", propOrder = {
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
    "clsdEndFnd",
    "equlstn",
    "taxEffcntPdctElgbl",
    "authrsd",
    "rdrCmplnt",
    "mgmtFeeSrc",
    "prfrmncFee",
    "addtlInf"
})
public class FinancialInstrument66 {

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
    @XmlElement(name = "LnchDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lnchDt;
    @XmlElement(name = "FndEndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fndEndDt;
    @XmlElement(name = "TermntnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termntnDt;
    @XmlElement(name = "InitlOfferEndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar initlOfferEndDt;
    @XmlElement(name = "SspnsnStartDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sspnsnStartDt;
    @XmlElement(name = "SspnsnEndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sspnsnEndDt;
    @XmlElement(name = "MtrtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
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
    public FinancialInstrument66 setPhysBrScties(Boolean value) {
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
    public FinancialInstrument66 setDmtrlsdBrScties(Boolean value) {
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
    public FinancialInstrument66 setPhysRegdScties(Boolean value) {
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
    public FinancialInstrument66 setDmtrlsdRegdScties(Boolean value) {
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
    public FinancialInstrument66 setDstrbtnPlcy(DistributionPolicy1Code value) {
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
    public FinancialInstrument66 setDvddPlcy(DividendPolicy1Code value) {
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
    public FinancialInstrument66 setDvddFrqcy(EventFrequency5Code value) {
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
    public FinancialInstrument66 setRinvstmtFrqcy(EventFrequency5Code value) {
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
    public FinancialInstrument66 setFrntEndLd(Boolean value) {
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
    public FinancialInstrument66 setBckEndLd(Boolean value) {
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
    public FinancialInstrument66 setSwtchFee(Boolean value) {
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
    public FinancialInstrument66 setEUSvgsDrctv(EUSavingsDirective1Code value) {
        this.euSvgsDrctv = value;
        return this;
    }

    /**
     * Gets the value of the lnchDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLnchDt() {
        return lnchDt;
    }

    /**
     * Sets the value of the lnchDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrument66 setLnchDt(XMLGregorianCalendar value) {
        this.lnchDt = value;
        return this;
    }

    /**
     * Gets the value of the fndEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFndEndDt() {
        return fndEndDt;
    }

    /**
     * Sets the value of the fndEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrument66 setFndEndDt(XMLGregorianCalendar value) {
        this.fndEndDt = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrument66 setTermntnDt(XMLGregorianCalendar value) {
        this.termntnDt = value;
        return this;
    }

    /**
     * Gets the value of the initlOfferEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitlOfferEndDt() {
        return initlOfferEndDt;
    }

    /**
     * Sets the value of the initlOfferEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrument66 setInitlOfferEndDt(XMLGregorianCalendar value) {
        this.initlOfferEndDt = value;
        return this;
    }

    /**
     * Gets the value of the sspnsnStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSspnsnStartDt() {
        return sspnsnStartDt;
    }

    /**
     * Sets the value of the sspnsnStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrument66 setSspnsnStartDt(XMLGregorianCalendar value) {
        this.sspnsnStartDt = value;
        return this;
    }

    /**
     * Gets the value of the sspnsnEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSspnsnEndDt() {
        return sspnsnEndDt;
    }

    /**
     * Sets the value of the sspnsnEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrument66 setSspnsnEndDt(XMLGregorianCalendar value) {
        this.sspnsnEndDt = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public FinancialInstrument66 setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
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
    public FinancialInstrument66 setClsdEndFnd(Boolean value) {
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
    public FinancialInstrument66 setEqulstn(Boolean value) {
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
    public FinancialInstrument66 setTaxEffcntPdctElgbl(Boolean value) {
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
    public FinancialInstrument66 setAuthrsd(Boolean value) {
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
    public FinancialInstrument66 setRDRCmplnt(Boolean value) {
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
    public FinancialInstrument66 setMgmtFeeSrc(AnnualChargePaymentType1Code value) {
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
    public FinancialInstrument66 setPrfrmncFee(Boolean value) {
        this.prfrmncFee = value;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public FinancialInstrument66 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
