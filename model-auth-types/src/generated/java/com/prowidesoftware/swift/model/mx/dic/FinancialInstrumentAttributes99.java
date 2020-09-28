
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
 * Elements characterising a financial instrument.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes99", propOrder = {
    "nm",
    "lglFrmwk",
    "stffWthSvgsPlan",
    "ctryOfDmcl",
    "regdDstrbtnCtry",
    "baseCcy",
    "dpstryId",
    "mnyMktFndTp",
    "mstrFnd",
    "mstrFndList",
    "shrClssInd",
    "shrClss",
    "fndRltdEvt"
})
public class FinancialInstrumentAttributes99 {

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "LglFrmwk", required = true)
    protected LegalFramework5Choice lglFrmwk;
    @XmlElement(name = "StffWthSvgsPlan")
    protected boolean stffWthSvgsPlan;
    @XmlElement(name = "CtryOfDmcl", required = true)
    protected String ctryOfDmcl;
    @XmlElement(name = "RegdDstrbtnCtry")
    protected List<RegisteredDistributionCountry1Choice> regdDstrbtnCtry;
    @XmlElement(name = "BaseCcy", required = true)
    protected String baseCcy;
    @XmlElement(name = "DpstryId")
    protected PartyIdentification194 dpstryId;
    @XmlElement(name = "MnyMktFndTp", required = true)
    protected MoneyMarketFundType1Choice mnyMktFndTp;
    @XmlElement(name = "MstrFnd", required = true)
    @XmlSchemaType(name = "string")
    protected MasterFundType1Code mstrFnd;
    @XmlElement(name = "MstrFndList")
    protected List<PartyIdentification194> mstrFndList;
    @XmlElement(name = "ShrClssInd")
    protected boolean shrClssInd;
    @XmlElement(name = "ShrClss", required = true)
    protected FinancialInstrument60Choice shrClss;
    @XmlElement(name = "FndRltdEvt", required = true)
    protected RelatedEvent2 fndRltdEvt;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes99 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the lglFrmwk property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFramework5Choice }
     *     
     */
    public LegalFramework5Choice getLglFrmwk() {
        return lglFrmwk;
    }

    /**
     * Sets the value of the lglFrmwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFramework5Choice }
     *     
     */
    public FinancialInstrumentAttributes99 setLglFrmwk(LegalFramework5Choice value) {
        this.lglFrmwk = value;
        return this;
    }

    /**
     * Gets the value of the stffWthSvgsPlan property.
     * 
     */
    public boolean isStffWthSvgsPlan() {
        return stffWthSvgsPlan;
    }

    /**
     * Sets the value of the stffWthSvgsPlan property.
     * 
     */
    public FinancialInstrumentAttributes99 setStffWthSvgsPlan(boolean value) {
        this.stffWthSvgsPlan = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfDmcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfDmcl() {
        return ctryOfDmcl;
    }

    /**
     * Sets the value of the ctryOfDmcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes99 setCtryOfDmcl(String value) {
        this.ctryOfDmcl = value;
        return this;
    }

    /**
     * Gets the value of the regdDstrbtnCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regdDstrbtnCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegdDstrbtnCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredDistributionCountry1Choice }
     * 
     * 
     */
    public List<RegisteredDistributionCountry1Choice> getRegdDstrbtnCtry() {
        if (regdDstrbtnCtry == null) {
            regdDstrbtnCtry = new ArrayList<RegisteredDistributionCountry1Choice>();
        }
        return this.regdDstrbtnCtry;
    }

    /**
     * Gets the value of the baseCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCcy() {
        return baseCcy;
    }

    /**
     * Sets the value of the baseCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes99 setBaseCcy(String value) {
        this.baseCcy = value;
        return this;
    }

    /**
     * Gets the value of the dpstryId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification194 }
     *     
     */
    public PartyIdentification194 getDpstryId() {
        return dpstryId;
    }

    /**
     * Sets the value of the dpstryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification194 }
     *     
     */
    public FinancialInstrumentAttributes99 setDpstryId(PartyIdentification194 value) {
        this.dpstryId = value;
        return this;
    }

    /**
     * Gets the value of the mnyMktFndTp property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketFundType1Choice }
     *     
     */
    public MoneyMarketFundType1Choice getMnyMktFndTp() {
        return mnyMktFndTp;
    }

    /**
     * Sets the value of the mnyMktFndTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketFundType1Choice }
     *     
     */
    public FinancialInstrumentAttributes99 setMnyMktFndTp(MoneyMarketFundType1Choice value) {
        this.mnyMktFndTp = value;
        return this;
    }

    /**
     * Gets the value of the mstrFnd property.
     * 
     * @return
     *     possible object is
     *     {@link MasterFundType1Code }
     *     
     */
    public MasterFundType1Code getMstrFnd() {
        return mstrFnd;
    }

    /**
     * Sets the value of the mstrFnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterFundType1Code }
     *     
     */
    public FinancialInstrumentAttributes99 setMstrFnd(MasterFundType1Code value) {
        this.mstrFnd = value;
        return this;
    }

    /**
     * Gets the value of the mstrFndList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mstrFndList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMstrFndList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification194 }
     * 
     * 
     */
    public List<PartyIdentification194> getMstrFndList() {
        if (mstrFndList == null) {
            mstrFndList = new ArrayList<PartyIdentification194>();
        }
        return this.mstrFndList;
    }

    /**
     * Gets the value of the shrClssInd property.
     * 
     */
    public boolean isShrClssInd() {
        return shrClssInd;
    }

    /**
     * Sets the value of the shrClssInd property.
     * 
     */
    public FinancialInstrumentAttributes99 setShrClssInd(boolean value) {
        this.shrClssInd = value;
        return this;
    }

    /**
     * Gets the value of the shrClss property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument60Choice }
     *     
     */
    public FinancialInstrument60Choice getShrClss() {
        return shrClss;
    }

    /**
     * Sets the value of the shrClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument60Choice }
     *     
     */
    public FinancialInstrumentAttributes99 setShrClss(FinancialInstrument60Choice value) {
        this.shrClss = value;
        return this;
    }

    /**
     * Gets the value of the fndRltdEvt property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedEvent2 }
     *     
     */
    public RelatedEvent2 getFndRltdEvt() {
        return fndRltdEvt;
    }

    /**
     * Sets the value of the fndRltdEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedEvent2 }
     *     
     */
    public FinancialInstrumentAttributes99 setFndRltdEvt(RelatedEvent2 value) {
        this.fndRltdEvt = value;
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
     * Adds a new item to the regdDstrbtnCtry list.
     * @see #getRegdDstrbtnCtry()
     * 
     */
    public FinancialInstrumentAttributes99 addRegdDstrbtnCtry(RegisteredDistributionCountry1Choice regdDstrbtnCtry) {
        getRegdDstrbtnCtry().add(regdDstrbtnCtry);
        return this;
    }

    /**
     * Adds a new item to the mstrFndList list.
     * @see #getMstrFndList()
     * 
     */
    public FinancialInstrumentAttributes99 addMstrFndList(PartyIdentification194 mstrFndList) {
        getMstrFndList().add(mstrFndList);
        return this;
    }

}
