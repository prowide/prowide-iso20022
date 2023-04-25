
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicates the details of a guarantee.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeDetails1", propOrder = {
    "issr",
    "pos",
    "desc",
    "grntedAmt",
    "xcss",
    "cvrdPctg",
    "assoctdDoc",
    "addtlInf"
})
public class GuaranteeDetails1 {

    @XmlElement(name = "Issr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object issr;
    @XmlElement(name = "Pos")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pos;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "GrntedAmt")
    protected List<AmountAndPeriod1> grntedAmt;
    @XmlElement(name = "Xcss")
    protected List<AmountAndPeriod1> xcss;
    @XmlElement(name = "CvrdPctg")
    protected List<PercentageAndPeriod1> cvrdPctg;
    @XmlElementRef(name = "AssoctdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> assoctdDoc;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public GuaranteeDetails1 setIssr(Object value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public GuaranteeDetails1 setPos(BigInteger value) {
        this.pos = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GuaranteeDetails1 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the grntedAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the grntedAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrntedAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAndPeriod1 }
     * 
     * 
     * @return
     *     The value of the grntedAmt property.
     */
    public List<AmountAndPeriod1> getGrntedAmt() {
        if (grntedAmt == null) {
            grntedAmt = new ArrayList<>();
        }
        return this.grntedAmt;
    }

    /**
     * Gets the value of the xcss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xcss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXcss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAndPeriod1 }
     * 
     * 
     * @return
     *     The value of the xcss property.
     */
    public List<AmountAndPeriod1> getXcss() {
        if (xcss == null) {
            xcss = new ArrayList<>();
        }
        return this.xcss;
    }

    /**
     * Gets the value of the cvrdPctg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cvrdPctg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvrdPctg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PercentageAndPeriod1 }
     * 
     * 
     * @return
     *     The value of the cvrdPctg property.
     */
    public List<PercentageAndPeriod1> getCvrdPctg() {
        if (cvrdPctg == null) {
            cvrdPctg = new ArrayList<>();
        }
        return this.cvrdPctg;
    }

    /**
     * Gets the value of the assoctdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assoctdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssoctdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the assoctdDoc property.
     */
    public List<JAXBElement<Object>> getAssoctdDoc() {
        if (assoctdDoc == null) {
            assoctdDoc = new ArrayList<>();
        }
        return this.assoctdDoc;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
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
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
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
     * Adds a new item to the grntedAmt list.
     * @see #getGrntedAmt()
     * 
     */
    public GuaranteeDetails1 addGrntedAmt(AmountAndPeriod1 grntedAmt) {
        getGrntedAmt().add(grntedAmt);
        return this;
    }

    /**
     * Adds a new item to the xcss list.
     * @see #getXcss()
     * 
     */
    public GuaranteeDetails1 addXcss(AmountAndPeriod1 xcss) {
        getXcss().add(xcss);
        return this;
    }

    /**
     * Adds a new item to the cvrdPctg list.
     * @see #getCvrdPctg()
     * 
     */
    public GuaranteeDetails1 addCvrdPctg(PercentageAndPeriod1 cvrdPctg) {
        getCvrdPctg().add(cvrdPctg);
        return this;
    }

    /**
     * Adds a new item to the assoctdDoc list.
     * @see #getAssoctdDoc()
     * 
     */
    public GuaranteeDetails1 addAssoctdDoc(JAXBElement<Object> assoctdDoc) {
        getAssoctdDoc().add(assoctdDoc);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public GuaranteeDetails1 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
