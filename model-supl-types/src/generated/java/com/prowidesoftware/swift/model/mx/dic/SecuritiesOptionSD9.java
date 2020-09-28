
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides additional information regarding corporate action option securities movement details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOptionSD9", propOrder = {
    "plcAndNm",
    "pyoutTp",
    "dtcPayMtd",
    "dtcPayOrdr",
    "rinvstmtIncmClssfctn",
    "entitlmntClctnMtd",
    "pricBsis",
    "dtcExitExpltnInd",
    "chrgFlg",
    "prtctChrgFlg",
    "estmtdPricFlg",
    "dtcFrctnlShrInstrPrd",
    "dtcusTaxInstrPrd",
    "rdpRefNb"
})
public class SecuritiesOptionSD9 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "PyoutTp", required = true)
    @XmlSchemaType(name = "string")
    protected DTCCPayoutType4Code pyoutTp;
    @XmlElement(name = "DTCPayMtd")
    protected String dtcPayMtd;
    @XmlElement(name = "DTCPayOrdr")
    protected String dtcPayOrdr;
    @XmlElement(name = "RinvstmtIncmClssfctn")
    @XmlSchemaType(name = "string")
    protected ReinvestmentIncomeClassification2Code rinvstmtIncmClssfctn;
    @XmlElement(name = "EntitlmntClctnMtd")
    @XmlSchemaType(name = "string")
    protected DTCEntitlementCalculationMethod1Code entitlmntClctnMtd;
    @XmlElement(name = "PricBsis")
    @XmlSchemaType(name = "string")
    protected DTCBaseDisbursed1Code pricBsis;
    @XmlElement(name = "DTCExitExpltnInd")
    @XmlSchemaType(name = "string")
    protected SecuritiesExitReason1Code dtcExitExpltnInd;
    @XmlElement(name = "ChrgFlg")
    protected Boolean chrgFlg;
    @XmlElement(name = "PrtctChrgFlg")
    protected Boolean prtctChrgFlg;
    @XmlElement(name = "EstmtdPricFlg")
    protected Boolean estmtdPricFlg;
    @XmlElement(name = "DTCFrctnlShrInstrPrd")
    protected Period13 dtcFrctnlShrInstrPrd;
    @XmlElement(name = "DTCUSTaxInstrPrd")
    protected Period13 dtcusTaxInstrPrd;
    @XmlElement(name = "RDPRefNb")
    protected String rdpRefNb;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesOptionSD9 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the pyoutTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCPayoutType4Code }
     *     
     */
    public DTCCPayoutType4Code getPyoutTp() {
        return pyoutTp;
    }

    /**
     * Sets the value of the pyoutTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCPayoutType4Code }
     *     
     */
    public SecuritiesOptionSD9 setPyoutTp(DTCCPayoutType4Code value) {
        this.pyoutTp = value;
        return this;
    }

    /**
     * Gets the value of the dtcPayMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTCPayMtd() {
        return dtcPayMtd;
    }

    /**
     * Sets the value of the dtcPayMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesOptionSD9 setDTCPayMtd(String value) {
        this.dtcPayMtd = value;
        return this;
    }

    /**
     * Gets the value of the dtcPayOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTCPayOrdr() {
        return dtcPayOrdr;
    }

    /**
     * Sets the value of the dtcPayOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesOptionSD9 setDTCPayOrdr(String value) {
        this.dtcPayOrdr = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtIncmClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ReinvestmentIncomeClassification2Code }
     *     
     */
    public ReinvestmentIncomeClassification2Code getRinvstmtIncmClssfctn() {
        return rinvstmtIncmClssfctn;
    }

    /**
     * Sets the value of the rinvstmtIncmClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReinvestmentIncomeClassification2Code }
     *     
     */
    public SecuritiesOptionSD9 setRinvstmtIncmClssfctn(ReinvestmentIncomeClassification2Code value) {
        this.rinvstmtIncmClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the entitlmntClctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link DTCEntitlementCalculationMethod1Code }
     *     
     */
    public DTCEntitlementCalculationMethod1Code getEntitlmntClctnMtd() {
        return entitlmntClctnMtd;
    }

    /**
     * Sets the value of the entitlmntClctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCEntitlementCalculationMethod1Code }
     *     
     */
    public SecuritiesOptionSD9 setEntitlmntClctnMtd(DTCEntitlementCalculationMethod1Code value) {
        this.entitlmntClctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the pricBsis property.
     * 
     * @return
     *     possible object is
     *     {@link DTCBaseDisbursed1Code }
     *     
     */
    public DTCBaseDisbursed1Code getPricBsis() {
        return pricBsis;
    }

    /**
     * Sets the value of the pricBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCBaseDisbursed1Code }
     *     
     */
    public SecuritiesOptionSD9 setPricBsis(DTCBaseDisbursed1Code value) {
        this.pricBsis = value;
        return this;
    }

    /**
     * Gets the value of the dtcExitExpltnInd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesExitReason1Code }
     *     
     */
    public SecuritiesExitReason1Code getDTCExitExpltnInd() {
        return dtcExitExpltnInd;
    }

    /**
     * Sets the value of the dtcExitExpltnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesExitReason1Code }
     *     
     */
    public SecuritiesOptionSD9 setDTCExitExpltnInd(SecuritiesExitReason1Code value) {
        this.dtcExitExpltnInd = value;
        return this;
    }

    /**
     * Gets the value of the chrgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChrgFlg() {
        return chrgFlg;
    }

    /**
     * Sets the value of the chrgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesOptionSD9 setChrgFlg(Boolean value) {
        this.chrgFlg = value;
        return this;
    }

    /**
     * Gets the value of the prtctChrgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtctChrgFlg() {
        return prtctChrgFlg;
    }

    /**
     * Sets the value of the prtctChrgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesOptionSD9 setPrtctChrgFlg(Boolean value) {
        this.prtctChrgFlg = value;
        return this;
    }

    /**
     * Gets the value of the estmtdPricFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstmtdPricFlg() {
        return estmtdPricFlg;
    }

    /**
     * Sets the value of the estmtdPricFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesOptionSD9 setEstmtdPricFlg(Boolean value) {
        this.estmtdPricFlg = value;
        return this;
    }

    /**
     * Gets the value of the dtcFrctnlShrInstrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period13 }
     *     
     */
    public Period13 getDTCFrctnlShrInstrPrd() {
        return dtcFrctnlShrInstrPrd;
    }

    /**
     * Sets the value of the dtcFrctnlShrInstrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period13 }
     *     
     */
    public SecuritiesOptionSD9 setDTCFrctnlShrInstrPrd(Period13 value) {
        this.dtcFrctnlShrInstrPrd = value;
        return this;
    }

    /**
     * Gets the value of the dtcusTaxInstrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period13 }
     *     
     */
    public Period13 getDTCUSTaxInstrPrd() {
        return dtcusTaxInstrPrd;
    }

    /**
     * Sets the value of the dtcusTaxInstrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period13 }
     *     
     */
    public SecuritiesOptionSD9 setDTCUSTaxInstrPrd(Period13 value) {
        this.dtcusTaxInstrPrd = value;
        return this;
    }

    /**
     * Gets the value of the rdpRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRDPRefNb() {
        return rdpRefNb;
    }

    /**
     * Sets the value of the rdpRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesOptionSD9 setRDPRefNb(String value) {
        this.rdpRefNb = value;
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
