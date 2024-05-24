
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
@XmlType(name = "DisputeData3", propOrder = {
    "presntmntCycl",
    "dsptCond",
    "dsptSts",
    "prtlDspt",
    "dsptRef",
    "dcmnttnSts",
    "addtlDsptData",
    "dsptRjctRsn",
    "chrgbckElgblty"
})
public class DisputeData3 {

    @XmlElement(name = "PresntmntCycl")
    protected String presntmntCycl;
    @XmlElement(name = "DsptCond")
    protected String dsptCond;
    @XmlElement(name = "DsptSts")
    protected String dsptSts;
    @XmlElement(name = "PrtlDspt")
    protected Boolean prtlDspt;
    @XmlElement(name = "DsptRef")
    protected List<DisputeReference1> dsptRef;
    @XmlElement(name = "DcmnttnSts")
    protected String dcmnttnSts;
    @XmlElement(name = "AddtlDsptData")
    protected AdditionalData1 addtlDsptData;
    @XmlElement(name = "DsptRjctRsn")
    protected List<String> dsptRjctRsn;
    @XmlElement(name = "ChrgbckElgblty")
    protected String chrgbckElgblty;

    /**
     * Gets the value of the presntmntCycl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntCycl() {
        return presntmntCycl;
    }

    /**
     * Sets the value of the presntmntCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData3 setPresntmntCycl(String value) {
        this.presntmntCycl = value;
        return this;
    }

    /**
     * Gets the value of the dsptCond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsptCond() {
        return dsptCond;
    }

    /**
     * Sets the value of the dsptCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData3 setDsptCond(String value) {
        this.dsptCond = value;
        return this;
    }

    /**
     * Gets the value of the dsptSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsptSts() {
        return dsptSts;
    }

    /**
     * Sets the value of the dsptSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisputeData3 setDsptSts(String value) {
        this.dsptSts = value;
        return this;
    }

    /**
     * Gets the value of the prtlDspt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlDspt() {
        return prtlDspt;
    }

    /**
     * Sets the value of the prtlDspt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DisputeData3 setPrtlDspt(Boolean value) {
        this.prtlDspt = value;
        return this;
    }

    /**
     * Gets the value of the dsptRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsptRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeReference1 }
     * 
     * 
     * @return
     *     The value of the dsptRef property.
     */
    public List<DisputeReference1> getDsptRef() {
        if (dsptRef == null) {
            dsptRef = new ArrayList<>();
        }
        return this.dsptRef;
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
    public DisputeData3 setDcmnttnSts(String value) {
        this.dcmnttnSts = value;
        return this;
    }

    /**
     * Gets the value of the addtlDsptData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalData1 }
     *     
     */
    public AdditionalData1 getAddtlDsptData() {
        return addtlDsptData;
    }

    /**
     * Sets the value of the addtlDsptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalData1 }
     *     
     */
    public DisputeData3 setAddtlDsptData(AdditionalData1 value) {
        this.addtlDsptData = value;
        return this;
    }

    /**
     * Gets the value of the dsptRjctRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsptRjctRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptRjctRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the dsptRjctRsn property.
     */
    public List<String> getDsptRjctRsn() {
        if (dsptRjctRsn == null) {
            dsptRjctRsn = new ArrayList<>();
        }
        return this.dsptRjctRsn;
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
    public DisputeData3 setChrgbckElgblty(String value) {
        this.chrgbckElgblty = value;
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
     * Adds a new item to the dsptRef list.
     * @see #getDsptRef()
     * 
     */
    public DisputeData3 addDsptRef(DisputeReference1 dsptRef) {
        getDsptRef().add(dsptRef);
        return this;
    }

    /**
     * Adds a new item to the dsptRjctRsn list.
     * @see #getDsptRjctRsn()
     * 
     */
    public DisputeData3 addDsptRjctRsn(String dsptRjctRsn) {
        getDsptRjctRsn().add(dsptRjctRsn);
        return this;
    }

}
