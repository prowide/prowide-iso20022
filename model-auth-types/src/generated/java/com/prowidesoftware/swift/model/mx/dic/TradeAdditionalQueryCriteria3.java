
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
@XmlType(name = "TradeAdditionalQueryCriteria3", propOrder = {
    "actnTp",
    "exctnVn",
    "ntrOfCtrPty",
    "corpSctr",
    "asstClss",
    "pdctClssfctn"
})
public class TradeAdditionalQueryCriteria3 {

    @XmlElement(name = "ActnTp")
    @XmlSchemaType(name = "string")
    protected List<TransactionOperationType3Code> actnTp;
    @XmlElement(name = "ExctnVn")
    protected SecuritiesTradeVenueCriteria1Choice exctnVn;
    @XmlElement(name = "NtrOfCtrPty")
    @XmlSchemaType(name = "string")
    protected PartyNatureType1Code ntrOfCtrPty;
    @XmlElement(name = "CorpSctr")
    protected CorporateSectorCriteria3 corpSctr;
    @XmlElement(name = "AsstClss")
    @XmlSchemaType(name = "string")
    protected List<ProductType4Code> asstClss;
    @XmlElement(name = "PdctClssfctn")
    protected ProductClassificationCriteria1 pdctClssfctn;

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
     * {@link TransactionOperationType3Code }
     * 
     * 
     */
    public List<TransactionOperationType3Code> getActnTp() {
        if (actnTp == null) {
            actnTp = new ArrayList<TransactionOperationType3Code>();
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
    public TradeAdditionalQueryCriteria3 setExctnVn(SecuritiesTradeVenueCriteria1Choice value) {
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
    public TradeAdditionalQueryCriteria3 setNtrOfCtrPty(PartyNatureType1Code value) {
        this.ntrOfCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the corpSctr property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateSectorCriteria3 }
     *     
     */
    public CorporateSectorCriteria3 getCorpSctr() {
        return corpSctr;
    }

    /**
     * Sets the value of the corpSctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateSectorCriteria3 }
     *     
     */
    public TradeAdditionalQueryCriteria3 setCorpSctr(CorporateSectorCriteria3 value) {
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
    public TradeAdditionalQueryCriteria3 setPdctClssfctn(ProductClassificationCriteria1 value) {
        this.pdctClssfctn = value;
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
     * Adds a new item to the actnTp list.
     * @see #getActnTp()
     * 
     */
    public TradeAdditionalQueryCriteria3 addActnTp(TransactionOperationType3Code actnTp) {
        getActnTp().add(actnTp);
        return this;
    }

    /**
     * Adds a new item to the asstClss list.
     * @see #getAsstClss()
     * 
     */
    public TradeAdditionalQueryCriteria3 addAsstClss(ProductType4Code asstClss) {
        getAsstClss().add(asstClss);
        return this;
    }

}
