
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Describes an event not covered by other formal messages, for example a trace after a telephone call.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDescription1", propOrder = {
    "idr",
    "dt",
    "rcpt",
    "advsr",
    "othrPty",
    "langCd",
    "desc",
    "rltdDoc",
    "rltdLttr",
    "rltdMsg",
    "assoctdDoc",
    "govngCtrct",
    "lglCntxt"
})
public class EventDescription1 {

    @XmlElement(name = "Idr", required = true)
    protected String idr;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dt;
    @XmlElement(name = "Rcpt", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object rcpt;
    @XmlElement(name = "Advsr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object advsr;
    @XmlElementRef(name = "OthrPty", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> othrPty;
    @XmlElement(name = "LangCd", required = true)
    protected String langCd;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElementRef(name = "RltdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdDoc;
    @XmlElementRef(name = "RltdLttr", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdLttr;
    @XmlElementRef(name = "RltdMsg", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdMsg;
    @XmlElementRef(name = "AssoctdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> assoctdDoc;
    @XmlElementRef(name = "GovngCtrct", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> govngCtrct;
    @XmlElement(name = "LglCntxt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object lglCntxt;

    /**
     * Gets the value of the idr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdr() {
        return idr;
    }

    /**
     * Sets the value of the idr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EventDescription1 setIdr(String value) {
        this.idr = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EventDescription1 setDt(OffsetDateTime value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public EventDescription1 setRcpt(Object value) {
        this.rcpt = value;
        return this;
    }

    /**
     * Gets the value of the advsr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdvsr() {
        return advsr;
    }

    /**
     * Sets the value of the advsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public EventDescription1 setAdvsr(Object value) {
        this.advsr = value;
        return this;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPty property.
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
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the othrPty property.
     */
    public List<JAXBElement<Object>> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<>();
        }
        return this.othrPty;
    }

    /**
     * Gets the value of the langCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * Sets the value of the langCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EventDescription1 setLangCd(String value) {
        this.langCd = value;
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
    public EventDescription1 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the rltdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the rltdDoc property.
     */
    public List<JAXBElement<Object>> getRltdDoc() {
        if (rltdDoc == null) {
            rltdDoc = new ArrayList<>();
        }
        return this.rltdDoc;
    }

    /**
     * Gets the value of the rltdLttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdLttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdLttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the rltdLttr property.
     */
    public List<JAXBElement<Object>> getRltdLttr() {
        if (rltdLttr == null) {
            rltdLttr = new ArrayList<>();
        }
        return this.rltdLttr;
    }

    /**
     * Gets the value of the rltdMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the rltdMsg property.
     */
    public List<JAXBElement<Object>> getRltdMsg() {
        if (rltdMsg == null) {
            rltdMsg = new ArrayList<>();
        }
        return this.rltdMsg;
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
     * Gets the value of the govngCtrct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the govngCtrct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovngCtrct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the govngCtrct property.
     */
    public List<JAXBElement<Object>> getGovngCtrct() {
        if (govngCtrct == null) {
            govngCtrct = new ArrayList<>();
        }
        return this.govngCtrct;
    }

    /**
     * Gets the value of the lglCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLglCntxt() {
        return lglCntxt;
    }

    /**
     * Sets the value of the lglCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public EventDescription1 setLglCntxt(Object value) {
        this.lglCntxt = value;
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
     * Adds a new item to the othrPty list.
     * @see #getOthrPty()
     * 
     */
    public EventDescription1 addOthrPty(JAXBElement<Object> othrPty) {
        getOthrPty().add(othrPty);
        return this;
    }

    /**
     * Adds a new item to the rltdDoc list.
     * @see #getRltdDoc()
     * 
     */
    public EventDescription1 addRltdDoc(JAXBElement<Object> rltdDoc) {
        getRltdDoc().add(rltdDoc);
        return this;
    }

    /**
     * Adds a new item to the rltdLttr list.
     * @see #getRltdLttr()
     * 
     */
    public EventDescription1 addRltdLttr(JAXBElement<Object> rltdLttr) {
        getRltdLttr().add(rltdLttr);
        return this;
    }

    /**
     * Adds a new item to the rltdMsg list.
     * @see #getRltdMsg()
     * 
     */
    public EventDescription1 addRltdMsg(JAXBElement<Object> rltdMsg) {
        getRltdMsg().add(rltdMsg);
        return this;
    }

    /**
     * Adds a new item to the assoctdDoc list.
     * @see #getAssoctdDoc()
     * 
     */
    public EventDescription1 addAssoctdDoc(JAXBElement<Object> assoctdDoc) {
        getAssoctdDoc().add(assoctdDoc);
        return this;
    }

    /**
     * Adds a new item to the govngCtrct list.
     * @see #getGovngCtrct()
     * 
     */
    public EventDescription1 addGovngCtrct(JAXBElement<Object> govngCtrct) {
        getGovngCtrct().add(govngCtrct);
        return this;
    }

}
