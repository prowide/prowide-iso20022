
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Telecom services carries telephony billing data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecomServices3", propOrder = {
    "cstmrAcctNb",
    "cstmrNm",
    "cstmrPhne",
    "bllgStart",
    "bllgEnd",
    "bllgEvt",
    "ttlTax",
    "lineItm",
    "addtlData"
})
public class TelecomServices3 {

    @XmlElement(name = "CstmrAcctNb")
    protected String cstmrAcctNb;
    @XmlElement(name = "CstmrNm")
    protected String cstmrNm;
    @XmlElement(name = "CstmrPhne")
    protected String cstmrPhne;
    @XmlElement(name = "BllgStart", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate bllgStart;
    @XmlElement(name = "BllgEnd", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate bllgEnd;
    @XmlElement(name = "BllgEvt")
    protected List<Amount22> bllgEvt;
    @XmlElement(name = "TtlTax")
    protected List<Tax41> ttlTax;
    @XmlElement(name = "LineItm")
    protected List<TelecomServicesLineItem3> lineItm;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the cstmrAcctNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrAcctNb() {
        return cstmrAcctNb;
    }

    /**
     * Sets the value of the cstmrAcctNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServices3 setCstmrAcctNb(String value) {
        this.cstmrAcctNb = value;
        return this;
    }

    /**
     * Gets the value of the cstmrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrNm() {
        return cstmrNm;
    }

    /**
     * Sets the value of the cstmrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServices3 setCstmrNm(String value) {
        this.cstmrNm = value;
        return this;
    }

    /**
     * Gets the value of the cstmrPhne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrPhne() {
        return cstmrPhne;
    }

    /**
     * Sets the value of the cstmrPhne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServices3 setCstmrPhne(String value) {
        this.cstmrPhne = value;
        return this;
    }

    /**
     * Gets the value of the bllgStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getBllgStart() {
        return bllgStart;
    }

    /**
     * Sets the value of the bllgStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServices3 setBllgStart(LocalDate value) {
        this.bllgStart = value;
        return this;
    }

    /**
     * Gets the value of the bllgEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getBllgEnd() {
        return bllgEnd;
    }

    /**
     * Sets the value of the bllgEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServices3 setBllgEnd(LocalDate value) {
        this.bllgEnd = value;
        return this;
    }

    /**
     * Gets the value of the bllgEvt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bllgEvt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBllgEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount22 }
     * 
     * 
     * @return
     *     The value of the bllgEvt property.
     */
    public List<Amount22> getBllgEvt() {
        if (bllgEvt == null) {
            bllgEvt = new ArrayList<>();
        }
        return this.bllgEvt;
    }

    /**
     * Gets the value of the ttlTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax41 }
     * 
     * 
     * @return
     *     The value of the ttlTax property.
     */
    public List<Tax41> getTtlTax() {
        if (ttlTax == null) {
            ttlTax = new ArrayList<>();
        }
        return this.ttlTax;
    }

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelecomServicesLineItem3 }
     * 
     * 
     * @return
     *     The value of the lineItm property.
     */
    public List<TelecomServicesLineItem3> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<>();
        }
        return this.lineItm;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
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
     * Adds a new item to the bllgEvt list.
     * @see #getBllgEvt()
     * 
     */
    public TelecomServices3 addBllgEvt(Amount22 bllgEvt) {
        getBllgEvt().add(bllgEvt);
        return this;
    }

    /**
     * Adds a new item to the ttlTax list.
     * @see #getTtlTax()
     * 
     */
    public TelecomServices3 addTtlTax(Tax41 ttlTax) {
        getTtlTax().add(ttlTax);
        return this;
    }

    /**
     * Adds a new item to the lineItm list.
     * @see #getLineItm()
     * 
     */
    public TelecomServices3 addLineItm(TelecomServicesLineItem3 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public TelecomServices3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
