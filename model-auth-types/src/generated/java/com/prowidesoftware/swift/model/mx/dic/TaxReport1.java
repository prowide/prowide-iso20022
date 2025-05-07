
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
 * Contains all needed party details for tax agency (sender of the TaxReport) and tax authority (receiver of the TaxReport) and the details of the reported sales transaction and calculated tax related that specific business transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReport1", propOrder = {
    "taxRptHdr",
    "sellr",
    "buyr",
    "tradSttlm",
    "othrPty",
    "addtlInf",
    "addtlRef",
    "splmtryData"
})
public class TaxReport1 {

    @XmlElement(name = "TaxRptHdr", required = true)
    protected GroupHeader69 taxRptHdr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification72 sellr;
    @XmlElement(name = "Buyr")
    protected PartyIdentification72 buyr;
    @XmlElement(name = "TradSttlm", required = true)
    protected TradeSettlement2 tradSttlm;
    @XmlElement(name = "OthrPty")
    protected List<PartyIdentification72> othrPty;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation1> addtlInf;
    @XmlElement(name = "AddtlRef")
    protected List<DocumentGeneralInformation2> addtlRef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the taxRptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader69 }
     *     
     */
    public GroupHeader69 getTaxRptHdr() {
        return taxRptHdr;
    }

    /**
     * Sets the value of the taxRptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader69 }
     *     
     */
    public TaxReport1 setTaxRptHdr(GroupHeader69 value) {
        this.taxRptHdr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification72 }
     *     
     */
    public PartyIdentification72 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification72 }
     *     
     */
    public TaxReport1 setSellr(PartyIdentification72 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification72 }
     *     
     */
    public PartyIdentification72 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification72 }
     *     
     */
    public TaxReport1 setBuyr(PartyIdentification72 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the tradSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link TradeSettlement2 }
     *     
     */
    public TradeSettlement2 getTradSttlm() {
        return tradSttlm;
    }

    /**
     * Sets the value of the tradSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeSettlement2 }
     *     
     */
    public TaxReport1 setTradSttlm(TradeSettlement2 value) {
        this.tradSttlm = value;
        return this;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification72 }
     * 
     * 
     */
    public List<PartyIdentification72> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<PartyIdentification72>();
        }
        return this.othrPty;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation1 }
     * 
     * 
     */
    public List<AdditionalInformation1> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation1>();
        }
        return this.addtlInf;
    }

    /**
     * Gets the value of the addtlRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation2 }
     * 
     * 
     */
    public List<DocumentGeneralInformation2> getAddtlRef() {
        if (addtlRef == null) {
            addtlRef = new ArrayList<DocumentGeneralInformation2>();
        }
        return this.addtlRef;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the othrPty list.
     * @see #getOthrPty()
     * 
     */
    public TaxReport1 addOthrPty(PartyIdentification72 othrPty) {
        getOthrPty().add(othrPty);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public TaxReport1 addAddtlInf(AdditionalInformation1 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

    /**
     * Adds a new item to the addtlRef list.
     * @see #getAddtlRef()
     * 
     */
    public TaxReport1 addAddtlRef(DocumentGeneralInformation2 addtlRef) {
        getAddtlRef().add(addtlRef);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TaxReport1 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
