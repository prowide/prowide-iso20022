
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption47", propOrder = {
    "optnNb",
    "optnTp",
    "frctnDspstn",
    "chngTp",
    "elgblForCollInd",
    "ccyToBuy",
    "ccyToSell",
    "ccyOptn",
    "sctyId",
    "sctiesQty",
    "exctnReqdDtTm",
    "rateAndAmtDtls",
    "pricDtls",
    "addtlInf"
})
public class CorporateActionOption47 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption15Choice optnTp;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType11Choice frctnDspstn;
    @XmlElement(name = "ChngTp")
    protected List<CorporateActionChangeTypeFormat4Choice> chngTp;
    @XmlElement(name = "ElgblForCollInd")
    protected Boolean elgblForCollInd;
    @XmlElement(name = "CcyToBuy")
    protected String ccyToBuy;
    @XmlElement(name = "CcyToSell")
    protected String ccyToSell;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "SctyId")
    protected SecurityIdentification15 sctyId;
    @XmlElement(name = "SctiesQty", required = true)
    protected SecuritiesOption7 sctiesQty;
    @XmlElement(name = "ExctnReqdDtTm")
    protected DateAndDateTimeChoice exctnReqdDtTm;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate9 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice35 pricDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative13 addtlInf;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public OptionNumber1Choice getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionNumber1Choice }
     *     
     */
    public CorporateActionOption47 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption15Choice }
     *     
     */
    public CorporateActionOption15Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption15Choice }
     *     
     */
    public CorporateActionOption47 setOptnTp(CorporateActionOption15Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType11Choice }
     *     
     */
    public FractionDispositionType11Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType11Choice }
     *     
     */
    public CorporateActionOption47 setFrctnDspstn(FractionDispositionType11Choice value) {
        this.frctnDspstn = value;
        return this;
    }

    /**
     * Gets the value of the chngTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chngTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChngTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionChangeTypeFormat4Choice }
     * 
     * 
     */
    public List<CorporateActionChangeTypeFormat4Choice> getChngTp() {
        if (chngTp == null) {
            chngTp = new ArrayList<CorporateActionChangeTypeFormat4Choice>();
        }
        return this.chngTp;
    }

    /**
     * Gets the value of the elgblForCollInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElgblForCollInd() {
        return elgblForCollInd;
    }

    /**
     * Sets the value of the elgblForCollInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption47 setElgblForCollInd(Boolean value) {
        this.elgblForCollInd = value;
        return this;
    }

    /**
     * Gets the value of the ccyToBuy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyToBuy() {
        return ccyToBuy;
    }

    /**
     * Sets the value of the ccyToBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionOption47 setCcyToBuy(String value) {
        this.ccyToBuy = value;
        return this;
    }

    /**
     * Gets the value of the ccyToSell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyToSell() {
        return ccyToSell;
    }

    /**
     * Sets the value of the ccyToSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionOption47 setCcyToSell(String value) {
        this.ccyToSell = value;
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
    public CorporateActionOption47 setCcyOptn(String value) {
        this.ccyOptn = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public SecurityIdentification15 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public CorporateActionOption47 setSctyId(SecurityIdentification15 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesOption7 }
     *     
     */
    public SecuritiesOption7 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesOption7 }
     *     
     */
    public CorporateActionOption47 setSctiesQty(SecuritiesOption7 value) {
        this.sctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the exctnReqdDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getExctnReqdDtTm() {
        return exctnReqdDtTm;
    }

    /**
     * Sets the value of the exctnReqdDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public CorporateActionOption47 setExctnReqdDtTm(DateAndDateTimeChoice value) {
        this.exctnReqdDtTm = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate9 }
     *     
     */
    public CorporateActionRate9 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate9 }
     *     
     */
    public CorporateActionOption47 setRateAndAmtDtls(CorporateActionRate9 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice35 }
     *     
     */
    public CorporateActionPrice35 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice35 }
     *     
     */
    public CorporateActionOption47 setPricDtls(CorporateActionPrice35 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative13 }
     *     
     */
    public CorporateActionNarrative13 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative13 }
     *     
     */
    public CorporateActionOption47 setAddtlInf(CorporateActionNarrative13 value) {
        this.addtlInf = value;
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
     * Adds a new item to the chngTp list.
     * @see #getChngTp()
     * 
     */
    public CorporateActionOption47 addChngTp(CorporateActionChangeTypeFormat4Choice chngTp) {
        getChngTp().add(chngTp);
        return this;
    }

}
