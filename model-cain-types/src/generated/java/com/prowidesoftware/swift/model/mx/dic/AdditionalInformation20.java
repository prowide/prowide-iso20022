
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
 * Additional information relevant to the destination.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation20", propOrder = {
    "rcpt",
    "othrRcpt",
    "trgt",
    "othrTrgt",
    "frmt",
    "othrFrmt",
    "tp",
    "val"
})
public class AdditionalInformation20 {

    @XmlElement(name = "Rcpt")
    @XmlSchemaType(name = "string")
    protected PartyType22Code rcpt;
    @XmlElement(name = "OthrRcpt")
    protected String othrRcpt;
    @XmlElement(name = "Trgt")
    @XmlSchemaType(name = "string")
    protected List<UserInterface6Code> trgt;
    @XmlElement(name = "OthrTrgt")
    protected String othrTrgt;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat4Code frmt;
    @XmlElement(name = "OthrFrmt")
    protected String othrFrmt;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Val", required = true)
    protected String val;

    /**
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType22Code }
     *     
     */
    public PartyType22Code getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType22Code }
     *     
     */
    public AdditionalInformation20 setRcpt(PartyType22Code value) {
        this.rcpt = value;
        return this;
    }

    /**
     * Gets the value of the othrRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRcpt() {
        return othrRcpt;
    }

    /**
     * Sets the value of the othrRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation20 setOthrRcpt(String value) {
        this.othrRcpt = value;
        return this;
    }

    /**
     * Gets the value of the trgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserInterface6Code }
     * 
     * 
     */
    public List<UserInterface6Code> getTrgt() {
        if (trgt == null) {
            trgt = new ArrayList<UserInterface6Code>();
        }
        return this.trgt;
    }

    /**
     * Gets the value of the othrTrgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTrgt() {
        return othrTrgt;
    }

    /**
     * Sets the value of the othrTrgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation20 setOthrTrgt(String value) {
        this.othrTrgt = value;
        return this;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat4Code }
     *     
     */
    public OutputFormat4Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat4Code }
     *     
     */
    public AdditionalInformation20 setFrmt(OutputFormat4Code value) {
        this.frmt = value;
        return this;
    }

    /**
     * Gets the value of the othrFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrmt() {
        return othrFrmt;
    }

    /**
     * Sets the value of the othrFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation20 setOthrFrmt(String value) {
        this.othrFrmt = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation20 setTp(String value) {
        this.tp = value;
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
    public AdditionalInformation20 setVal(String value) {
        this.val = value;
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
     * Adds a new item to the trgt list.
     * @see #getTrgt()
     * 
     */
    public AdditionalInformation20 addTrgt(UserInterface6Code trgt) {
        getTrgt().add(trgt);
        return this;
    }

}
