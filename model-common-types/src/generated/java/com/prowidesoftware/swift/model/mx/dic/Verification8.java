
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
 * Method and data intended to be verified as well as the related results.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verification8", propOrder = {
    "tp",
    "subTp",
    "data",
    "pinData",
    "ntty",
    "rslt",
    "rsltDtls"
})
public class Verification8 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "SubTp")
    protected String subTp;
    @XmlElement(name = "Data")
    protected List<VerificationValue1> data;
    @XmlElement(name = "PINData")
    protected PINData1 pinData;
    @XmlElement(name = "Ntty")
    @XmlSchemaType(name = "string")
    protected VerificationEntity3Code ntty;
    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected Verification4Code rslt;
    @XmlElement(name = "RsltDtls")
    protected ATICALaxProcessing rsltDtls;

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
    public Verification8 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the subTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTp() {
        return subTp;
    }

    /**
     * Sets the value of the subTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Verification8 setSubTp(String value) {
        this.subTp = value;
        return this;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationValue1 }
     * 
     * 
     * @return
     *     The value of the data property.
     */
    public List<VerificationValue1> getData() {
        if (data == null) {
            data = new ArrayList<>();
        }
        return this.data;
    }

    /**
     * Gets the value of the pinData property.
     * 
     * @return
     *     possible object is
     *     {@link PINData1 }
     *     
     */
    public PINData1 getPINData() {
        return pinData;
    }

    /**
     * Sets the value of the pinData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINData1 }
     *     
     */
    public Verification8 setPINData(PINData1 value) {
        this.pinData = value;
        return this;
    }

    /**
     * Gets the value of the ntty property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationEntity3Code }
     *     
     */
    public VerificationEntity3Code getNtty() {
        return ntty;
    }

    /**
     * Sets the value of the ntty property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationEntity3Code }
     *     
     */
    public Verification8 setNtty(VerificationEntity3Code value) {
        this.ntty = value;
        return this;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link Verification4Code }
     *     
     */
    public Verification4Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verification4Code }
     *     
     */
    public Verification8 setRslt(Verification4Code value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the rsltDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ATICALaxProcessing }
     *     
     */
    public ATICALaxProcessing getRsltDtls() {
        return rsltDtls;
    }

    /**
     * Sets the value of the rsltDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATICALaxProcessing }
     *     
     */
    public Verification8 setRsltDtls(ATICALaxProcessing value) {
        this.rsltDtls = value;
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
     * Adds a new item to the data list.
     * @see #getData()
     * 
     */
    public Verification8 addData(VerificationValue1 data) {
        getData().add(data);
        return this;
    }

}
