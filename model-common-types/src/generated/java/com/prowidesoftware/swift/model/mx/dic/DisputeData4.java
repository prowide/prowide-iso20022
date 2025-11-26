
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
 * Data to be present in a dispute.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeData4", propOrder = {
    "cycl",
    "cond",
    "sts",
    "prtl",
    "ref",
    "dcmnttnSts",
    "rjctRsn",
    "chrgbckElgblty",
    "addtlData"
})
public class DisputeData4 {

    @XmlElement(name = "Cycl")
    protected String cycl;
    @XmlElement(name = "Cond")
    protected String cond;
    @XmlElement(name = "Sts")
    protected String sts;
    @XmlElement(name = "Prtl")
    protected Boolean prtl;
    @XmlElement(name = "Ref")
    protected List<DisputeReference1> ref;
    @XmlElement(name = "DcmnttnSts")
    protected String dcmnttnSts;
    @XmlElement(name = "RjctRsn")
    protected List<String> rjctRsn;
    @XmlElement(name = "ChrgbckElgblty")
    protected String chrgbckElgblty;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the cycl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycl() {
        return cycl;
    }

    /**
     * Sets the value of the cycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData4 setCycl(String value) {
        this.cycl = value;
        return this;
    }

    /**
     * Gets the value of the cond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCond() {
        return cond;
    }

    /**
     * Sets the value of the cond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData4 setCond(String value) {
        this.cond = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData4 setSts(String value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the prtl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtl() {
        return prtl;
    }

    /**
     * Sets the value of the prtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DisputeData4 setPrtl(Boolean value) {
        this.prtl = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeReference1 }
     * 
     * 
     * @return
     *     The value of the ref property.
     */
    public List<DisputeReference1> getRef() {
        if (ref == null) {
            ref = new ArrayList<>();
        }
        return this.ref;
    }

    /**
     * Gets the value of the dcmnttnSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcmnttnSts() {
        return dcmnttnSts;
    }

    /**
     * Sets the value of the dcmnttnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData4 setDcmnttnSts(String value) {
        this.dcmnttnSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the rjctRsn property.
     */
    public List<String> getRjctRsn() {
        if (rjctRsn == null) {
            rjctRsn = new ArrayList<>();
        }
        return this.rjctRsn;
    }

    /**
     * Gets the value of the chrgbckElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrgbckElgblty() {
        return chrgbckElgblty;
    }

    /**
     * Sets the value of the chrgbckElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData4 setChrgbckElgblty(String value) {
        this.chrgbckElgblty = value;
        return this;
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
     * Adds a new item to the ref list.
     * @see #getRef()
     * 
     */
    public DisputeData4 addRef(DisputeReference1 ref) {
        getRef().add(ref);
        return this;
    }

    /**
     * Adds a new item to the rjctRsn list.
     * @see #getRjctRsn()
     * 
     */
    public DisputeData4 addRjctRsn(String rjctRsn) {
        getRjctRsn().add(rjctRsn);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public DisputeData4 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
