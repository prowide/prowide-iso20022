
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "CorporateActionOption103", propOrder = {
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
public class CorporateActionOption103 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption12Choice optnTp;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType17Choice frctnDspstn;
    @XmlElement(name = "ChngTp")
    protected List<CorporateActionChangeTypeFormat2Choice> chngTp;
    @XmlElement(name = "ElgblForCollInd")
    protected Boolean elgblForCollInd;
    @XmlElement(name = "CcyToBuy")
    protected String ccyToBuy;
    @XmlElement(name = "CcyToSell")
    protected String ccyToSell;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "SctyId")
    protected SecurityIdentification14 sctyId;
    @XmlElement(name = "SctiesQty", required = true)
    protected SecuritiesOption2 sctiesQty;
    @XmlElement(name = "ExctnReqdDtTm")
    protected DateAndDateTimeChoice exctnReqdDtTm;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate47 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice44 pricDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative8 addtlInf;

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
    public CorporateActionOption103 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption12Choice }
     *     
     */
    public CorporateActionOption12Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption12Choice }
     *     
     */
    public CorporateActionOption103 setOptnTp(CorporateActionOption12Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType17Choice }
     *     
     */
    public FractionDispositionType17Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType17Choice }
     *     
     */
    public CorporateActionOption103 setFrctnDspstn(FractionDispositionType17Choice value) {
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
     * {@link CorporateActionChangeTypeFormat2Choice }
     * 
     * 
     */
    public List<CorporateActionChangeTypeFormat2Choice> getChngTp() {
        if (chngTp == null) {
            chngTp = new ArrayList<CorporateActionChangeTypeFormat2Choice>();
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
    public CorporateActionOption103 setElgblForCollInd(Boolean value) {
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
    public CorporateActionOption103 setCcyToBuy(String value) {
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
    public CorporateActionOption103 setCcyToSell(String value) {
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
    public CorporateActionOption103 setCcyOptn(String value) {
        this.ccyOptn = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public CorporateActionOption103 setSctyId(SecurityIdentification14 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesOption2 }
     *     
     */
    public SecuritiesOption2 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesOption2 }
     *     
     */
    public CorporateActionOption103 setSctiesQty(SecuritiesOption2 value) {
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
    public CorporateActionOption103 setExctnReqdDtTm(DateAndDateTimeChoice value) {
        this.exctnReqdDtTm = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate47 }
     *     
     */
    public CorporateActionRate47 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate47 }
     *     
     */
    public CorporateActionOption103 setRateAndAmtDtls(CorporateActionRate47 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice44 }
     *     
     */
    public CorporateActionPrice44 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice44 }
     *     
     */
    public CorporateActionOption103 setPricDtls(CorporateActionPrice44 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative8 }
     *     
     */
    public CorporateActionNarrative8 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative8 }
     *     
     */
    public CorporateActionOption103 setAddtlInf(CorporateActionNarrative8 value) {
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
    public CorporateActionOption103 addChngTp(CorporateActionChangeTypeFormat2Choice chngTp) {
        getChngTp().add(chngTp);
        return this;
    }

}
