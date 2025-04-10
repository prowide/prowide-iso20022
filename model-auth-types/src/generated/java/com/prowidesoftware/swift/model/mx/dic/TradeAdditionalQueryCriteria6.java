
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "TradeAdditionalQueryCriteria6", propOrder = {
    "actnTp",
    "exctnVn",
    "ntrOfCtrPty",
    "corpSctr"
})
public class TradeAdditionalQueryCriteria6 {

    @XmlElement(name = "ActnTp")
    @XmlSchemaType(name = "string")
    protected List<TransactionOperationType6Code> actnTp;
    @XmlElement(name = "ExctnVn")
    protected SecuritiesTradeVenueCriteria1Choice exctnVn;
    @XmlElement(name = "NtrOfCtrPty")
    @XmlSchemaType(name = "string")
    protected List<PartyNatureType1Code> ntrOfCtrPty;
    @XmlElement(name = "CorpSctr")
    protected List<CorporateSectorCriteria4> corpSctr;

    /**
     * Gets the value of the actnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actnTp property.
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
     * {@link TransactionOperationType6Code }
     * 
     * 
     * @return
     *     The value of the actnTp property.
     */
    public List<TransactionOperationType6Code> getActnTp() {
        if (actnTp == null) {
            actnTp = new ArrayList<>();
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
    public TradeAdditionalQueryCriteria6 setExctnVn(SecuritiesTradeVenueCriteria1Choice value) {
        this.exctnVn = value;
        return this;
    }

    /**
     * Gets the value of the ntrOfCtrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntrOfCtrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtrOfCtrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyNatureType1Code }
     * 
     * 
     * @return
     *     The value of the ntrOfCtrPty property.
     */
    public List<PartyNatureType1Code> getNtrOfCtrPty() {
        if (ntrOfCtrPty == null) {
            ntrOfCtrPty = new ArrayList<>();
        }
        return this.ntrOfCtrPty;
    }

    /**
     * Gets the value of the corpSctr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpSctr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpSctr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateSectorCriteria4 }
     * 
     * 
     * @return
     *     The value of the corpSctr property.
     */
    public List<CorporateSectorCriteria4> getCorpSctr() {
        if (corpSctr == null) {
            corpSctr = new ArrayList<>();
        }
        return this.corpSctr;
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
    public TradeAdditionalQueryCriteria6 addActnTp(TransactionOperationType6Code actnTp) {
        getActnTp().add(actnTp);
        return this;
    }

    /**
     * Adds a new item to the ntrOfCtrPty list.
     * @see #getNtrOfCtrPty()
     * 
     */
    public TradeAdditionalQueryCriteria6 addNtrOfCtrPty(PartyNatureType1Code ntrOfCtrPty) {
        getNtrOfCtrPty().add(ntrOfCtrPty);
        return this;
    }

    /**
     * Adds a new item to the corpSctr list.
     * @see #getCorpSctr()
     * 
     */
    public TradeAdditionalQueryCriteria6 addCorpSctr(CorporateSectorCriteria4 corpSctr) {
        getCorpSctr().add(corpSctr);
        return this;
    }

}
