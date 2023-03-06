
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
 * Goods or services that are part of a commercial trade agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialDataSet3", propOrder = {
    "dataSetId",
    "comrclDocRef",
    "buyr",
    "sellr",
    "bllTo",
    "goods",
    "pmtTerms",
    "sttlmTerms"
})
public class CommercialDataSet3 {

    @XmlElement(name = "DataSetId", required = true)
    protected DocumentIdentification1 dataSetId;
    @XmlElement(name = "ComrclDocRef", required = true)
    protected InvoiceIdentification1 comrclDocRef;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification26 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification26 sellr;
    @XmlElement(name = "BllTo")
    protected PartyIdentification26 bllTo;
    @XmlElement(name = "Goods", required = true)
    protected List<LineItem9> goods;
    @XmlElement(name = "PmtTerms", required = true)
    protected List<PaymentTerms1> pmtTerms;
    @XmlElement(name = "SttlmTerms", required = true)
    protected SettlementTerms2 sttlmTerms;

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public DocumentIdentification1 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification1 }
     *     
     */
    public CommercialDataSet3 setDataSetId(DocumentIdentification1 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the comrclDocRef property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceIdentification1 }
     *     
     */
    public InvoiceIdentification1 getComrclDocRef() {
        return comrclDocRef;
    }

    /**
     * Sets the value of the comrclDocRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceIdentification1 }
     *     
     */
    public CommercialDataSet3 setComrclDocRef(InvoiceIdentification1 value) {
        this.comrclDocRef = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public CommercialDataSet3 setBuyr(PartyIdentification26 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public CommercialDataSet3 setSellr(PartyIdentification26 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the bllTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification26 }
     *     
     */
    public PartyIdentification26 getBllTo() {
        return bllTo;
    }

    /**
     * Sets the value of the bllTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification26 }
     *     
     */
    public CommercialDataSet3 setBllTo(PartyIdentification26 value) {
        this.bllTo = value;
        return this;
    }

    /**
     * Gets the value of the goods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItem9 }
     * 
     * 
     */
    public List<LineItem9> getGoods() {
        if (goods == null) {
            goods = new ArrayList<LineItem9>();
        }
        return this.goods;
    }

    /**
     * Gets the value of the pmtTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerms1 }
     * 
     * 
     */
    public List<PaymentTerms1> getPmtTerms() {
        if (pmtTerms == null) {
            pmtTerms = new ArrayList<PaymentTerms1>();
        }
        return this.pmtTerms;
    }

    /**
     * Gets the value of the sttlmTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTerms2 }
     *     
     */
    public SettlementTerms2 getSttlmTerms() {
        return sttlmTerms;
    }

    /**
     * Sets the value of the sttlmTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTerms2 }
     *     
     */
    public CommercialDataSet3 setSttlmTerms(SettlementTerms2 value) {
        this.sttlmTerms = value;
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
     * Adds a new item to the goods list.
     * @see #getGoods()
     * 
     */
    public CommercialDataSet3 addGoods(LineItem9 goods) {
        getGoods().add(goods);
        return this;
    }

    /**
     * Adds a new item to the pmtTerms list.
     * @see #getPmtTerms()
     * 
     */
    public CommercialDataSet3 addPmtTerms(PaymentTerms1 pmtTerms) {
        getPmtTerms().add(pmtTerms);
        return this;
    }

}
