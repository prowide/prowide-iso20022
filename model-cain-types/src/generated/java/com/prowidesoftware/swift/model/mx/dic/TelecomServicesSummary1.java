
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
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
 * Telecom services summary component carries summary level telephony billing data. 
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecomServicesSummary1", propOrder = {
    "cstmr",
    "bllgStmtPrdStart",
    "bllgStmtPrdEnd",
    "bllgEvt",
    "ttlTax",
    "addtlData"
})
public class TelecomServicesSummary1 {

    @XmlElement(name = "Cstmr")
    protected Customer6 cstmr;
    @XmlElement(name = "BllgStmtPrdStart", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar bllgStmtPrdStart;
    @XmlElement(name = "BllgStmtPrdEnd", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar bllgStmtPrdEnd;
    @XmlElement(name = "BllgEvt")
    protected List<Amount10> bllgEvt;
    @XmlElement(name = "TtlTax")
    protected List<Tax33> ttlTax;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the cstmr property.
     * 
     * @return
     *     possible object is
     *     {@link Customer6 }
     *     
     */
    public Customer6 getCstmr() {
        return cstmr;
    }

    /**
     * Sets the value of the cstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer6 }
     *     
     */
    public TelecomServicesSummary1 setCstmr(Customer6 value) {
        this.cstmr = value;
        return this;
    }

    /**
     * Gets the value of the bllgStmtPrdStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBllgStmtPrdStart() {
        return bllgStmtPrdStart;
    }

    /**
     * Sets the value of the bllgStmtPrdStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesSummary1 setBllgStmtPrdStart(Calendar value) {
        this.bllgStmtPrdStart = value;
        return this;
    }

    /**
     * Gets the value of the bllgStmtPrdEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getBllgStmtPrdEnd() {
        return bllgStmtPrdEnd;
    }

    /**
     * Sets the value of the bllgStmtPrdEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesSummary1 setBllgStmtPrdEnd(Calendar value) {
        this.bllgStmtPrdEnd = value;
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
     * {@link Amount10 }
     * 
     * 
     * @return
     *     The value of the bllgEvt property.
     */
    public List<Amount10> getBllgEvt() {
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
     * {@link Tax33 }
     * 
     * 
     * @return
     *     The value of the ttlTax property.
     */
    public List<Tax33> getTtlTax() {
        if (ttlTax == null) {
            ttlTax = new ArrayList<>();
        }
        return this.ttlTax;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TelecomServicesSummary1 setAddtlData(String value) {
        this.addtlData = value;
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
     * Adds a new item to the bllgEvt list.
     * @see #getBllgEvt()
     * 
     */
    public TelecomServicesSummary1 addBllgEvt(Amount10 bllgEvt) {
        getBllgEvt().add(bllgEvt);
        return this;
    }

    /**
     * Adds a new item to the ttlTax list.
     * @see #getTtlTax()
     * 
     */
    public TelecomServicesSummary1 addTtlTax(Tax33 ttlTax) {
        getTtlTax().add(ttlTax);
        return this;
    }

}
