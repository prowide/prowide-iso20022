
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
 * Loyalty programme used for partial payment in loyalty value (debit) and computation of loyalty value gained on the monetary value paid by the customer (credit).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramme5", propOrder = {
    "elgblty",
    "issr",
    "mmbNm",
    "mmbAdr",
    "mmbId",
    "mmbSts",
    "xprtnDt",
    "val",
    "valTp",
    "othrValTp",
    "valToCdt",
    "valToDbt",
    "bal"
})
public class LoyaltyProgramme5 {

    @XmlElement(name = "Elgblty", type = Boolean.class)
    protected List<Boolean> elgblty;
    @XmlElement(name = "Issr")
    protected String issr;
    @XmlElement(name = "MmbNm")
    protected CardholderName3 mmbNm;
    @XmlElement(name = "MmbAdr")
    protected Address2 mmbAdr;
    @XmlElement(name = "MmbId")
    protected String mmbId;
    @XmlElement(name = "MmbSts")
    protected String mmbSts;
    @XmlElement(name = "XprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate xprtnDt;
    @XmlElement(name = "Val")
    protected String val;
    @XmlElement(name = "ValTp")
    @XmlSchemaType(name = "string")
    protected LoyaltyValueType1Code valTp;
    @XmlElement(name = "OthrValTp")
    protected String othrValTp;
    @XmlElement(name = "ValToCdt")
    protected String valToCdt;
    @XmlElement(name = "ValToDbt")
    protected String valToDbt;
    @XmlElement(name = "Bal")
    protected String bal;

    /**
     * Gets the value of the elgblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the elgblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElgblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     * @return
     *     The value of the elgblty property.
     */
    public List<Boolean> getElgblty() {
        if (elgblty == null) {
            elgblty = new ArrayList<>();
        }
        return this.elgblty;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme5 setIssr(String value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the mmbNm property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName3 }
     *     
     */
    public CardholderName3 getMmbNm() {
        return mmbNm;
    }

    /**
     * Sets the value of the mmbNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName3 }
     *     
     */
    public LoyaltyProgramme5 setMmbNm(CardholderName3 value) {
        this.mmbNm = value;
        return this;
    }

    /**
     * Gets the value of the mmbAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getMmbAdr() {
        return mmbAdr;
    }

    /**
     * Sets the value of the mmbAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public LoyaltyProgramme5 setMmbAdr(Address2 value) {
        this.mmbAdr = value;
        return this;
    }

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme5 setMmbId(String value) {
        this.mmbId = value;
        return this;
    }

    /**
     * Gets the value of the mmbSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmbSts() {
        return mmbSts;
    }

    /**
     * Sets the value of the mmbSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme5 setMmbSts(String value) {
        this.mmbSts = value;
        return this;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme5 setXprtnDt(LocalDate value) {
        this.xprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme5 setVal(String value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the valTp property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyValueType1Code }
     *     
     */
    public LoyaltyValueType1Code getValTp() {
        return valTp;
    }

    /**
     * Sets the value of the valTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyValueType1Code }
     *     
     */
    public LoyaltyProgramme5 setValTp(LoyaltyValueType1Code value) {
        this.valTp = value;
        return this;
    }

    /**
     * Gets the value of the othrValTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrValTp() {
        return othrValTp;
    }

    /**
     * Sets the value of the othrValTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme5 setOthrValTp(String value) {
        this.othrValTp = value;
        return this;
    }

    /**
     * Gets the value of the valToCdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValToCdt() {
        return valToCdt;
    }

    /**
     * Sets the value of the valToCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme5 setValToCdt(String value) {
        this.valToCdt = value;
        return this;
    }

    /**
     * Gets the value of the valToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValToDbt() {
        return valToDbt;
    }

    /**
     * Sets the value of the valToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme5 setValToDbt(String value) {
        this.valToDbt = value;
        return this;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyProgramme5 setBal(String value) {
        this.bal = value;
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
     * Adds a new item to the elgblty list.
     * @see #getElgblty()
     * 
     */
    public LoyaltyProgramme5 addElgblty(Boolean elgblty) {
        getElgblty().add(elgblty);
        return this;
    }

}
