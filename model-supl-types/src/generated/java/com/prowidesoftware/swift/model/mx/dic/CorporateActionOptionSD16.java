
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides additional information regarding corporate action option details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOptionSD16", propOrder = {
    "plcAndNm",
    "xtndedOptnFeatrs",
    "dfltOptnFlg",
    "optnlDvddSplmtryDataReqrdFlg",
    "ovrsbcptChrgFlg",
    "prtctChrgFlg",
    "stepUpChrgFlg",
    "sbcptChrgFlg",
    "bckEndOddLotQtyFlg",
    "frntEndOddLotQtyFlg",
    "fullCondFlg",
    "rdpRefNb",
    "nbOfConds",
    "taxCtgy",
    "prratnRndgInd",
    "prratnFrctn",
    "optnConds",
    "agtAccptRjctInd",
    "prratnRtrMinQtyTrtmnt"
})
public class CorporateActionOptionSD16 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "XtndedOptnFeatrs")
    @XmlSchemaType(name = "string")
    protected List<ExtendedOptionFeature2Code> xtndedOptnFeatrs;
    @XmlElement(name = "DfltOptnFlg")
    protected Boolean dfltOptnFlg;
    @XmlElement(name = "OptnlDvddSplmtryDataReqrdFlg")
    protected Boolean optnlDvddSplmtryDataReqrdFlg;
    @XmlElement(name = "OvrsbcptChrgFlg")
    protected Boolean ovrsbcptChrgFlg;
    @XmlElement(name = "PrtctChrgFlg")
    protected Boolean prtctChrgFlg;
    @XmlElement(name = "StepUpChrgFlg")
    protected Boolean stepUpChrgFlg;
    @XmlElement(name = "SbcptChrgFlg")
    protected Boolean sbcptChrgFlg;
    @XmlElement(name = "BckEndOddLotQtyFlg")
    protected Boolean bckEndOddLotQtyFlg;
    @XmlElement(name = "FrntEndOddLotQtyFlg")
    protected Boolean frntEndOddLotQtyFlg;
    @XmlElement(name = "FullCondFlg")
    protected Boolean fullCondFlg;
    @XmlElement(name = "RDPRefNb")
    protected String rdpRefNb;
    @XmlElement(name = "NbOfConds")
    protected String nbOfConds;
    @XmlElement(name = "TaxCtgy")
    protected List<TaxCategory1> taxCtgy;
    @XmlElement(name = "PrratnRndgInd")
    @XmlSchemaType(name = "string")
    protected FractionDispositionType12Code prratnRndgInd;
    @XmlElement(name = "PrratnFrctn")
    protected BigDecimal prratnFrctn;
    @XmlElement(name = "OptnConds")
    protected List<OptionConditions1> optnConds;
    @XmlElement(name = "AgtAccptRjctInd")
    @XmlSchemaType(name = "string")
    protected AgentAcceptReject1Code agtAccptRjctInd;
    @XmlElement(name = "PrratnRtrMinQtyTrtmnt")
    @XmlSchemaType(name = "string")
    protected ProrationReturnQuantityTreatment1Code prratnRtrMinQtyTrtmnt;

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
    public CorporateActionOptionSD16 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the xtndedOptnFeatrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtndedOptnFeatrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtndedOptnFeatrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedOptionFeature2Code }
     * 
     * 
     */
    public List<ExtendedOptionFeature2Code> getXtndedOptnFeatrs() {
        if (xtndedOptnFeatrs == null) {
            xtndedOptnFeatrs = new ArrayList<ExtendedOptionFeature2Code>();
        }
        return this.xtndedOptnFeatrs;
    }

    /**
     * Gets the value of the dfltOptnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfltOptnFlg() {
        return dfltOptnFlg;
    }

    /**
     * Sets the value of the dfltOptnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOptionSD16 setDfltOptnFlg(Boolean value) {
        this.dfltOptnFlg = value;
        return this;
    }

    /**
     * Gets the value of the optnlDvddSplmtryDataReqrdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptnlDvddSplmtryDataReqrdFlg() {
        return optnlDvddSplmtryDataReqrdFlg;
    }

    /**
     * Sets the value of the optnlDvddSplmtryDataReqrdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOptionSD16 setOptnlDvddSplmtryDataReqrdFlg(Boolean value) {
        this.optnlDvddSplmtryDataReqrdFlg = value;
        return this;
    }

    /**
     * Gets the value of the ovrsbcptChrgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOvrsbcptChrgFlg() {
        return ovrsbcptChrgFlg;
    }

    /**
     * Sets the value of the ovrsbcptChrgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOptionSD16 setOvrsbcptChrgFlg(Boolean value) {
        this.ovrsbcptChrgFlg = value;
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
    public CorporateActionOptionSD16 setPrtctChrgFlg(Boolean value) {
        this.prtctChrgFlg = value;
        return this;
    }

    /**
     * Gets the value of the stepUpChrgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStepUpChrgFlg() {
        return stepUpChrgFlg;
    }

    /**
     * Sets the value of the stepUpChrgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOptionSD16 setStepUpChrgFlg(Boolean value) {
        this.stepUpChrgFlg = value;
        return this;
    }

    /**
     * Gets the value of the sbcptChrgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSbcptChrgFlg() {
        return sbcptChrgFlg;
    }

    /**
     * Sets the value of the sbcptChrgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOptionSD16 setSbcptChrgFlg(Boolean value) {
        this.sbcptChrgFlg = value;
        return this;
    }

    /**
     * Gets the value of the bckEndOddLotQtyFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBckEndOddLotQtyFlg() {
        return bckEndOddLotQtyFlg;
    }

    /**
     * Sets the value of the bckEndOddLotQtyFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOptionSD16 setBckEndOddLotQtyFlg(Boolean value) {
        this.bckEndOddLotQtyFlg = value;
        return this;
    }

    /**
     * Gets the value of the frntEndOddLotQtyFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrntEndOddLotQtyFlg() {
        return frntEndOddLotQtyFlg;
    }

    /**
     * Sets the value of the frntEndOddLotQtyFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOptionSD16 setFrntEndOddLotQtyFlg(Boolean value) {
        this.frntEndOddLotQtyFlg = value;
        return this;
    }

    /**
     * Gets the value of the fullCondFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullCondFlg() {
        return fullCondFlg;
    }

    /**
     * Sets the value of the fullCondFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOptionSD16 setFullCondFlg(Boolean value) {
        this.fullCondFlg = value;
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
    public CorporateActionOptionSD16 setRDPRefNb(String value) {
        this.rdpRefNb = value;
        return this;
    }

    /**
     * Gets the value of the nbOfConds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfConds() {
        return nbOfConds;
    }

    /**
     * Sets the value of the nbOfConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionOptionSD16 setNbOfConds(String value) {
        this.nbOfConds = value;
        return this;
    }

    /**
     * Gets the value of the taxCtgy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCtgy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCtgy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategory1 }
     * 
     * 
     */
    public List<TaxCategory1> getTaxCtgy() {
        if (taxCtgy == null) {
            taxCtgy = new ArrayList<TaxCategory1>();
        }
        return this.taxCtgy;
    }

    /**
     * Gets the value of the prratnRndgInd property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType12Code }
     *     
     */
    public FractionDispositionType12Code getPrratnRndgInd() {
        return prratnRndgInd;
    }

    /**
     * Sets the value of the prratnRndgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType12Code }
     *     
     */
    public CorporateActionOptionSD16 setPrratnRndgInd(FractionDispositionType12Code value) {
        this.prratnRndgInd = value;
        return this;
    }

    /**
     * Gets the value of the prratnFrctn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrratnFrctn() {
        return prratnFrctn;
    }

    /**
     * Sets the value of the prratnFrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionOptionSD16 setPrratnFrctn(BigDecimal value) {
        this.prratnFrctn = value;
        return this;
    }

    /**
     * Gets the value of the optnConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionConditions1 }
     * 
     * 
     */
    public List<OptionConditions1> getOptnConds() {
        if (optnConds == null) {
            optnConds = new ArrayList<OptionConditions1>();
        }
        return this.optnConds;
    }

    /**
     * Gets the value of the agtAccptRjctInd property.
     * 
     * @return
     *     possible object is
     *     {@link AgentAcceptReject1Code }
     *     
     */
    public AgentAcceptReject1Code getAgtAccptRjctInd() {
        return agtAccptRjctInd;
    }

    /**
     * Sets the value of the agtAccptRjctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentAcceptReject1Code }
     *     
     */
    public CorporateActionOptionSD16 setAgtAccptRjctInd(AgentAcceptReject1Code value) {
        this.agtAccptRjctInd = value;
        return this;
    }

    /**
     * Gets the value of the prratnRtrMinQtyTrtmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ProrationReturnQuantityTreatment1Code }
     *     
     */
    public ProrationReturnQuantityTreatment1Code getPrratnRtrMinQtyTrtmnt() {
        return prratnRtrMinQtyTrtmnt;
    }

    /**
     * Sets the value of the prratnRtrMinQtyTrtmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProrationReturnQuantityTreatment1Code }
     *     
     */
    public CorporateActionOptionSD16 setPrratnRtrMinQtyTrtmnt(ProrationReturnQuantityTreatment1Code value) {
        this.prratnRtrMinQtyTrtmnt = value;
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
     * Adds a new item to the xtndedOptnFeatrs list.
     * @see #getXtndedOptnFeatrs()
     * 
     */
    public CorporateActionOptionSD16 addXtndedOptnFeatrs(ExtendedOptionFeature2Code xtndedOptnFeatrs) {
        getXtndedOptnFeatrs().add(xtndedOptnFeatrs);
        return this;
    }

    /**
     * Adds a new item to the taxCtgy list.
     * @see #getTaxCtgy()
     * 
     */
    public CorporateActionOptionSD16 addTaxCtgy(TaxCategory1 taxCtgy) {
        getTaxCtgy().add(taxCtgy);
        return this;
    }

    /**
     * Adds a new item to the optnConds list.
     * @see #getOptnConds()
     * 
     */
    public CorporateActionOptionSD16 addOptnConds(OptionConditions1 optnConds) {
        getOptnConds().add(optnConds);
        return this;
    }

}
