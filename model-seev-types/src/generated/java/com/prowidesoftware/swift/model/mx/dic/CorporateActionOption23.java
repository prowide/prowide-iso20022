
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
@XmlType(name = "CorporateActionOption23", propOrder = {
    "optnNb",
    "optnTp",
    "optnFeatrs",
    "frctnDspstn",
    "ccyOptn",
    "dtDtls",
    "prdDtls",
    "rateAndAmtDtls",
    "pricDtls",
    "plcOfTrad",
    "sctiesMvmntDtls",
    "cshMvmntDtls"
})
public class CorporateActionOption23 {

    @XmlElement(name = "OptnNb", required = true)
    protected OptionNumber1Choice optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption3Choice optnTp;
    @XmlElement(name = "OptnFeatrs")
    protected List<OptionFeaturesFormat1Choice> optnFeatrs;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType12Choice frctnDspstn;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "DtDtls")
    protected CorporateActionDate18 dtDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod9 prdDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate20 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice21 pricDtls;
    @XmlElement(name = "PlcOfTrad")
    protected MarketIdentification4 plcOfTrad;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<SecuritiesOption18> sctiesMvmntDtls;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashOption12> cshMvmntDtls;

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
    public CorporateActionOption23 setOptnNb(OptionNumber1Choice value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption3Choice }
     *     
     */
    public CorporateActionOption3Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption3Choice }
     *     
     */
    public CorporateActionOption23 setOptnTp(CorporateActionOption3Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the optnFeatrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnFeatrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnFeatrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionFeaturesFormat1Choice }
     * 
     * 
     */
    public List<OptionFeaturesFormat1Choice> getOptnFeatrs() {
        if (optnFeatrs == null) {
            optnFeatrs = new ArrayList<OptionFeaturesFormat1Choice>();
        }
        return this.optnFeatrs;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType12Choice }
     *     
     */
    public FractionDispositionType12Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType12Choice }
     *     
     */
    public CorporateActionOption23 setFrctnDspstn(FractionDispositionType12Choice value) {
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
    public CorporateActionOption23 setCcyOptn(String value) {
        this.ccyOptn = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate18 }
     *     
     */
    public CorporateActionDate18 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate18 }
     *     
     */
    public CorporateActionOption23 setDtDtls(CorporateActionDate18 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod9 }
     *     
     */
    public CorporateActionPeriod9 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod9 }
     *     
     */
    public CorporateActionOption23 setPrdDtls(CorporateActionPeriod9 value) {
        this.prdDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate20 }
     *     
     */
    public CorporateActionRate20 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate20 }
     *     
     */
    public CorporateActionOption23 setRateAndAmtDtls(CorporateActionRate20 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice21 }
     *     
     */
    public CorporateActionPrice21 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice21 }
     *     
     */
    public CorporateActionOption23 setPricDtls(CorporateActionPrice21 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification4 }
     *     
     */
    public MarketIdentification4 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification4 }
     *     
     */
    public CorporateActionOption23 setPlcOfTrad(MarketIdentification4 value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOption18 }
     * 
     * 
     */
    public List<SecuritiesOption18> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<SecuritiesOption18>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOption12 }
     * 
     * 
     */
    public List<CashOption12> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<CashOption12>();
        }
        return this.cshMvmntDtls;
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
     * Adds a new item to the optnFeatrs list.
     * @see #getOptnFeatrs()
     * 
     */
    public CorporateActionOption23 addOptnFeatrs(OptionFeaturesFormat1Choice optnFeatrs) {
        getOptnFeatrs().add(optnFeatrs);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntDtls list.
     * @see #getSctiesMvmntDtls()
     * 
     */
    public CorporateActionOption23 addSctiesMvmntDtls(SecuritiesOption18 sctiesMvmntDtls) {
        getSctiesMvmntDtls().add(sctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the cshMvmntDtls list.
     * @see #getCshMvmntDtls()
     * 
     */
    public CorporateActionOption23 addCshMvmntDtls(CashOption12 cshMvmntDtls) {
        getCshMvmntDtls().add(cshMvmntDtls);
        return this;
    }

}
