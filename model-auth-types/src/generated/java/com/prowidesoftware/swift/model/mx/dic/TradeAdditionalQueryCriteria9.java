
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
 * Query criteria regarding action type, product classification, venue of execution, asset class, corporate sector nature of counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAdditionalQueryCriteria9", propOrder = {
    "actnTp",
    "exctnVn",
    "ntrOfCtrPty",
    "corpSctr",
    "asstClss",
    "pdctClssfctn",
    "lvl",
    "evtTp"
})
public class TradeAdditionalQueryCriteria9 {

    @XmlElement(name = "ActnTp")
    @XmlSchemaType(name = "string")
    protected List<TransactionOperationType8Code> actnTp;
    @XmlElement(name = "ExctnVn")
    protected SecuritiesTradeVenueCriteria1Choice exctnVn;
    @XmlElement(name = "NtrOfCtrPty")
    @XmlSchemaType(name = "string")
    protected PartyNatureType1Code ntrOfCtrPty;
    @XmlElement(name = "CorpSctr")
    protected CorporateSectorCriteria6 corpSctr;
    @XmlElement(name = "AsstClss")
    @XmlSchemaType(name = "string")
    protected List<ProductType4Code> asstClss;
    @XmlElement(name = "PdctClssfctn")
    protected ProductClassificationCriteria1 pdctClssfctn;
    @XmlElement(name = "Lvl")
    @XmlSchemaType(name = "string")
    protected ModificationLevel1Code lvl;
    @XmlElement(name = "EvtTp")
    @XmlSchemaType(name = "string")
    protected List<DerivativeEventType3Code> evtTp;

    /**
     * Gets the value of the actnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionOperationType8Code }
     * 
     * 
     */
    public List<TransactionOperationType8Code> getActnTp() {
        if (actnTp == null) {
            actnTp = new ArrayList<TransactionOperationType8Code>();
        }
        return this.actnTp;
    }

    /**
     * Gets the value of the exctnVn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeVenueCriteria1Choice }
     *     
     */
    public SecuritiesTradeVenueCriteria1Choice getExctnVn() {
        return exctnVn;
    }

    /**
     * Sets the value of the exctnVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeVenueCriteria1Choice }
     *     
     */
    public TradeAdditionalQueryCriteria9 setExctnVn(SecuritiesTradeVenueCriteria1Choice value) {
        this.exctnVn = value;
        return this;
    }

    /**
     * Gets the value of the ntrOfCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyNatureType1Code }
     *     
     */
    public PartyNatureType1Code getNtrOfCtrPty() {
        return ntrOfCtrPty;
    }

    /**
     * Sets the value of the ntrOfCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyNatureType1Code }
     *     
     */
    public TradeAdditionalQueryCriteria9 setNtrOfCtrPty(PartyNatureType1Code value) {
        this.ntrOfCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the corpSctr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateSectorCriteria6 }
     *     
     */
    public CorporateSectorCriteria6 getCorpSctr() {
        return corpSctr;
    }

    /**
     * Sets the value of the corpSctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateSectorCriteria6 }
     *     
     */
    public TradeAdditionalQueryCriteria9 setCorpSctr(CorporateSectorCriteria6 value) {
        this.corpSctr = value;
        return this;
    }

    /**
     * Gets the value of the asstClss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asstClss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsstClss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType4Code }
     * 
     * 
     */
    public List<ProductType4Code> getAsstClss() {
        if (asstClss == null) {
            asstClss = new ArrayList<ProductType4Code>();
        }
        return this.asstClss;
    }

    /**
     * Gets the value of the pdctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ProductClassificationCriteria1 }
     *     
     */
    public ProductClassificationCriteria1 getPdctClssfctn() {
        return pdctClssfctn;
    }

    /**
     * Sets the value of the pdctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductClassificationCriteria1 }
     *     
     */
    public TradeAdditionalQueryCriteria9 setPdctClssfctn(ProductClassificationCriteria1 value) {
        this.pdctClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the lvl property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationLevel1Code }
     *     
     */
    public ModificationLevel1Code getLvl() {
        return lvl;
    }

    /**
     * Sets the value of the lvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationLevel1Code }
     *     
     */
    public TradeAdditionalQueryCriteria9 setLvl(ModificationLevel1Code value) {
        this.lvl = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivativeEventType3Code }
     * 
     * 
     */
    public List<DerivativeEventType3Code> getEvtTp() {
        if (evtTp == null) {
            evtTp = new ArrayList<DerivativeEventType3Code>();
        }
        return this.evtTp;
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
     * Adds a new item to the actnTp list.
     * @see #getActnTp()
     * 
     */
    public TradeAdditionalQueryCriteria9 addActnTp(TransactionOperationType8Code actnTp) {
        getActnTp().add(actnTp);
        return this;
    }

    /**
     * Adds a new item to the asstClss list.
     * @see #getAsstClss()
     * 
     */
    public TradeAdditionalQueryCriteria9 addAsstClss(ProductType4Code asstClss) {
        getAsstClss().add(asstClss);
        return this;
    }

    /**
     * Adds a new item to the evtTp list.
     * @see #getEvtTp()
     * 
     */
    public TradeAdditionalQueryCriteria9 addEvtTp(DerivativeEventType3Code evtTp) {
        getEvtTp().add(evtTp);
        return this;
    }

}
