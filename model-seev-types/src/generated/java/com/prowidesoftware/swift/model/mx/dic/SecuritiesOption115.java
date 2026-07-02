
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the corporate action security option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption115", propOrder = {
    "finInstrmId",
    "cdtDbtInd",
    "tempFinInstrmInd",
    "newSctiesIssncInd",
    "issrOfferrTaxbltyInd",
    "incmTp",
    "othrIncmTp",
    "xmptnTp",
    "ctryOfIncmSrc",
    "pstngQty",
    "sfkpgPlc",
    "frctnDspstn",
    "ccyOptn",
    "dtDtls",
    "rateDtls",
    "pricDtls",
    "amtDtls",
    "rcvgSttlmPties",
    "dlvrgSttlmPties"
})
public class SecuritiesOption115 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification20 finInstrmId;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TempFinInstrmInd")
    protected TemporaryFinancialInstrumentIndicator4Choice tempFinInstrmInd;
    @XmlElement(name = "NewSctiesIssncInd")
    @XmlSchemaType(name = "string")
    protected NewSecuritiesIssuanceType6Code newSctiesIssncInd;
    @XmlElement(name = "IssrOfferrTaxbltyInd")
    protected IssuerOfferorTaxabilityIndicator1Choice issrOfferrTaxbltyInd;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification47 incmTp;
    @XmlElement(name = "OthrIncmTp")
    protected List<GenericIdentification47> othrIncmTp;
    @XmlElement(name = "XmptnTp")
    protected List<GenericIdentification47> xmptnTp;
    @XmlElement(name = "CtryOfIncmSrc")
    protected String ctryOfIncmSrc;
    @XmlElement(name = "PstngQty", required = true)
    protected Quantity54Choice pstngQty;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat50Choice sfkpgPlc;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType30Choice frctnDspstn;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "DtDtls", required = true)
    protected SecurityDate26 dtDtls;
    @XmlElement(name = "RateDtls")
    protected CorporateActionRate132 rateDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice93 pricDtls;
    @XmlElement(name = "AmtDtls")
    protected CorporateActionAmounts61 amtDtls;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties130 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties130 dlvrgSttlmPties;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecuritiesOption115 setFinInstrmId(SecurityIdentification20 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public SecuritiesOption115 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the tempFinInstrmInd property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryFinancialInstrumentIndicator4Choice }
     *     
     */
    public TemporaryFinancialInstrumentIndicator4Choice getTempFinInstrmInd() {
        return tempFinInstrmInd;
    }

    /**
     * Sets the value of the tempFinInstrmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryFinancialInstrumentIndicator4Choice }
     *     
     */
    public SecuritiesOption115 setTempFinInstrmInd(TemporaryFinancialInstrumentIndicator4Choice value) {
        this.tempFinInstrmInd = value;
        return this;
    }

    /**
     * Gets the value of the newSctiesIssncInd property.
     * 
     * @return
     *     possible object is
     *     {@link NewSecuritiesIssuanceType6Code }
     *     
     */
    public NewSecuritiesIssuanceType6Code getNewSctiesIssncInd() {
        return newSctiesIssncInd;
    }

    /**
     * Sets the value of the newSctiesIssncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSecuritiesIssuanceType6Code }
     *     
     */
    public SecuritiesOption115 setNewSctiesIssncInd(NewSecuritiesIssuanceType6Code value) {
        this.newSctiesIssncInd = value;
        return this;
    }

    /**
     * Gets the value of the issrOfferrTaxbltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerOfferorTaxabilityIndicator1Choice }
     *     
     */
    public IssuerOfferorTaxabilityIndicator1Choice getIssrOfferrTaxbltyInd() {
        return issrOfferrTaxbltyInd;
    }

    /**
     * Sets the value of the issrOfferrTaxbltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerOfferorTaxabilityIndicator1Choice }
     *     
     */
    public SecuritiesOption115 setIssrOfferrTaxbltyInd(IssuerOfferorTaxabilityIndicator1Choice value) {
        this.issrOfferrTaxbltyInd = value;
        return this;
    }

    /**
     * Gets the value of the incmTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification47 }
     *     
     */
    public GenericIdentification47 getIncmTp() {
        return incmTp;
    }

    /**
     * Sets the value of the incmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification47 }
     *     
     */
    public SecuritiesOption115 setIncmTp(GenericIdentification47 value) {
        this.incmTp = value;
        return this;
    }

    /**
     * Gets the value of the othrIncmTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrIncmTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrIncmTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification47 }
     * 
     * 
     */
    public List<GenericIdentification47> getOthrIncmTp() {
        if (othrIncmTp == null) {
            othrIncmTp = new ArrayList<GenericIdentification47>();
        }
        return this.othrIncmTp;
    }

    /**
     * Gets the value of the xmptnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmptnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXmptnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification47 }
     * 
     * 
     */
    public List<GenericIdentification47> getXmptnTp() {
        if (xmptnTp == null) {
            xmptnTp = new ArrayList<GenericIdentification47>();
        }
        return this.xmptnTp;
    }

    /**
     * Gets the value of the ctryOfIncmSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIncmSrc() {
        return ctryOfIncmSrc;
    }

    /**
     * Sets the value of the ctryOfIncmSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesOption115 setCtryOfIncmSrc(String value) {
        this.ctryOfIncmSrc = value;
        return this;
    }

    /**
     * Gets the value of the pstngQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity54Choice }
     *     
     */
    public Quantity54Choice getPstngQty() {
        return pstngQty;
    }

    /**
     * Sets the value of the pstngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity54Choice }
     *     
     */
    public SecuritiesOption115 setPstngQty(Quantity54Choice value) {
        this.pstngQty = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat50Choice }
     *     
     */
    public SafekeepingPlaceFormat50Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat50Choice }
     *     
     */
    public SecuritiesOption115 setSfkpgPlc(SafekeepingPlaceFormat50Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType30Choice }
     *     
     */
    public FractionDispositionType30Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType30Choice }
     *     
     */
    public SecuritiesOption115 setFrctnDspstn(FractionDispositionType30Choice value) {
        this.frctnDspstn = value;
        return this;
    }

    /**
     * Gets the value of the ccyOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyOptn() {
        return ccyOptn;
    }

    /**
     * Sets the value of the ccyOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesOption115 setCcyOptn(String value) {
        this.ccyOptn = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDate26 }
     *     
     */
    public SecurityDate26 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDate26 }
     *     
     */
    public SecuritiesOption115 setDtDtls(SecurityDate26 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate132 }
     *     
     */
    public CorporateActionRate132 getRateDtls() {
        return rateDtls;
    }

    /**
     * Sets the value of the rateDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate132 }
     *     
     */
    public SecuritiesOption115 setRateDtls(CorporateActionRate132 value) {
        this.rateDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice93 }
     *     
     */
    public CorporateActionPrice93 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice93 }
     *     
     */
    public SecuritiesOption115 setPricDtls(CorporateActionPrice93 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAmounts61 }
     *     
     */
    public CorporateActionAmounts61 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAmounts61 }
     *     
     */
    public SecuritiesOption115 setAmtDtls(CorporateActionAmounts61 value) {
        this.amtDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties130 }
     *     
     */
    public SettlementParties130 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties130 }
     *     
     */
    public SecuritiesOption115 setRcvgSttlmPties(SettlementParties130 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties130 }
     *     
     */
    public SettlementParties130 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties130 }
     *     
     */
    public SecuritiesOption115 setDlvrgSttlmPties(SettlementParties130 value) {
        this.dlvrgSttlmPties = value;
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
     * Adds a new item to the othrIncmTp list.
     * @see #getOthrIncmTp()
     * 
     */
    public SecuritiesOption115 addOthrIncmTp(GenericIdentification47 othrIncmTp) {
        getOthrIncmTp().add(othrIncmTp);
        return this;
    }

    /**
     * Adds a new item to the xmptnTp list.
     * @see #getXmptnTp()
     * 
     */
    public SecuritiesOption115 addXmptnTp(GenericIdentification47 xmptnTp) {
        getXmptnTp().add(xmptnTp);
        return this;
    }

}
